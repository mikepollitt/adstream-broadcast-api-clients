
package com.adstream.webservice.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvertiserProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvertiserProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NewAdvertiser" type="{http://www.adstream.com/WebService/Orders}NewAdvertiser" minOccurs="0"/>
 *         &lt;element name="NewProduct" type="{http://www.adstream.com/WebService/Orders}NewProduct" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvertiserProduct", propOrder = {
    "newAdvertiser",
    "newProduct"
})
public class AdvertiserProduct {

    @XmlElement(name = "NewAdvertiser")
    protected NewAdvertiser newAdvertiser;
    @XmlElement(name = "NewProduct")
    protected NewProduct newProduct;

    /**
     * Gets the value of the newAdvertiser property.
     * 
     * @return
     *     possible object is
     *     {@link NewAdvertiser }
     *     
     */
    public NewAdvertiser getNewAdvertiser() {
        return newAdvertiser;
    }

    /**
     * Sets the value of the newAdvertiser property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewAdvertiser }
     *     
     */
    public void setNewAdvertiser(NewAdvertiser value) {
        this.newAdvertiser = value;
    }

    /**
     * Gets the value of the newProduct property.
     * 
     * @return
     *     possible object is
     *     {@link NewProduct }
     *     
     */
    public NewProduct getNewProduct() {
        return newProduct;
    }

    /**
     * Sets the value of the newProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewProduct }
     *     
     */
    public void setNewProduct(NewProduct value) {
        this.newProduct = value;
    }

}
