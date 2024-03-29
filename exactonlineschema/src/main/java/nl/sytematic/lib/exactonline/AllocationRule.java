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
 *         &lt;element name="AccountBankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Words" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WordCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element ref="{}Costcenter" minOccurs="0"/>
 *         &lt;element ref="{}Costunit" minOccurs="0"/>
 *         &lt;element ref="{}GLAccount" minOccurs="0"/>
 *         &lt;element ref="{}Account" minOccurs="0"/>
 *         &lt;element ref="{}VAT" minOccurs="0"/>
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
    "accountBankAccount",
    "words",
    "wordCount",
    "costcenter",
    "costunit",
    "glAccount",
    "account",
    "vat"
})
@XmlRootElement(name = "AllocationRule")
public class AllocationRule {

    @XmlElement(name = "AccountBankAccount")
    protected String accountBankAccount;
    @XmlElement(name = "Words")
    protected String words;
    @XmlElement(name = "WordCount")
    protected BigInteger wordCount;
    @XmlElement(name = "Costcenter")
    protected Costcenter costcenter;
    @XmlElement(name = "Costunit")
    protected Costunit costunit;
    @XmlElement(name = "GLAccount")
    protected TypeGLAccount glAccount;
    @XmlElement(name = "Account")
    protected TypeAccount account;
    @XmlElement(name = "VAT")
    protected VAT vat;

    /**
     * Gets the value of the accountBankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBankAccount() {
        return accountBankAccount;
    }

    /**
     * Sets the value of the accountBankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBankAccount(String value) {
        this.accountBankAccount = value;
    }

    /**
     * Gets the value of the words property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWords() {
        return words;
    }

    /**
     * Sets the value of the words property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWords(String value) {
        this.words = value;
    }

    /**
     * Gets the value of the wordCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWordCount() {
        return wordCount;
    }

    /**
     * Sets the value of the wordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWordCount(BigInteger value) {
        this.wordCount = value;
    }

    /**
     * Gets the value of the costcenter property.
     * 
     * @return
     *     possible object is
     *     {@link Costcenter }
     *     
     */
    public Costcenter getCostcenter() {
        return costcenter;
    }

    /**
     * Sets the value of the costcenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Costcenter }
     *     
     */
    public void setCostcenter(Costcenter value) {
        this.costcenter = value;
    }

    /**
     * Gets the value of the costunit property.
     * 
     * @return
     *     possible object is
     *     {@link Costunit }
     *     
     */
    public Costunit getCostunit() {
        return costunit;
    }

    /**
     * Sets the value of the costunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Costunit }
     *     
     */
    public void setCostunit(Costunit value) {
        this.costunit = value;
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
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAccount }
     *     
     */
    public TypeAccount getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAccount }
     *     
     */
    public void setAccount(TypeAccount value) {
        this.account = value;
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

}
