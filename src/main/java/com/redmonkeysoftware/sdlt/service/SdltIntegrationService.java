package com.redmonkeysoftware.sdlt.service;

import com.redmonkeysoftware.sdlt.model.SdltAccountOtp;
import com.redmonkeysoftware.sdlt.model.SdltDocument;
import com.redmonkeysoftware.sdlt.model.SdltDocumentStatus;
import com.redmonkeysoftware.sdlt.model.SdltImportRequest;
import com.redmonkeysoftware.sdlt.model.SdltXmlHelper;
import com.redmonkeysoftware.sdlt.model.exceptions.SdltException;
import com.redmonkeysoftware.sdlt.model.response.GetAccountOTP;
import com.redmonkeysoftware.sdlt.model.response.GetDocumentsStatus;
import com.redmonkeysoftware.sdlt.model.response.GetPrintoutDocuments;
import com.redmonkeysoftware.sdlt.model.response.ImportDocuments;
import com.redmonkeysoftware.sdlt.model.response.Test;
import com.redmonkeysoftware.sdlt.model.SdltAccessToken;
import com.redmonkeysoftware.sdlt.model.request.SDLT;
import com.redmonkeysoftware.sdlt.service.handler.AccessTokenJsonResponseHandler;
import com.redmonkeysoftware.sdlt.service.handler.SDLTResponseHandler;
import java.io.Closeable;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

public class SdltIntegrationService implements Closeable {

    private final static Logger logger = Logger.getLogger(SdltIntegrationService.class.getName());
    private final String applicationId;
    private final String applicationSecret;
    private final static String endpoint = "https://online.sdlt.co.uk/api/";
    private CloseableHttpClient client = null;
    private SdltAccessToken applicationAccessToken;

    public SdltIntegrationService(final String applicationId, final String applicationSecret) {
        this.applicationId = applicationId;
        this.applicationSecret = applicationSecret;
        initialise();
    }

    private void initialise() {
        client = HttpClients.createDefault();
    }

    @Override
    public void close() {
        HttpClientUtils.closeQuietly(client);
    }

    protected SdltAccessToken authenticateApplication() {
        return processAuthenticationCall(applicationId, applicationSecret, null);
    }

    protected SdltAccessToken authenticateClient(String clientId, String clientSecret) {
        if ((applicationAccessToken == null) || (applicationAccessToken.isExpired())) {
            applicationAccessToken = authenticateApplication();
        }
        return processAuthenticationCall(clientId, clientSecret, applicationAccessToken.getAccessToken());
    }

    protected SdltAccessToken processAuthenticationCall(String id, String secret, String headerToken) {
        try {
            HttpPost post = new HttpPost(endpoint + "auth");

            List<NameValuePair> urlParameters = new ArrayList<>();
            urlParameters.add(new BasicNameValuePair("client_id", id));
            urlParameters.add(new BasicNameValuePair("client_secret", secret));
            urlParameters.add(new BasicNameValuePair("grant_type", StringUtils.isNotBlank(headerToken) ? "fe_user_credentials" : "fe_client_credentials"));
            if (StringUtils.isNotBlank(headerToken)) {
                post.addHeader("Authorization", "Bearer " + headerToken);
            }
            post.setEntity(new UrlEncodedFormEntity(urlParameters));
            SdltAccessToken accessToken = client.execute(post, new AccessTokenJsonResponseHandler());
            return accessToken;
        } catch (IOException | IllegalStateException e) {
            logger.log(Level.SEVERE, "Could not authenticate with SDLT - client authentication", e);
            throw new SdltException("Error authenticating with SDLT - client authentication");
        }
    }

    protected <T> T processSdltCall(String clientId, String clientSecret, String url, Object requestObject, Class<T> type) throws IOException, IllegalStateException, JAXBException {
        SdltAccessToken clientAuth = authenticateClient(clientId, clientSecret);
        HttpPost post = new HttpPost(endpoint + url);
        String requestString = SdltXmlHelper.getInstance().createSdltMessage(requestObject, url);
        if (requestObject instanceof SDLT) {
            requestString = SdltXmlHelper.getInstance().createImportDocumentsMessage((SDLT) requestObject);
        }
        logger.log(Level.INFO, requestString);
        StringEntity entity = new StringEntity(requestString);
        post.addHeader("Authorization", "Bearer " + clientAuth.getAccessToken());
        post.setEntity(entity);
        T result = client.execute(post, new SDLTResponseHandler<T>());
        return result;
    }

    public String test(String clientId, String clientSecret, String testValue) {
        try {
            Test result = processSdltCall(clientId, clientSecret, "Test", SdltXmlHelper.getInstance().convertToTest(testValue), Test.class);
            return result != null ? result.getData() : null;
        } catch (IOException | IllegalStateException | JAXBException e) {
            logger.log(Level.SEVERE, "Error calling Test method", e);
            throw new SdltException("Error calling Test: " + e.getMessage());
        }
    }

    public SdltAccountOtp getAccountOtp(String clientId, String clientSecret, Integer documentId) {
        try {
            GetAccountOTP result = processSdltCall(clientId, clientSecret, "GetAccountOTP", SdltXmlHelper.getInstance().convertToGetAccountOTP(documentId), GetAccountOTP.class);
            return new SdltAccountOtp().withGetAccountOTP(result);
        } catch (IOException | IllegalStateException | JAXBException e) {
            logger.log(Level.SEVERE, "Error getting account OTP", e);
            throw new SdltException("Error getting account OTP: " + e.getMessage());
        }
    }

    public List<SdltDocumentStatus> getDocumentsStatus(String clientId, String clientSecret, LocalDate from, LocalDate to) {
        try {
            GetDocumentsStatus result = processSdltCall(clientId, clientSecret, "GetDocumentsStatus", SdltXmlHelper.getInstance().convertToGetDocumentsStatus(from, to), GetDocumentsStatus.class);
            List<SdltDocumentStatus> results = new ArrayList<>();
            for (GetDocumentsStatus.Document doc : result.getDocument()) {
                results.add(new SdltDocumentStatus().withDocumentStatus(doc));
            }
            return results;
        } catch (IOException | IllegalStateException | JAXBException e) {
            logger.log(Level.SEVERE, "Error getting documents status", e);
            throw new SdltException("Error getting documents status: " + e.getMessage());
        }
    }

    public List<SdltDocument> getPrintoutDocuments(String clientId, String clientSecret, String documentId) {
        try {
            GetPrintoutDocuments result = processSdltCall(clientId, clientSecret, "GetPrintoutDocuments", SdltXmlHelper.getInstance().convertToPrintoutDocuments(documentId), GetPrintoutDocuments.class);
            List<SdltDocument> results = new ArrayList<>();
            for (GetPrintoutDocuments.Document gpoDoc : result.getDocument()) {
                for (GetPrintoutDocuments.Document.PrintoutDocument gpoDocDoc : gpoDoc.getPrintoutDocument()) {
                    results.add(new SdltDocument().withPrintoutDocument(gpoDocDoc));
                }
            }
            return results;
        } catch (IOException | IllegalStateException | JAXBException e) {
            logger.log(Level.SEVERE, "Error getting printout documents", e);
            throw new SdltException("Error getting printout documents: " + e.getMessage());
        }
    }

    public List<SdltDocumentStatus> importDocuments(String clientId, String clientSecret, SdltImportRequest request) {
        try {
            ImportDocuments result = processSdltCall(clientId, clientSecret, "ImportDocuments", SdltXmlHelper.getInstance().convertToSDLT(request), ImportDocuments.class);
            List<SdltDocumentStatus> results = new ArrayList<>();
            for (ImportDocuments.Document doc : result.getDocument()) {
                results.add(new SdltDocumentStatus().withDocumentImport(doc));
            }
            return results;
        } catch (IOException | IllegalStateException | JAXBException e) {
            logger.log(Level.SEVERE, "Error importing documents", e);
            throw new SdltException("Error importing documents: " + e.getMessage());
        }
    }
}
