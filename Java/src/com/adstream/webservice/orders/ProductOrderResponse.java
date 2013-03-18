
package com.adstream.webservice.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductOrderResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductOrderResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProductOrders" type="{http://www.adstream.com/WebService/Orders}ArrayOfAdstreamOrderRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductOrderResponse", propOrder = {
    "count",
    "productOrders"
})
public class ProductOrderResponse {

    @XmlElement(name = "Count")
    protected int count;
    @XmlElement(name = "ProductOrders")
    protected ArrayOfAdstreamOrderRequest productOrders;

    /**
     * Gets the value of the count property.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Gets the value of the productOrders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdstreamOrderRequest }
     *     
     */
    public ArrayOfAdstreamOrderRequest getProductOrders() {
        return productOrders;
    }

    /**
     * Sets the value of the productOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdstreamOrderRequest }
     *     
     */
    public void setProductOrders(ArrayOfAdstreamOrderRequest value) {
        this.productOrders = value;
    }

}
