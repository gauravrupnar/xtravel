
package com.amadeus.xml.tfopcr_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the form of payment type, amounts, approval codes, and other related information.
 * 
 * <p>Java class for FormOfPaymentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormOfPaymentDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To10"/>
 *         &lt;element name="indicator" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="vendorCode" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="creditCardNumber" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="expiryDate" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="approvalCode" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To17" minOccurs="0"/>
 *         &lt;element name="sourceOfApproval" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="addressVerification" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="customerAccount" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *         &lt;element name="extendedPayment" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="fopFreeText" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *         &lt;element name="membershipStatus" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="transactionInfo" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="pinCode" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To100" minOccurs="0"/>
 *         &lt;element name="pinCodeType" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To8" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormOfPaymentDetailsType", propOrder = {
    "type",
    "indicator",
    "vendorCode",
    "creditCardNumber",
    "expiryDate",
    "approvalCode",
    "sourceOfApproval",
    "addressVerification",
    "customerAccount",
    "extendedPayment",
    "fopFreeText",
    "membershipStatus",
    "transactionInfo",
    "pinCode",
    "pinCodeType"
})
public class FormOfPaymentDetailsType {

    @XmlElement(required = true)
    protected String type;
    protected String indicator;
    protected String vendorCode;
    protected String creditCardNumber;
    protected String expiryDate;
    protected String approvalCode;
    protected String sourceOfApproval;
    protected String addressVerification;
    protected String customerAccount;
    protected String extendedPayment;
    protected String fopFreeText;
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
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     * Gets the value of the creditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value) {
        this.creditCardNumber = value;
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
     * Gets the value of the approvalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalCode() {
        return approvalCode;
    }

    /**
     * Sets the value of the approvalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalCode(String value) {
        this.approvalCode = value;
    }

    /**
     * Gets the value of the sourceOfApproval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfApproval() {
        return sourceOfApproval;
    }

    /**
     * Sets the value of the sourceOfApproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfApproval(String value) {
        this.sourceOfApproval = value;
    }

    /**
     * Gets the value of the addressVerification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressVerification() {
        return addressVerification;
    }

    /**
     * Sets the value of the addressVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressVerification(String value) {
        this.addressVerification = value;
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
     * Gets the value of the extendedPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedPayment() {
        return extendedPayment;
    }

    /**
     * Sets the value of the extendedPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedPayment(String value) {
        this.extendedPayment = value;
    }

    /**
     * Gets the value of the fopFreeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFopFreeText() {
        return fopFreeText;
    }

    /**
     * Sets the value of the fopFreeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFopFreeText(String value) {
        this.fopFreeText = value;
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
