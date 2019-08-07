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
import com.redmonkeysoftware.sdlt.model.request.sdlt.SDLT;
import com.redmonkeysoftware.sdlt.service.handler.AccessTokenJsonResponseHandler;
import com.redmonkeysoftware.sdlt.service.handler.SDLTResponseHandler;
import java.io.Closeable;
import java.io.IOException;
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
    //private SdltAccessToken applicationAccessToken;

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

    protected SdltAccessToken authenticateApplication(String clientId, String clientSecret) {
        SdltAccessToken applicationAuth = processAuthenticationCall(applicationId, applicationSecret, null);
        SdltAccessToken clientAuth = processAuthenticationCall(clientId, clientSecret, applicationAuth.getAccessToken());
        return clientAuth;
    }

    public SdltAccessToken authenticateClient(SdltAccessToken token, String clientId, String clientSecret) {
        if ((token == null) || (token.isExpired())) {
            return authenticateApplication(clientId, clientSecret);
        }
        return processAuthenticationCall(clientId, clientSecret, token.getAccessToken());
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
   
    
    protected <T> T processSdltCall(SdltAccessToken token, String clientId, String clientSecret, String url, Object apiRequest, Class<T> type) throws IOException, IllegalStateException, JAXBException {
        //SdltAccessToken clientAuth = authenticateClient(clientId, clientSecret);
        HttpPost post = new HttpPost(endpoint + url);
        StringEntity entity = new StringEntity(SdltXmlHelper.getInstance().generateRequestXml(url, apiRequest));
        post.addHeader("Authorization", "Bearer " + token.getAccessToken());
        post.setEntity(entity);
        T result = client.execute(post, new SDLTResponseHandler<>());
        return result;
    }

    public String test(SdltAccessToken token, String clientId, String clientSecret, String testValue) {
        try {
            Test result = processSdltCall(token, clientId, clientSecret, "Test",
                    SdltXmlHelper.getInstance().convertToTest(testValue), Test.class);
            return result != null ? result.getData() : null;
        } catch (IOException | IllegalStateException | JAXBException e) {
            logger.log(Level.SEVERE, "Error calling Test method", e);
            throw new SdltException("Error calling Test: " + e.getMessage());
        }
    }

    public SdltAccountOtp getAccountOtp(SdltAccessToken token, String clientId, String clientSecret, Integer documentId) {
        try {
            GetAccountOTP result = processSdltCall(token, clientId, clientSecret, "GetAccountOTP", SdltXmlHelper.getInstance().convertToGetAccountOTP(documentId), GetAccountOTP.class);
            return new SdltAccountOtp().withGetAccountOTP(result);
        } catch (IOException | IllegalStateException | JAXBException e) {
            logger.log(Level.SEVERE, "Error getting account OTP", e);
            throw new SdltException("Error getting account OTP: " + e.getMessage());
        }
    }

    public List<SdltDocumentStatus> getDocumentsStatus(SdltAccessToken token, String clientId, String clientSecret, String documentId) {
        try {
            GetDocumentsStatus result = processSdltCall(token, clientId, clientSecret, "GetDocumentsStatus", SdltXmlHelper.getInstance().convertToGetDocumentsStatus(documentId), GetDocumentsStatus.class);
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

    public List<SdltDocument> getPrintoutDocuments(SdltAccessToken token, String clientId, String clientSecret, String documentId) {
        try {
            GetPrintoutDocuments result = processSdltCall(token, clientId, clientSecret, "GetPrintoutDocuments", SdltXmlHelper.getInstance().convertToPrintoutDocuments(documentId), GetPrintoutDocuments.class);
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

    public List<SdltDocumentStatus> importDocuments(SdltAccessToken token, String clientId, String clientSecret, SdltImportRequest request) {
        try {
            ImportDocuments result = processSdltCall(token, clientId, clientSecret, "ImportDocuments", SdltXmlHelper.getInstance().convertToSDLT(request), ImportDocuments.class);
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
