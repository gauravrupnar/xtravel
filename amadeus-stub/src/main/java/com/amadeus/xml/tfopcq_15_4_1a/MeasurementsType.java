
package com.amadeus.xml.tfopcq_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify Physical Measurements.
 * 
 * <p>Java class for MeasurementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measurementQualifier" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="measurementDetails" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}MeasurementDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="valueRange" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}ValueRangeTypeI" minOccurs="0"/>
 *         &lt;element name="surfaceLayerIndicator" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementsType", propOrder = {
    "measurementQualifier",
    "measurementDetails",
    "valueRange",
    "surfaceLayerIndicator"
})
public class MeasurementsType {

    protected String measurementQualifier;
    protected MeasurementDetailsTypeI measurementDetails;
    protected ValueRangeTypeI valueRange;
    protected String surfaceLayerIndicator;

    /**
     * Gets the value of the measurementQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementQualifier() {
        return measurementQualifier;
    }

    /**
     * Sets the value of the measurementQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementQualifier(String value) {
        this.measurementQualifier = value;
    }

    /**
     * Gets the value of the measurementDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementDetailsTypeI }
     *     
     */
    public MeasurementDetailsTypeI getMeasurementDetails() {
        return measurementDetails;
    }

    /**
     * Sets the value of the measurementDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementDetailsTypeI }
     *     
     */
    public void setMeasurementDetails(MeasurementDetailsTypeI value) {
        this.measurementDetails = value;
    }

    /**
     * Gets the value of the valueRange property.
     * 
     * @return
     *     possible object is
     *     {@link ValueRangeTypeI }
     *     
     */
    public ValueRangeTypeI getValueRange() {
        return valueRange;
    }

    /**
     * Sets the value of the valueRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueRangeTypeI }
     *     
     */
    public void setValueRange(ValueRangeTypeI value) {
        this.valueRange = value;
    }

    /**
     * Gets the value of the surfaceLayerIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurfaceLayerIndicator() {
        return surfaceLayerIndicator;
    }

    /**
     * Sets the value of the surfaceLayerIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurfaceLayerIndicator(String value) {
        this.surfaceLayerIndicator = value;
    }

}
