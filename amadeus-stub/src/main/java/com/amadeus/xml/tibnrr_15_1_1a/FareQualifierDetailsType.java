
package com.amadeus.xml.tibnrr_15_1_1a;

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
 *         &lt;element name="discountDetails" type="{http://xml.amadeus.com/TIBNRR_15_1_1A}DiscountPenaltyInformationType" maxOccurs="9" minOccurs="0"/>
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
    "discountDetails"
})
public class FareQualifierDetailsType {

    protected List<DiscountPenaltyInformationType> discountDetails;

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
