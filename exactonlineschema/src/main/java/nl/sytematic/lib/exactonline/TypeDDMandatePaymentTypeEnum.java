//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 03:25:32 PM CEST 
//


package nl.sytematic.lib.exactonline;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeDDMandatePaymentTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeDDMandatePaymentTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="OneOff"/>
 *     &lt;enumeration value="Recurrent"/>
 *     &lt;enumeration value="AdHoc"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeDDMandatePaymentTypeEnum")
@XmlEnum
public enum TypeDDMandatePaymentTypeEnum {

    @XmlEnumValue("OneOff")
    ONE_OFF("OneOff"),
    @XmlEnumValue("Recurrent")
    RECURRENT("Recurrent"),
    @XmlEnumValue("AdHoc")
    AD_HOC("AdHoc");
    private final String value;

    TypeDDMandatePaymentTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeDDMandatePaymentTypeEnum fromValue(String v) {
        for (TypeDDMandatePaymentTypeEnum c: TypeDDMandatePaymentTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
