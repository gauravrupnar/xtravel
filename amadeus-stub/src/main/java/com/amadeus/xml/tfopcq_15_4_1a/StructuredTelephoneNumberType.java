
package com.amadeus.xml.tfopcq_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StructuredTelephoneNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredTelephoneNumberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="internationalDialCode" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *         &lt;element name="localPrefixCode" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *         &lt;element name="areaCode" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *         &lt;element name="telephoneNumber" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To25"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredTelephoneNumberType", propOrder = {
    "internationalDialCode",
    "localPrefixCode",
    "areaCode",
    "telephoneNumber"
})
public class StructuredTelephoneNumberType {

    protected String internationalDialCode;
    protected String localPrefixCode;
    protected String areaCode;
    @XmlElement(required = true)
    protected String telephoneNumber;

    /**
     * Gets the value of the internationalDialCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalDialCode() {
        return internationalDialCode;
    }

    /**
     * Sets the value of the internationalDialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalDialCode(String value) {
        this.internationalDialCode = value;
    }

    /**
     * Gets the value of the localPrefixCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalPrefixCode() {
        return localPrefixCode;
    }

    /**
     * Sets the value of the localPrefixCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalPrefixCode(String value) {
        this.localPrefixCode = value;
    }

    /**
     * Gets the value of the areaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the value of the areaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneNumber(String value) {
        this.telephoneNumber = value;
    }

}
