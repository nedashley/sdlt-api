//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.19 at 05:38:08 PM GMT 
//


package com.redmonkeysoftware.sdlt.model.request.sdltmessage;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.redmonkeysoftware.sdlt.model.request.sdltmessage package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.redmonkeysoftware.sdlt.model.request.sdltmessage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SDLTMessage }
     * 
     */
    public SDLTMessage createSDLTMessage() {
        return new SDLTMessage();
    }

    /**
     * Create an instance of {@link SDLTMessage.Header }
     * 
     */
    public SDLTMessage.Header createSDLTMessageHeader() {
        return new SDLTMessage.Header();
    }

    /**
     * Create an instance of {@link SDLTMessage.Body }
     * 
     */
    public SDLTMessage.Body createSDLTMessageBody() {
        return new SDLTMessage.Body();
    }

}
