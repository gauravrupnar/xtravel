
package com.amadeus.xml.tfopcq_15_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * is the generic group to convey payment related data
 * 
 * <p>Java class for PaymentGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupUsage" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}CodedAttributeType_190204S"/>
 *         &lt;element name="paymentData" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}PaymentDataGroupType" minOccurs="0"/>
 *         &lt;element name="paymentStatus" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}PaymentStatusGroupType" minOccurs="0"/>
 *         &lt;element name="paymentSupplementaryData" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}CodedAttributeType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="mopInformation" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}MeanOfPaymentDataType" minOccurs="0"/>
 *         &lt;element name="dummy" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}DummySegmentTypeI"/>
 *         &lt;element name="mopDetailedData" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}DetailedPaymentDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentGroupType", propOrder = {
    "groupUsage",
    "paymentData",
    "paymentStatus",
    "paymentSupplementaryData",
    "mopInformation",
    "dummy",
    "mopDetailedData"
})
public class PaymentGroupType {

    @XmlElement(required = true)
    protected CodedAttributeType190204S groupUsage;
    protected PaymentDataGroupType paymentData;
    protected PaymentStatusGroupType paymentStatus;
    protected List<CodedAttributeType> paymentSupplementaryData;
    protected MeanOfPaymentDataType mopInformation;
    @XmlElement(required = true)
    protected DummySegmentTypeI dummy;
    protected DetailedPaymentDataType mopDetailedData;

    /**
     * Gets the value of the groupUsage property.
     * 
     * @return
     *     possible object is
     *     {@link CodedAttributeType190204S }
     *     
     */
    public CodedAttributeType190204S getGroupUsage() {
        return groupUsage;
    }

    /**
     * Sets the value of the groupUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedAttributeType190204S }
     *     
     */
    public void setGroupUsage(CodedAttributeType190204S value) {
        this.groupUsage = value;
    }

    /**
     * Gets the value of the paymentData property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDataGroupType }
     *     
     */
    public PaymentDataGroupType getPaymentData() {
        return paymentData;
    }

    /**
     * Sets the value of the paymentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDataGroupType }
     *     
     */
    public void setPaymentData(PaymentDataGroupType value) {
        this.paymentData = value;
    }

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusGroupType }
     *     
     */
    public PaymentStatusGroupType getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusGroupType }
     *     
     */
    public void setPaymentStatus(PaymentStatusGroupType value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the paymentSupplementaryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentSupplementaryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentSupplementaryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodedAttributeType }
     * 
     * 
     */
    public List<CodedAttributeType> getPaymentSupplementaryData() {
        if (paymentSupplementaryData == null) {
            paymentSupplementaryData = new ArrayList<CodedAttributeType>();
        }
        return this.paymentSupplementaryData;
    }

    /**
     * Gets the value of the mopInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MeanOfPaymentDataType }
     *     
     */
    public MeanOfPaymentDataType getMopInformation() {
        return mopInformation;
    }

    /**
     * Sets the value of the mopInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeanOfPaymentDataType }
     *     
     */
    public void setMopInformation(MeanOfPaymentDataType value) {
        this.mopInformation = value;
    }

    /**
     * Gets the value of the dummy property.
     * 
     * @return
     *     possible object is
     *     {@link DummySegmentTypeI }
     *     
     */
    public DummySegmentTypeI getDummy() {
        return dummy;
    }

    /**
     * Sets the value of the dummy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DummySegmentTypeI }
     *     
     */
    public void setDummy(DummySegmentTypeI value) {
        this.dummy = value;
    }

    /**
     * Gets the value of the mopDetailedData property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedPaymentDataType }
     *     
     */
    public DetailedPaymentDataType getMopDetailedData() {
        return mopDetailedData;
    }

    /**
     * Sets the value of the mopDetailedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedPaymentDataType }
     *     
     */
    public void setMopDetailedData(DetailedPaymentDataType value) {
        this.mopDetailedData = value;
    }

}
