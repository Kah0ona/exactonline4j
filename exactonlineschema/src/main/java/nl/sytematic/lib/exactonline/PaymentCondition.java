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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PaymentCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{}Description"/>
 *         &lt;element name="PaymentDiscountType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="B"/>
 *               &lt;enumeration value="K"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PaymentMethod" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="B"/>
 *               &lt;enumeration value="C"/>
 *               &lt;enumeration value="E"/>
 *               &lt;enumeration value="H"/>
 *               &lt;enumeration value="I"/>
 *               &lt;enumeration value="K"/>
 *               &lt;enumeration value="R"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PaymentEndOfMonths" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PaymentDays" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="DiscountPaymentDays" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="DiscountPercentage" type="{}typePercentage" minOccurs="0"/>
 *         &lt;element name="DiscountCalculation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="E"/>
 *               &lt;enumeration value="I"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VATCalculation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="E"/>
 *               &lt;enumeration value="I"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CreditManagementScenario" type="{}typeCreditManagementScenario" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{}code use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCondition", propOrder = {
    "description",
    "paymentDiscountType",
    "paymentMethod",
    "paymentEndOfMonths",
    "paymentDays",
    "discountPaymentDays",
    "discountPercentage",
    "discountCalculation",
    "vatCalculation",
    "creditManagementScenario"
})
public class PaymentCondition {

    @XmlElement(name = "Description")
    protected TypeDescription description;
    @XmlElement(name = "PaymentDiscountType", defaultValue = "B")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String paymentDiscountType;
    @XmlElement(name = "PaymentMethod", defaultValue = "B")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String paymentMethod;
    @XmlElement(name = "PaymentEndOfMonths")
    protected BigInteger paymentEndOfMonths;
    @XmlElement(name = "PaymentDays")
    protected BigInteger paymentDays;
    @XmlElement(name = "DiscountPaymentDays")
    protected BigInteger discountPaymentDays;
    @XmlElement(name = "DiscountPercentage")
    protected Float discountPercentage;
    @XmlElement(name = "DiscountCalculation", defaultValue = "E")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String discountCalculation;
    @XmlElement(name = "VATCalculation", defaultValue = "E")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String vatCalculation;
    @XmlElement(name = "CreditManagementScenario")
    protected TypeCreditManagementScenario creditManagementScenario;
    @XmlAttribute(required = true)
    protected String code;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDescription }
     *     
     */
    public TypeDescription getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDescription }
     *     
     */
    public void setDescription(TypeDescription value) {
        this.description = value;
    }

    /**
     * Gets the value of the paymentDiscountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDiscountType() {
        return paymentDiscountType;
    }

    /**
     * Sets the value of the paymentDiscountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDiscountType(String value) {
        this.paymentDiscountType = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the paymentEndOfMonths property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPaymentEndOfMonths() {
        return paymentEndOfMonths;
    }

    /**
     * Sets the value of the paymentEndOfMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPaymentEndOfMonths(BigInteger value) {
        this.paymentEndOfMonths = value;
    }

    /**
     * Gets the value of the paymentDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPaymentDays() {
        return paymentDays;
    }

    /**
     * Sets the value of the paymentDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPaymentDays(BigInteger value) {
        this.paymentDays = value;
    }

    /**
     * Gets the value of the discountPaymentDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiscountPaymentDays() {
        return discountPaymentDays;
    }

    /**
     * Sets the value of the discountPaymentDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiscountPaymentDays(BigInteger value) {
        this.discountPaymentDays = value;
    }

    /**
     * Gets the value of the discountPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDiscountPercentage() {
        return discountPercentage;
    }

    /**
     * Sets the value of the discountPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDiscountPercentage(Float value) {
        this.discountPercentage = value;
    }

    /**
     * Gets the value of the discountCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountCalculation() {
        return discountCalculation;
    }

    /**
     * Sets the value of the discountCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountCalculation(String value) {
        this.discountCalculation = value;
    }

    /**
     * Gets the value of the vatCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATCalculation() {
        return vatCalculation;
    }

    /**
     * Sets the value of the vatCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATCalculation(String value) {
        this.vatCalculation = value;
    }

    /**
     * Gets the value of the creditManagementScenario property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCreditManagementScenario }
     *     
     */
    public TypeCreditManagementScenario getCreditManagementScenario() {
        return creditManagementScenario;
    }

    /**
     * Sets the value of the creditManagementScenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCreditManagementScenario }
     *     
     */
    public void setCreditManagementScenario(TypeCreditManagementScenario value) {
        this.creditManagementScenario = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

}
