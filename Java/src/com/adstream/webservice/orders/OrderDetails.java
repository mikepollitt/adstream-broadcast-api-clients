
package com.adstream.webservice.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderReference" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Deliveries" type="{http://www.adstream.com/WebService/Orders}ArrayOfDeliveryDetails" minOccurs="0"/>
 *         &lt;element name="Destinations" type="{http://www.adstream.com/WebService/Orders}ArrayOfDestinationDetails" minOccurs="0"/>
 *         &lt;element name="Assets" type="{http://www.adstream.com/WebService/Orders}ArrayOfAssetDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDetails", propOrder = {
    "orderReference",
    "dateCreated",
    "deliveries",
    "destinations",
    "assets"
})
public class OrderDetails {

    @XmlElement(name = "OrderReference")
    protected int orderReference;
    @XmlElement(name = "DateCreated", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    @XmlElement(name = "Deliveries")
    protected ArrayOfDeliveryDetails deliveries;
    @XmlElement(name = "Destinations")
    protected ArrayOfDestinationDetails destinations;
    @XmlElement(name = "Assets")
    protected ArrayOfAssetDetails assets;

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
     * Gets the value of the deliveries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeliveryDetails }
     *     
     */
    public ArrayOfDeliveryDetails getDeliveries() {
        return deliveries;
    }

    /**
     * Sets the value of the deliveries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeliveryDetails }
     *     
     */
    public void setDeliveries(ArrayOfDeliveryDetails value) {
        this.deliveries = value;
    }

    /**
     * Gets the value of the destinations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDestinationDetails }
     *     
     */
    public ArrayOfDestinationDetails getDestinations() {
        return destinations;
    }

    /**
     * Sets the value of the destinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDestinationDetails }
     *     
     */
    public void setDestinations(ArrayOfDestinationDetails value) {
        this.destinations = value;
    }

    /**
     * Gets the value of the assets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssetDetails }
     *     
     */
    public ArrayOfAssetDetails getAssets() {
        return assets;
    }

    /**
     * Sets the value of the assets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssetDetails }
     *     
     */
    public void setAssets(ArrayOfAssetDetails value) {
        this.assets = value;
    }

}
