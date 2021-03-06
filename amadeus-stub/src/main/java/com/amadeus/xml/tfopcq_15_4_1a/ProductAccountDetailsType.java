
package com.amadeus.xml.tfopcq_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify frequent traveller card information.
 * 
 * <p>Java class for ProductAccountDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductAccountDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceType" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="frequentTravellerId" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *         &lt;element name="category" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To9" minOccurs="0"/>
 *         &lt;element name="sequenceNumber" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To6" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="rateClass" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="approvalCode" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To17" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductAccountDetailsType", propOrder = {
    "referenceType",
    "frequentTravellerId",
    "category",
    "sequenceNumber",
    "versionNumber",
    "rateClass",
    "approvalCode"
})
public class ProductAccountDetailsType {

    protected String referenceType;
    protected String frequentTravellerId;
    protected String category;
    protected String sequenceNumber;
    protected String versionNumber;
    protected String rateClass;
    protected String approvalCode;

    /**
     * Gets the value of the referenceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceType() {
        return referenceType;
    }

    /**
     * Sets the value of the referenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceType(String value) {
        this.referenceType = value;
    }

    /**
     * Gets the value of the frequentTravellerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequentTravellerId() {
        return frequentTravellerId;
    }

    /**
     * Sets the value of the frequentTravellerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequentTravellerId(String value) {
        this.frequentTravellerId = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionNumber(String value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the rateClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateClass() {
        return rateClass;
    }

    /**
     * Sets the value of the rateClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateClass(String value) {
        this.rateClass = value;
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

}
