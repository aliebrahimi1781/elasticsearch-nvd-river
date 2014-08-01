//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.30 at 11:36:03 AM CEST 
//


package org.mitre.cpe.language._2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.cpe.language._2 package. 
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

    private final static QName _Platform_QNAME = new QName("http://cpe.mitre.org/language/2.0", "platform");
    private final static QName _FactRef_QNAME = new QName("http://cpe.mitre.org/language/2.0", "fact-ref");
    private final static QName _LogicalTest_QNAME = new QName("http://cpe.mitre.org/language/2.0", "logical-test");
    private final static QName _PlatformConfiguration_QNAME = new QName("http://cpe.mitre.org/language/2.0", "platform-configuration");
    private final static QName _PlatformSpecification_QNAME = new QName("http://cpe.mitre.org/language/2.0", "platform-specification");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.cpe.language._2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LogicalTestType }
     * 
     */
    public LogicalTestType createLogicalTestType() {
        return new LogicalTestType();
    }

    /**
     * Create an instance of {@link PlatformBaseType }
     * 
     */
    public PlatformBaseType createPlatformBaseType() {
        return new PlatformBaseType();
    }

    /**
     * Create an instance of {@link PlatformSpecificationType }
     * 
     */
    public PlatformSpecificationType createPlatformSpecificationType() {
        return new PlatformSpecificationType();
    }

    /**
     * Create an instance of {@link PlatformType }
     * 
     */
    public PlatformType createPlatformType() {
        return new PlatformType();
    }

    /**
     * Create an instance of {@link FactRefType }
     * 
     */
    public FactRefType createFactRefType() {
        return new FactRefType();
    }

    /**
     * Create an instance of {@link TextType }
     * 
     */
    public TextType createTextType() {
        return new TextType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlatformType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cpe.mitre.org/language/2.0", name = "platform")
    public JAXBElement<PlatformType> createPlatform(PlatformType value) {
        return new JAXBElement<PlatformType>(_Platform_QNAME, PlatformType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FactRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cpe.mitre.org/language/2.0", name = "fact-ref")
    public JAXBElement<FactRefType> createFactRef(FactRefType value) {
        return new JAXBElement<FactRefType>(_FactRef_QNAME, FactRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogicalTestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cpe.mitre.org/language/2.0", name = "logical-test")
    public JAXBElement<LogicalTestType> createLogicalTest(LogicalTestType value) {
        return new JAXBElement<LogicalTestType>(_LogicalTest_QNAME, LogicalTestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlatformBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cpe.mitre.org/language/2.0", name = "platform-configuration")
    public JAXBElement<PlatformBaseType> createPlatformConfiguration(PlatformBaseType value) {
        return new JAXBElement<PlatformBaseType>(_PlatformConfiguration_QNAME, PlatformBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlatformSpecificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cpe.mitre.org/language/2.0", name = "platform-specification")
    public JAXBElement<PlatformSpecificationType> createPlatformSpecification(PlatformSpecificationType value) {
        return new JAXBElement<PlatformSpecificationType>(_PlatformSpecification_QNAME, PlatformSpecificationType.class, null, value);
    }

}
