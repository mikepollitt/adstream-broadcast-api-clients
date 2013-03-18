
package com.adstream.webservice.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import adstream.ams.VideoReleaseStatus;


/**
 * <p>Java class for DeliveryDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeliveryID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="DestinationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="DeliveryStatus" type="{urn:Adstream:AMS}VideoReleaseStatus"/>
 *         &lt;element name="HouseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryDetails", propOrder = {
    "deliveryID",
    "destinationID",
    "serviceLevel",
    "assetID",
    "deliveryStatus",
    "houseNumber",
    "comments"
})
public class DeliveryDetails {

    @XmlElement(name = "DeliveryID", required = true)
    protected String deliveryID;
    @XmlElement(name = "DestinationID")
    protected int destinationID;
    @XmlElement(name = "ServiceLevel")
    protected String serviceLevel;
    @XmlElement(name = "AssetID", required = true)
    protected String assetID;
    @XmlElement(name = "DeliveryStatus", required = true)
    protected VideoReleaseStatus deliveryStatus;
    @XmlElement(name = "HouseNumber")
    protected String houseNumber;
    @XmlElement(name = "Comments")
    protected String comments;

    /**
     * Gets the value of the deliveryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryID() {
        return deliveryID;
    }

    /**
     * Sets the value of the deliveryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryID(String value) {
        this.deliveryID = value;
    }

    /**
     * Gets the value of the destinationID property.
     * 
     */
    public int getDestinationID() {
        return destinationID;
    }

    /**
     * Sets the value of the destinationID property.
     * 
     */
    public void setDestinationID(int value) {
        this.destinationID = value;
    }

    /**
     * Gets the value of the serviceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Sets the value of the serviceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLevel(String value) {
        this.serviceLevel = value;
    }

    /**
     * Gets the value of the assetID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetID() {
        return assetID;
    }

    /**
     * Sets the value of the assetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetID(String value) {
        this.assetID = value;
    }

    /**
     * Gets the value of the deliveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VideoReleaseStatus }
     *     
     */
    public VideoReleaseStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * Sets the value of the deliveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoReleaseStatus }
     *     
     */
    public void setDeliveryStatus(VideoReleaseStatus value) {
        this.deliveryStatus = value;
    }

    /**
     * Gets the value of the houseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the value of the houseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumber(String value) {
        this.houseNumber = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
