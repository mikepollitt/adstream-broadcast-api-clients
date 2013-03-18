
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
 *         &lt;element name="getAdvertiserProductListResult" type="{http://www.adstream.com/WebService/Orders}ArrayOfAdvertiser" minOccurs="0"/>
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
    "getAdvertiserProductListResult"
})
@XmlRootElement(name = "getAdvertiserProductListResponse")
public class GetAdvertiserProductListResponse {

    protected ArrayOfAdvertiser getAdvertiserProductListResult;

    /**
     * Gets the value of the getAdvertiserProductListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdvertiser }
     *     
     */
    public ArrayOfAdvertiser getGetAdvertiserProductListResult() {
        return getAdvertiserProductListResult;
    }

    /**
     * Sets the value of the getAdvertiserProductListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdvertiser }
     *     
     */
    public void setGetAdvertiserProductListResult(ArrayOfAdvertiser value) {
        this.getAdvertiserProductListResult = value;
    }

}
