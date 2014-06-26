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
 *         &lt;element ref="{}Account" minOccurs="0"/>
 *         &lt;element ref="{}Date"/>
 *         &lt;element ref="{}Employee"/>
 *         &lt;element ref="{}Item"/>
 *         &lt;element ref="{}Note" minOccurs="0"/>
 *         &lt;element ref="{}Project" minOccurs="0"/>
 *         &lt;element name="Expense" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}Quantity"/>
 *         &lt;element name="Price" type="{}typePrice" minOccurs="0"/>
 *         &lt;element ref="{}Attachment" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="status">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="10"/>
 *             &lt;enumeration value="11"/>
 *             &lt;enumeration value="14"/>
 *             &lt;enumeration value="16"/>
 *             &lt;enumeration value="19"/>
 *             &lt;enumeration value="20"/>
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
    "account",
    "date",
    "employee",
    "item",
    "note",
    "project",
    "expense",
    "quantity",
    "price",
    "attachment"
})
@XmlRootElement(name = "CostTransaction")
public class CostTransaction {

    @XmlElement(name = "Account")
    protected TypeAccount account;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Employee", required = true)
    protected Employee employee;
    @XmlElement(name = "Item", required = true)
    protected TypeItem item;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "Project")
    protected Project project;
    @XmlElement(name = "Expense")
    protected CostTransaction.Expense expense;
    @XmlElement(name = "Quantity")
    protected float quantity;
    @XmlElement(name = "Price")
    protected TypePrice price;
    @XmlElement(name = "Attachment")
    protected TypeAttachment attachment;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String number;
    @XmlAttribute
    protected BigInteger status;

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
     * Gets the value of the expense property.
     * 
     * @return
     *     possible object is
     *     {@link CostTransaction.Expense }
     *     
     */
    public CostTransaction.Expense getExpense() {
        return expense;
    }

    /**
     * Sets the value of the expense property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostTransaction.Expense }
     *     
     */
    public void setExpense(CostTransaction.Expense value) {
        this.expense = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public float getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(float value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link TypePrice }
     *     
     */
    public TypePrice getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePrice }
     *     
     */
    public void setPrice(TypePrice value) {
        this.price = value;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAttachment }
     *     
     */
    public TypeAttachment getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAttachment }
     *     
     */
    public void setAttachment(TypeAttachment value) {
        this.attachment = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Expense {

        @XmlAttribute(name = "ID", required = true)
        protected String id;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
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
        public void setID(String value) {
            this.id = value;
        }

    }

}
