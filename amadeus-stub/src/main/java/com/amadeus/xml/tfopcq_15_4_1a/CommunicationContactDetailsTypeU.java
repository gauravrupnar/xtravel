
package com.amadeus.xml.tfopcq_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Communication number of a department or employee in a specified channel.
 * 
 * <p>Java class for CommunicationContactDetailsTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommunicationContactDetailsTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="internetAddress" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To512"/>
 *         &lt;element name="adressQualifier" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationContactDetailsTypeU", propOrder = {
    "internetAddress",
    "adressQualifier"
})
public class CommunicationContactDetailsTypeU {

    @XmlElement(required = true)
    protected String internetAddress;
    @XmlElement(required = true)
    protected String adressQualifier;

    /**
     * Gets the value of the internetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternetAddress() {
        return internetAddress;
    }

    /**
     * Sets the value of the internetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetAddress(String value) {
        this.internetAddress = value;
    }

    /**
     * Gets the value of the adressQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdressQualifier() {
        return adressQualifier;
    }

    /**
     * Sets the value of the adressQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdressQualifier(String value) {
        this.adressQualifier = value;
    }

}
