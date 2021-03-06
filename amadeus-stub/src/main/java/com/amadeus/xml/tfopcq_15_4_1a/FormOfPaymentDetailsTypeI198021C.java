
package com.amadeus.xml.tfopcq_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the form of payment type, amounts, approval codes, and other related information.
 * 
 * <p>Java class for FormOfPaymentDetailsTypeI_198021C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormOfPaymentDetailsTypeI_198021C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To10"/>
 *         &lt;element name="indicator" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="merchantCode" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="expiryDate" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="customerAccount" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To35"/>
 *         &lt;element name="membershipStatus" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="transactionInfo" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="pinCode" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To100" minOccurs="0"/>
 *         &lt;element name="pinCodeType" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To8" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormOfPaymentDetailsTypeI_198021C", propOrder = {
    "type",
    "indicator",
    "merchantCode",
    "expiryDate",
    "customerAccount",
    "membershipStatus",
    "transactionInfo",
    "pinCode",
    "pinCodeType"
})
public class FormOfPaymentDetailsTypeI198021C {

    @XmlElement(required = true)
    protected String type;
    protected String indicator;
    protected String merchantCode;
    protected String expiryDate;
    @XmlElement(required = true)
    protected String customerAccount;
    @XmlElement(required = true)
    protected String membershipStatus;
    protected String transactionInfo;
    protected String pinCode;
    protected String pinCodeType;

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
     * Gets the value of the indicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicator() {
        return indicator;
    }

    /**
     * Sets the value of the indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicator(String value) {
        this.indicator = value;
    }

    /**
     * Gets the value of the merchantCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCode() {
        return merchantCode;
    }

    /**
     * Sets the value of the merchantCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCode(String value) {
        this.merchantCode = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the customerAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAccount() {
        return customerAccount;
    }

    /**
     * Sets the value of the customerAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAccount(String value) {
        this.customerAccount = value;
    }

    /**
     * Gets the value of the membershipStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipStatus() {
        return membershipStatus;
    }

    /**
     * Sets the value of the membershipStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipStatus(String value) {
        this.membershipStatus = value;
    }

    /**
     * Gets the value of the transactionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionInfo() {
        return transactionInfo;
    }

    /**
     * Sets the value of the transactionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionInfo(String value) {
        this.transactionInfo = value;
    }

    /**
     * Gets the value of the pinCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinCode() {
        return pinCode;
    }

    /**
     * Sets the value of the pinCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinCode(String value) {
        this.pinCode = value;
    }

    /**
     * Gets the value of the pinCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinCodeType() {
        return pinCodeType;
    }

    /**
     * Sets the value of the pinCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinCodeType(String value) {
        this.pinCodeType = value;
    }

}
