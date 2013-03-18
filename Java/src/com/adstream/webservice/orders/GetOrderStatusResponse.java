
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
 *         &lt;element name="getOrderStatusResult" type="{http://www.adstream.com/WebService/Orders}AdstreamOrderResponse" minOccurs="0"/>
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
    "getOrderStatusResult"
})
@XmlRootElement(name = "getOrderStatusResponse")
public class GetOrderStatusResponse {

    protected AdstreamOrderResponse getOrderStatusResult;

    /**
     * Gets the value of the getOrderStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link AdstreamOrderResponse }
     *     
     */
    public AdstreamOrderResponse getGetOrderStatusResult() {
        return getOrderStatusResult;
    }

    /**
     * Sets the value of the getOrderStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdstreamOrderResponse }
     *     
     */
    public void setGetOrderStatusResult(AdstreamOrderResponse value) {
        this.getOrderStatusResult = value;
    }

}
