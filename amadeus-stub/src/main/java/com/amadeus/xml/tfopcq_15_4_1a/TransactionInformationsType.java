
package com.amadeus.xml.tfopcq_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey details related to the transaction
 * 
 * <p>Java class for TransactionInformationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionInformationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To4" minOccurs="0"/>
 *         &lt;element name="type" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To4" minOccurs="0"/>
 *         &lt;element name="issueIndicator" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="transmissionControlNumber" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionInformationsType", propOrder = {
    "code",
    "type",
    "issueIndicator",
    "transmissionControlNumber"
})
public class TransactionInformationsType {

    protected String code;
    protected String type;
    protected String issueIndicator;
    protected String transmissionControlNumber;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

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
     * Gets the value of the issueIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueIndicator() {
        return issueIndicator;
    }

    /**
     * Sets the value of the issueIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueIndicator(String value) {
        this.issueIndicator = value;
    }

    /**
     * Gets the value of the transmissionControlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmissionControlNumber() {
        return transmissionControlNumber;
    }

    /**
     * Sets the value of the transmissionControlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmissionControlNumber(String value) {
        this.transmissionControlNumber = value;
    }

}
