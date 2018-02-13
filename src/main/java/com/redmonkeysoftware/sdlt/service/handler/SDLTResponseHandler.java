package com.redmonkeysoftware.sdlt.service.handler;

import com.redmonkeysoftware.sdlt.model.SdltXmlHelper;
import com.redmonkeysoftware.sdlt.model.response.SDLTResponse;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;

public class SDLTResponseHandler<T> implements ResponseHandler<T> {

    private final static Logger logger = Logger.getLogger(SDLTResponseHandler.class.getName());

    @Override
    public T handleResponse(HttpResponse response) throws ClientProtocolException, IOException {
        int status = response.getStatusLine().getStatusCode();
        if ((status >= 200) && (status < 300)) {
            try {
                SDLTResponse sdltResponse = SdltXmlHelper.getInstance().unmarshalResponseXml(response.getEntity().getContent(), SDLTResponse.class);
                for (Object obj : sdltResponse.getBody().getAny()) {
                    logger.log(Level.INFO, "Received: " + obj.getClass().getName());
                    try {
                        T t = (T) obj;
                        return t;
                    } catch (Throwable t) {
                        //Ignore as may not be convertable into required type
                    }
                }
                return null;
            } catch (JAXBException jaxbe) {
                throw new ClientProtocolException("Could not unmarshal XML: " + jaxbe.getMessage());
            }
        } else {
            throw new ClientProtocolException("Sdlt Request was not successful: " + status + ":" + response.getStatusLine().getReasonPhrase());
        }
    }
}
