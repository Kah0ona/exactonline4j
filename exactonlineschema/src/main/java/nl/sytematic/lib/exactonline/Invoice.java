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
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{}Journal" minOccurs="0"/>
 *         &lt;element ref="{}OrderDate" minOccurs="0"/>
 *         &lt;element name="InvoiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element ref="{}Description" minOccurs="0"/>
 *         &lt;element ref="{}YourRef" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderedBy" type="{}typeAccount"/>
 *         &lt;element name="DeliverTo" type="{}typeAccount" minOccurs="0"/>
 *         &lt;element ref="{}DeliveryAddress" minOccurs="0"/>
 *         &lt;element name="InvoiceTo" type="{}typeAccount"/>
 *         &lt;element ref="{}Contact" minOccurs="0"/>
 *         &lt;element ref="{}Warehouse" minOccurs="0"/>
 *         &lt;element ref="{}PaymentCondition" minOccurs="0"/>
 *         &lt;element name="DDMandate" type="{}typeDDMandate" minOccurs="0"/>
 *         &lt;element ref="{}ForeignAmount" minOccurs="0"/>
 *         &lt;element ref="{}Document" minOccurs="0"/>
 *         &lt;element ref="{}ShippingMethod" minOccurs="0"/>
 *         &lt;element name="SalesPerson" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}EntryDiscount" minOccurs="0"/>
 *         &lt;element name="InvoiceLine" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}Description" minOccurs="0"/>
 *                   &lt;element ref="{}Item"/>
 *                   &lt;element ref="{}Quantity" minOccurs="0"/>
 *                   &lt;element ref="{}Unit" minOccurs="0"/>
 *                   &lt;element name="UnitPrice" type="{}typePrice" minOccurs="0"/>
 *                   &lt;element name="NetPrice" type="{}typePrice" minOccurs="0"/>
 *                   &lt;element ref="{}ForeignAmount" minOccurs="0"/>
 *                   &lt;element name="DiscountPercentage" type="{}typePercentage" minOccurs="0"/>
 *                   &lt;element ref="{}Costcenter" minOccurs="0"/>
 *                   &lt;element ref="{}Costunit" minOccurs="0"/>
 *                   &lt;element ref="{}Note" minOccurs="0"/>
 *                   &lt;element ref="{}StartDate" minOccurs="0"/>
 *                   &lt;element ref="{}EndDate" minOccurs="0"/>
 *                   &lt;element ref="{}Project" minOccurs="0"/>
 *                   &lt;element ref="{}Employee" minOccurs="0"/>
 *                   &lt;element ref="{}GLAccount" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="line" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ordernumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="invoicenumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="8020"/>
 *             &lt;enumeration value="8021"/>
 *             &lt;enumeration value="8023"/>
 *             &lt;enumeration value="8024"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
    "journal",
    "orderDate",
    "invoiceDate",
    "dueDate",
    "description",
    "yourRef",
    "notes",
    "orderedBy",
    "deliverTo",
    "deliveryAddress",
    "invoiceTo",
    "contact",
    "warehouse",
    "paymentCondition",
    "ddMandate",
    "foreignAmount",
    "document",
    "shippingMethod",
    "salesPerson",
    "entryDiscount",
    "invoiceLine"
})
@XmlRootElement(name = "Invoice")
public class Invoice {

    @XmlElement(name = "Journal")
    protected Journal journal;
    @XmlElement(name = "OrderDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(name = "InvoiceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar invoiceDate;
    @XmlElement(name = "DueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(name = "Description")
    protected TypeDescription description;
    @XmlElement(name = "YourRef")
    protected String yourRef;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "OrderedBy")
    protected TypeAccount orderedBy;
    @XmlElement(name = "DeliverTo")
    protected TypeAccount deliverTo;
    @XmlElement(name = "DeliveryAddress")
    protected DeliveryAddress deliveryAddress;
    @XmlElement(name = "InvoiceTo")
    protected TypeAccount invoiceTo;
    @XmlElement(name = "Contact")
    protected Contact contact;
    @XmlElement(name = "Warehouse")
    protected Warehouse warehouse;
    @XmlElement(name = "PaymentCondition")
    protected PaymentCondition paymentCondition;
    @XmlElement(name = "DDMandate")
    protected TypeDDMandate ddMandate;
    @XmlElement(name = "ForeignAmount")
    protected ForeignAmount foreignAmount;
    @XmlElement(name = "Document")
    protected Document document;
    @XmlElement(name = "ShippingMethod")
    protected ShippingMethod shippingMethod;
    @XmlElement(name = "SalesPerson")
    protected Invoice.SalesPerson salesPerson;
    @XmlElement(name = "EntryDiscount")
    protected EntryDiscount entryDiscount;
    @XmlElement(name = "InvoiceLine")
    protected List<Invoice.InvoiceLine> invoiceLine;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String ordernumber;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String invoicenumber;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;

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
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
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
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the orderedBy property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAccount }
     *     
     */
    public TypeAccount getOrderedBy() {
        return orderedBy;
    }

    /**
     * Sets the value of the orderedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAccount }
     *     
     */
    public void setOrderedBy(TypeAccount value) {
        this.orderedBy = value;
    }

    /**
     * Gets the value of the deliverTo property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAccount }
     *     
     */
    public TypeAccount getDeliverTo() {
        return deliverTo;
    }

    /**
     * Sets the value of the deliverTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAccount }
     *     
     */
    public void setDeliverTo(TypeAccount value) {
        this.deliverTo = value;
    }

    /**
     * Gets the value of the deliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryAddress }
     *     
     */
    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the value of the deliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryAddress }
     *     
     */
    public void setDeliveryAddress(DeliveryAddress value) {
        this.deliveryAddress = value;
    }

    /**
     * Gets the value of the invoiceTo property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAccount }
     *     
     */
    public TypeAccount getInvoiceTo() {
        return invoiceTo;
    }

    /**
     * Sets the value of the invoiceTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAccount }
     *     
     */
    public void setInvoiceTo(TypeAccount value) {
        this.invoiceTo = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the warehouse property.
     * 
     * @return
     *     possible object is
     *     {@link Warehouse }
     *     
     */
    public Warehouse getWarehouse() {
        return warehouse;
    }

    /**
     * Sets the value of the warehouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Warehouse }
     *     
     */
    public void setWarehouse(Warehouse value) {
        this.warehouse = value;
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
     * Gets the value of the ddMandate property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDDMandate }
     *     
     */
    public TypeDDMandate getDDMandate() {
        return ddMandate;
    }

    /**
     * Sets the value of the ddMandate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDDMandate }
     *     
     */
    public void setDDMandate(TypeDDMandate value) {
        this.ddMandate = value;
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
     * Gets the value of the shippingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingMethod }
     *     
     */
    public ShippingMethod getShippingMethod() {
        return shippingMethod;
    }

    /**
     * Sets the value of the shippingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingMethod }
     *     
     */
    public void setShippingMethod(ShippingMethod value) {
        this.shippingMethod = value;
    }

    /**
     * Gets the value of the salesPerson property.
     * 
     * @return
     *     possible object is
     *     {@link Invoice.SalesPerson }
     *     
     */
    public Invoice.SalesPerson getSalesPerson() {
        return salesPerson;
    }

    /**
     * Sets the value of the salesPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invoice.SalesPerson }
     *     
     */
    public void setSalesPerson(Invoice.SalesPerson value) {
        this.salesPerson = value;
    }

    /**
     * Gets the value of the entryDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link EntryDiscount }
     *     
     */
    public EntryDiscount getEntryDiscount() {
        return entryDiscount;
    }

    /**
     * Sets the value of the entryDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryDiscount }
     *     
     */
    public void setEntryDiscount(EntryDiscount value) {
        this.entryDiscount = value;
    }

    /**
     * Gets the value of the invoiceLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Invoice.InvoiceLine }
     * 
     * 
     */
    public List<Invoice.InvoiceLine> getInvoiceLine() {
        if (invoiceLine == null) {
            invoiceLine = new ArrayList<Invoice.InvoiceLine>();
        }
        return this.invoiceLine;
    }

    /**
     * Gets the value of the ordernumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdernumber() {
        return ordernumber;
    }

    /**
     * Sets the value of the ordernumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdernumber(String value) {
        this.ordernumber = value;
    }

    /**
     * Gets the value of the invoicenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoicenumber() {
        return invoicenumber;
    }

    /**
     * Sets the value of the invoicenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoicenumber(String value) {
        this.invoicenumber = value;
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
     *       &lt;sequence>
     *         &lt;element ref="{}Description" minOccurs="0"/>
     *         &lt;element ref="{}Item"/>
     *         &lt;element ref="{}Quantity" minOccurs="0"/>
     *         &lt;element ref="{}Unit" minOccurs="0"/>
     *         &lt;element name="UnitPrice" type="{}typePrice" minOccurs="0"/>
     *         &lt;element name="NetPrice" type="{}typePrice" minOccurs="0"/>
     *         &lt;element ref="{}ForeignAmount" minOccurs="0"/>
     *         &lt;element name="DiscountPercentage" type="{}typePercentage" minOccurs="0"/>
     *         &lt;element ref="{}Costcenter" minOccurs="0"/>
     *         &lt;element ref="{}Costunit" minOccurs="0"/>
     *         &lt;element ref="{}Note" minOccurs="0"/>
     *         &lt;element ref="{}StartDate" minOccurs="0"/>
     *         &lt;element ref="{}EndDate" minOccurs="0"/>
     *         &lt;element ref="{}Project" minOccurs="0"/>
     *         &lt;element ref="{}Employee" minOccurs="0"/>
     *         &lt;element ref="{}GLAccount" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="line" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
        "item",
        "quantity",
        "unit",
        "unitPrice",
        "netPrice",
        "foreignAmount",
        "discountPercentage",
        "costcenter",
        "costunit",
        "note",
        "startDate",
        "endDate",
        "project",
        "employee",
        "glAccount"
    })
    public static class InvoiceLine {

        @XmlElement(name = "Description")
        protected TypeDescription description;
        @XmlElement(name = "Item", required = true)
        protected TypeItem item;
        @XmlElement(name = "Quantity")
        protected Float quantity;
        @XmlElement(name = "Unit")
        protected Unit unit;
        @XmlElement(name = "UnitPrice")
        protected TypePrice unitPrice;
        @XmlElement(name = "NetPrice")
        protected TypePrice netPrice;
        @XmlElement(name = "ForeignAmount")
        protected ForeignAmount foreignAmount;
        @XmlElement(name = "DiscountPercentage")
        protected Float discountPercentage;
        @XmlElement(name = "Costcenter")
        protected Costcenter costcenter;
        @XmlElement(name = "Costunit")
        protected Costunit costunit;
        @XmlElement(name = "Note")
        protected String note;
        @XmlElement(name = "StartDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startDate;
        @XmlElement(name = "EndDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar endDate;
        @XmlElement(name = "Project")
        protected Project project;
        @XmlElement(name = "Employee")
        protected Employee employee;
        @XmlElement(name = "GLAccount")
        protected TypeGLAccount glAccount;
        @XmlAttribute
        protected BigInteger line;

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
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link Unit }
         *     
         */
        public Unit getUnit() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Unit }
         *     
         */
        public void setUnit(Unit value) {
            this.unit = value;
        }

        /**
         * Gets the value of the unitPrice property.
         * 
         * @return
         *     possible object is
         *     {@link TypePrice }
         *     
         */
        public TypePrice getUnitPrice() {
            return unitPrice;
        }

        /**
         * Sets the value of the unitPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypePrice }
         *     
         */
        public void setUnitPrice(TypePrice value) {
            this.unitPrice = value;
        }

        /**
         * Gets the value of the netPrice property.
         * 
         * @return
         *     possible object is
         *     {@link TypePrice }
         *     
         */
        public TypePrice getNetPrice() {
            return netPrice;
        }

        /**
         * Sets the value of the netPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypePrice }
         *     
         */
        public void setNetPrice(TypePrice value) {
            this.netPrice = value;
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
         * Gets the value of the startDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartDate() {
            return startDate;
        }

        /**
         * Sets the value of the startDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartDate(XMLGregorianCalendar value) {
            this.startDate = value;
        }

        /**
         * Gets the value of the endDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndDate() {
            return endDate;
        }

        /**
         * Sets the value of the endDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEndDate(XMLGregorianCalendar value) {
            this.endDate = value;
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
         * Gets the value of the employee property.
         * 
         * @return
         *     possible object is
         *     {@link Employee }
         *     
         */
        public Employee getEmployee() {
            return employee;
        }

        /**
         * Sets the value of the employee property.
         * 
         * @param value
         *     allowed object is
         *     {@link Employee }
         *     
         */
        public void setEmployee(Employee value) {
            this.employee = value;
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
     *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fullName"
    })
    public static class SalesPerson {

        @XmlElement(name = "FullName")
        protected String fullName;
        @XmlAttribute
        protected String id;

        /**
         * Gets the value of the fullName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFullName() {
            return fullName;
        }

        /**
         * Sets the value of the fullName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFullName(String value) {
            this.fullName = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

    }

}
