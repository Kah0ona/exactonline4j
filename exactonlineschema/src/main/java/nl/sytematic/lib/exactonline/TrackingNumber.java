//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 03:25:32 PM CEST 
//


package nl.sytematic.lib.exactonline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="Type" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Status" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}Description" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Class_01" type="{}typeTrackingNumberClass" minOccurs="0"/>
 *         &lt;element name="Class_02" type="{}typeTrackingNumberClass" minOccurs="0"/>
 *         &lt;element name="Class_03" type="{}typeTrackingNumberClass" minOccurs="0"/>
 *         &lt;element name="Class_04" type="{}typeTrackingNumberClass" minOccurs="0"/>
 *         &lt;element name="Class_05" type="{}typeTrackingNumberClass" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{}ID"/>
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
    "type",
    "status",
    "description",
    "notes",
    "class01",
    "class02",
    "class03",
    "class04",
    "class05"
})
@XmlRootElement(name = "TrackingNumber")
public class TrackingNumber {

    @XmlElement(name = "Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlElement(name = "Status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;
    @XmlElement(name = "Description")
    protected TypeDescription description;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "Class_01")
    protected TypeTrackingNumberClass class01;
    @XmlElement(name = "Class_02")
    protected TypeTrackingNumberClass class02;
    @XmlElement(name = "Class_03")
    protected TypeTrackingNumberClass class03;
    @XmlElement(name = "Class_04")
    protected TypeTrackingNumberClass class04;
    @XmlElement(name = "Class_05")
    protected TypeTrackingNumberClass class05;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(required = true)
    protected String code;

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
     * Gets the value of the class01 property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTrackingNumberClass }
     *     
     */
    public TypeTrackingNumberClass getClass01() {
        return class01;
    }

    /**
     * Sets the value of the class01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTrackingNumberClass }
     *     
     */
    public void setClass01(TypeTrackingNumberClass value) {
        this.class01 = value;
    }

    /**
     * Gets the value of the class02 property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTrackingNumberClass }
     *     
     */
    public TypeTrackingNumberClass getClass02() {
        return class02;
    }

    /**
     * Sets the value of the class02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTrackingNumberClass }
     *     
     */
    public void setClass02(TypeTrackingNumberClass value) {
        this.class02 = value;
    }

    /**
     * Gets the value of the class03 property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTrackingNumberClass }
     *     
     */
    public TypeTrackingNumberClass getClass03() {
        return class03;
    }

    /**
     * Sets the value of the class03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTrackingNumberClass }
     *     
     */
    public void setClass03(TypeTrackingNumberClass value) {
        this.class03 = value;
    }

    /**
     * Gets the value of the class04 property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTrackingNumberClass }
     *     
     */
    public TypeTrackingNumberClass getClass04() {
        return class04;
    }

    /**
     * Sets the value of the class04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTrackingNumberClass }
     *     
     */
    public void setClass04(TypeTrackingNumberClass value) {
        this.class04 = value;
    }

    /**
     * Gets the value of the class05 property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTrackingNumberClass }
     *     
     */
    public TypeTrackingNumberClass getClass05() {
        return class05;
    }

    /**
     * Sets the value of the class05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTrackingNumberClass }
     *     
     */
    public void setClass05(TypeTrackingNumberClass value) {
        this.class05 = value;
    }

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
