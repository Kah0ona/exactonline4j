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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Currency" type="{}typeCurrency"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{}Debit" minOccurs="0"/>
 *             &lt;element ref="{}Credit" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element ref="{}Value" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element ref="{}VAT" minOccurs="0"/>
 *         &lt;element name="VATPercentage" type="{}typePercentage" minOccurs="0"/>
 *         &lt;element name="VATBaseAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="VATAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="PaymentDiscountAmount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}Value" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "currency",
    "debit",
    "credit",
    "value",
    "rate",
    "vat",
    "vatPercentage",
    "vatBaseAmount",
    "vatAmount",
    "paymentDiscountAmount"
})
@XmlRootElement(name = "ForeignAmount")
public class ForeignAmount {

    @XmlElement(name = "Currency", required = true)
    protected TypeCurrency currency;
    @XmlElement(name = "Debit")
    protected Float debit;
    @XmlElement(name = "Credit")
    protected Float credit;
    @XmlElement(name = "Value")
    protected Float value;
    @XmlElement(name = "Rate")
    protected Float rate;
    @XmlElement(name = "VAT")
    protected VAT vat;
    @XmlElement(name = "VATPercentage")
    protected Float vatPercentage;
    @XmlElement(name = "VATBaseAmount", defaultValue = "0")
    protected Float vatBaseAmount;
    @XmlElement(name = "VATAmount", defaultValue = "0")
    protected Float vatAmount;
    @XmlElement(name = "PaymentDiscountAmount")
    protected ForeignAmount.PaymentDiscountAmount paymentDiscountAmount;

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
     * Gets the value of the debit property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDebit() {
        return debit;
    }

    /**
     * Sets the value of the debit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDebit(Float value) {
        this.debit = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCredit(Float value) {
        this.credit = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setValue(Float value) {
        this.value = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRate(Float value) {
        this.rate = value;
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

    /**
     * Gets the value of the vatBaseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVATBaseAmount() {
        return vatBaseAmount;
    }

    /**
     * Sets the value of the vatBaseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVATBaseAmount(Float value) {
        this.vatBaseAmount = value;
    }

    /**
     * Gets the value of the vatAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVATAmount() {
        return vatAmount;
    }

    /**
     * Sets the value of the vatAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVATAmount(Float value) {
        this.vatAmount = value;
    }

    /**
     * Gets the value of the paymentDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignAmount.PaymentDiscountAmount }
     *     
     */
    public ForeignAmount.PaymentDiscountAmount getPaymentDiscountAmount() {
        return paymentDiscountAmount;
    }

    /**
     * Sets the value of the paymentDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignAmount.PaymentDiscountAmount }
     *     
     */
    public void setPaymentDiscountAmount(ForeignAmount.PaymentDiscountAmount value) {
        this.paymentDiscountAmount = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{}Value" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class PaymentDiscountAmount {

        @XmlElement(name = "Value")
        protected Float value;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setValue(Float value) {
            this.value = value;
        }

    }

}
