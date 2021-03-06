
package com.amadeus.xml.tfopcq_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify Screening and Security details
 * 
 * <p>Java class for SecurityScreeningType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityScreeningType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="screeningInstructions" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AMA_EDICodesetType_Length1to3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityScreeningType", propOrder = {
    "screeningInstructions"
})
public class SecurityScreeningType {

    protected String screeningInstructions;

    /**
     * Gets the value of the screeningInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreeningInstructions() {
        return screeningInstructions;
    }

    /**
     * Sets the value of the screeningInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreeningInstructions(String value) {
        this.screeningInstructions = value;
    }

}
