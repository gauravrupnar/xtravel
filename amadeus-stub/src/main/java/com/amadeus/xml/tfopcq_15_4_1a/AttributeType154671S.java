
package com.amadeus.xml.tfopcq_15_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to have tag value without code list for tag
 * 
 * <p>Java class for AttributeType_154671S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeType_154671S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="criteriaSetType" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="criteriaDetails" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AttributeInformationTypeU" maxOccurs="999"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeType_154671S", propOrder = {
    "criteriaSetType",
    "criteriaDetails"
})
public class AttributeType154671S {

    @XmlElement(required = true)
    protected String criteriaSetType;
    @XmlElement(required = true)
    protected List<AttributeInformationTypeU> criteriaDetails;

    /**
     * Gets the value of the criteriaSetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriteriaSetType() {
        return criteriaSetType;
    }

    /**
     * Sets the value of the criteriaSetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriteriaSetType(String value) {
        this.criteriaSetType = value;
    }

    /**
     * Gets the value of the criteriaDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteriaDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteriaDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeInformationTypeU }
     * 
     * 
     */
    public List<AttributeInformationTypeU> getCriteriaDetails() {
        if (criteriaDetails == null) {
            criteriaDetails = new ArrayList<AttributeInformationTypeU>();
        }
        return this.criteriaDetails;
    }

}
