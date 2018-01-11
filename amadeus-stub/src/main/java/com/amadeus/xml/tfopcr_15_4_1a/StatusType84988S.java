
package com.amadeus.xml.tfopcr_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To advise the requester system the status of the reply
 * 
 * <p>Java class for StatusType_84988S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusType_84988S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}StatusDetailsTypeI_129365C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusType_84988S", propOrder = {
    "statusInformation"
})
public class StatusType84988S {

    @XmlElement(required = true)
    protected StatusDetailsTypeI129365C statusInformation;

    /**
     * Gets the value of the statusInformation property.
     * 
     * @return
     *     possible object is
     *     {@link StatusDetailsTypeI129365C }
     *     
     */
    public StatusDetailsTypeI129365C getStatusInformation() {
        return statusInformation;
    }

    /**
     * Sets the value of the statusInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusDetailsTypeI129365C }
     *     
     */
    public void setStatusInformation(StatusDetailsTypeI129365C value) {
        this.statusInformation = value;
    }

}
