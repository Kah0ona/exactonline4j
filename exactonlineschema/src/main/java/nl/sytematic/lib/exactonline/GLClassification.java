//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 03:25:32 PM CEST 
//


package nl.sytematic.lib.exactonline;

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
 *       &lt;sequence>
 *         &lt;element ref="{}Description"/>
 *         &lt;element ref="{}GLClassification" maxOccurs="unbounded" minOccurs="0"/>
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
    "description",
    "glClassification"
})
@XmlRootElement(name = "GLClassification")
public class GLClassification {

    @XmlElement(name = "Description", required = true)
    protected TypeDescription description;
    @XmlElement(name = "GLClassification")
    protected List<GLClassification> glClassification;
    @XmlAttribute(required = true)
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
     * Gets the value of the glClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGLClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GLClassification }
     * 
     * 
     */
    public List<GLClassification> getGLClassification() {
        if (glClassification == null) {
            glClassification = new ArrayList<GLClassification>();
        }
        return this.glClassification;
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
