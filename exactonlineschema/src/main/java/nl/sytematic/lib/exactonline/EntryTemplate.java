//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 03:25:32 PM CEST 
//


package nl.sytematic.lib.exactonline;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}Journal"/>
 *         &lt;element name="JournalType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element ref="{}Description" minOccurs="0"/>
 *         &lt;element ref="{}PaymentCondition" minOccurs="0"/>
 *         &lt;element name="Currency" type="{}typeCurrency" minOccurs="0"/>
 *         &lt;element ref="{}Note" minOccurs="0"/>
 *         &lt;element name="Reversal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Blocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{}EntryTemplateLine" maxOccurs="unbounded"/>
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
@XmlType(name = "", propOrder = {
    "journal",
    "journalType",
    "description",
    "paymentCondition",
    "currency",
    "note",
    "reversal",
    "blocked",
    "entryTemplateLine"
})
@XmlRootElement(name = "EntryTemplate")
public class EntryTemplate {

    @XmlElement(name = "Journal")
    protected Journal journal;
    @XmlElement(name = "JournalType")
    protected BigInteger journalType;
    @XmlElement(name = "Description")
    protected TypeDescription description;
    @XmlElement(name = "PaymentCondition")
    protected PaymentCondition paymentCondition;
    @XmlElement(name = "Currency")
    protected TypeCurrency currency;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "Reversal")
    protected Boolean reversal;
    @XmlElement(name = "Blocked")
    protected Boolean blocked;
    @XmlElement(name = "EntryTemplateLine")
    protected List<EntryTemplateLine> entryTemplateLine;
    @XmlAttribute(required = true)
    protected String code;

    /**
     * Gets the value of the journal property.
     * 
     * @return
     *     possible object is
     *     {@link Journal }
     *     
     */
    public Journal getJournal() {
        return journal;
    }

    /**
     * Sets the value of the journal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Journal }
     *     
     */
    public void setJournal(Journal value) {
        this.journal = value;
    }

    /**
     * Gets the value of the journalType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJournalType() {
        return journalType;
    }

    /**
     * Sets the value of the journalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJournalType(BigInteger value) {
        this.journalType = value;
    }

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
     * Gets the value of the paymentCondition property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCondition }
     *     
     */
    public PaymentCondition getPaymentCondition() {
        return paymentCondition;
    }

    /**
     * Sets the value of the paymentCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCondition }
     *     
     */
    public void setPaymentCondition(PaymentCondition value) {
        this.paymentCondition = value;
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
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the reversal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReversal() {
        return reversal;
    }

    /**
     * Sets the value of the reversal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReversal(Boolean value) {
        this.reversal = value;
    }

    /**
     * Gets the value of the blocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlocked() {
        return blocked;
    }

    /**
     * Sets the value of the blocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlocked(Boolean value) {
        this.blocked = value;
    }

    /**
     * Gets the value of the entryTemplateLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entryTemplateLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntryTemplateLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntryTemplateLine }
     * 
     * 
     */
    public List<EntryTemplateLine> getEntryTemplateLine() {
        if (entryTemplateLine == null) {
            entryTemplateLine = new ArrayList<EntryTemplateLine>();
        }
        return this.entryTemplateLine;
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
