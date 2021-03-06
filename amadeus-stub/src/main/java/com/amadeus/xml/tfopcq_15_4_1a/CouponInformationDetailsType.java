
package com.amadeus.xml.tfopcq_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the coupon number, status, value, and other related information.
 * 
 * <p>Java class for CouponInformationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponInformationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpnNumber" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To6" minOccurs="0"/>
 *         &lt;element name="cpnStatus" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="cpnAmount" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="cpnExchangeMedia" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="settlementAuthorization" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="voluntaryIndic" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="cpnPreviousStatus" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="cpnSequenceNumber" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To6" minOccurs="0"/>
 *         &lt;element name="cpnReferenceNumber" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To60" minOccurs="0"/>
 *         &lt;element name="cpnInConnectionWithQualifier" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponInformationDetailsType", propOrder = {
    "cpnNumber",
    "cpnStatus",
    "cpnAmount",
    "cpnExchangeMedia",
    "settlementAuthorization",
    "voluntaryIndic",
    "cpnPreviousStatus",
    "cpnSequenceNumber",
    "cpnReferenceNumber",
    "cpnInConnectionWithQualifier"
})
public class CouponInformationDetailsType {

    protected String cpnNumber;
    protected String cpnStatus;
    protected String cpnAmount;
    protected String cpnExchangeMedia;
    protected String settlementAuthorization;
    protected String voluntaryIndic;
    protected String cpnPreviousStatus;
    protected String cpnSequenceNumber;
    protected String cpnReferenceNumber;
    protected String cpnInConnectionWithQualifier;

    /**
     * Gets the value of the cpnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnNumber() {
        return cpnNumber;
    }

    /**
     * Sets the value of the cpnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnNumber(String value) {
        this.cpnNumber = value;
    }

    /**
     * Gets the value of the cpnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnStatus() {
        return cpnStatus;
    }

    /**
     * Sets the value of the cpnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnStatus(String value) {
        this.cpnStatus = value;
    }

    /**
     * Gets the value of the cpnAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnAmount() {
        return cpnAmount;
    }

    /**
     * Sets the value of the cpnAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnAmount(String value) {
        this.cpnAmount = value;
    }

    /**
     * Gets the value of the cpnExchangeMedia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnExchangeMedia() {
        return cpnExchangeMedia;
    }

    /**
     * Sets the value of the cpnExchangeMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnExchangeMedia(String value) {
        this.cpnExchangeMedia = value;
    }

    /**
     * Gets the value of the settlementAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementAuthorization() {
        return settlementAuthorization;
    }

    /**
     * Sets the value of the settlementAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementAuthorization(String value) {
        this.settlementAuthorization = value;
    }

    /**
     * Gets the value of the voluntaryIndic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoluntaryIndic() {
        return voluntaryIndic;
    }

    /**
     * Sets the value of the voluntaryIndic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoluntaryIndic(String value) {
        this.voluntaryIndic = value;
    }

    /**
     * Gets the value of the cpnPreviousStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnPreviousStatus() {
        return cpnPreviousStatus;
    }

    /**
     * Sets the value of the cpnPreviousStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnPreviousStatus(String value) {
        this.cpnPreviousStatus = value;
    }

    /**
     * Gets the value of the cpnSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnSequenceNumber() {
        return cpnSequenceNumber;
    }

    /**
     * Sets the value of the cpnSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnSequenceNumber(String value) {
        this.cpnSequenceNumber = value;
    }

    /**
     * Gets the value of the cpnReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnReferenceNumber() {
        return cpnReferenceNumber;
    }

    /**
     * Sets the value of the cpnReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnReferenceNumber(String value) {
        this.cpnReferenceNumber = value;
    }

    /**
     * Gets the value of the cpnInConnectionWithQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnInConnectionWithQualifier() {
        return cpnInConnectionWithQualifier;
    }

    /**
     * Sets the value of the cpnInConnectionWithQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnInConnectionWithQualifier(String value) {
        this.cpnInConnectionWithQualifier = value;
    }

}
