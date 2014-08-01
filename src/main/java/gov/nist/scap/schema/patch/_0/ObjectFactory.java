//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.30 at 11:36:03 AM CEST 
//


package gov.nist.scap.schema.patch._0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.nist.scap.schema.patch._0 package. 
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

    private final static QName _Patch_QNAME = new QName("http://scap.nist.gov/schema/patch/0.1", "patch");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.nist.scap.schema.patch._0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PatchType }
     * 
     */
    public PatchType createPatchType() {
        return new PatchType();
    }

    /**
     * Create an instance of {@link PatchType.References }
     * 
     */
    public PatchType.References createPatchTypeReferences() {
        return new PatchType.References();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://scap.nist.gov/schema/patch/0.1", name = "patch")
    public JAXBElement<PatchType> createPatch(PatchType value) {
        return new JAXBElement<PatchType>(_Patch_QNAME, PatchType.class, null, value);
    }

}
