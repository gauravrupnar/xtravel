
package org.opentravel.ota._2003._05.ota2010b;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the type of transportation offered.
 * 
 * <p>Java class for TransportationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Transportation" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}MultimediaDescriptionsType" minOccurs="0"/>
 *                   &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OperationSchedulesType" minOccurs="0"/>
 *                   &lt;element name="DescriptiveText" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[A-Za-z0-9]{1,500}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}CurrencyAmountGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}ID_OptionalGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}CodeInfoGroup"/>
 *                 &lt;attribute name="NotificationRequired" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to64" />
 *                 &lt;attribute name="TransportationCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" />
 *                 &lt;attribute name="ChargeUnit" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" />
 *                 &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Description" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength0to64" />
 *                 &lt;attribute name="TypicalTravelTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportationType", propOrder = {
    "transportation"
})
public class TransportationType {

    @XmlElement(name = "Transportation", required = true)
    protected List<TransportationType.Transportation> transportation;

    /**
     * Gets the value of the transportation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportationType.Transportation }
     * 
     * 
     */
    public List<TransportationType.Transportation> getTransportation() {
        if (transportation == null) {
            transportation = new ArrayList<TransportationType.Transportation>();
        }
        return this.transportation;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}MultimediaDescriptionsType" minOccurs="0"/>
     *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OperationSchedulesType" minOccurs="0"/>
     *         &lt;element name="DescriptiveText" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="[A-Za-z0-9]{1,500}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}CurrencyAmountGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}ID_OptionalGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}CodeInfoGroup"/>
     *       &lt;attribute name="NotificationRequired" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to64" />
     *       &lt;attribute name="TransportationCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" />
     *       &lt;attribute name="ChargeUnit" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" />
     *       &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Description" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength0to64" />
     *       &lt;attribute name="TypicalTravelTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "multimediaDescriptions",
        "operationSchedules",
        "descriptiveText"
    })
    public static class Transportation {

        @XmlElement(name = "MultimediaDescriptions")
        protected MultimediaDescriptionsType multimediaDescriptions;
        @XmlElement(name = "OperationSchedules")
        protected OperationSchedulesType operationSchedules;
        @XmlElement(name = "DescriptiveText")
        protected String descriptiveText;
        @XmlAttribute(name = "NotificationRequired")
        protected String notificationRequired;
        @XmlAttribute(name = "TransportationCode")
        protected String transportationCode;
        @XmlAttribute(name = "ChargeUnit")
        protected String chargeUnit;
        @XmlAttribute(name = "Included")
        protected Boolean included;
        @XmlAttribute(name = "Description")
        protected String description;
        @XmlAttribute(name = "TypicalTravelTime")
        protected String typicalTravelTime;
        @XmlAttribute(name = "ExistsCode")
        protected String existsCode;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;
        @XmlAttribute(name = "ID")
        protected String id;
        @XmlAttribute(name = "CodeDetail")
        protected String codeDetail;
        @XmlAttribute(name = "Removal")
        protected Boolean removal;

        /**
         * Gets the value of the multimediaDescriptions property.
         * 
         * @return
         *     possible object is
         *     {@link MultimediaDescriptionsType }
         *     
         */
        public MultimediaDescriptionsType getMultimediaDescriptions() {
            return multimediaDescriptions;
        }

        /**
         * Sets the value of the multimediaDescriptions property.
         * 
         * @param value
         *     allowed object is
         *     {@link MultimediaDescriptionsType }
         *     
         */
        public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
            this.multimediaDescriptions = value;
        }

        /**
         * Gets the value of the operationSchedules property.
         * 
         * @return
         *     possible object is
         *     {@link OperationSchedulesType }
         *     
         */
        public OperationSchedulesType getOperationSchedules() {
            return operationSchedules;
        }

        /**
         * Sets the value of the operationSchedules property.
         * 
         * @param value
         *     allowed object is
         *     {@link OperationSchedulesType }
         *     
         */
        public void setOperationSchedules(OperationSchedulesType value) {
            this.operationSchedules = value;
        }

        /**
         * Gets the value of the descriptiveText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescriptiveText() {
            return descriptiveText;
        }

        /**
         * Sets the value of the descriptiveText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescriptiveText(String value) {
            this.descriptiveText = value;
        }

        /**
         * Gets the value of the notificationRequired property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNotificationRequired() {
            return notificationRequired;
        }

        /**
         * Sets the value of the notificationRequired property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNotificationRequired(String value) {
            this.notificationRequired = value;
        }

        /**
         * Gets the value of the transportationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransportationCode() {
            return transportationCode;
        }

        /**
         * Sets the value of the transportationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransportationCode(String value) {
            this.transportationCode = value;
        }

        /**
         * Gets the value of the chargeUnit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChargeUnit() {
            return chargeUnit;
        }

        /**
         * Sets the value of the chargeUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChargeUnit(String value) {
            this.chargeUnit = value;
        }

        /**
         * Gets the value of the included property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIncluded() {
            return included;
        }

        /**
         * Sets the value of the included property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIncluded(Boolean value) {
            this.included = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the typicalTravelTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTypicalTravelTime() {
            return typicalTravelTime;
        }

        /**
         * Sets the value of the typicalTravelTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTypicalTravelTime(String value) {
            this.typicalTravelTime = value;
        }

        /**
         * Gets the value of the existsCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExistsCode() {
            return existsCode;
        }

        /**
         * Sets the value of the existsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExistsCode(String value) {
            this.existsCode = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the currencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Sets the value of the currencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

        /**
         * Gets the value of the decimalPlaces property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDecimalPlaces() {
            return decimalPlaces;
        }

        /**
         * Sets the value of the decimalPlaces property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDecimalPlaces(BigInteger value) {
            this.decimalPlaces = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the codeDetail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeDetail() {
            return codeDetail;
        }

        /**
         * Sets the value of the codeDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeDetail(String value) {
            this.codeDetail = value;
        }

        /**
         * Gets the value of the removal property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRemoval() {
            return removal;
        }

        /**
         * Sets the value of the removal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRemoval(Boolean value) {
            this.removal = value;
        }

    }

}
