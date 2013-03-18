
package com.adstream.webservice.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="getAssetDeliveriesResult" type="{http://www.adstream.com/WebService/Orders}ArrayOfAssetDeliveryDetails" minOccurs="0"/>
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
    "getAssetDeliveriesResult"
})
@XmlRootElement(name = "getAssetDeliveriesResponse")
public class GetAssetDeliveriesResponse {

    protected ArrayOfAssetDeliveryDetails getAssetDeliveriesResult;

    /**
     * Gets the value of the getAssetDeliveriesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssetDeliveryDetails }
     *     
     */
    public ArrayOfAssetDeliveryDetails getGetAssetDeliveriesResult() {
        return getAssetDeliveriesResult;
    }

    /**
     * Sets the value of the getAssetDeliveriesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssetDeliveryDetails }
     *     
     */
    public void setGetAssetDeliveriesResult(ArrayOfAssetDeliveryDetails value) {
        this.getAssetDeliveriesResult = value;
    }

}
