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
 *         &lt;element ref="{}PayrollPeriod" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{}number"/>
 *       &lt;attribute name="Frequency" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="YearChanges" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "payrollPeriod"
})
@XmlRootElement(name = "PayrollYear")
public class PayrollYear {

    @XmlElement(name = "PayrollPeriod")
    protected List<PayrollPeriod> payrollPeriod;
    @XmlAttribute
    protected BigInteger number;
    @XmlAttribute(name = "Frequency", required = true)
    protected int frequency;
    @XmlAttribute(name = "YearChanges", required = true)
    protected boolean yearChanges;

    /**
     * Gets the value of the payrollPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payrollPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayrollPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayrollPeriod }
     * 
     * 
     */
    public List<PayrollPeriod> getPayrollPeriod() {
        if (payrollPeriod == null) {
            payrollPeriod = new ArrayList<PayrollPeriod>();
        }
        return this.payrollPeriod;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     */
    public int getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     */
    public void setFrequency(int value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the yearChanges property.
     * 
     */
    public boolean isYearChanges() {
        return yearChanges;
    }

    /**
     * Sets the value of the yearChanges property.
     * 
     */
    public void setYearChanges(boolean value) {
        this.yearChanges = value;
    }

}
