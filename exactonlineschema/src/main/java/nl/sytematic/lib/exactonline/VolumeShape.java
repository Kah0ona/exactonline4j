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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VolumeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolumeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="StockToDimensionRatio" type="{}StockToDimensionRatioType"/>
 *           &lt;element name="DimensionToStockRatio" type="{}DimensionToStockRatioType"/>
 *         &lt;/choice>
 *         &lt;element name="Measurements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MeasurementUnit" type="{}LengthUnitOfMeasure" minOccurs="0"/>
 *                   &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="Depth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CalculatedUnits" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Volume" type="{}VolumeUnitOfMeasure" minOccurs="0"/>
 *                   &lt;element name="WholeEaches" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="WholePieces" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeShape", propOrder = {
    "stockToDimensionRatio",
    "dimensionToStockRatio",
    "measurements",
    "calculatedUnits"
})
public class VolumeShape {

    @XmlElement(name = "StockToDimensionRatio")
    protected StockToDimensionRatioType stockToDimensionRatio;
    @XmlElement(name = "DimensionToStockRatio")
    protected DimensionToStockRatioType dimensionToStockRatio;
    @XmlElement(name = "Measurements")
    protected VolumeShape.Measurements measurements;
    @XmlElement(name = "CalculatedUnits")
    protected VolumeShape.CalculatedUnits calculatedUnits;

    /**
     * Gets the value of the stockToDimensionRatio property.
     * 
     * @return
     *     possible object is
     *     {@link StockToDimensionRatioType }
     *     
     */
    public StockToDimensionRatioType getStockToDimensionRatio() {
        return stockToDimensionRatio;
    }

    /**
     * Sets the value of the stockToDimensionRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockToDimensionRatioType }
     *     
     */
    public void setStockToDimensionRatio(StockToDimensionRatioType value) {
        this.stockToDimensionRatio = value;
    }

    /**
     * Gets the value of the dimensionToStockRatio property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionToStockRatioType }
     *     
     */
    public DimensionToStockRatioType getDimensionToStockRatio() {
        return dimensionToStockRatio;
    }

    /**
     * Sets the value of the dimensionToStockRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionToStockRatioType }
     *     
     */
    public void setDimensionToStockRatio(DimensionToStockRatioType value) {
        this.dimensionToStockRatio = value;
    }

    /**
     * Gets the value of the measurements property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeShape.Measurements }
     *     
     */
    public VolumeShape.Measurements getMeasurements() {
        return measurements;
    }

    /**
     * Sets the value of the measurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeShape.Measurements }
     *     
     */
    public void setMeasurements(VolumeShape.Measurements value) {
        this.measurements = value;
    }

    /**
     * Gets the value of the calculatedUnits property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeShape.CalculatedUnits }
     *     
     */
    public VolumeShape.CalculatedUnits getCalculatedUnits() {
        return calculatedUnits;
    }

    /**
     * Sets the value of the calculatedUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeShape.CalculatedUnits }
     *     
     */
    public void setCalculatedUnits(VolumeShape.CalculatedUnits value) {
        this.calculatedUnits = value;
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
     *         &lt;element name="Volume" type="{}VolumeUnitOfMeasure" minOccurs="0"/>
     *         &lt;element name="WholeEaches" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="WholePieces" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "volume",
        "wholeEaches",
        "wholePieces"
    })
    public static class CalculatedUnits {

        @XmlElement(name = "Volume")
        protected String volume;
        @XmlElement(name = "WholeEaches", defaultValue = "false")
        protected Boolean wholeEaches;
        @XmlElement(name = "WholePieces", defaultValue = "false")
        protected Boolean wholePieces;

        /**
         * Gets the value of the volume property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVolume() {
            return volume;
        }

        /**
         * Sets the value of the volume property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVolume(String value) {
            this.volume = value;
        }

        /**
         * Gets the value of the wholeEaches property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWholeEaches() {
            return wholeEaches;
        }

        /**
         * Sets the value of the wholeEaches property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWholeEaches(Boolean value) {
            this.wholeEaches = value;
        }

        /**
         * Gets the value of the wholePieces property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWholePieces() {
            return wholePieces;
        }

        /**
         * Sets the value of the wholePieces property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWholePieces(Boolean value) {
            this.wholePieces = value;
        }

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
     *         &lt;element name="MeasurementUnit" type="{}LengthUnitOfMeasure" minOccurs="0"/>
     *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="Depth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
        "measurementUnit",
        "length",
        "width",
        "depth"
    })
    public static class Measurements {

        @XmlElement(name = "MeasurementUnit")
        protected String measurementUnit;
        @XmlElement(name = "Length")
        protected Double length;
        @XmlElement(name = "Width")
        protected Double width;
        @XmlElement(name = "Depth")
        protected Double depth;

        /**
         * Gets the value of the measurementUnit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMeasurementUnit() {
            return measurementUnit;
        }

        /**
         * Sets the value of the measurementUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMeasurementUnit(String value) {
            this.measurementUnit = value;
        }

        /**
         * Gets the value of the length property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getLength() {
            return length;
        }

        /**
         * Sets the value of the length property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setLength(Double value) {
            this.length = value;
        }

        /**
         * Gets the value of the width property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getWidth() {
            return width;
        }

        /**
         * Sets the value of the width property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setWidth(Double value) {
            this.width = value;
        }

        /**
         * Gets the value of the depth property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getDepth() {
            return depth;
        }

        /**
         * Sets the value of the depth property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setDepth(Double value) {
            this.depth = value;
        }

    }

}
