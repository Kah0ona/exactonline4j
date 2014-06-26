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
 *         &lt;element name="PayrollComponentGroup">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}StartDate"/>
 *                 &lt;/sequence>
 *                 &lt;attribute ref="{}code use="required""/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}EmploymentSalaries"/>
 *         &lt;element ref="{}EmploymentComponents" minOccurs="0"/>
 *         &lt;element ref="{}EmploymentAgenciesTax" minOccurs="0"/>
 *         &lt;element ref="{}EmploymentAgenciesCordBouw" minOccurs="0"/>
 *         &lt;element ref="{}EmploymentAgenciesCordSch" minOccurs="0"/>
 *         &lt;element ref="{}EmploymentAgenciesPGGM" minOccurs="0"/>
 *         &lt;element ref="{}EmploymentAgenciesSyntrus" minOccurs="0"/>
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
    "payrollComponentGroup",
    "notes",
    "employmentSalaries",
    "employmentComponents",
    "employmentAgenciesTax",
    "employmentAgenciesCordBouw",
    "employmentAgenciesCordSch",
    "employmentAgenciesPGGM",
    "employmentAgenciesSyntrus"
})
@XmlRootElement(name = "EmploymentCLA")
public class EmploymentCLA {

    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "PayrollComponentGroup")
    protected EmploymentCLA.PayrollComponentGroup payrollComponentGroup;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "EmploymentSalaries")
    protected EmploymentSalaries employmentSalaries;
    @XmlElement(name = "EmploymentComponents")
    protected EmploymentComponents employmentComponents;
    @XmlElement(name = "EmploymentAgenciesTax")
    protected EmploymentAgenciesTax employmentAgenciesTax;
    @XmlElement(name = "EmploymentAgenciesCordBouw")
    protected EmploymentAgenciesCordBouw employmentAgenciesCordBouw;
    @XmlElement(name = "EmploymentAgenciesCordSch")
    protected EmploymentAgenciesCordSch employmentAgenciesCordSch;
    @XmlElement(name = "EmploymentAgenciesPGGM")
    protected EmploymentAgenciesPGGM employmentAgenciesPGGM;
    @XmlElement(name = "EmploymentAgenciesSyntrus")
    protected EmploymentAgenciesSyntrus employmentAgenciesSyntrus;

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
     * Gets the value of the payrollComponentGroup property.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentCLA.PayrollComponentGroup }
     *     
     */
    public EmploymentCLA.PayrollComponentGroup getPayrollComponentGroup() {
        return payrollComponentGroup;
    }

    /**
     * Sets the value of the payrollComponentGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentCLA.PayrollComponentGroup }
     *     
     */
    public void setPayrollComponentGroup(EmploymentCLA.PayrollComponentGroup value) {
        this.payrollComponentGroup = value;
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
     * Gets the value of the employmentSalaries property.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentSalaries }
     *     
     */
    public EmploymentSalaries getEmploymentSalaries() {
        return employmentSalaries;
    }

    /**
     * Sets the value of the employmentSalaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentSalaries }
     *     
     */
    public void setEmploymentSalaries(EmploymentSalaries value) {
        this.employmentSalaries = value;
    }

    /**
     * Gets the value of the employmentComponents property.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentComponents }
     *     
     */
    public EmploymentComponents getEmploymentComponents() {
        return employmentComponents;
    }

    /**
     * Sets the value of the employmentComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentComponents }
     *     
     */
    public void setEmploymentComponents(EmploymentComponents value) {
        this.employmentComponents = value;
    }

    /**
     * Gets the value of the employmentAgenciesTax property.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentAgenciesTax }
     *     
     */
    public EmploymentAgenciesTax getEmploymentAgenciesTax() {
        return employmentAgenciesTax;
    }

    /**
     * Sets the value of the employmentAgenciesTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentAgenciesTax }
     *     
     */
    public void setEmploymentAgenciesTax(EmploymentAgenciesTax value) {
        this.employmentAgenciesTax = value;
    }

    /**
     * Gets the value of the employmentAgenciesCordBouw property.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentAgenciesCordBouw }
     *     
     */
    public EmploymentAgenciesCordBouw getEmploymentAgenciesCordBouw() {
        return employmentAgenciesCordBouw;
    }

    /**
     * Sets the value of the employmentAgenciesCordBouw property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentAgenciesCordBouw }
     *     
     */
    public void setEmploymentAgenciesCordBouw(EmploymentAgenciesCordBouw value) {
        this.employmentAgenciesCordBouw = value;
    }

    /**
     * Gets the value of the employmentAgenciesCordSch property.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentAgenciesCordSch }
     *     
     */
    public EmploymentAgenciesCordSch getEmploymentAgenciesCordSch() {
        return employmentAgenciesCordSch;
    }

    /**
     * Sets the value of the employmentAgenciesCordSch property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentAgenciesCordSch }
     *     
     */
    public void setEmploymentAgenciesCordSch(EmploymentAgenciesCordSch value) {
        this.employmentAgenciesCordSch = value;
    }

    /**
     * Gets the value of the employmentAgenciesPGGM property.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentAgenciesPGGM }
     *     
     */
    public EmploymentAgenciesPGGM getEmploymentAgenciesPGGM() {
        return employmentAgenciesPGGM;
    }

    /**
     * Sets the value of the employmentAgenciesPGGM property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentAgenciesPGGM }
     *     
     */
    public void setEmploymentAgenciesPGGM(EmploymentAgenciesPGGM value) {
        this.employmentAgenciesPGGM = value;
    }

    /**
     * Gets the value of the employmentAgenciesSyntrus property.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentAgenciesSyntrus }
     *     
     */
    public EmploymentAgenciesSyntrus getEmploymentAgenciesSyntrus() {
        return employmentAgenciesSyntrus;
    }

    /**
     * Sets the value of the employmentAgenciesSyntrus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentAgenciesSyntrus }
     *     
     */
    public void setEmploymentAgenciesSyntrus(EmploymentAgenciesSyntrus value) {
        this.employmentAgenciesSyntrus = value;
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
     *         &lt;element ref="{}StartDate"/>
     *       &lt;/sequence>
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
        "startDate"
    })
    public static class PayrollComponentGroup {

        @XmlElement(name = "StartDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startDate;
        @XmlAttribute(required = true)
        protected String code;

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
