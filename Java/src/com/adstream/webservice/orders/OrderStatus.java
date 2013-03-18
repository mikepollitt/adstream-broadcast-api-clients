
package com.adstream.webservice.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssetStatusList" type="{http://www.adstream.com/WebService/Orders}ArrayOfAssetStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CurrentStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatus", propOrder = {
    "assetStatusList"
})
public class OrderStatus {

    @XmlElement(name = "AssetStatusList")
    protected ArrayOfAssetStatus assetStatusList;
    @XmlAttribute(name = "CurrentStatus")
    protected String currentStatus;

    /**
     * Gets the value of the assetStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssetStatus }
     *     
     */
    public ArrayOfAssetStatus getAssetStatusList() {
        return assetStatusList;
    }

    /**
     * Sets the value of the assetStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssetStatus }
     *     
     */
    public void setAssetStatusList(ArrayOfAssetStatus value) {
        this.assetStatusList = value;
    }

    /**
     * Gets the value of the currentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentStatus() {
        return currentStatus;
    }

    /**
     * Sets the value of the currentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentStatus(String value) {
        this.currentStatus = value;
    }

}
