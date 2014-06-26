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
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{}StartDate"/>
 *         &lt;element ref="{}EndDate" minOccurs="0"/>
 *         &lt;element name="EmploymentSalaryType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Scale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobLevel" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FulltimeAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ParttimeAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="AmountType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="HourlyWage" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="AverageDaysPerWeek" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="AverageHoursPerWeek" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ParttimeFactor" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="PayrollPeriodFrequency" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayrollTable" minOccurs="0">
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
 *         &lt;element name="InternalRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
    "employmentSalaryType",
    "scale",
    "jobLevel",
    "fulltimeAmount",
    "parttimeAmount",
    "amountType",
    "hourlyWage",
    "averageDaysPerWeek",
    "averageHoursPerWeek",
    "parttimeFactor",
    "payrollPeriodFrequency",
    "notes",
    "payrollTable",
    "internalRate"
})
@XmlRootElement(name = "EmploymentSalary")
public class EmploymentSalary {

    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "EmploymentSalaryType")
    protected BigInteger employmentSalaryType;
    @XmlElement(name = "Scale")
    protected String scale;
    @XmlElement(name = "JobLevel")
    protected BigInteger jobLevel;
    @XmlElement(name = "FulltimeAmount")
    protected Float fulltimeAmount;
    @XmlElement(name = "ParttimeAmount")
    protected Float parttimeAmount;
    @XmlElement(name = "AmountType")
    protected BigInteger amountType;
    @XmlElement(name = "HourlyWage")
    protected Float hourlyWage;
    @XmlElement(name = "AverageDaysPerWeek")
    protected Float averageDaysPerWeek;
    @XmlElement(name = "AverageHoursPerWeek")
    protected Float averageHoursPerWeek;
    @XmlElement(name = "ParttimeFactor")
    protected Float parttimeFactor;
    @XmlElement(name = "PayrollPeriodFrequency")
    protected BigInteger payrollPeriodFrequency;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "PayrollTable")
    protected EmploymentSalary.PayrollTable payrollTable;
    @XmlElement(name = "InternalRate")
    protected Float internalRate;

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
     * Gets the value of the employmentSalaryType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEmploymentSalaryType() {
        return employmentSalaryType;
    }

    /**
     * Sets the value of the employmentSalaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEmploymentSalaryType(BigInteger value) {
        this.employmentSalaryType = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScale(String value) {
        this.scale = value;
    }

    /**
     * Gets the value of the jobLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJobLevel() {
        return jobLevel;
    }

    /**
     * Sets the value of the jobLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJobLevel(BigInteger value) {
        this.jobLevel = value;
    }

    /**
     * Gets the value of the fulltimeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFulltimeAmount() {
        return fulltimeAmount;
    }

    /**
     * Sets the value of the fulltimeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFulltimeAmount(Float value) {
        this.fulltimeAmount = value;
    }

    /**
     * Gets the value of the parttimeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getParttimeAmount() {
        return parttimeAmount;
    }

    /**
     * Sets the value of the parttimeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setParttimeAmount(Float value) {
        this.parttimeAmount = value;
    }

    /**
     * Gets the value of the amountType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmountType() {
        return amountType;
    }

    /**
     * Sets the value of the amountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmountType(BigInteger value) {
        this.amountType = value;
    }

    /**
     * Gets the value of the hourlyWage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHourlyWage() {
        return hourlyWage;
    }

    /**
     * Sets the value of the hourlyWage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHourlyWage(Float value) {
        this.hourlyWage = value;
    }

    /**
     * Gets the value of the averageDaysPerWeek property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAverageDaysPerWeek() {
        return averageDaysPerWeek;
    }

    /**
     * Sets the value of the averageDaysPerWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAverageDaysPerWeek(Float value) {
        this.averageDaysPerWeek = value;
    }

    /**
     * Gets the value of the averageHoursPerWeek property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAverageHoursPerWeek() {
        return averageHoursPerWeek;
    }

    /**
     * Sets the value of the averageHoursPerWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAverageHoursPerWeek(Float value) {
        this.averageHoursPerWeek = value;
    }

    /**
     * Gets the value of the parttimeFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getParttimeFactor() {
        return parttimeFactor;
    }

    /**
     * Sets the value of the parttimeFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setParttimeFactor(Float value) {
        this.parttimeFactor = value;
    }

    /**
     * Gets the value of the payrollPeriodFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPayrollPeriodFrequency() {
        return payrollPeriodFrequency;
    }

    /**
     * Sets the value of the payrollPeriodFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPayrollPeriodFrequency(BigInteger value) {
        this.payrollPeriodFrequency = value;
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
     * Gets the value of the payrollTable property.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentSalary.PayrollTable }
     *     
     */
    public EmploymentSalary.PayrollTable getPayrollTable() {
        return payrollTable;
    }

    /**
     * Sets the value of the payrollTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentSalary.PayrollTable }
     *     
     */
    public void setPayrollTable(EmploymentSalary.PayrollTable value) {
        this.payrollTable = value;
    }

    /**
     * Gets the value of the internalRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInternalRate() {
        return internalRate;
    }

    /**
     * Sets the value of the internalRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInternalRate(Float value) {
        this.internalRate = value;
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
    public static class PayrollTable {

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