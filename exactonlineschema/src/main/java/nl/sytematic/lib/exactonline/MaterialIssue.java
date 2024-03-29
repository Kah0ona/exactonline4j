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
 *         &lt;element name="ShopOrderNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="MaterialPlanLineNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element ref="{}Warehouse" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}SerialNumbers"/>
 *           &lt;element ref="{}BatchNumbers"/>
 *         &lt;/choice>
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
    "shopOrderNumber",
    "materialPlanLineNumber",
    "itemCode",
    "quantity",
    "warehouse",
    "serialNumbers",
    "batchNumbers"
})
@XmlRootElement(name = "MaterialIssue")
public class MaterialIssue {

    @XmlElement(name = "ShopOrderNumber", required = true)
    protected BigInteger shopOrderNumber;
    @XmlElement(name = "MaterialPlanLineNumber", required = true)
    protected BigInteger materialPlanLineNumber;
    @XmlElement(name = "ItemCode", required = true)
    protected String itemCode;
    @XmlElement(name = "Quantity")
    protected float quantity;
    @XmlElement(name = "Warehouse")
    protected Warehouse warehouse;
    @XmlElement(name = "SerialNumbers")
    protected SerialNumbers serialNumbers;
    @XmlElement(name = "BatchNumbers")
    protected BatchNumbers batchNumbers;

    /**
     * Gets the value of the shopOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getShopOrderNumber() {
        return shopOrderNumber;
    }

    /**
     * Sets the value of the shopOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setShopOrderNumber(BigInteger value) {
        this.shopOrderNumber = value;
    }

    /**
     * Gets the value of the materialPlanLineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaterialPlanLineNumber() {
        return materialPlanLineNumber;
    }

    /**
     * Sets the value of the materialPlanLineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaterialPlanLineNumber(BigInteger value) {
        this.materialPlanLineNumber = value;
    }

    /**
     * Gets the value of the itemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * Sets the value of the itemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCode(String value) {
        this.itemCode = value;
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
     * Gets the value of the serialNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link SerialNumbers }
     *     
     */
    public SerialNumbers getSerialNumbers() {
        return serialNumbers;
    }

    /**
     * Sets the value of the serialNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerialNumbers }
     *     
     */
    public void setSerialNumbers(SerialNumbers value) {
        this.serialNumbers = value;
    }

    /**
     * Gets the value of the batchNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link BatchNumbers }
     *     
     */
    public BatchNumbers getBatchNumbers() {
        return batchNumbers;
    }

    /**
     * Sets the value of the batchNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchNumbers }
     *     
     */
    public void setBatchNumbers(BatchNumbers value) {
        this.batchNumbers = value;
    }

}
