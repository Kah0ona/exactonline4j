//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 03:25:32 PM CEST 
//


package nl.sytematic.lib.exactonline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typePrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typePrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Currency" type="{}typeCurrency"/>
 *         &lt;element ref="{}Value"/>
 *         &lt;element ref="{}VAT" minOccurs="0"/>
 *         &lt;element name="VATPercentage" type="{}typePercentage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typePrice", propOrder = {
    "currency",
    "value",
    "vat",
    "vatPercentage"
})
public class TypePrice {

    @XmlElement(name = "Currency", required = true)
    protected TypeCurrency currency;
    @XmlElement(name = "Value")
    protected float value;
    @XmlElement(name = "VAT")
    protected VAT vat;
    @XmlElement(name = "VATPercentage")
    protected Float vatPercentage;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCurrency }
     *     
     */
    public TypeCurrency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCurrency }
     *     
     */
    public void setCurrency(TypeCurrency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * Gets the value of the vat property.
     * 
     * @return
     *     possible object is
     *     {@link VAT }
     *     
     */
    public VAT getVAT() {
        return vat;
    }

    /**
     * Sets the value of the vat property.
     * 
     * @param value
     *     allowed object is
     *     {@link VAT }
     *     
     */
    public void setVAT(VAT value) {
        this.vat = value;
    }

    /**
     * Gets the value of the vatPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVATPercentage() {
        return vatPercentage;
    }

    /**
     * Sets the value of the vatPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVATPercentage(Float value) {
        this.vatPercentage = value;
    }

}
