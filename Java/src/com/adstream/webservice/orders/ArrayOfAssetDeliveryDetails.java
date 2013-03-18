
package com.adstream.webservice.orders;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAssetDeliveryDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAssetDeliveryDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssetDeliveryDetails" type="{http://www.adstream.com/WebService/Orders}AssetDeliveryDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAssetDeliveryDetails", propOrder = {
    "assetDeliveryDetails"
})
public class ArrayOfAssetDeliveryDetails {

    @XmlElement(name = "AssetDeliveryDetails", nillable = true)
    protected List<AssetDeliveryDetails> assetDeliveryDetails;

    /**
     * Gets the value of the assetDeliveryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetDeliveryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetDeliveryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetDeliveryDetails }
     * 
     * 
     */
    public List<AssetDeliveryDetails> getAssetDeliveryDetails() {
        if (assetDeliveryDetails == null) {
            assetDeliveryDetails = new ArrayList<AssetDeliveryDetails>();
        }
        return this.assetDeliveryDetails;
    }

}
