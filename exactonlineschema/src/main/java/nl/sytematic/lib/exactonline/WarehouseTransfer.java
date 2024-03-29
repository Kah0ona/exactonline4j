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
 *         &lt;element ref="{}Description" minOccurs="0"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarehouseFrom">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}Description"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="WarehouseTo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}Description"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PlannedTransferDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="WarehouseTransferLine" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}Description" minOccurs="0"/>
 *                   &lt;element ref="{}Item"/>
 *                   &lt;element ref="{}Quantity"/>
 *                   &lt;element ref="{}Unit" minOccurs="0"/>
 *                   &lt;element name="StorageLocationFrom" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="StorageLocationTo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Line" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="TransferNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Status">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="10"/>
 *             &lt;enumeration value="30"/>
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
    "description",
    "remark",
    "warehouseFrom",
    "warehouseTo",
    "entryDate",
    "plannedTransferDate",
    "warehouseTransferLine"
})
@XmlRootElement(name = "WarehouseTransfer")
public class WarehouseTransfer {

    @XmlElement(name = "Description")
    protected TypeDescription description;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElement(name = "WarehouseFrom")
    protected WarehouseTransfer.WarehouseFrom warehouseFrom;
    @XmlElement(name = "WarehouseTo")
    protected WarehouseTransfer.WarehouseTo warehouseTo;
    @XmlElement(name = "EntryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar entryDate;
    @XmlElement(name = "PlannedTransferDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar plannedTransferDate;
    @XmlElement(name = "WarehouseTransferLine")
    protected List<WarehouseTransfer.WarehouseTransferLine> warehouseTransferLine;
    @XmlAttribute(name = "TransferNumber")
    @XmlSchemaType(name = "anySimpleType")
    protected String transferNumber;
    @XmlAttribute(name = "Status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;

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
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the warehouseFrom property.
     * 
     * @return
     *     possible object is
     *     {@link WarehouseTransfer.WarehouseFrom }
     *     
     */
    public WarehouseTransfer.WarehouseFrom getWarehouseFrom() {
        return warehouseFrom;
    }

    /**
     * Sets the value of the warehouseFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarehouseTransfer.WarehouseFrom }
     *     
     */
    public void setWarehouseFrom(WarehouseTransfer.WarehouseFrom value) {
        this.warehouseFrom = value;
    }

    /**
     * Gets the value of the warehouseTo property.
     * 
     * @return
     *     possible object is
     *     {@link WarehouseTransfer.WarehouseTo }
     *     
     */
    public WarehouseTransfer.WarehouseTo getWarehouseTo() {
        return warehouseTo;
    }

    /**
     * Sets the value of the warehouseTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarehouseTransfer.WarehouseTo }
     *     
     */
    public void setWarehouseTo(WarehouseTransfer.WarehouseTo value) {
        this.warehouseTo = value;
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
     * Gets the value of the plannedTransferDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlannedTransferDate() {
        return plannedTransferDate;
    }

    /**
     * Sets the value of the plannedTransferDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlannedTransferDate(XMLGregorianCalendar value) {
        this.plannedTransferDate = value;
    }

    /**
     * Gets the value of the warehouseTransferLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warehouseTransferLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarehouseTransferLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarehouseTransfer.WarehouseTransferLine }
     * 
     * 
     */
    public List<WarehouseTransfer.WarehouseTransferLine> getWarehouseTransferLine() {
        if (warehouseTransferLine == null) {
            warehouseTransferLine = new ArrayList<WarehouseTransfer.WarehouseTransferLine>();
        }
        return this.warehouseTransferLine;
    }

    /**
     * Gets the value of the transferNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferNumber() {
        return transferNumber;
    }

    /**
     * Sets the value of the transferNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferNumber(String value) {
        this.transferNumber = value;
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
     *         &lt;element ref="{}Description"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description"
    })
    public static class WarehouseFrom {

        @XmlElement(name = "Description", required = true)
        protected TypeDescription description;
        @XmlAttribute(name = "Code", required = true)
        @XmlSchemaType(name = "anySimpleType")
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
     *         &lt;element ref="{}Description"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description"
    })
    public static class WarehouseTo {

        @XmlElement(name = "Description", required = true)
        protected TypeDescription description;
        @XmlAttribute(name = "Code", required = true)
        @XmlSchemaType(name = "anySimpleType")
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
     *         &lt;element ref="{}Quantity"/>
     *         &lt;element ref="{}Unit" minOccurs="0"/>
     *         &lt;element name="StorageLocationFrom" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="StorageLocationTo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Line" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
        "storageLocationFrom",
        "storageLocationTo"
    })
    public static class WarehouseTransferLine {

        @XmlElement(name = "Description")
        protected TypeDescription description;
        @XmlElement(name = "Item", required = true)
        protected TypeItem item;
        @XmlElement(name = "Quantity")
        protected float quantity;
        @XmlElement(name = "Unit")
        protected Unit unit;
        @XmlElement(name = "StorageLocationFrom")
        protected WarehouseTransfer.WarehouseTransferLine.StorageLocationFrom storageLocationFrom;
        @XmlElement(name = "StorageLocationTo")
        protected WarehouseTransfer.WarehouseTransferLine.StorageLocationTo storageLocationTo;
        @XmlAttribute(name = "Line")
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
         * Gets the value of the storageLocationFrom property.
         * 
         * @return
         *     possible object is
         *     {@link WarehouseTransfer.WarehouseTransferLine.StorageLocationFrom }
         *     
         */
        public WarehouseTransfer.WarehouseTransferLine.StorageLocationFrom getStorageLocationFrom() {
            return storageLocationFrom;
        }

        /**
         * Sets the value of the storageLocationFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link WarehouseTransfer.WarehouseTransferLine.StorageLocationFrom }
         *     
         */
        public void setStorageLocationFrom(WarehouseTransfer.WarehouseTransferLine.StorageLocationFrom value) {
            this.storageLocationFrom = value;
        }

        /**
         * Gets the value of the storageLocationTo property.
         * 
         * @return
         *     possible object is
         *     {@link WarehouseTransfer.WarehouseTransferLine.StorageLocationTo }
         *     
         */
        public WarehouseTransfer.WarehouseTransferLine.StorageLocationTo getStorageLocationTo() {
            return storageLocationTo;
        }

        /**
         * Sets the value of the storageLocationTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link WarehouseTransfer.WarehouseTransferLine.StorageLocationTo }
         *     
         */
        public void setStorageLocationTo(WarehouseTransfer.WarehouseTransferLine.StorageLocationTo value) {
            this.storageLocationTo = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class StorageLocationFrom {

            @XmlAttribute(name = "Code", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String code;

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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class StorageLocationTo {

            @XmlAttribute(name = "Code", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String code;

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

    }

}
