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
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{}Description"/>
 *         &lt;element ref="{}GLAccount" minOccurs="0"/>
 *         &lt;element name="Currency" type="{}typeCurrency" minOccurs="0"/>
 *         &lt;element ref="{}OwnBankAccount" minOccurs="0"/>
 *         &lt;element name="UseSepa" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseSepaDirectDebit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{}code use="required""/>
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="variableCurrency" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="variableExchangeRate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="autoSave" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="allowVAT" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    "glAccount",
    "currency",
    "ownBankAccount",
    "useSepa",
    "useSepaDirectDebit"
})
@XmlRootElement(name = "Journal")
public class Journal {

    @XmlElement(name = "Description")
    protected TypeDescription description;
    @XmlElement(name = "GLAccount")
    protected TypeGLAccount glAccount;
    @XmlElement(name = "Currency")
    protected TypeCurrency currency;
    @XmlElement(name = "OwnBankAccount")
    protected OwnBankAccount ownBankAccount;
    @XmlElement(name = "UseSepa")
    protected Boolean useSepa;
    @XmlElement(name = "UseSepaDirectDebit")
    protected Boolean useSepaDirectDebit;
    @XmlAttribute(required = true)
    protected String code;
    @XmlAttribute
    protected BigInteger status;
    @XmlAttribute
    protected BigInteger type;
    @XmlAttribute
    protected Boolean variableCurrency;
    @XmlAttribute
    protected Boolean variableExchangeRate;
    @XmlAttribute
    protected Boolean autoSave;
    @XmlAttribute
    protected Boolean allowVAT;

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
     * Gets the value of the ownBankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link OwnBankAccount }
     *     
     */
    public OwnBankAccount getOwnBankAccount() {
        return ownBankAccount;
    }

    /**
     * Sets the value of the ownBankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnBankAccount }
     *     
     */
    public void setOwnBankAccount(OwnBankAccount value) {
        this.ownBankAccount = value;
    }

    /**
     * Gets the value of the useSepa property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseSepa() {
        return useSepa;
    }

    /**
     * Sets the value of the useSepa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseSepa(Boolean value) {
        this.useSepa = value;
    }

    /**
     * Gets the value of the useSepaDirectDebit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseSepaDirectDebit() {
        return useSepaDirectDebit;
    }

    /**
     * Sets the value of the useSepaDirectDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseSepaDirectDebit(Boolean value) {
        this.useSepaDirectDebit = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatus(BigInteger value) {
        this.status = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setType(BigInteger value) {
        this.type = value;
    }

    /**
     * Gets the value of the variableCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVariableCurrency() {
        return variableCurrency;
    }

    /**
     * Sets the value of the variableCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVariableCurrency(Boolean value) {
        this.variableCurrency = value;
    }

    /**
     * Gets the value of the variableExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVariableExchangeRate() {
        return variableExchangeRate;
    }

    /**
     * Sets the value of the variableExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVariableExchangeRate(Boolean value) {
        this.variableExchangeRate = value;
    }

    /**
     * Gets the value of the autoSave property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoSave() {
        return autoSave;
    }

    /**
     * Sets the value of the autoSave property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoSave(Boolean value) {
        this.autoSave = value;
    }

    /**
     * Gets the value of the allowVAT property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowVAT() {
        return allowVAT;
    }

    /**
     * Sets the value of the allowVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowVAT(Boolean value) {
        this.allowVAT = value;
    }

}
