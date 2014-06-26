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
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element ref="{}FieldDefinition" minOccurs="0"/>
 *         &lt;element ref="{}CalculationParameter" minOccurs="0"/>
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
 *         &lt;element name="EntryFieldType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ComponentResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultCharacter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultInteger" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="DefaultDecimal" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="DefaultBoolean" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DefaultDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="UsePayrollTable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Dimension1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dimension2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dimension3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dimension4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dimension5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HistoryType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PeriodFrom" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PeriodTo" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element ref="{}PayrollCompCriterionInputs" minOccurs="0"/>
 *         &lt;element ref="{}PayrollComponentHistoryPeriods" minOccurs="0"/>
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
    "type",
    "fieldDefinition",
    "calculationParameter",
    "payrollTable",
    "entryFieldType",
    "componentResult",
    "defaultCharacter",
    "defaultInteger",
    "defaultDecimal",
    "defaultBoolean",
    "defaultDate",
    "usePayrollTable",
    "dimension1",
    "dimension2",
    "dimension3",
    "dimension4",
    "dimension5",
    "historyType",
    "periodFrom",
    "periodTo",
    "payrollCompCriterionInputs",
    "payrollComponentHistoryPeriods"
})
@XmlRootElement(name = "PayrollComponentInput")
public class PayrollComponentInput {

    @XmlElement(name = "Type")
    protected BigInteger type;
    @XmlElement(name = "FieldDefinition")
    protected FieldDefinition fieldDefinition;
    @XmlElement(name = "CalculationParameter")
    protected CalculationParameter calculationParameter;
    @XmlElement(name = "PayrollTable")
    protected PayrollComponentInput.PayrollTable payrollTable;
    @XmlElement(name = "EntryFieldType")
    protected BigInteger entryFieldType;
    @XmlElement(name = "ComponentResult")
    protected String componentResult;
    @XmlElement(name = "DefaultCharacter")
    protected String defaultCharacter;
    @XmlElement(name = "DefaultInteger")
    protected BigInteger defaultInteger;
    @XmlElement(name = "DefaultDecimal")
    protected Float defaultDecimal;
    @XmlElement(name = "DefaultBoolean")
    protected Boolean defaultBoolean;
    @XmlElement(name = "DefaultDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar defaultDate;
    @XmlElement(name = "UsePayrollTable")
    protected Boolean usePayrollTable;
    @XmlElement(name = "Dimension1")
    protected String dimension1;
    @XmlElement(name = "Dimension2")
    protected String dimension2;
    @XmlElement(name = "Dimension3")
    protected String dimension3;
    @XmlElement(name = "Dimension4")
    protected String dimension4;
    @XmlElement(name = "Dimension5")
    protected String dimension5;
    @XmlElement(name = "HistoryType")
    protected BigInteger historyType;
    @XmlElement(name = "PeriodFrom")
    protected BigInteger periodFrom;
    @XmlElement(name = "PeriodTo")
    protected BigInteger periodTo;
    @XmlElement(name = "PayrollCompCriterionInputs")
    protected PayrollCompCriterionInputs payrollCompCriterionInputs;
    @XmlElement(name = "PayrollComponentHistoryPeriods")
    protected PayrollComponentHistoryPeriods payrollComponentHistoryPeriods;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setType(BigInteger value) {
        this.type = value;
    }

    /**
     * Gets the value of the fieldDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDefinition }
     *     
     */
    public FieldDefinition getFieldDefinition() {
        return fieldDefinition;
    }

    /**
     * Sets the value of the fieldDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDefinition }
     *     
     */
    public void setFieldDefinition(FieldDefinition value) {
        this.fieldDefinition = value;
    }

    /**
     * Gets the value of the calculationParameter property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationParameter }
     *     
     */
    public CalculationParameter getCalculationParameter() {
        return calculationParameter;
    }

    /**
     * Sets the value of the calculationParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationParameter }
     *     
     */
    public void setCalculationParameter(CalculationParameter value) {
        this.calculationParameter = value;
    }

    /**
     * Gets the value of the payrollTable property.
     * 
     * @return
     *     possible object is
     *     {@link PayrollComponentInput.PayrollTable }
     *     
     */
    public PayrollComponentInput.PayrollTable getPayrollTable() {
        return payrollTable;
    }

    /**
     * Sets the value of the payrollTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollComponentInput.PayrollTable }
     *     
     */
    public void setPayrollTable(PayrollComponentInput.PayrollTable value) {
        this.payrollTable = value;
    }

    /**
     * Gets the value of the entryFieldType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEntryFieldType() {
        return entryFieldType;
    }

    /**
     * Sets the value of the entryFieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEntryFieldType(BigInteger value) {
        this.entryFieldType = value;
    }

    /**
     * Gets the value of the componentResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentResult() {
        return componentResult;
    }

    /**
     * Sets the value of the componentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentResult(String value) {
        this.componentResult = value;
    }

    /**
     * Gets the value of the defaultCharacter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultCharacter() {
        return defaultCharacter;
    }

    /**
     * Sets the value of the defaultCharacter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultCharacter(String value) {
        this.defaultCharacter = value;
    }

    /**
     * Gets the value of the defaultInteger property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDefaultInteger() {
        return defaultInteger;
    }

    /**
     * Sets the value of the defaultInteger property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDefaultInteger(BigInteger value) {
        this.defaultInteger = value;
    }

    /**
     * Gets the value of the defaultDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDefaultDecimal() {
        return defaultDecimal;
    }

    /**
     * Sets the value of the defaultDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDefaultDecimal(Float value) {
        this.defaultDecimal = value;
    }

    /**
     * Gets the value of the defaultBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultBoolean() {
        return defaultBoolean;
    }

    /**
     * Sets the value of the defaultBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultBoolean(Boolean value) {
        this.defaultBoolean = value;
    }

    /**
     * Gets the value of the defaultDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDefaultDate() {
        return defaultDate;
    }

    /**
     * Sets the value of the defaultDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDefaultDate(XMLGregorianCalendar value) {
        this.defaultDate = value;
    }

    /**
     * Gets the value of the usePayrollTable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsePayrollTable() {
        return usePayrollTable;
    }

    /**
     * Sets the value of the usePayrollTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsePayrollTable(Boolean value) {
        this.usePayrollTable = value;
    }

    /**
     * Gets the value of the dimension1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimension1() {
        return dimension1;
    }

    /**
     * Sets the value of the dimension1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimension1(String value) {
        this.dimension1 = value;
    }

    /**
     * Gets the value of the dimension2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimension2() {
        return dimension2;
    }

    /**
     * Sets the value of the dimension2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimension2(String value) {
        this.dimension2 = value;
    }

    /**
     * Gets the value of the dimension3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimension3() {
        return dimension3;
    }

    /**
     * Sets the value of the dimension3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimension3(String value) {
        this.dimension3 = value;
    }

    /**
     * Gets the value of the dimension4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimension4() {
        return dimension4;
    }

    /**
     * Sets the value of the dimension4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimension4(String value) {
        this.dimension4 = value;
    }

    /**
     * Gets the value of the dimension5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimension5() {
        return dimension5;
    }

    /**
     * Sets the value of the dimension5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimension5(String value) {
        this.dimension5 = value;
    }

    /**
     * Gets the value of the historyType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHistoryType() {
        return historyType;
    }

    /**
     * Sets the value of the historyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHistoryType(BigInteger value) {
        this.historyType = value;
    }

    /**
     * Gets the value of the periodFrom property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPeriodFrom() {
        return periodFrom;
    }

    /**
     * Sets the value of the periodFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPeriodFrom(BigInteger value) {
        this.periodFrom = value;
    }

    /**
     * Gets the value of the periodTo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPeriodTo() {
        return periodTo;
    }

    /**
     * Sets the value of the periodTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPeriodTo(BigInteger value) {
        this.periodTo = value;
    }

    /**
     * Gets the value of the payrollCompCriterionInputs property.
     * 
     * @return
     *     possible object is
     *     {@link PayrollCompCriterionInputs }
     *     
     */
    public PayrollCompCriterionInputs getPayrollCompCriterionInputs() {
        return payrollCompCriterionInputs;
    }

    /**
     * Sets the value of the payrollCompCriterionInputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollCompCriterionInputs }
     *     
     */
    public void setPayrollCompCriterionInputs(PayrollCompCriterionInputs value) {
        this.payrollCompCriterionInputs = value;
    }

    /**
     * Gets the value of the payrollComponentHistoryPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link PayrollComponentHistoryPeriods }
     *     
     */
    public PayrollComponentHistoryPeriods getPayrollComponentHistoryPeriods() {
        return payrollComponentHistoryPeriods;
    }

    /**
     * Sets the value of the payrollComponentHistoryPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollComponentHistoryPeriods }
     *     
     */
    public void setPayrollComponentHistoryPeriods(PayrollComponentHistoryPeriods value) {
        this.payrollComponentHistoryPeriods = value;
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
