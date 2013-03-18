
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
 *         &lt;element name="getOrderDetailsResult" type="{http://www.adstream.com/WebService/Orders}OrderDetails" minOccurs="0"/>
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
    "getOrderDetailsResult"
})
@XmlRootElement(name = "getOrderDetailsResponse")
public class GetOrderDetailsResponse {

    protected OrderDetails getOrderDetailsResult;

    /**
     * Gets the value of the getOrderDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDetails }
     *     
     */
    public OrderDetails getGetOrderDetailsResult() {
        return getOrderDetailsResult;
    }

    /**
     * Sets the value of the getOrderDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDetails }
     *     
     */
    public void setGetOrderDetailsResult(OrderDetails value) {
        this.getOrderDetailsResult = value;
    }

}
