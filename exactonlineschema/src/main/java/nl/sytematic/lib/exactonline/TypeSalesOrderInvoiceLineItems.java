//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 03:25:32 PM CEST 
//


package nl.sytematic.lib.exactonline;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeSalesOrderInvoiceLineItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeSalesOrderInvoiceLineItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Item" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="linenumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "typeSalesOrderInvoiceLineItems", propOrder = {
    "item"
})
public class TypeSalesOrderInvoiceLineItems {

    @XmlElement(name = "Item", required = true)
    protected List<TypeSalesOrderInvoiceLineItems.Item> item;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSalesOrderInvoiceLineItems.Item }
     * 
     * 
     */
    public List<TypeSalesOrderInvoiceLineItems.Item> getItem() {
        if (item == null) {
            item = new ArrayList<TypeSalesOrderInvoiceLineItems.Item>();
        }
        return this.item;
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
     *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *       &lt;/sequence>
     *       &lt;attribute name="linenumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "code",
        "description",
        "quantity",
        "notes"
    })
    public static class Item {

        @XmlElement(name = "Code", required = true)
        protected Object code;
        @XmlElement(name = "Description", required = true)
        protected Object description;
        @XmlElement(name = "Quantity")
        protected float quantity;
        @XmlElement(name = "Notes", required = true)
        protected Object notes;
        @XmlAttribute
        protected String linenumber;
        @XmlAttribute
        protected String id;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCode(Object value) {
            this.code = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDescription(Object value) {
            this.description = value;
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
         * Gets the value of the notes property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getNotes() {
            return notes;
        }

        /**
         * Sets the value of the notes property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setNotes(Object value) {
            this.notes = value;
        }

        /**
         * Gets the value of the linenumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLinenumber() {
            return linenumber;
        }

        /**
         * Sets the value of the linenumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLinenumber(String value) {
            this.linenumber = value;
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
