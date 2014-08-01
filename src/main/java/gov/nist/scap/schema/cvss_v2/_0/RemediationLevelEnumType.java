//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.30 at 11:36:03 AM CEST 
//


package gov.nist.scap.schema.cvss_v2._0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remediationLevelEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="remediationLevelEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="OFFICIAL_FIX"/>
 *     &lt;enumeration value="TEMPORARY_FIX"/>
 *     &lt;enumeration value="WORKAROUND"/>
 *     &lt;enumeration value="UNAVAILABLE"/>
 *     &lt;enumeration value="NOT_DEFINED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "remediationLevelEnumType")
@XmlEnum
public enum RemediationLevelEnumType {

    OFFICIAL_FIX,
    TEMPORARY_FIX,
    WORKAROUND,
    UNAVAILABLE,
    NOT_DEFINED;

    public String value() {
        return name();
    }

    public static RemediationLevelEnumType fromValue(String v) {
        return valueOf(v);
    }

}
