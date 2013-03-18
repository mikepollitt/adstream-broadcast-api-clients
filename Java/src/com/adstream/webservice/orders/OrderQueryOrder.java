
package com.adstream.webservice.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderQueryOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderQueryOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgencyGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderReference" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BeginCreationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndCreationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PoNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Advertizer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncompleteOrdersOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderQueryOrder", propOrder = {
    "agencyGuid",
    "userGuid",
    "jobNumber",
    "orderTypeId",
    "orderReference",
    "beginCreationDate",
    "endCreationDate",
    "poNumber",
    "advertizer",
    "incompleteOrdersOnly"
})
public class OrderQueryOrder {

    @XmlElement(name = "AgencyGuid")
    protected String agencyGuid;
    @XmlElement(name = "UserGuid")
    protected String userGuid;
    @XmlElement(name = "JobNumber")
    protected String jobNumber;
    @XmlElement(name = "OrderTypeId", required = true, type = Integer.class, nillable = true)
    protected Integer orderTypeId;
    @XmlElement(name = "OrderReference", required = true, type = Integer.class, nillable = true)
    protected Integer orderReference;
    @XmlElement(name = "BeginCreationDate")
    protected String beginCreationDate;
    @XmlElement(name = "EndCreationDate")
    protected String endCreationDate;
    @XmlElement(name = "PoNumber")
    protected String poNumber;
    @XmlElement(name = "Advertizer")
    protected String advertizer;
    @XmlElement(name = "IncompleteOrdersOnly")
    protected boolean incompleteOrdersOnly;

    /**
     * Gets the value of the agencyGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyGuid() {
        return agencyGuid;
    }

    /**
     * Sets the value of the agencyGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyGuid(String value) {
        this.agencyGuid = value;
    }

    /**
     * Gets the value of the userGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserGuid() {
        return userGuid;
    }

    /**
     * Sets the value of the userGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserGuid(String value) {
        this.userGuid = value;
    }

    /**
     * Gets the value of the jobNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobNumber() {
        return jobNumber;
    }

    /**
     * Sets the value of the jobNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobNumber(String value) {
        this.jobNumber = value;
    }

    /**
     * Gets the value of the orderTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderTypeId() {
        return orderTypeId;
    }

    /**
     * Sets the value of the orderTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderTypeId(Integer value) {
        this.orderTypeId = value;
    }

    /**
     * Gets the value of the orderReference property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderReference() {
        return orderReference;
    }

    /**
     * Sets the value of the orderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderReference(Integer value) {
        this.orderReference = value;
    }

    /**
     * Gets the value of the beginCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginCreationDate() {
        return beginCreationDate;
    }

    /**
     * Sets the value of the beginCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginCreationDate(String value) {
        this.beginCreationDate = value;
    }

    /**
     * Gets the value of the endCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndCreationDate() {
        return endCreationDate;
    }

    /**
     * Sets the value of the endCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndCreationDate(String value) {
        this.endCreationDate = value;
    }

    /**
     * Gets the value of the poNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoNumber() {
        return poNumber;
    }

    /**
     * Sets the value of the poNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoNumber(String value) {
        this.poNumber = value;
    }

    /**
     * Gets the value of the advertizer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvertizer() {
        return advertizer;
    }

    /**
     * Sets the value of the advertizer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvertizer(String value) {
        this.advertizer = value;
    }

    /**
     * Gets the value of the incompleteOrdersOnly property.
     * 
     */
    public boolean isIncompleteOrdersOnly() {
        return incompleteOrdersOnly;
    }

    /**
     * Sets the value of the incompleteOrdersOnly property.
     * 
     */
    public void setIncompleteOrdersOnly(boolean value) {
        this.incompleteOrdersOnly = value;
    }

}
