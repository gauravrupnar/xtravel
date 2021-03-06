
package com.amadeus.xml.tfopcr_15_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents Invoice fop to validate.
 * 
 * <p>Java class for InvoiceFopGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceFopGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invoiceInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}FormOfPaymentTypeI"/>
 *         &lt;element name="routing" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}RoutingInformationTypeI"/>
 *         &lt;element name="iruQualifier" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}StatusType_68646S" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="fopInformationGroup" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fopInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TicketingFormOfPaymentType_87806S"/>
 *                   &lt;element name="fopInformationAmount" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}MonetaryInformationType_87804S"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="accountSupplementaryData" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AttributeType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="bookingReference" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}ReservationControlInformationType" minOccurs="0"/>
 *         &lt;element name="parentTicketGroup" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="documentNumber" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TicketNumberType"/>
 *                   &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}MonetaryInformationType" maxOccurs="999" minOccurs="0"/>
 *                   &lt;element name="taxInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TaxType" maxOccurs="198" minOccurs="0"/>
 *                   &lt;element name="conjunctiveTicketGroup" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="conjunctiveFlag" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}StatusType_141910S"/>
 *                             &lt;element name="conjunctiveDocumentNumber" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TicketNumberType"/>
 *                             &lt;element name="couponStatus" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}CouponInformationTypeI" maxOccurs="4" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="originatorInfo" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}OriginatorOfRequestDetailsTypeI" minOccurs="0"/>
 *                   &lt;element name="eDocrecordLocator" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}ReservationControlInformationType_167717S" minOccurs="0"/>
 *                   &lt;element name="recipientNameSurname" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TravellerInformationType" minOccurs="0"/>
 *                   &lt;element name="frequentFlyerNumber" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}FrequentTravellerVerificationType" minOccurs="0"/>
 *                   &lt;element name="dates" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}StructuredDateTimeInformationType" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="additionalInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}FreeTextInformationType" maxOccurs="3" minOccurs="0"/>
 *                   &lt;element name="fareComponentDetails" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="fareComponentId" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}ReferenceInfoType"/>
 *                             &lt;element name="couponStatus" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}CouponInformationType" maxOccurs="99"/>
 *                             &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}MonetaryInformationType_192195S" maxOccurs="99" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="unusedTicketCoupons" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="fareBasis" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}FareQualifierDetailsType"/>
 *                             &lt;element name="flightInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TravelProductInformationType" minOccurs="0"/>
 *                             &lt;element name="couponStatus" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}CouponInformationType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="fopParentTicketGroup" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="fopDetails" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}FormOfPaymentType"/>
 *                             &lt;element name="fopInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TicketingFormOfPaymentType"/>
 *                             &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}MonetaryInformationType" maxOccurs="10" minOccurs="0"/>
 *                             &lt;element name="oldFopFreeflow" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}FreeTextInformationType" minOccurs="0"/>
 *                             &lt;element name="pnrSupplementaryData" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}PNRSupplementaryDataType" maxOccurs="2" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ruleList" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ruleType" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}InformationTypeDataTypeU"/>
 *                   &lt;element name="dateDetails" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="date" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}StructuredPeriodInformationType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="passengerDetails" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="recipientNameSurname" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TravellerInformationType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="flightDetails" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="flightInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TravelProductInformationType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="otherDetails" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}StatusType_141910S" minOccurs="0"/>
 *                 &lt;/sequence>
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
@XmlType(name = "InvoiceFopGroupType", propOrder = {
    "invoiceInformation",
    "routing",
    "iruQualifier",
    "fopInformationGroup",
    "accountSupplementaryData",
    "bookingReference",
    "parentTicketGroup",
    "ruleList"
})
public class InvoiceFopGroupType {

    @XmlElement(required = true)
    protected FormOfPaymentTypeI invoiceInformation;
    @XmlElement(required = true)
    protected RoutingInformationTypeI routing;
    protected List<StatusType68646S> iruQualifier;
    protected List<InvoiceFopGroupType.FopInformationGroup> fopInformationGroup;
    protected List<AttributeType> accountSupplementaryData;
    protected ReservationControlInformationType bookingReference;
    protected List<InvoiceFopGroupType.ParentTicketGroup> parentTicketGroup;
    protected List<InvoiceFopGroupType.RuleList> ruleList;

    /**
     * Gets the value of the invoiceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentTypeI }
     *     
     */
    public FormOfPaymentTypeI getInvoiceInformation() {
        return invoiceInformation;
    }

    /**
     * Sets the value of the invoiceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentTypeI }
     *     
     */
    public void setInvoiceInformation(FormOfPaymentTypeI value) {
        this.invoiceInformation = value;
    }

    /**
     * Gets the value of the routing property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingInformationTypeI }
     *     
     */
    public RoutingInformationTypeI getRouting() {
        return routing;
    }

    /**
     * Sets the value of the routing property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingInformationTypeI }
     *     
     */
    public void setRouting(RoutingInformationTypeI value) {
        this.routing = value;
    }

    /**
     * Gets the value of the iruQualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iruQualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIruQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusType68646S }
     * 
     * 
     */
    public List<StatusType68646S> getIruQualifier() {
        if (iruQualifier == null) {
            iruQualifier = new ArrayList<StatusType68646S>();
        }
        return this.iruQualifier;
    }

    /**
     * Gets the value of the fopInformationGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fopInformationGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFopInformationGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceFopGroupType.FopInformationGroup }
     * 
     * 
     */
    public List<InvoiceFopGroupType.FopInformationGroup> getFopInformationGroup() {
        if (fopInformationGroup == null) {
            fopInformationGroup = new ArrayList<InvoiceFopGroupType.FopInformationGroup>();
        }
        return this.fopInformationGroup;
    }

    /**
     * Gets the value of the accountSupplementaryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountSupplementaryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountSupplementaryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeType }
     * 
     * 
     */
    public List<AttributeType> getAccountSupplementaryData() {
        if (accountSupplementaryData == null) {
            accountSupplementaryData = new ArrayList<AttributeType>();
        }
        return this.accountSupplementaryData;
    }

    /**
     * Gets the value of the bookingReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationType }
     *     
     */
    public ReservationControlInformationType getBookingReference() {
        return bookingReference;
    }

    /**
     * Sets the value of the bookingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationType }
     *     
     */
    public void setBookingReference(ReservationControlInformationType value) {
        this.bookingReference = value;
    }

    /**
     * Gets the value of the parentTicketGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentTicketGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentTicketGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceFopGroupType.ParentTicketGroup }
     * 
     * 
     */
    public List<InvoiceFopGroupType.ParentTicketGroup> getParentTicketGroup() {
        if (parentTicketGroup == null) {
            parentTicketGroup = new ArrayList<InvoiceFopGroupType.ParentTicketGroup>();
        }
        return this.parentTicketGroup;
    }

    /**
     * Gets the value of the ruleList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceFopGroupType.RuleList }
     * 
     * 
     */
    public List<InvoiceFopGroupType.RuleList> getRuleList() {
        if (ruleList == null) {
            ruleList = new ArrayList<InvoiceFopGroupType.RuleList>();
        }
        return this.ruleList;
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
     *         &lt;element name="fopInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TicketingFormOfPaymentType_87806S"/>
     *         &lt;element name="fopInformationAmount" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}MonetaryInformationType_87804S"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fopInformation",
        "fopInformationAmount"
    })
    public static class FopInformationGroup {

        @XmlElement(required = true)
        protected TicketingFormOfPaymentType87806S fopInformation;
        @XmlElement(required = true)
        protected MonetaryInformationType87804S fopInformationAmount;

        /**
         * Gets the value of the fopInformation property.
         * 
         * @return
         *     possible object is
         *     {@link TicketingFormOfPaymentType87806S }
         *     
         */
        public TicketingFormOfPaymentType87806S getFopInformation() {
            return fopInformation;
        }

        /**
         * Sets the value of the fopInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketingFormOfPaymentType87806S }
         *     
         */
        public void setFopInformation(TicketingFormOfPaymentType87806S value) {
            this.fopInformation = value;
        }

        /**
         * Gets the value of the fopInformationAmount property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryInformationType87804S }
         *     
         */
        public MonetaryInformationType87804S getFopInformationAmount() {
            return fopInformationAmount;
        }

        /**
         * Sets the value of the fopInformationAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryInformationType87804S }
         *     
         */
        public void setFopInformationAmount(MonetaryInformationType87804S value) {
            this.fopInformationAmount = value;
        }

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
     *         &lt;element name="documentNumber" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TicketNumberType"/>
     *         &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}MonetaryInformationType" maxOccurs="999" minOccurs="0"/>
     *         &lt;element name="taxInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TaxType" maxOccurs="198" minOccurs="0"/>
     *         &lt;element name="conjunctiveTicketGroup" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="conjunctiveFlag" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}StatusType_141910S"/>
     *                   &lt;element name="conjunctiveDocumentNumber" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TicketNumberType"/>
     *                   &lt;element name="couponStatus" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}CouponInformationTypeI" maxOccurs="4" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="originatorInfo" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}OriginatorOfRequestDetailsTypeI" minOccurs="0"/>
     *         &lt;element name="eDocrecordLocator" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}ReservationControlInformationType_167717S" minOccurs="0"/>
     *         &lt;element name="recipientNameSurname" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TravellerInformationType" minOccurs="0"/>
     *         &lt;element name="frequentFlyerNumber" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}FrequentTravellerVerificationType" minOccurs="0"/>
     *         &lt;element name="dates" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}StructuredDateTimeInformationType" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="additionalInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}FreeTextInformationType" maxOccurs="3" minOccurs="0"/>
     *         &lt;element name="fareComponentDetails" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="fareComponentId" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}ReferenceInfoType"/>
     *                   &lt;element name="couponStatus" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}CouponInformationType" maxOccurs="99"/>
     *                   &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}MonetaryInformationType_192195S" maxOccurs="99" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="unusedTicketCoupons" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="fareBasis" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}FareQualifierDetailsType"/>
     *                   &lt;element name="flightInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TravelProductInformationType" minOccurs="0"/>
     *                   &lt;element name="couponStatus" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}CouponInformationType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="fopParentTicketGroup" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="fopDetails" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}FormOfPaymentType"/>
     *                   &lt;element name="fopInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TicketingFormOfPaymentType"/>
     *                   &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}MonetaryInformationType" maxOccurs="10" minOccurs="0"/>
     *                   &lt;element name="oldFopFreeflow" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}FreeTextInformationType" minOccurs="0"/>
     *                   &lt;element name="pnrSupplementaryData" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}PNRSupplementaryDataType" maxOccurs="2" minOccurs="0"/>
     *                 &lt;/sequence>
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
    @XmlType(name = "", propOrder = {
        "documentNumber",
        "monetaryInformation",
        "taxInformation",
        "conjunctiveTicketGroup",
        "originatorInfo",
        "eDocrecordLocator",
        "recipientNameSurname",
        "frequentFlyerNumber",
        "dates",
        "additionalInformation",
        "fareComponentDetails",
        "unusedTicketCoupons",
        "fopParentTicketGroup"
    })
    public static class ParentTicketGroup {

        @XmlElement(required = true)
        protected TicketNumberType documentNumber;
        protected List<MonetaryInformationType> monetaryInformation;
        protected List<TaxType> taxInformation;
        protected List<InvoiceFopGroupType.ParentTicketGroup.ConjunctiveTicketGroup> conjunctiveTicketGroup;
        protected OriginatorOfRequestDetailsTypeI originatorInfo;
        protected ReservationControlInformationType167717S eDocrecordLocator;
        protected TravellerInformationType recipientNameSurname;
        protected FrequentTravellerVerificationType frequentFlyerNumber;
        protected List<StructuredDateTimeInformationType> dates;
        protected List<FreeTextInformationType> additionalInformation;
        protected List<InvoiceFopGroupType.ParentTicketGroup.FareComponentDetails> fareComponentDetails;
        protected List<InvoiceFopGroupType.ParentTicketGroup.UnusedTicketCoupons> unusedTicketCoupons;
        protected List<InvoiceFopGroupType.ParentTicketGroup.FopParentTicketGroup> fopParentTicketGroup;

        /**
         * Gets the value of the documentNumber property.
         * 
         * @return
         *     possible object is
         *     {@link TicketNumberType }
         *     
         */
        public TicketNumberType getDocumentNumber() {
            return documentNumber;
        }

        /**
         * Sets the value of the documentNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketNumberType }
         *     
         */
        public void setDocumentNumber(TicketNumberType value) {
            this.documentNumber = value;
        }

        /**
         * Gets the value of the monetaryInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the monetaryInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMonetaryInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MonetaryInformationType }
         * 
         * 
         */
        public List<MonetaryInformationType> getMonetaryInformation() {
            if (monetaryInformation == null) {
                monetaryInformation = new ArrayList<MonetaryInformationType>();
            }
            return this.monetaryInformation;
        }

        /**
         * Gets the value of the taxInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TaxType }
         * 
         * 
         */
        public List<TaxType> getTaxInformation() {
            if (taxInformation == null) {
                taxInformation = new ArrayList<TaxType>();
            }
            return this.taxInformation;
        }

        /**
         * Gets the value of the conjunctiveTicketGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conjunctiveTicketGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConjunctiveTicketGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InvoiceFopGroupType.ParentTicketGroup.ConjunctiveTicketGroup }
         * 
         * 
         */
        public List<InvoiceFopGroupType.ParentTicketGroup.ConjunctiveTicketGroup> getConjunctiveTicketGroup() {
            if (conjunctiveTicketGroup == null) {
                conjunctiveTicketGroup = new ArrayList<InvoiceFopGroupType.ParentTicketGroup.ConjunctiveTicketGroup>();
            }
            return this.conjunctiveTicketGroup;
        }

        /**
         * Gets the value of the originatorInfo property.
         * 
         * @return
         *     possible object is
         *     {@link OriginatorOfRequestDetailsTypeI }
         *     
         */
        public OriginatorOfRequestDetailsTypeI getOriginatorInfo() {
            return originatorInfo;
        }

        /**
         * Sets the value of the originatorInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link OriginatorOfRequestDetailsTypeI }
         *     
         */
        public void setOriginatorInfo(OriginatorOfRequestDetailsTypeI value) {
            this.originatorInfo = value;
        }

        /**
         * Gets the value of the eDocrecordLocator property.
         * 
         * @return
         *     possible object is
         *     {@link ReservationControlInformationType167717S }
         *     
         */
        public ReservationControlInformationType167717S getEDocrecordLocator() {
            return eDocrecordLocator;
        }

        /**
         * Sets the value of the eDocrecordLocator property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReservationControlInformationType167717S }
         *     
         */
        public void setEDocrecordLocator(ReservationControlInformationType167717S value) {
            this.eDocrecordLocator = value;
        }

        /**
         * Gets the value of the recipientNameSurname property.
         * 
         * @return
         *     possible object is
         *     {@link TravellerInformationType }
         *     
         */
        public TravellerInformationType getRecipientNameSurname() {
            return recipientNameSurname;
        }

        /**
         * Sets the value of the recipientNameSurname property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravellerInformationType }
         *     
         */
        public void setRecipientNameSurname(TravellerInformationType value) {
            this.recipientNameSurname = value;
        }

        /**
         * Gets the value of the frequentFlyerNumber property.
         * 
         * @return
         *     possible object is
         *     {@link FrequentTravellerVerificationType }
         *     
         */
        public FrequentTravellerVerificationType getFrequentFlyerNumber() {
            return frequentFlyerNumber;
        }

        /**
         * Sets the value of the frequentFlyerNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link FrequentTravellerVerificationType }
         *     
         */
        public void setFrequentFlyerNumber(FrequentTravellerVerificationType value) {
            this.frequentFlyerNumber = value;
        }

        /**
         * Gets the value of the dates property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dates property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDates().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StructuredDateTimeInformationType }
         * 
         * 
         */
        public List<StructuredDateTimeInformationType> getDates() {
            if (dates == null) {
                dates = new ArrayList<StructuredDateTimeInformationType>();
            }
            return this.dates;
        }

        /**
         * Gets the value of the additionalInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FreeTextInformationType }
         * 
         * 
         */
        public List<FreeTextInformationType> getAdditionalInformation() {
            if (additionalInformation == null) {
                additionalInformation = new ArrayList<FreeTextInformationType>();
            }
            return this.additionalInformation;
        }

        /**
         * Gets the value of the fareComponentDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareComponentDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareComponentDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InvoiceFopGroupType.ParentTicketGroup.FareComponentDetails }
         * 
         * 
         */
        public List<InvoiceFopGroupType.ParentTicketGroup.FareComponentDetails> getFareComponentDetails() {
            if (fareComponentDetails == null) {
                fareComponentDetails = new ArrayList<InvoiceFopGroupType.ParentTicketGroup.FareComponentDetails>();
            }
            return this.fareComponentDetails;
        }

        /**
         * Gets the value of the unusedTicketCoupons property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the unusedTicketCoupons property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUnusedTicketCoupons().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InvoiceFopGroupType.ParentTicketGroup.UnusedTicketCoupons }
         * 
         * 
         */
        public List<InvoiceFopGroupType.ParentTicketGroup.UnusedTicketCoupons> getUnusedTicketCoupons() {
            if (unusedTicketCoupons == null) {
                unusedTicketCoupons = new ArrayList<InvoiceFopGroupType.ParentTicketGroup.UnusedTicketCoupons>();
            }
            return this.unusedTicketCoupons;
        }

        /**
         * Gets the value of the fopParentTicketGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fopParentTicketGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFopParentTicketGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InvoiceFopGroupType.ParentTicketGroup.FopParentTicketGroup }
         * 
         * 
         */
        public List<InvoiceFopGroupType.ParentTicketGroup.FopParentTicketGroup> getFopParentTicketGroup() {
            if (fopParentTicketGroup == null) {
                fopParentTicketGroup = new ArrayList<InvoiceFopGroupType.ParentTicketGroup.FopParentTicketGroup>();
            }
            return this.fopParentTicketGroup;
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
         *         &lt;element name="conjunctiveFlag" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}StatusType_141910S"/>
         *         &lt;element name="conjunctiveDocumentNumber" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TicketNumberType"/>
         *         &lt;element name="couponStatus" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}CouponInformationTypeI" maxOccurs="4" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "conjunctiveFlag",
            "conjunctiveDocumentNumber",
            "couponStatus"
        })
        public static class ConjunctiveTicketGroup {

            @XmlElement(required = true)
            protected StatusType141910S conjunctiveFlag;
            @XmlElement(required = true)
            protected TicketNumberType conjunctiveDocumentNumber;
            protected List<CouponInformationTypeI> couponStatus;

            /**
             * Gets the value of the conjunctiveFlag property.
             * 
             * @return
             *     possible object is
             *     {@link StatusType141910S }
             *     
             */
            public StatusType141910S getConjunctiveFlag() {
                return conjunctiveFlag;
            }

            /**
             * Sets the value of the conjunctiveFlag property.
             * 
             * @param value
             *     allowed object is
             *     {@link StatusType141910S }
             *     
             */
            public void setConjunctiveFlag(StatusType141910S value) {
                this.conjunctiveFlag = value;
            }

            /**
             * Gets the value of the conjunctiveDocumentNumber property.
             * 
             * @return
             *     possible object is
             *     {@link TicketNumberType }
             *     
             */
            public TicketNumberType getConjunctiveDocumentNumber() {
                return conjunctiveDocumentNumber;
            }

            /**
             * Sets the value of the conjunctiveDocumentNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link TicketNumberType }
             *     
             */
            public void setConjunctiveDocumentNumber(TicketNumberType value) {
                this.conjunctiveDocumentNumber = value;
            }

            /**
             * Gets the value of the couponStatus property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the couponStatus property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCouponStatus().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CouponInformationTypeI }
             * 
             * 
             */
            public List<CouponInformationTypeI> getCouponStatus() {
                if (couponStatus == null) {
                    couponStatus = new ArrayList<CouponInformationTypeI>();
                }
                return this.couponStatus;
            }

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
         *         &lt;element name="fareComponentId" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}ReferenceInfoType"/>
         *         &lt;element name="couponStatus" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}CouponInformationType" maxOccurs="99"/>
         *         &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}MonetaryInformationType_192195S" maxOccurs="99" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "fareComponentId",
            "couponStatus",
            "monetaryInformation"
        })
        public static class FareComponentDetails {

            @XmlElement(required = true)
            protected ReferenceInfoType fareComponentId;
            @XmlElement(required = true)
            protected List<CouponInformationType> couponStatus;
            protected List<MonetaryInformationType192195S> monetaryInformation;

            /**
             * Gets the value of the fareComponentId property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInfoType }
             *     
             */
            public ReferenceInfoType getFareComponentId() {
                return fareComponentId;
            }

            /**
             * Sets the value of the fareComponentId property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInfoType }
             *     
             */
            public void setFareComponentId(ReferenceInfoType value) {
                this.fareComponentId = value;
            }

            /**
             * Gets the value of the couponStatus property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the couponStatus property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCouponStatus().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CouponInformationType }
             * 
             * 
             */
            public List<CouponInformationType> getCouponStatus() {
                if (couponStatus == null) {
                    couponStatus = new ArrayList<CouponInformationType>();
                }
                return this.couponStatus;
            }

            /**
             * Gets the value of the monetaryInformation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the monetaryInformation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMonetaryInformation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MonetaryInformationType192195S }
             * 
             * 
             */
            public List<MonetaryInformationType192195S> getMonetaryInformation() {
                if (monetaryInformation == null) {
                    monetaryInformation = new ArrayList<MonetaryInformationType192195S>();
                }
                return this.monetaryInformation;
            }

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
         *         &lt;element name="fopDetails" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}FormOfPaymentType"/>
         *         &lt;element name="fopInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TicketingFormOfPaymentType"/>
         *         &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}MonetaryInformationType" maxOccurs="10" minOccurs="0"/>
         *         &lt;element name="oldFopFreeflow" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}FreeTextInformationType" minOccurs="0"/>
         *         &lt;element name="pnrSupplementaryData" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}PNRSupplementaryDataType" maxOccurs="2" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "fopDetails",
            "fopInformation",
            "monetaryInformation",
            "oldFopFreeflow",
            "pnrSupplementaryData"
        })
        public static class FopParentTicketGroup {

            @XmlElement(required = true)
            protected FormOfPaymentType fopDetails;
            @XmlElement(required = true)
            protected TicketingFormOfPaymentType fopInformation;
            protected List<MonetaryInformationType> monetaryInformation;
            protected FreeTextInformationType oldFopFreeflow;
            protected List<PNRSupplementaryDataType> pnrSupplementaryData;

            /**
             * Gets the value of the fopDetails property.
             * 
             * @return
             *     possible object is
             *     {@link FormOfPaymentType }
             *     
             */
            public FormOfPaymentType getFopDetails() {
                return fopDetails;
            }

            /**
             * Sets the value of the fopDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link FormOfPaymentType }
             *     
             */
            public void setFopDetails(FormOfPaymentType value) {
                this.fopDetails = value;
            }

            /**
             * Gets the value of the fopInformation property.
             * 
             * @return
             *     possible object is
             *     {@link TicketingFormOfPaymentType }
             *     
             */
            public TicketingFormOfPaymentType getFopInformation() {
                return fopInformation;
            }

            /**
             * Sets the value of the fopInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link TicketingFormOfPaymentType }
             *     
             */
            public void setFopInformation(TicketingFormOfPaymentType value) {
                this.fopInformation = value;
            }

            /**
             * Gets the value of the monetaryInformation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the monetaryInformation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMonetaryInformation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MonetaryInformationType }
             * 
             * 
             */
            public List<MonetaryInformationType> getMonetaryInformation() {
                if (monetaryInformation == null) {
                    monetaryInformation = new ArrayList<MonetaryInformationType>();
                }
                return this.monetaryInformation;
            }

            /**
             * Gets the value of the oldFopFreeflow property.
             * 
             * @return
             *     possible object is
             *     {@link FreeTextInformationType }
             *     
             */
            public FreeTextInformationType getOldFopFreeflow() {
                return oldFopFreeflow;
            }

            /**
             * Sets the value of the oldFopFreeflow property.
             * 
             * @param value
             *     allowed object is
             *     {@link FreeTextInformationType }
             *     
             */
            public void setOldFopFreeflow(FreeTextInformationType value) {
                this.oldFopFreeflow = value;
            }

            /**
             * Gets the value of the pnrSupplementaryData property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pnrSupplementaryData property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPnrSupplementaryData().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PNRSupplementaryDataType }
             * 
             * 
             */
            public List<PNRSupplementaryDataType> getPnrSupplementaryData() {
                if (pnrSupplementaryData == null) {
                    pnrSupplementaryData = new ArrayList<PNRSupplementaryDataType>();
                }
                return this.pnrSupplementaryData;
            }

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
         *         &lt;element name="fareBasis" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}FareQualifierDetailsType"/>
         *         &lt;element name="flightInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TravelProductInformationType" minOccurs="0"/>
         *         &lt;element name="couponStatus" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}CouponInformationType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "fareBasis",
            "flightInformation",
            "couponStatus"
        })
        public static class UnusedTicketCoupons {

            @XmlElement(required = true)
            protected FareQualifierDetailsType fareBasis;
            protected TravelProductInformationType flightInformation;
            protected CouponInformationType couponStatus;

            /**
             * Gets the value of the fareBasis property.
             * 
             * @return
             *     possible object is
             *     {@link FareQualifierDetailsType }
             *     
             */
            public FareQualifierDetailsType getFareBasis() {
                return fareBasis;
            }

            /**
             * Sets the value of the fareBasis property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareQualifierDetailsType }
             *     
             */
            public void setFareBasis(FareQualifierDetailsType value) {
                this.fareBasis = value;
            }

            /**
             * Gets the value of the flightInformation property.
             * 
             * @return
             *     possible object is
             *     {@link TravelProductInformationType }
             *     
             */
            public TravelProductInformationType getFlightInformation() {
                return flightInformation;
            }

            /**
             * Sets the value of the flightInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravelProductInformationType }
             *     
             */
            public void setFlightInformation(TravelProductInformationType value) {
                this.flightInformation = value;
            }

            /**
             * Gets the value of the couponStatus property.
             * 
             * @return
             *     possible object is
             *     {@link CouponInformationType }
             *     
             */
            public CouponInformationType getCouponStatus() {
                return couponStatus;
            }

            /**
             * Sets the value of the couponStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link CouponInformationType }
             *     
             */
            public void setCouponStatus(CouponInformationType value) {
                this.couponStatus = value;
            }

        }

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
     *         &lt;element name="ruleType" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}InformationTypeDataTypeU"/>
     *         &lt;element name="dateDetails" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="date" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}StructuredPeriodInformationType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="passengerDetails" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="recipientNameSurname" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TravellerInformationType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="flightDetails" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="flightInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TravelProductInformationType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="otherDetails" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}StatusType_141910S" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ruleType",
        "dateDetails",
        "passengerDetails",
        "flightDetails",
        "otherDetails"
    })
    public static class RuleList {

        @XmlElement(required = true)
        protected InformationTypeDataTypeU ruleType;
        protected List<InvoiceFopGroupType.RuleList.DateDetails> dateDetails;
        protected List<InvoiceFopGroupType.RuleList.PassengerDetails> passengerDetails;
        protected List<InvoiceFopGroupType.RuleList.FlightDetails> flightDetails;
        protected StatusType141910S otherDetails;

        /**
         * Gets the value of the ruleType property.
         * 
         * @return
         *     possible object is
         *     {@link InformationTypeDataTypeU }
         *     
         */
        public InformationTypeDataTypeU getRuleType() {
            return ruleType;
        }

        /**
         * Sets the value of the ruleType property.
         * 
         * @param value
         *     allowed object is
         *     {@link InformationTypeDataTypeU }
         *     
         */
        public void setRuleType(InformationTypeDataTypeU value) {
            this.ruleType = value;
        }

        /**
         * Gets the value of the dateDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dateDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDateDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InvoiceFopGroupType.RuleList.DateDetails }
         * 
         * 
         */
        public List<InvoiceFopGroupType.RuleList.DateDetails> getDateDetails() {
            if (dateDetails == null) {
                dateDetails = new ArrayList<InvoiceFopGroupType.RuleList.DateDetails>();
            }
            return this.dateDetails;
        }

        /**
         * Gets the value of the passengerDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InvoiceFopGroupType.RuleList.PassengerDetails }
         * 
         * 
         */
        public List<InvoiceFopGroupType.RuleList.PassengerDetails> getPassengerDetails() {
            if (passengerDetails == null) {
                passengerDetails = new ArrayList<InvoiceFopGroupType.RuleList.PassengerDetails>();
            }
            return this.passengerDetails;
        }

        /**
         * Gets the value of the flightDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InvoiceFopGroupType.RuleList.FlightDetails }
         * 
         * 
         */
        public List<InvoiceFopGroupType.RuleList.FlightDetails> getFlightDetails() {
            if (flightDetails == null) {
                flightDetails = new ArrayList<InvoiceFopGroupType.RuleList.FlightDetails>();
            }
            return this.flightDetails;
        }

        /**
         * Gets the value of the otherDetails property.
         * 
         * @return
         *     possible object is
         *     {@link StatusType141910S }
         *     
         */
        public StatusType141910S getOtherDetails() {
            return otherDetails;
        }

        /**
         * Sets the value of the otherDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusType141910S }
         *     
         */
        public void setOtherDetails(StatusType141910S value) {
            this.otherDetails = value;
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
         *         &lt;element name="date" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}StructuredPeriodInformationType"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "date"
        })
        public static class DateDetails {

            @XmlElement(required = true)
            protected StructuredPeriodInformationType date;

            /**
             * Gets the value of the date property.
             * 
             * @return
             *     possible object is
             *     {@link StructuredPeriodInformationType }
             *     
             */
            public StructuredPeriodInformationType getDate() {
                return date;
            }

            /**
             * Sets the value of the date property.
             * 
             * @param value
             *     allowed object is
             *     {@link StructuredPeriodInformationType }
             *     
             */
            public void setDate(StructuredPeriodInformationType value) {
                this.date = value;
            }

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
         *         &lt;element name="flightInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TravelProductInformationType"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "flightInformation"
        })
        public static class FlightDetails {

            @XmlElement(required = true)
            protected TravelProductInformationType flightInformation;

            /**
             * Gets the value of the flightInformation property.
             * 
             * @return
             *     possible object is
             *     {@link TravelProductInformationType }
             *     
             */
            public TravelProductInformationType getFlightInformation() {
                return flightInformation;
            }

            /**
             * Sets the value of the flightInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravelProductInformationType }
             *     
             */
            public void setFlightInformation(TravelProductInformationType value) {
                this.flightInformation = value;
            }

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
         *         &lt;element name="recipientNameSurname" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TravellerInformationType"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "recipientNameSurname"
        })
        public static class PassengerDetails {

            @XmlElement(required = true)
            protected TravellerInformationType recipientNameSurname;

            /**
             * Gets the value of the recipientNameSurname property.
             * 
             * @return
             *     possible object is
             *     {@link TravellerInformationType }
             *     
             */
            public TravellerInformationType getRecipientNameSurname() {
                return recipientNameSurname;
            }

            /**
             * Sets the value of the recipientNameSurname property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravellerInformationType }
             *     
             */
            public void setRecipientNameSurname(TravellerInformationType value) {
                this.recipientNameSurname = value;
            }

        }

    }

}
