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
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element ref="{}SchoolGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SchoolGroupCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "startDate",
    "endDate",
    "schoolGroup"
})
@XmlRootElement(name = "SchoolCareer")
public class SchoolCareer {

    @XmlElement(name = "StartDate")
    protected Object startDate;
    @XmlElement(name = "EndDate")
    protected Object endDate;
    @XmlElement(name = "SchoolGroup")
    protected SchoolGroup schoolGroup;
    @XmlAttribute(name = "SchoolGroupCode", required = true)
    protected String schoolGroupCode;

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStartDate(Object value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEndDate(Object value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the schoolGroup property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolGroup }
     *     
     */
    public SchoolGroup getSchoolGroup() {
        return schoolGroup;
    }

    /**
     * Sets the value of the schoolGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolGroup }
     *     
     */
    public void setSchoolGroup(SchoolGroup value) {
        this.schoolGroup = value;
    }

    /**
     * Gets the value of the schoolGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolGroupCode() {
        return schoolGroupCode;
    }

    /**
     * Sets the value of the schoolGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolGroupCode(String value) {
        this.schoolGroupCode = value;
    }

}
