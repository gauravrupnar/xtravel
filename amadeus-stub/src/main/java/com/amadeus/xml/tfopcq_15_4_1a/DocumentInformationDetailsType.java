
package com.amadeus.xml.tfopcq_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information concerning a document.
 * 
 * <p>Java class for DocumentInformationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentInformationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentDetails" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}DocumentDetailsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentInformationDetailsType", propOrder = {
    "documentDetails"
})
public class DocumentInformationDetailsType {

    @XmlElement(required = true)
    protected DocumentDetailsTypeI documentDetails;

    /**
     * Gets the value of the documentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentDetailsTypeI }
     *     
     */
    public DocumentDetailsTypeI getDocumentDetails() {
        return documentDetails;
    }

    /**
     * Sets the value of the documentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentDetailsTypeI }
     *     
     */
    public void setDocumentDetails(DocumentDetailsTypeI value) {
        this.documentDetails = value;
    }

}
