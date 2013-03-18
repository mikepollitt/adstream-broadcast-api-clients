
package com.adstream.webservice.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvalidAssets" type="{http://www.adstream.com/WebService/Orders}ArrayOfInvalidAsset" minOccurs="0"/>
 *         &lt;element name="OrderReference" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderResult", propOrder = {
    "invalidAssets",
    "orderReference"
})
public class OrderResult {

    @XmlElement(name = "InvalidAssets")
    protected ArrayOfInvalidAsset invalidAssets;
    @XmlElement(name = "OrderReference")
    protected int orderReference;

    /**
     * Gets the value of the invalidAssets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInvalidAsset }
     *     
     */
    public ArrayOfInvalidAsset getInvalidAssets() {
        return invalidAssets;
    }

    /**
     * Sets the value of the invalidAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInvalidAsset }
     *     
     */
    public void setInvalidAssets(ArrayOfInvalidAsset value) {
        this.invalidAssets = value;
    }

    /**
     * Gets the value of the orderReference property.
     * 
     */
    public int getOrderReference() {
        return orderReference;
    }

    /**
     * Sets the value of the orderReference property.
     * 
     */
    public void setOrderReference(int value) {
        this.orderReference = value;
    }

}
