//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 03:25:32 PM CEST 
//


package nl.sytematic.lib.exactonline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{}StartDate"/>
 *         &lt;element ref="{}EndDate" minOccurs="0"/>
 *         &lt;element ref="{}Department" minOccurs="0"/>
 *         &lt;element ref="{}Costcenter" minOccurs="0"/>
 *         &lt;element ref="{}Costunit" minOccurs="0"/>
 *         &lt;element ref="{}JobTitle" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "startDate",
    "endDate",
    "department",
    "costcenter",
    "costunit",
    "jobTitle",
    "notes"
})
@XmlRootElement(name = "EmploymentOrganization")
public class EmploymentOrganization {

    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "Department")
    protected Department department;
    @XmlElement(name = "Costcenter")
    protected Costcenter costcenter;
    @XmlElement(name = "Costunit")
    protected Costunit costunit;
    @XmlElement(name = "JobTitle")
    protected JobTitle jobTitle;
    @XmlElement(name = "Notes")
    protected String notes;

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
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link Department }
     *     
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link Department }
     *     
     */
    public void setDepartment(Department value) {
        this.department = value;
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
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JobTitle }
     *     
     */
    public JobTitle getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobTitle }
     *     
     */
    public void setJobTitle(JobTitle value) {
        this.jobTitle = value;
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

}
