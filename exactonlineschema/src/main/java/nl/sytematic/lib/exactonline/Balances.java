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
 *         &lt;element name="CompanyData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element ref="{}Country"/>
 *                   &lt;element name="ChamberOfCommerce" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}Balance" maxOccurs="unbounded"/>
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
    "companyData",
    "balance"
})
@XmlRootElement(name = "Balances")
public class Balances {

    @XmlElement(name = "CompanyData", required = true)
    protected Balances.CompanyData companyData;
    @XmlElement(name = "Balance", required = true)
    protected List<Balance> balance;

    /**
     * Gets the value of the companyData property.
     * 
     * @return
     *     possible object is
     *     {@link Balances.CompanyData }
     *     
     */
    public Balances.CompanyData getCompanyData() {
        return companyData;
    }

    /**
     * Sets the value of the companyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balances.CompanyData }
     *     
     */
    public void setCompanyData(Balances.CompanyData value) {
        this.companyData = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Balance }
     * 
     * 
     */
    public List<Balance> getBalance() {
        if (balance == null) {
            balance = new ArrayList<Balance>();
        }
        return this.balance;
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
     *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element ref="{}Country"/>
     *         &lt;element name="ChamberOfCommerce" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "companyName",
        "address",
        "postalCode",
        "city",
        "country",
        "chamberOfCommerce"
    })
    public static class CompanyData {

        @XmlElement(name = "CompanyName", required = true)
        protected String companyName;
        @XmlElement(name = "Address", required = true)
        protected String address;
        @XmlElement(name = "PostalCode", required = true)
        protected String postalCode;
        @XmlElement(name = "City", required = true)
        protected String city;
        @XmlElement(name = "Country", required = true)
        protected Country country;
        @XmlElement(name = "ChamberOfCommerce", required = true)
        protected String chamberOfCommerce;

        /**
         * Gets the value of the companyName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompanyName() {
            return companyName;
        }

        /**
         * Sets the value of the companyName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompanyName(String value) {
            this.companyName = value;
        }

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress(String value) {
            this.address = value;
        }

        /**
         * Gets the value of the postalCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostalCode() {
            return postalCode;
        }

        /**
         * Sets the value of the postalCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostalCode(String value) {
            this.postalCode = value;
        }

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCity(String value) {
            this.city = value;
        }

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link Country }
         *     
         */
        public Country getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link Country }
         *     
         */
        public void setCountry(Country value) {
            this.country = value;
        }

        /**
         * Gets the value of the chamberOfCommerce property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChamberOfCommerce() {
            return chamberOfCommerce;
        }

        /**
         * Sets the value of the chamberOfCommerce property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChamberOfCommerce(String value) {
            this.chamberOfCommerce = value;
        }

    }

}
