
package com.amadeus.xml.tfopcr_15_4_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a ticket number, type of ticket, and related information.
 * 
 * <p>Java class for TicketNumberDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketNumberDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}NumericInteger_Length1To35" minOccurs="0"/>
 *         &lt;element name="type" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="numberOfBooklets" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}NumericInteger_Length1To15" minOccurs="0"/>
 *         &lt;element name="dataIndicator" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="requestNotification" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="inConnectionWith" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}NumericInteger_Length1To35" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketNumberDetailsType", propOrder = {
    "number",
    "type",
    "numberOfBooklets",
    "dataIndicator",
    "requestNotification",
    "inConnectionWith"
})
public class TicketNumberDetailsType {

    protected BigInteger number;
    protected String type;
    protected BigInteger numberOfBooklets;
    protected String dataIndicator;
    protected String requestNotification;
    protected BigInteger inConnectionWith;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the numberOfBooklets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfBooklets() {
        return numberOfBooklets;
    }

    /**
     * Sets the value of the numberOfBooklets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfBooklets(BigInteger value) {
        this.numberOfBooklets = value;
    }

    /**
     * Gets the value of the dataIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataIndicator() {
        return dataIndicator;
    }

    /**
     * Sets the value of the dataIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataIndicator(String value) {
        this.dataIndicator = value;
    }

    /**
     * Gets the value of the requestNotification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestNotification() {
        return requestNotification;
    }

    /**
     * Sets the value of the requestNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestNotification(String value) {
        this.requestNotification = value;
    }

    /**
     * Gets the value of the inConnectionWith property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInConnectionWith() {
        return inConnectionWith;
    }

    /**
     * Sets the value of the inConnectionWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInConnectionWith(BigInteger value) {
        this.inConnectionWith = value;
    }

}
