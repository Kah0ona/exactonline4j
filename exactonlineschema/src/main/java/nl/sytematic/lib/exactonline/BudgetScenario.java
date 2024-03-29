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
 *         &lt;element ref="{}Description"/>
 *         &lt;element name="FromFinancialYear" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="ToFinancialYear" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{}code"/>
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
    "fromFinancialYear",
    "toFinancialYear"
})
@XmlRootElement(name = "BudgetScenario")
public class BudgetScenario {

    @XmlElement(name = "Description")
    protected TypeDescription description;
    @XmlElement(name = "FromFinancialYear")
    protected Object fromFinancialYear;
    @XmlElement(name = "ToFinancialYear")
    protected Object toFinancialYear;
    @XmlAttribute
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
     * Gets the value of the fromFinancialYear property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFromFinancialYear() {
        return fromFinancialYear;
    }

    /**
     * Sets the value of the fromFinancialYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFromFinancialYear(Object value) {
        this.fromFinancialYear = value;
    }

    /**
     * Gets the value of the toFinancialYear property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getToFinancialYear() {
        return toFinancialYear;
    }

    /**
     * Sets the value of the toFinancialYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setToFinancialYear(Object value) {
        this.toFinancialYear = value;
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
