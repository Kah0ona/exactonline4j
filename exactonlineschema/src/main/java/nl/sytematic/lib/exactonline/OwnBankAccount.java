//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 03:25:32 PM CEST 
//


package nl.sytematic.lib.exactonline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{}Description"/>
 *         &lt;element name="Currency" type="{}typeCurrency"/>
 *         &lt;element ref="{}Country" minOccurs="0"/>
 *         &lt;element ref="{}BankName" minOccurs="0"/>
 *         &lt;element ref="{}BICCode" minOccurs="0"/>
 *         &lt;element ref="{}IBAN" minOccurs="0"/>
 *         &lt;element ref="{}GLAccount"/>
 *         &lt;element name="GLPaymentInTransit" type="{}typeGLAccount" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{}code use="required""/>
 *       &lt;attribute name="type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="C"/>
 *             &lt;enumeration value="K"/>
 *             &lt;enumeration value="P"/>
 *             &lt;enumeration value="R"/>
 *             &lt;enumeration value="U"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "currency",
    "country",
    "bankName",
    "bicCode",
    "iban",
    "glAccount",
    "glPaymentInTransit"
})
@XmlRootElement(name = "OwnBankAccount")
public class OwnBankAccount {

    @XmlElement(name = "Description")
    protected TypeDescription description;
    @XmlElement(name = "Currency")
    protected TypeCurrency currency;
    @XmlElement(name = "Country")
    protected Country country;
    @XmlElement(name = "BankName")
    protected String bankName;
    @XmlElement(name = "BICCode")
    protected String bicCode;
    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "GLAccount")
    protected TypeGLAccount glAccount;
    @XmlElement(name = "GLPaymentInTransit")
    protected TypeGLAccount glPaymentInTransit;
    @XmlAttribute(required = true)
    protected String code;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;

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
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the bicCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICCode() {
        return bicCode;
    }

    /**
     * Sets the value of the bicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICCode(String value) {
        this.bicCode = value;
    }

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Gets the value of the glAccount property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGLAccount }
     *     
     */
    public TypeGLAccount getGLAccount() {
        return glAccount;
    }

    /**
     * Sets the value of the glAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGLAccount }
     *     
     */
    public void setGLAccount(TypeGLAccount value) {
        this.glAccount = value;
    }

    /**
     * Gets the value of the glPaymentInTransit property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGLAccount }
     *     
     */
    public TypeGLAccount getGLPaymentInTransit() {
        return glPaymentInTransit;
    }

    /**
     * Sets the value of the glPaymentInTransit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGLAccount }
     *     
     */
    public void setGLPaymentInTransit(TypeGLAccount value) {
        this.glPaymentInTransit = value;
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

}