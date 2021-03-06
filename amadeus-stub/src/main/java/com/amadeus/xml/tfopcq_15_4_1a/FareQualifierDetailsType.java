
package com.amadeus.xml.tfopcq_15_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareQualifierDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareQualifierDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="movementType" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AMA_EDICodesetType_Length1to3" minOccurs="0"/>
 *         &lt;element name="fareCategories" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}FareCategoryCodesType" minOccurs="0"/>
 *         &lt;element name="fareDetails" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}FareDetailsType" minOccurs="0"/>
 *         &lt;element name="additionalFareDetails" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AdditionalFareQualifierDetailsType" minOccurs="0"/>
 *         &lt;element name="discountDetails" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}DiscountPenaltyInformationType" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareQualifierDetailsType", propOrder = {
    "movementType",
    "fareCategories",
    "fareDetails",
    "additionalFareDetails",
    "discountDetails"
})
public class FareQualifierDetailsType {

    protected String movementType;
    protected FareCategoryCodesType fareCategories;
    protected FareDetailsType fareDetails;
    protected AdditionalFareQualifierDetailsType additionalFareDetails;
    protected List<DiscountPenaltyInformationType> discountDetails;

    /**
     * Gets the value of the movementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementType() {
        return movementType;
    }

    /**
     * Sets the value of the movementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementType(String value) {
        this.movementType = value;
    }

    /**
     * Gets the value of the fareCategories property.
     * 
     * @return
     *     possible object is
     *     {@link FareCategoryCodesType }
     *     
     */
    public FareCategoryCodesType getFareCategories() {
        return fareCategories;
    }

    /**
     * Sets the value of the fareCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareCategoryCodesType }
     *     
     */
    public void setFareCategories(FareCategoryCodesType value) {
        this.fareCategories = value;
    }

    /**
     * Gets the value of the fareDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailsType }
     *     
     */
    public FareDetailsType getFareDetails() {
        return fareDetails;
    }

    /**
     * Sets the value of the fareDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailsType }
     *     
     */
    public void setFareDetails(FareDetailsType value) {
        this.fareDetails = value;
    }

    /**
     * Gets the value of the additionalFareDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalFareQualifierDetailsType }
     *     
     */
    public AdditionalFareQualifierDetailsType getAdditionalFareDetails() {
        return additionalFareDetails;
    }

    /**
     * Sets the value of the additionalFareDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalFareQualifierDetailsType }
     *     
     */
    public void setAdditionalFareDetails(AdditionalFareQualifierDetailsType value) {
        this.additionalFareDetails = value;
    }

    /**
     * Gets the value of the discountDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountPenaltyInformationType }
     * 
     * 
     */
    public List<DiscountPenaltyInformationType> getDiscountDetails() {
        if (discountDetails == null) {
            discountDetails = new ArrayList<DiscountPenaltyInformationType>();
        }
        return this.discountDetails;
    }

}
