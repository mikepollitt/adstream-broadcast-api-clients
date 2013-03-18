
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
 *         &lt;element name="placeOrderAdbank5Result" type="{http://www.adstream.com/WebService/Orders}ArrayOfInt" minOccurs="0"/>
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
    "placeOrderAdbank5Result"
})
@XmlRootElement(name = "placeOrderAdbank5Response")
public class PlaceOrderAdbank5Response {

    protected ArrayOfInt placeOrderAdbank5Result;

    /**
     * Gets the value of the placeOrderAdbank5Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getPlaceOrderAdbank5Result() {
        return placeOrderAdbank5Result;
    }

    /**
     * Sets the value of the placeOrderAdbank5Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setPlaceOrderAdbank5Result(ArrayOfInt value) {
        this.placeOrderAdbank5Result = value;
    }

}
