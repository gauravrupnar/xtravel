
package com.amadeus.xml.quereq_09_1_ia;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide free text information.
 * 
 * <p>Java class for InteractiveFreeTextTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InteractiveFreeTextTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="freeTextQualification" type="{http://xml.amadeus.com/QUEREQ_09_1_IA}FreeTextQualificationTypeI" minOccurs="0"/>
 *         &lt;element name="freeText" type="{http://xml.amadeus.com/QUEREQ_09_1_IA}AlphaNumericString_Length1To70" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InteractiveFreeTextTypeI", propOrder = {
    "freeTextQualification",
    "freeText"
})
public class InteractiveFreeTextTypeI {

    protected FreeTextQualificationTypeI freeTextQualification;
    protected List<String> freeText;

    /**
     * Gets the value of the freeTextQualification property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextQualificationTypeI }
     *     
     */
    public FreeTextQualificationTypeI getFreeTextQualification() {
        return freeTextQualification;
    }

    /**
     * Sets the value of the freeTextQualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextQualificationTypeI }
     *     
     */
    public void setFreeTextQualification(FreeTextQualificationTypeI value) {
        this.freeTextQualification = value;
    }

    /**
     * Gets the value of the freeText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFreeText() {
        if (freeText == null) {
            freeText = new ArrayList<String>();
        }
        return this.freeText;
    }

}
