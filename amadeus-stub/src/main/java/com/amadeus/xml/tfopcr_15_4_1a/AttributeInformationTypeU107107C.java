
package com.amadeus.xml.tfopcr_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the type of attribute and the attribute
 * 
 * <p>Java class for AttributeInformationTypeU_107107C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeInformationTypeU_107107C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attributeType" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To25"/>
 *         &lt;element name="attributeDescription" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To256"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeInformationTypeU_107107C", propOrder = {
    "attributeType",
    "attributeDescription"
})
public class AttributeInformationTypeU107107C {

    @XmlElement(required = true)
    protected String attributeType;
    @XmlElement(required = true)
    protected String attributeDescription;

    /**
     * Gets the value of the attributeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeType() {
        return attributeType;
    }

    /**
     * Sets the value of the attributeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeType(String value) {
        this.attributeType = value;
    }

    /**
     * Gets the value of the attributeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeDescription() {
        return attributeDescription;
    }

    /**
     * Sets the value of the attributeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeDescription(String value) {
        this.attributeDescription = value;
    }

}
