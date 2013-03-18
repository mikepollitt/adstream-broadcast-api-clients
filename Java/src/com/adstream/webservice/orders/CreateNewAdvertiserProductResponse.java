
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
 *         &lt;element name="createNewAdvertiserProductResult" type="{http://www.adstream.com/WebService/Orders}AdvertiserProduct" minOccurs="0"/>
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
    "createNewAdvertiserProductResult"
})
@XmlRootElement(name = "createNewAdvertiserProductResponse")
public class CreateNewAdvertiserProductResponse {

    protected AdvertiserProduct createNewAdvertiserProductResult;

    /**
     * Gets the value of the createNewAdvertiserProductResult property.
     * 
     * @return
     *     possible object is
     *     {@link AdvertiserProduct }
     *     
     */
    public AdvertiserProduct getCreateNewAdvertiserProductResult() {
        return createNewAdvertiserProductResult;
    }

    /**
     * Sets the value of the createNewAdvertiserProductResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvertiserProduct }
     *     
     */
    public void setCreateNewAdvertiserProductResult(AdvertiserProduct value) {
        this.createNewAdvertiserProductResult = value;
    }

}
