
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
 *         &lt;element name="findOrdersResult" type="{http://www.adstream.com/WebService/Orders}ProductOrderResponse" minOccurs="0"/>
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
    "findOrdersResult"
})
@XmlRootElement(name = "findOrdersResponse")
public class FindOrdersResponse {

    protected ProductOrderResponse findOrdersResult;

    /**
     * Gets the value of the findOrdersResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProductOrderResponse }
     *     
     */
    public ProductOrderResponse getFindOrdersResult() {
        return findOrdersResult;
    }

    /**
     * Sets the value of the findOrdersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOrderResponse }
     *     
     */
    public void setFindOrdersResult(ProductOrderResponse value) {
        this.findOrdersResult = value;
    }

}
