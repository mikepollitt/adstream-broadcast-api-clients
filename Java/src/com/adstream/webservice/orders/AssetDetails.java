
package com.adstream.webservice.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssetID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Advertiser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Campaign" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AssetStatus" type="{http://www.adstream.com/WebService/Orders}MasterAssetStatus"/>
 *       &lt;/sequence>
 *       &lt;attribute name="UniqueName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetDetails", propOrder = {
    "assetID",
    "advertiser",
    "product",
    "campaign",
    "title",
    "comment",
    "assetStatus"
})
public class AssetDetails {

    @XmlElement(name = "AssetID", required = true)
    protected String assetID;
    @XmlElement(name = "Advertiser")
    protected String advertiser;
    @XmlElement(name = "Product")
    protected String product;
    @XmlElement(name = "Campaign", required = true, nillable = true)
    protected String campaign;
    @XmlElement(name = "Title", required = true, nillable = true)
    protected String title;
    @XmlElement(name = "Comment", required = true, nillable = true)
    protected String comment;
    @XmlElement(name = "AssetStatus", required = true)
    protected MasterAssetStatus assetStatus;
    @XmlAttribute(name = "UniqueName")
    protected String uniqueName;

    /**
     * Gets the value of the assetID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetID() {
        return assetID;
    }

    /**
     * Sets the value of the assetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetID(String value) {
        this.assetID = value;
    }

    /**
     * Gets the value of the advertiser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvertiser() {
        return advertiser;
    }

    /**
     * Sets the value of the advertiser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvertiser(String value) {
        this.advertiser = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the campaign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaign() {
        return campaign;
    }

    /**
     * Sets the value of the campaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaign(String value) {
        this.campaign = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the assetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAssetStatus }
     *     
     */
    public MasterAssetStatus getAssetStatus() {
        return assetStatus;
    }

    /**
     * Sets the value of the assetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAssetStatus }
     *     
     */
    public void setAssetStatus(MasterAssetStatus value) {
        this.assetStatus = value;
    }

    /**
     * Gets the value of the uniqueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueName() {
        return uniqueName;
    }

    /**
     * Sets the value of the uniqueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueName(String value) {
        this.uniqueName = value;
    }

}
