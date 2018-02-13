package com.redmonkeysoftware.sdlt.model;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Logger;
import org.apache.commons.lang3.StringUtils;

public class SdltJsonHelper {

    private final static Logger logger = Logger.getLogger(SdltXmlHelper.class.getName());
    private static SdltJsonHelper instance;
    private final ObjectMapper mapper = new ObjectMapper();

    private SdltJsonHelper() {
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    }

    public static synchronized SdltJsonHelper getInstance() {
        if (instance == null) {
            instance = new SdltJsonHelper();
        }
        return instance;
    }

    public <T extends Object> T getJson(String json, Class<T> type) throws IOException {
        return (StringUtils.isNotBlank(json)) ? mapper.readValue(json, type) : null;
    }

    protected <T> List<T> getJsonList(String json, Class<T> type) throws IOException {
        return (StringUtils.isNotBlank(json))
                ? mapper.readValue(json, mapper.getTypeFactory().constructCollectionType(List.class, type)) : null;
    }
}
