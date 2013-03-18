
package com.adstream.webservice.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AdstreamOrderRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdstreamOrderRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderReference" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="From" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaseOrderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MasterArrival" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Assets" type="{http://www.adstream.com/WebService/Orders}ArrayOfAsset" minOccurs="0"/>
 *         &lt;element name="EmailRecipients" type="{http://www.adstream.com/WebService/Orders}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="SMSrecipients" type="{http://www.adstream.com/WebService/Orders}ArrayOfInteger" minOccurs="0"/>
 *         &lt;element name="AlertReminder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PercentComplete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateModified" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdstreamOrderRequest", propOrder = {
    "orderReference",
    "from",
    "source",
    "purchaseOrderNo",
    "masterArrival",
    "jobNo",
    "assets",
    "emailRecipients",
    "smSrecipients",
    "alertReminder",
    "percentComplete",
    "createdBy",
    "dateCreated",
    "dateModified"
})
public class AdstreamOrderRequest {

    @XmlElement(name = "OrderReference")
    protected int orderReference;
    @XmlElement(name = "From")
    protected String from;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "PurchaseOrderNo")
    protected String purchaseOrderNo;
    @XmlElement(name = "MasterArrival")
    protected String masterArrival;
    @XmlElement(name = "JobNo")
    protected String jobNo;
    @XmlElement(name = "Assets")
    protected ArrayOfAsset assets;
    @XmlElement(name = "EmailRecipients")
    protected ArrayOfString emailRecipients;
    @XmlElement(name = "SMSrecipients")
    protected ArrayOfInteger smSrecipients;
    @XmlElement(name = "AlertReminder")
    protected String alertReminder;
    @XmlElement(name = "PercentComplete")
    protected String percentComplete;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "DateCreated", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    @XmlElement(name = "DateModified", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateModified;

    /**
     * Gets the value of the orderReference property.
     * 
     */
    public int getOrderReference() {
        return orderReference;
    }

    /**
     * Sets the value of the orderReference property.
     * 
     */
    public void setOrderReference(int value) {
        this.orderReference = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the purchaseOrderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderNo() {
        return purchaseOrderNo;
    }

    /**
     * Sets the value of the purchaseOrderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderNo(String value) {
        this.purchaseOrderNo = value;
    }

    /**
     * Gets the value of the masterArrival property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterArrival() {
        return masterArrival;
    }

    /**
     * Sets the value of the masterArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterArrival(String value) {
        this.masterArrival = value;
    }

    /**
     * Gets the value of the jobNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobNo() {
        return jobNo;
    }

    /**
     * Sets the value of the jobNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobNo(String value) {
        this.jobNo = value;
    }

    /**
     * Gets the value of the assets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAsset }
     *     
     */
    public ArrayOfAsset getAssets() {
        return assets;
    }

    /**
     * Sets the value of the assets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAsset }
     *     
     */
    public void setAssets(ArrayOfAsset value) {
        this.assets = value;
    }

    /**
     * Gets the value of the emailRecipients property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getEmailRecipients() {
        return emailRecipients;
    }

    /**
     * Sets the value of the emailRecipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setEmailRecipients(ArrayOfString value) {
        this.emailRecipients = value;
    }

    /**
     * Gets the value of the smSrecipients property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInteger }
     *     
     */
    public ArrayOfInteger getSMSrecipients() {
        return smSrecipients;
    }

    /**
     * Sets the value of the smSrecipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInteger }
     *     
     */
    public void setSMSrecipients(ArrayOfInteger value) {
        this.smSrecipients = value;
    }

    /**
     * Gets the value of the alertReminder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertReminder() {
        return alertReminder;
    }

    /**
     * Sets the value of the alertReminder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertReminder(String value) {
        this.alertReminder = value;
    }

    /**
     * Gets the value of the percentComplete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentComplete() {
        return percentComplete;
    }

    /**
     * Sets the value of the percentComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentComplete(String value) {
        this.percentComplete = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the dateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreated(XMLGregorianCalendar value) {
        this.dateCreated = value;
    }

    /**
     * Gets the value of the dateModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateModified() {
        return dateModified;
    }

    /**
     * Sets the value of the dateModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateModified(XMLGregorianCalendar value) {
        this.dateModified = value;
    }

}
