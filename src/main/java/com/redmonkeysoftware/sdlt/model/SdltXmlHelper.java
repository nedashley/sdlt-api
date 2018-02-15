package com.redmonkeysoftware.sdlt.model;

import com.redmonkeysoftware.sdlt.model.exceptions.SdltException;
import com.redmonkeysoftware.sdlt.model.request.BooleanType;
import com.redmonkeysoftware.sdlt.model.request.DateTimeType;
import com.redmonkeysoftware.sdlt.model.request.DateType;
import com.redmonkeysoftware.sdlt.model.request.GetAccountOTP;
import com.redmonkeysoftware.sdlt.model.request.GetDocumentsStatus;
import com.redmonkeysoftware.sdlt.model.request.GetDocumentsStatus.Filter;
import com.redmonkeysoftware.sdlt.model.request.GetPrintoutDocuments;
import com.redmonkeysoftware.sdlt.model.request.ImportDocuments;
import com.redmonkeysoftware.sdlt.model.request.ObjectFactory;
import com.redmonkeysoftware.sdlt.model.request.SDLT;
import com.redmonkeysoftware.sdlt.model.request.SDLTMessage;
import com.redmonkeysoftware.sdlt.model.request.StringType;
import com.redmonkeysoftware.sdlt.model.request.Test;
import java.io.InputStream;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.apache.commons.lang3.StringUtils;

public class SdltXmlHelper {

    private final static Logger logger = Logger.getLogger(SdltXmlHelper.class.getName());
    private static SdltXmlHelper instance;
    private final DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    private JAXBContext requestContext = JAXBContext.newInstance("com.redmonkeysoftware.sdlt.model.request");
    private ObjectFactory requestObjectFactory = new com.redmonkeysoftware.sdlt.model.request.ObjectFactory();
    private JAXBContext responseContext = JAXBContext.newInstance("com.redmonkeysoftware.sdlt.model.response");
    private ObjectFactory responseObjectFactory = new com.redmonkeysoftware.sdlt.model.request.ObjectFactory();

    private SdltXmlHelper() throws JAXBException {

    }

    private Marshaller createMarshaller(JAXBContext context, String schemaLocation) throws JAXBException {
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        if (StringUtils.isNotBlank(schemaLocation)) {
            marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, schemaLocation);
        }
        return marshaller;
    }

    private Unmarshaller createUnmarshaller(JAXBContext context) throws JAXBException {
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return unmarshaller;
    }

    public static synchronized SdltXmlHelper getInstance() throws JAXBException {
        if (instance == null) {
            instance = new SdltXmlHelper();
        }
        return instance;
    }

    protected JAXBElement createStringType(String name, String value) {
        StringType st = new StringType();
        st.setValue(value);
        JAXBElement jaxbe = new JAXBElement(new QName("http://sdlt.co.uk/SDLT", name), StringType.class, st);
        return jaxbe;
    }

    protected JAXBElement createBooleanType(String name, Boolean value) {
        BooleanType st = new BooleanType();
        st.setValue(Objects.equals(Boolean.TRUE, value) ? "true" : "false");
        JAXBElement jaxbe = new JAXBElement(new QName("http://sdlt.co.uk/SDLT", name), BooleanType.class, st);
        return jaxbe;
    }

    protected JAXBElement createDateType(String name, LocalDate value) {
        DateType st = new DateType();
        st.setValue(value != null ? dateFormatter.format(value) : null);
        JAXBElement jaxbe = new JAXBElement(new QName("http://sdlt.co.uk/SDLT", name), DateType.class, st);
        return jaxbe;
    }

    protected JAXBElement createDateTimeType(String name, LocalDateTime value) {
        DateTimeType st = new DateTimeType();
        st.setValue(value != null ? dateTimeFormatter.format(value) : null);
        JAXBElement jaxbe = new JAXBElement(new QName("http://sdlt.co.uk/SDLT", name), DateTimeType.class, st);
        return jaxbe;
    }

    protected JAXBElement<XMLGregorianCalendar> createXmlGregorianCalendarType(String name, LocalDate value) {
        StringType st = new StringType();
        st.setValue(value != null ? dateFormatter.format(value) : null);
        JAXBElement jaxbe = new JAXBElement(new QName("http://sdlt.co.uk/API", name), XMLGregorianCalendar.class, st);
        return jaxbe;
    }

    public Test convertToTest(String testValue) {
        Test request = requestObjectFactory.createTest();
        request.setData(testValue);
        return request;
    }

    public GetAccountOTP convertToGetAccountOTP(Integer documentId) {
        GetAccountOTP request = requestObjectFactory.createGetAccountOTP();
        if (documentId != null) {
            request.setDocumentID(documentId);
        }
        return request;
    }

    public GetDocumentsStatus convertToGetDocumentsStatus(LocalDate from, LocalDate to) {
        GetDocumentsStatus status = requestObjectFactory.createGetDocumentsStatus();
        Filter filter = requestObjectFactory.createGetDocumentsStatusFilter();
        if (from != null) {
            filter.getCreateDateFromOrCreateDateTo().add(createXmlGregorianCalendarType("CreateDateFrom", from));
        }
        if (to != null) {
            filter.getCreateDateFromOrCreateDateTo().add(createXmlGregorianCalendarType("CreateDateTo", to));
        }
        status.setFilter(filter);
        return status;
    }

    public GetPrintoutDocuments convertToPrintoutDocuments(String documentId) {
        GetPrintoutDocuments request = requestObjectFactory.createGetPrintoutDocuments();
        if (StringUtils.isNotBlank(documentId)) {
            GetPrintoutDocuments.Document document = requestObjectFactory.createGetPrintoutDocumentsDocument();
            document.setDocumentID(documentId);
            request.getDocument().add(document);
        }
        return request;
    }

    public String createSdltMessage(Object requestObject, String url) throws JAXBException {
        SDLTMessage message = requestObjectFactory.createSDLTMessage();
        SDLTMessage.Body body = requestObjectFactory.createSDLTMessageBody();
        body.getAny().add(requestObject);
        message.setBody(body);
        message.setVersion("1.0");
        SDLTMessage.Header header = requestObjectFactory.createSDLTMessageHeader();
        message.setHeader(header);
        String responseXml = marshalRequestObject(message, "http://sdlt.co.uk/Header https://online.sdlt.co.uk/schema/v1-0/SDLTMessage.xsd http://sdlt.co.uk/API https://online.sdlt.co.uk/schema/v1-0/" + url + ".xsd");
        return responseXml;
    }

    public String createImportDocumentsMessage(SDLT sdlt) throws JAXBException {
        String responseXml = createSdltMessage(requestObjectFactory.createImportDocuments(), "ImportDocuments");
        String sdltXml = marshalRequestObject(sdlt, "http://sdlt.co.uk/API https://online.sdlt.co.uk/schema/v1-0/SDLT.xsd");
        sdltXml = StringUtils.removeStartIgnoreCase(sdltXml, "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>");

        responseXml = StringUtils.replace(responseXml, "ImportDocuments.xsd", "ImportXsdDocuments");
        String before = StringUtils.substringBefore(responseXml, "ImportDocuments");
        String namespace = StringUtils.substringAfterLast(before, "<");
        String attributes = StringUtils.substringBefore(StringUtils.substringAfter(responseXml, "ImportDocuments"), ">");
        String after = StringUtils.substringAfterLast(responseXml, "ImportDocuments");
        responseXml = before + "ImportDocuments" + StringUtils.removeStart(StringUtils.trim(attributes), "/") + ">" + sdltXml + "</" + namespace + "ImportDocuments>" + StringUtils.removeStart(StringUtils.trim(after), "/>");
        responseXml = StringUtils.replace(responseXml, "ImportXsdDocuments", "ImportDocuments.xsd");
        //responseXml = responseXml.replaceAll("(?<=[:<]ImportDocuments>)[^<]*(?=</(\\w+:)?ImportDocuments>)", sdltXml);
        //responseXml = StringUtils.replace(responseXml, "<ns3:ImportDocuments/>", "<ns3:ImportDocuments>" + sdltXml + "</ns3:ImportDocuments>");
        //responseXml = StringUtils.replace(responseXml, "<ns2:ImportDocuments/>", "<ns2:ImportDocuments>" + sdltXml + "</ns2:ImportDocuments>");
        //responseXml = StringUtils.replace(responseXml, "<ImportDocuments/>", "<ImportDocuments>" + sdltXml + "</ImportDocuments>");
        return responseXml;
    }

    public String marshalRequestObject(Object requestObject, String schemaLocation) throws JAXBException {
        Marshaller marshaller = createMarshaller(requestContext, schemaLocation);
        StringWriter swriter = new StringWriter();
        marshaller.marshal(requestObject, swriter);
        return swriter.toString();
    }

    public SDLT convertToSDLT(SdltImportRequest request) {
        SDLT sdlt = requestObjectFactory.createSDLT();
        try {
            for (Field field : request.getClass().getDeclaredFields()) {
                if (field.isAnnotationPresent(SdltXmlValue.class)) {
                    SdltXmlValue xmlValue = field.getAnnotation(SdltXmlValue.class);
                    field.setAccessible(true);
                    Object value = field.get(request);
                    if (value instanceof String) {
                        sdlt.getFIDOrFDateCreatedOrFUserNotes().add(createStringType(xmlValue.value(), (String) value));
                    } else if (value instanceof Boolean) {
                        sdlt.getFIDOrFDateCreatedOrFUserNotes().add(createBooleanType(xmlValue.value(), (Boolean) value));
                    } else if (value instanceof Integer) {
                        sdlt.getFIDOrFDateCreatedOrFUserNotes().add(createStringType(xmlValue.value(), ((Integer) value).toString()));
                    } else if (value instanceof BigDecimal) {
                        sdlt.getFIDOrFDateCreatedOrFUserNotes().add(createStringType(xmlValue.value(), ((BigDecimal) value).setScale(0, RoundingMode.FLOOR).toPlainString()));
                    } else if (value instanceof LocalDate) {
                        sdlt.getFIDOrFDateCreatedOrFUserNotes().add(createDateType(xmlValue.value(), (LocalDate) value));
                    } else if (value instanceof LocalDateTime) {
                        sdlt.getFIDOrFDateCreatedOrFUserNotes().add(createDateTimeType(xmlValue.value(), (LocalDateTime) value));
                    } else if (value instanceof BaseEnumType) {
                        sdlt.getFIDOrFDateCreatedOrFUserNotes().add(createStringType(xmlValue.value(), ((BaseEnumType) value).getCode()));
                    } else if (value != null) {
                        logger.log(Level.WARNING, "Not sure how to map field of type: " + field.getClass().getName());
                    }
                }
            }
        } catch (IllegalAccessException | IllegalArgumentException | SecurityException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "Error generating SDLT", e);
        }
        return sdlt;
    }

    public String generateTestSdlt() throws JAXBException {
        ImportDocuments importDocuments = requestObjectFactory.createImportDocuments();
        SDLT sdlt = requestObjectFactory.createSDLT();
        StringType id = requestObjectFactory.createStringType();
        id.setValue("test");
        sdlt.getFIDOrFDateCreatedOrFUserNotes().add(requestObjectFactory.createSDLTFID(id));
        importDocuments.getAny().add(sdlt);
        return createImportDocumentsMessage(sdlt);
    }

    public <T extends Object> T unmarshalResponseXml(InputStream xml, Class<T> type) throws JAXBException {
        Unmarshaller responseUnmarshaller = createUnmarshaller(responseContext);
        Object unmarshalled = responseUnmarshaller.unmarshal(xml);
        try {
            return (T) unmarshalled;
        } catch (Throwable te) {
            logger.log(Level.SEVERE, "Unmarshalled class from xml is not of the correct type", te);
        }
        return null;
    }
}
