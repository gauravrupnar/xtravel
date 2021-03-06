
package com.amadeus.xml.tfopcr_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To indicate a location and the type of location.
 * 
 * <p>Java class for ProductLocationDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductLocationDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="otherStation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To25"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductLocationDetailsTypeI", propOrder = {
    "otherStation"
})
public class ProductLocationDetailsTypeI {

    @XmlElement(required = true)
    protected String otherStation;

    /**
     * Gets the value of the otherStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherStation() {
        return otherStation;
    }

    /**
     * Sets the value of the otherStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherStation(String value) {
        this.otherStation = value;
    }

}
