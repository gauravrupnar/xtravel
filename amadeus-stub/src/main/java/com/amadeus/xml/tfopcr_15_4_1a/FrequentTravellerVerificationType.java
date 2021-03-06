
package com.amadeus.xml.tfopcr_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide frequent traveller information for mileage accrual and account updating.
 * 
 * <p>Java class for FrequentTravellerVerificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentTravellerVerificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionRequest" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="tier" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="companyDetails" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}CompanyIdentificationTypeI" minOccurs="0"/>
 *         &lt;element name="accountDetails" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}ProductAccountDetailsType" minOccurs="0"/>
 *         &lt;element name="otherProductsDetails" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}ProductAccountDetailsType" minOccurs="0"/>
 *         &lt;element name="dateDetails" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}ValidDateInformationTypeI" minOccurs="0"/>
 *         &lt;element name="accountHolderDetails" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AccountHolderInformationTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentTravellerVerificationType", propOrder = {
    "actionRequest",
    "tier",
    "companyDetails",
    "accountDetails",
    "otherProductsDetails",
    "dateDetails",
    "accountHolderDetails"
})
public class FrequentTravellerVerificationType {

    @XmlElement(required = true)
    protected String actionRequest;
    protected String tier;
    protected CompanyIdentificationTypeI companyDetails;
    protected ProductAccountDetailsType accountDetails;
    protected ProductAccountDetailsType otherProductsDetails;
    protected ValidDateInformationTypeI dateDetails;
    protected AccountHolderInformationTypeI accountHolderDetails;

    /**
     * Gets the value of the actionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionRequest() {
        return actionRequest;
    }

    /**
     * Sets the value of the actionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionRequest(String value) {
        this.actionRequest = value;
    }

    /**
     * Gets the value of the tier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTier() {
        return tier;
    }

    /**
     * Sets the value of the tier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTier(String value) {
        this.tier = value;
    }

    /**
     * Gets the value of the companyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI }
     *     
     */
    public CompanyIdentificationTypeI getCompanyDetails() {
        return companyDetails;
    }

    /**
     * Sets the value of the companyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI }
     *     
     */
    public void setCompanyDetails(CompanyIdentificationTypeI value) {
        this.companyDetails = value;
    }

    /**
     * Gets the value of the accountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductAccountDetailsType }
     *     
     */
    public ProductAccountDetailsType getAccountDetails() {
        return accountDetails;
    }

    /**
     * Sets the value of the accountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAccountDetailsType }
     *     
     */
    public void setAccountDetails(ProductAccountDetailsType value) {
        this.accountDetails = value;
    }

    /**
     * Gets the value of the otherProductsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductAccountDetailsType }
     *     
     */
    public ProductAccountDetailsType getOtherProductsDetails() {
        return otherProductsDetails;
    }

    /**
     * Sets the value of the otherProductsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAccountDetailsType }
     *     
     */
    public void setOtherProductsDetails(ProductAccountDetailsType value) {
        this.otherProductsDetails = value;
    }

    /**
     * Gets the value of the dateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ValidDateInformationTypeI }
     *     
     */
    public ValidDateInformationTypeI getDateDetails() {
        return dateDetails;
    }

    /**
     * Sets the value of the dateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidDateInformationTypeI }
     *     
     */
    public void setDateDetails(ValidDateInformationTypeI value) {
        this.dateDetails = value;
    }

    /**
     * Gets the value of the accountHolderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHolderInformationTypeI }
     *     
     */
    public AccountHolderInformationTypeI getAccountHolderDetails() {
        return accountHolderDetails;
    }

    /**
     * Sets the value of the accountHolderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHolderInformationTypeI }
     *     
     */
    public void setAccountHolderDetails(AccountHolderInformationTypeI value) {
        this.accountHolderDetails = value;
    }

}
