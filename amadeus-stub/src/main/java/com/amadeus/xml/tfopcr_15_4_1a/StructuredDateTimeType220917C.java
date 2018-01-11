
package com.amadeus.xml.tfopcr_15_4_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Store date and time in a structured way
 * 
 * <p>Java class for StructuredDateTimeType_220917C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredDateTimeType_220917C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="year" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}NumericInteger_Length4To4" minOccurs="0"/>
 *         &lt;element name="month" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}NumericInteger_Length1To2"/>
 *         &lt;element name="day" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}NumericInteger_Length1To2"/>
 *         &lt;element name="hour" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}NumericInteger_Length1To2" minOccurs="0"/>
 *         &lt;element name="minutes" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}NumericInteger_Length1To2" minOccurs="0"/>
 *         &lt;element name="seconds" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}NumericInteger_Length1To2" minOccurs="0"/>
 *         &lt;element name="milliseconds" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}NumericInteger_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredDateTimeType_220917C", propOrder = {
    "year",
    "month",
    "day",
    "hour",
    "minutes",
    "seconds",
    "milliseconds"
})
public class StructuredDateTimeType220917C {

    protected BigInteger year;
    @XmlElement(required = true)
    protected BigInteger month;
    @XmlElement(required = true)
    protected BigInteger day;
    protected BigInteger hour;
    protected BigInteger minutes;
    protected BigInteger seconds;
    protected BigInteger milliseconds;

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYear(BigInteger value) {
        this.year = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonth(BigInteger value) {
        this.month = value;
    }

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDay(BigInteger value) {
        this.day = value;
    }

    /**
     * Gets the value of the hour property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHour() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHour(BigInteger value) {
        this.hour = value;
    }

    /**
     * Gets the value of the minutes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinutes() {
        return minutes;
    }

    /**
     * Sets the value of the minutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinutes(BigInteger value) {
        this.minutes = value;
    }

    /**
     * Gets the value of the seconds property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeconds() {
        return seconds;
    }

    /**
     * Sets the value of the seconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeconds(BigInteger value) {
        this.seconds = value;
    }

    /**
     * Gets the value of the milliseconds property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMilliseconds() {
        return milliseconds;
    }

    /**
     * Sets the value of the milliseconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMilliseconds(BigInteger value) {
        this.milliseconds = value;
    }

}
