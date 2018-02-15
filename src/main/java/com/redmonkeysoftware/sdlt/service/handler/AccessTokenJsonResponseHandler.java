package com.redmonkeysoftware.sdlt.service.handler;

import com.redmonkeysoftware.sdlt.model.SdltAccessToken;
import com.redmonkeysoftware.sdlt.model.SdltJsonHelper;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

public class AccessTokenJsonResponseHandler implements ResponseHandler<SdltAccessToken> {

    private final static Logger logger = Logger.getLogger(AccessTokenJsonResponseHandler.class.getName());

    @Override
    public SdltAccessToken handleResponse(HttpResponse response) throws ClientProtocolException, IOException {
        int status = response.getStatusLine().getStatusCode();
        if ((status >= 200) && (status < 300)) {
            String responseContent = EntityUtils.toString(response.getEntity());
            logger.log(Level.FINEST, responseContent);
            SdltAccessToken result = SdltJsonHelper.getInstance().getJson(responseContent, SdltAccessToken.class);
            return result;
        } else {
            throw new ClientProtocolException("Authorisation Request was not successful: " + status + ":" + response.getStatusLine().getReasonPhrase());
        }
    }
}
