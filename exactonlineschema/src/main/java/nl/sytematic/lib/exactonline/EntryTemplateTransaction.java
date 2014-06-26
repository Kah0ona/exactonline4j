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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{}EntryTemplate"/>
 *         &lt;element ref="{}Account"/>
 *         &lt;element name="EntryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Amount">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}Value"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}Document" minOccurs="0"/>
 *         &lt;element name="Status">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="20"/>
 *               &lt;enumeration value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}YourRef" minOccurs="0"/>
 *         &lt;element name="PaymentReference" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element ref="{}OrderNumber" minOccurs="0"/>
 *         &lt;element name="Entry" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element ref="{}FinYear" minOccurs="0"/>
 *         &lt;element ref="{}Journal" minOccurs="0"/>
 *         &lt;element name="Currency" type="{}typeCurrency"/>
 *         &lt;element ref="{}Description" minOccurs="0"/>
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
    "entryTemplate",
    "account",
    "entryDate",
    "amount",
    "document",
    "status",
    "yourRef",
    "paymentReference",
    "orderNumber",
    "entry",
    "finYear",
    "journal",
    "currency",
    "description"
})
@XmlRootElement(name = "EntryTemplateTransaction")
public class EntryTemplateTransaction {

    @XmlElement(name = "EntryTemplate", required = true)
    protected EntryTemplate entryTemplate;
    @XmlElement(name = "Account", required = true)
    protected TypeAccount account;
    @XmlElement(name = "EntryDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar entryDate;
    @XmlElement(name = "Amount", required = true)
    protected EntryTemplateTransaction.Amount amount;
    @XmlElement(name = "Document")
    protected Document document;
    @XmlElement(name = "Status", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;
    @XmlElement(name = "YourRef")
    protected String yourRef;
    @XmlElement(name = "PaymentReference")
    protected Object paymentReference;
    @XmlElement(name = "OrderNumber")
    protected String orderNumber;
    @XmlElement(name = "Entry")
    protected BigInteger entry;
    @XmlElement(name = "FinYear")
    protected FinYear finYear;
    @XmlElement(name = "Journal")
    protected Journal journal;
    @XmlElement(name = "Currency", required = true)
    protected TypeCurrency currency;
    @XmlElement(name = "Description")
    protected TypeDescription description;

    /**
     * Gets the value of the entryTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link EntryTemplate }
     *     
     */
    public EntryTemplate getEntryTemplate() {
        return entryTemplate;
    }

    /**
     * Sets the value of the entryTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryTemplate }
     *     
     */
    public void setEntryTemplate(EntryTemplate value) {
        this.entryTemplate = value;
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
     * Gets the value of the entryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryDate() {
        return entryDate;
    }

    /**
     * Sets the value of the entryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryDate(XMLGregorianCalendar value) {
        this.entryDate = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link EntryTemplateTransaction.Amount }
     *     
     */
    public EntryTemplateTransaction.Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryTemplateTransaction.Amount }
     *     
     */
    public void setAmount(EntryTemplateTransaction.Amount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setDocument(Document value) {
        this.document = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the yourRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYourRef() {
        return yourRef;
    }

    /**
     * Sets the value of the yourRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYourRef(String value) {
        this.yourRef = value;
    }

    /**
     * Gets the value of the paymentReference property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPaymentReference() {
        return paymentReference;
    }

    /**
     * Sets the value of the paymentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPaymentReference(Object value) {
        this.paymentReference = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the entry property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEntry() {
        return entry;
    }

    /**
     * Sets the value of the entry property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEntry(BigInteger value) {
        this.entry = value;
    }

    /**
     * Gets the value of the finYear property.
     * 
     * @return
     *     possible object is
     *     {@link FinYear }
     *     
     */
    public FinYear getFinYear() {
        return finYear;
    }

    /**
     * Sets the value of the finYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinYear }
     *     
     */
    public void setFinYear(FinYear value) {
        this.finYear = value;
    }

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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{}Value"/>
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
    public static class Amount {

        @XmlElement(name = "Value")
        protected float value;

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

    }

}