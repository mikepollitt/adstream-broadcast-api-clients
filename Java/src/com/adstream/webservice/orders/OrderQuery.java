
package com.adstream.webservice.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Order" type="{http://www.adstream.com/WebService/Orders}OrderQueryOrder" minOccurs="0"/>
 *         &lt;element name="Asset" type="{http://www.adstream.com/WebService/Orders}OrderQueryAsset" minOccurs="0"/>
 *         &lt;element name="Sort" type="{http://www.adstream.com/WebService/Orders}OrderQuerySort" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderQuery", propOrder = {
    "order",
    "asset",
    "sort"
})
public class OrderQuery {

    @XmlElement(name = "Order")
    protected OrderQueryOrder order;
    @XmlElement(name = "Asset")
    protected OrderQueryAsset asset;
    @XmlElement(name = "Sort")
    protected OrderQuerySort sort;

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQueryOrder }
     *     
     */
    public OrderQueryOrder getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQueryOrder }
     *     
     */
    public void setOrder(OrderQueryOrder value) {
        this.order = value;
    }

    /**
     * Gets the value of the asset property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQueryAsset }
     *     
     */
    public OrderQueryAsset getAsset() {
        return asset;
    }

    /**
     * Sets the value of the asset property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQueryAsset }
     *     
     */
    public void setAsset(OrderQueryAsset value) {
        this.asset = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQuerySort }
     *     
     */
    public OrderQuerySort getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQuerySort }
     *     
     */
    public void setSort(OrderQuerySort value) {
        this.sort = value;
    }

}
