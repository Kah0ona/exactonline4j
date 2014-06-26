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
 * <p>Java class for CoilWireLengthShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoilWireLengthShape">
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
 *                   &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Weights" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="WeightPer" type="{}LengthUnitOfMeasure" minOccurs="0"/>
 *                   &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="WeightUOM" type="{}WeightUnitOfMeasure" minOccurs="0"/>
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
 *                   &lt;element name="Weight" type="{}WeightUnitOfMeasure" minOccurs="0"/>
 *                   &lt;element name="Length" type="{}LengthUnitOfMeasure" minOccurs="0"/>
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
@XmlType(name = "CoilWireLengthShape", propOrder = {
    "stockToDimensionRatio",
    "dimensionToStockRatio",
    "measurements",
    "weights",
    "calculatedUnits"
})
public class CoilWireLengthShape {

    @XmlElement(name = "StockToDimensionRatio")
    protected StockToDimensionRatioType stockToDimensionRatio;
    @XmlElement(name = "DimensionToStockRatio")
    protected DimensionToStockRatioType dimensionToStockRatio;
    @XmlElement(name = "Measurements")
    protected CoilWireLengthShape.Measurements measurements;
    @XmlElement(name = "Weights")
    protected CoilWireLengthShape.Weights weights;
    @XmlElement(name = "CalculatedUnits")
    protected CoilWireLengthShape.CalculatedUnits calculatedUnits;

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
     *     {@link CoilWireLengthShape.Measurements }
     *     
     */
    public CoilWireLengthShape.Measurements getMeasurements() {
        return measurements;
    }

    /**
     * Sets the value of the measurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoilWireLengthShape.Measurements }
     *     
     */
    public void setMeasurements(CoilWireLengthShape.Measurements value) {
        this.measurements = value;
    }

    /**
     * Gets the value of the weights property.
     * 
     * @return
     *     possible object is
     *     {@link CoilWireLengthShape.Weights }
     *     
     */
    public CoilWireLengthShape.Weights getWeights() {
        return weights;
    }

    /**
     * Sets the value of the weights property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoilWireLengthShape.Weights }
     *     
     */
    public void setWeights(CoilWireLengthShape.Weights value) {
        this.weights = value;
    }

    /**
     * Gets the value of the calculatedUnits property.
     * 
     * @return
     *     possible object is
     *     {@link CoilWireLengthShape.CalculatedUnits }
     *     
     */
    public CoilWireLengthShape.CalculatedUnits getCalculatedUnits() {
        return calculatedUnits;
    }

    /**
     * Sets the value of the calculatedUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoilWireLengthShape.CalculatedUnits }
     *     
     */
    public void setCalculatedUnits(CoilWireLengthShape.CalculatedUnits value) {
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
     *         &lt;element name="Weight" type="{}WeightUnitOfMeasure" minOccurs="0"/>
     *         &lt;element name="Length" type="{}LengthUnitOfMeasure" minOccurs="0"/>
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
        "weight",
        "length"
    })
    public static class CalculatedUnits {

        @XmlElement(name = "Weight")
        protected String weight;
        @XmlElement(name = "Length")
        protected String length;

        /**
         * Gets the value of the weight property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWeight() {
            return weight;
        }

        /**
         * Sets the value of the weight property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWeight(String value) {
            this.weight = value;
        }

        /**
         * Gets the value of the length property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLength() {
            return length;
        }

        /**
         * Sets the value of the length property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLength(String value) {
            this.length = value;
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
     *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
        "width"
    })
    public static class Measurements {

        @XmlElement(name = "MeasurementUnit")
        protected String measurementUnit;
        @XmlElement(name = "Width")
        protected Double width;

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
     *         &lt;element name="WeightPer" type="{}LengthUnitOfMeasure" minOccurs="0"/>
     *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="WeightUOM" type="{}WeightUnitOfMeasure" minOccurs="0"/>
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
        "weightPer",
        "weight",
        "weightUOM"
    })
    public static class Weights {

        @XmlElement(name = "WeightPer")
        protected String weightPer;
        @XmlElement(name = "Weight")
        protected Double weight;
        @XmlElement(name = "WeightUOM")
        protected String weightUOM;

        /**
         * Gets the value of the weightPer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWeightPer() {
            return weightPer;
        }

        /**
         * Sets the value of the weightPer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWeightPer(String value) {
            this.weightPer = value;
        }

        /**
         * Gets the value of the weight property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getWeight() {
            return weight;
        }

        /**
         * Sets the value of the weight property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setWeight(Double value) {
            this.weight = value;
        }

        /**
         * Gets the value of the weightUOM property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWeightUOM() {
            return weightUOM;
        }

        /**
         * Sets the value of the weightUOM property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWeightUOM(String value) {
            this.weightUOM = value;
        }

    }

}