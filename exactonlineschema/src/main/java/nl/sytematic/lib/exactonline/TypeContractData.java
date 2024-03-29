//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 03:25:32 PM CEST 
//


package nl.sytematic.lib.exactonline;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeContractData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeContractData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FixedPackage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FixedTerm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExtraModules" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Template" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeContractData", propOrder = {
    "type",
    "fixedPackage",
    "fixedTerm",
    "extraModules",
    "template"
})
public class TypeContractData {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "FixedPackage", required = true)
    protected String fixedPackage;
    @XmlElement(name = "FixedTerm", required = true)
    protected String fixedTerm;
    @XmlElement(name = "ExtraModules", required = true)
    protected BigInteger extraModules;
    @XmlElement(name = "Template", required = true)
    protected String template;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the fixedPackage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedPackage() {
        return fixedPackage;
    }

    /**
     * Sets the value of the fixedPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedPackage(String value) {
        this.fixedPackage = value;
    }

    /**
     * Gets the value of the fixedTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedTerm() {
        return fixedTerm;
    }

    /**
     * Sets the value of the fixedTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedTerm(String value) {
        this.fixedTerm = value;
    }

    /**
     * Gets the value of the extraModules property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExtraModules() {
        return extraModules;
    }

    /**
     * Sets the value of the extraModules property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExtraModules(BigInteger value) {
        this.extraModules = value;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplate(String value) {
        this.template = value;
    }

}
