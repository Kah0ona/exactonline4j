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
 *         &lt;element ref="{}Date"/>
 *         &lt;element name="VATType" type="{}typeVATType" minOccurs="0"/>
 *         &lt;element ref="{}FinYear" minOccurs="0"/>
 *         &lt;element ref="{}FinPeriod" minOccurs="0"/>
 *         &lt;element ref="{}GLAccount"/>
 *         &lt;element ref="{}GLOffset" minOccurs="0"/>
 *         &lt;element ref="{}Description" minOccurs="0"/>
 *         &lt;element ref="{}DueDate" minOccurs="0"/>
 *         &lt;element ref="{}InvoiceDate" minOccurs="0"/>
 *         &lt;element ref="{}Account" minOccurs="0"/>
 *         &lt;element ref="{}TrackingNumber" minOccurs="0"/>
 *         &lt;element ref="{}Costcenter" minOccurs="0"/>
 *         &lt;element ref="{}Costunit" minOccurs="0"/>
 *         &lt;element ref="{}Asset" minOccurs="0"/>
 *         &lt;element ref="{}Item" minOccurs="0"/>
 *         &lt;element ref="{}Quantity" minOccurs="0"/>
 *         &lt;element ref="{}Amount" minOccurs="0"/>
 *         &lt;element ref="{}ForeignAmount" minOccurs="0"/>
 *         &lt;element ref="{}References" minOccurs="0"/>
 *         &lt;element ref="{}OwnBankAccount" minOccurs="0"/>
 *         &lt;element ref="{}BankAccount" minOccurs="0"/>
 *         &lt;element name="MatchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}Note" minOccurs="0"/>
 *         &lt;element ref="{}Document" minOccurs="0"/>
 *         &lt;element ref="{}Project" minOccurs="0"/>
 *         &lt;element ref="{}Subscription" minOccurs="0"/>
 *         &lt;element name="IntraStat" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="StatisticalNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="StatisticalValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *                   &lt;element name="StatisticalQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *                   &lt;element name="StatisticalNetWeight" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *                   &lt;element name="System" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="TransactionA" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="TransactionB" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="TransportMethod" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="DeliveryTerm" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute ref="{}type"/>
 *       &lt;attribute name="linetype">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;enumeration value="0"/>
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="3"/>
 *             &lt;enumeration value="10"/>
 *             &lt;enumeration value="11"/>
 *             &lt;enumeration value="12"/>
 *             &lt;enumeration value="20"/>
 *             &lt;enumeration value="22"/>
 *             &lt;enumeration value="24"/>
 *             &lt;enumeration value="26"/>
 *             &lt;enumeration value="27"/>
 *             &lt;enumeration value="29"/>
 *             &lt;enumeration value="30"/>
 *             &lt;enumeration value="32"/>
 *             &lt;enumeration value="35"/>
 *             &lt;enumeration value="40"/>
 *             &lt;enumeration value="50"/>
 *             &lt;enumeration value="52"/>
 *             &lt;enumeration value="55"/>
 *             &lt;enumeration value="60"/>
 *             &lt;enumeration value="90"/>
 *             &lt;enumeration value="110"/>
 *             &lt;enumeration value="111"/>
 *             &lt;enumeration value="120"/>
 *             &lt;enumeration value="121"/>
 *             &lt;enumeration value="122"/>
 *             &lt;enumeration value="123"/>
 *             &lt;enumeration value="125"/>
 *             &lt;enumeration value="130"/>
 *             &lt;enumeration value="140"/>
 *             &lt;enumeration value="150"/>
 *             &lt;enumeration value="160"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="line" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="status">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="20"/>
 *             &lt;enumeration value="50"/>
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
    "date",
    "vatType",
    "finYear",
    "finPeriod",
    "glAccount",
    "glOffset",
    "description",
    "dueDate",
    "invoiceDate",
    "account",
    "trackingNumber",
    "costcenter",
    "costunit",
    "asset",
    "item",
    "quantity",
    "amount",
    "foreignAmount",
    "references",
    "ownBankAccount",
    "bankAccount",
    "matchID",
    "note",
    "document",
    "project",
    "subscription",
    "intraStat"
})
@XmlRootElement(name = "GLTransactionLine")
public class GLTransactionLine {

    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "VATType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String vatType;
    @XmlElement(name = "FinYear")
    protected FinYear finYear;
    @XmlElement(name = "FinPeriod")
    protected FinPeriod finPeriod;
    @XmlElement(name = "GLAccount", required = true)
    protected TypeGLAccount glAccount;
    @XmlElement(name = "GLOffset")
    protected TypeGLAccount glOffset;
    @XmlElement(name = "Description")
    protected TypeDescription description;
    @XmlElement(name = "DueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(name = "InvoiceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar invoiceDate;
    @XmlElement(name = "Account")
    protected TypeAccount account;
    @XmlElement(name = "TrackingNumber")
    protected TrackingNumber trackingNumber;
    @XmlElement(name = "Costcenter")
    protected Costcenter costcenter;
    @XmlElement(name = "Costunit")
    protected Costunit costunit;
    @XmlElement(name = "Asset")
    protected TypeAsset asset;
    @XmlElement(name = "Item")
    protected TypeItem item;
    @XmlElement(name = "Quantity")
    protected Float quantity;
    @XmlElement(name = "Amount")
    protected Amount amount;
    @XmlElement(name = "ForeignAmount")
    protected ForeignAmount foreignAmount;
    @XmlElement(name = "References")
    protected References references;
    @XmlElement(name = "OwnBankAccount")
    protected OwnBankAccount ownBankAccount;
    @XmlElement(name = "BankAccount")
    protected TypeBankAccount bankAccount;
    @XmlElement(name = "MatchID")
    protected String matchID;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "Document")
    protected Document document;
    @XmlElement(name = "Project")
    protected Project project;
    @XmlElement(name = "Subscription")
    protected Subscription subscription;
    @XmlElement(name = "IntraStat")
    protected GLTransactionLine.IntraStat intraStat;
    @XmlAttribute
    protected BigInteger type;
    @XmlAttribute
    protected BigInteger linetype;
    @XmlAttribute
    protected BigInteger line;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the vatType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATType() {
        return vatType;
    }

    /**
     * Sets the value of the vatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATType(String value) {
        this.vatType = value;
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
     * Gets the value of the finPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link FinPeriod }
     *     
     */
    public FinPeriod getFinPeriod() {
        return finPeriod;
    }

    /**
     * Sets the value of the finPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinPeriod }
     *     
     */
    public void setFinPeriod(FinPeriod value) {
        this.finPeriod = value;
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
     * Gets the value of the glOffset property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGLAccount }
     *     
     */
    public TypeGLAccount getGLOffset() {
        return glOffset;
    }

    /**
     * Sets the value of the glOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGLAccount }
     *     
     */
    public void setGLOffset(TypeGLAccount value) {
        this.glOffset = value;
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
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the invoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the value of the invoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceDate(XMLGregorianCalendar value) {
        this.invoiceDate = value;
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
     * Gets the value of the trackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingNumber }
     *     
     */
    public TrackingNumber getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Sets the value of the trackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingNumber }
     *     
     */
    public void setTrackingNumber(TrackingNumber value) {
        this.trackingNumber = value;
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
     * Gets the value of the asset property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAsset }
     *     
     */
    public TypeAsset getAsset() {
        return asset;
    }

    /**
     * Sets the value of the asset property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAsset }
     *     
     */
    public void setAsset(TypeAsset value) {
        this.asset = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link TypeItem }
     *     
     */
    public TypeItem getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeItem }
     *     
     */
    public void setItem(TypeItem value) {
        this.item = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setQuantity(Float value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAmount(Amount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the foreignAmount property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignAmount }
     *     
     */
    public ForeignAmount getForeignAmount() {
        return foreignAmount;
    }

    /**
     * Sets the value of the foreignAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignAmount }
     *     
     */
    public void setForeignAmount(ForeignAmount value) {
        this.foreignAmount = value;
    }

    /**
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link References }
     *     
     */
    public References getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link References }
     *     
     */
    public void setReferences(References value) {
        this.references = value;
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
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link TypeBankAccount }
     *     
     */
    public TypeBankAccount getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBankAccount }
     *     
     */
    public void setBankAccount(TypeBankAccount value) {
        this.bankAccount = value;
    }

    /**
     * Gets the value of the matchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchID() {
        return matchID;
    }

    /**
     * Sets the value of the matchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchID(String value) {
        this.matchID = value;
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
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link Project }
     *     
     */
    public Project getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project }
     *     
     */
    public void setProject(Project value) {
        this.project = value;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * @return
     *     possible object is
     *     {@link Subscription }
     *     
     */
    public Subscription getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscription }
     *     
     */
    public void setSubscription(Subscription value) {
        this.subscription = value;
    }

    /**
     * Gets the value of the intraStat property.
     * 
     * @return
     *     possible object is
     *     {@link GLTransactionLine.IntraStat }
     *     
     */
    public GLTransactionLine.IntraStat getIntraStat() {
        return intraStat;
    }

    /**
     * Sets the value of the intraStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLTransactionLine.IntraStat }
     *     
     */
    public void setIntraStat(GLTransactionLine.IntraStat value) {
        this.intraStat = value;
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
     * Gets the value of the linetype property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLinetype() {
        return linetype;
    }

    /**
     * Sets the value of the linetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLinetype(BigInteger value) {
        this.linetype = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLine(BigInteger value) {
        this.line = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="StatisticalNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="StatisticalValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
     *         &lt;element name="StatisticalQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
     *         &lt;element name="StatisticalNetWeight" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
     *         &lt;element name="System" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="TransactionA" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="TransactionB" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="TransportMethod" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="DeliveryTerm" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
        "statisticalNumber",
        "statisticalValue",
        "statisticalQuantity",
        "statisticalNetWeight",
        "system",
        "transactionA",
        "transactionB",
        "transportMethod",
        "deliveryTerm",
        "area",
        "reference"
    })
    public static class IntraStat {

        @XmlElement(name = "StatisticalNumber")
        protected Object statisticalNumber;
        @XmlElement(name = "StatisticalValue")
        protected Float statisticalValue;
        @XmlElement(name = "StatisticalQuantity")
        protected Float statisticalQuantity;
        @XmlElement(name = "StatisticalNetWeight")
        protected Float statisticalNetWeight;
        @XmlElement(name = "System")
        protected Object system;
        @XmlElement(name = "TransactionA")
        protected Object transactionA;
        @XmlElement(name = "TransactionB")
        protected Object transactionB;
        @XmlElement(name = "TransportMethod")
        protected Object transportMethod;
        @XmlElement(name = "DeliveryTerm")
        protected Object deliveryTerm;
        @XmlElement(name = "Area")
        protected Object area;
        @XmlElement(name = "Reference")
        protected Object reference;

        /**
         * Gets the value of the statisticalNumber property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getStatisticalNumber() {
            return statisticalNumber;
        }

        /**
         * Sets the value of the statisticalNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setStatisticalNumber(Object value) {
            this.statisticalNumber = value;
        }

        /**
         * Gets the value of the statisticalValue property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getStatisticalValue() {
            return statisticalValue;
        }

        /**
         * Sets the value of the statisticalValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setStatisticalValue(Float value) {
            this.statisticalValue = value;
        }

        /**
         * Gets the value of the statisticalQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getStatisticalQuantity() {
            return statisticalQuantity;
        }

        /**
         * Sets the value of the statisticalQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setStatisticalQuantity(Float value) {
            this.statisticalQuantity = value;
        }

        /**
         * Gets the value of the statisticalNetWeight property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getStatisticalNetWeight() {
            return statisticalNetWeight;
        }

        /**
         * Sets the value of the statisticalNetWeight property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setStatisticalNetWeight(Float value) {
            this.statisticalNetWeight = value;
        }

        /**
         * Gets the value of the system property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSystem() {
            return system;
        }

        /**
         * Sets the value of the system property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSystem(Object value) {
            this.system = value;
        }

        /**
         * Gets the value of the transactionA property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTransactionA() {
            return transactionA;
        }

        /**
         * Sets the value of the transactionA property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTransactionA(Object value) {
            this.transactionA = value;
        }

        /**
         * Gets the value of the transactionB property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTransactionB() {
            return transactionB;
        }

        /**
         * Sets the value of the transactionB property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTransactionB(Object value) {
            this.transactionB = value;
        }

        /**
         * Gets the value of the transportMethod property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTransportMethod() {
            return transportMethod;
        }

        /**
         * Sets the value of the transportMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTransportMethod(Object value) {
            this.transportMethod = value;
        }

        /**
         * Gets the value of the deliveryTerm property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDeliveryTerm() {
            return deliveryTerm;
        }

        /**
         * Sets the value of the deliveryTerm property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDeliveryTerm(Object value) {
            this.deliveryTerm = value;
        }

        /**
         * Gets the value of the area property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getArea() {
            return area;
        }

        /**
         * Sets the value of the area property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setArea(Object value) {
            this.area = value;
        }

        /**
         * Gets the value of the reference property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getReference() {
            return reference;
        }

        /**
         * Sets the value of the reference property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setReference(Object value) {
            this.reference = value;
        }

    }

}
