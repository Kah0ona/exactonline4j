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
 *         &lt;element name="JobLevelFrom" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="JobLevelTo" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="JobCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}JobGroup" minOccurs="0"/>
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
    "jobLevelFrom",
    "jobLevelTo",
    "jobCode",
    "jobGroup"
})
@XmlRootElement(name = "JobTitle")
public class JobTitle {

    @XmlElement(name = "Description")
    protected TypeDescription description;
    @XmlElement(name = "JobLevelFrom")
    protected BigInteger jobLevelFrom;
    @XmlElement(name = "JobLevelTo")
    protected BigInteger jobLevelTo;
    @XmlElement(name = "JobCode")
    protected String jobCode;
    @XmlElement(name = "JobGroup")
    protected JobGroup jobGroup;
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
     * Gets the value of the jobLevelFrom property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJobLevelFrom() {
        return jobLevelFrom;
    }

    /**
     * Sets the value of the jobLevelFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJobLevelFrom(BigInteger value) {
        this.jobLevelFrom = value;
    }

    /**
     * Gets the value of the jobLevelTo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJobLevelTo() {
        return jobLevelTo;
    }

    /**
     * Sets the value of the jobLevelTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJobLevelTo(BigInteger value) {
        this.jobLevelTo = value;
    }

    /**
     * Gets the value of the jobCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobCode() {
        return jobCode;
    }

    /**
     * Sets the value of the jobCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobCode(String value) {
        this.jobCode = value;
    }

    /**
     * Gets the value of the jobGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JobGroup }
     *     
     */
    public JobGroup getJobGroup() {
        return jobGroup;
    }

    /**
     * Sets the value of the jobGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobGroup }
     *     
     */
    public void setJobGroup(JobGroup value) {
        this.jobGroup = value;
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
