
package com.adstream.webservice.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Asset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Asset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Deleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IngestOrder" type="{http://www.adstream.com/WebService/Orders}IngestOrder"/>
 *         &lt;element name="DestinationIDs" type="{http://www.adstream.com/WebService/Orders}ArrayOfDestinationID" minOccurs="0"/>
 *         &lt;element name="CartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdbankLevelID" type="{http://www.adstream.com/WebService/Orders}AdbankLevelID" minOccurs="0"/>
 *         &lt;element name="AssetMetadata" type="{http://www.adstream.com/WebService/Orders}AssetMetadata" minOccurs="0"/>
 *         &lt;element name="AssetGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="A5Struct" type="{http://www.adstream.com/WebService/Orders}A5Struct" minOccurs="0"/>
 *         &lt;element name="AssetTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubAssetTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *       &lt;attribute name="UniqueKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Asset", propOrder = {
    "deleted",
    "ingestOrder",
    "destinationIDs",
    "cartNumber",
    "adbankLevelID",
    "assetMetadata",
    "assetGuid",
    "statusID",
    "status",
    "agencyGuid",
    "a5Struct",
    "assetTypeID",
    "subAssetTypeID"
})
public class Asset {

    @XmlElement(name = "Deleted")
    protected boolean deleted;
    @XmlElement(name = "IngestOrder", required = true, nillable = true)
    protected IngestOrder ingestOrder;
    @XmlElement(name = "DestinationIDs")
    protected ArrayOfDestinationID destinationIDs;
    @XmlElement(name = "CartNumber")
    protected String cartNumber;
    @XmlElement(name = "AdbankLevelID")
    protected AdbankLevelID adbankLevelID;
    @XmlElement(name = "AssetMetadata")
    protected AssetMetadata assetMetadata;
    @XmlElement(name = "AssetGuid")
    protected String assetGuid;
    @XmlElement(name = "StatusID")
    protected int statusID;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "AgencyGuid")
    protected String agencyGuid;
    @XmlElement(name = "A5Struct")
    protected A5Struct a5Struct;
    @XmlElement(name = "AssetTypeID")
    protected int assetTypeID;
    @XmlElement(name = "SubAssetTypeID")
    protected int subAssetTypeID;
    @XmlAttribute(name = "UniqueKey")
    protected String uniqueKey;

    /**
     * Gets the value of the deleted property.
     * 
     */
    public boolean isDeleted() {
        return deleted;
    }

    /**
     * Sets the value of the deleted property.
     * 
     */
    public void setDeleted(boolean value) {
        this.deleted = value;
    }

    /**
     * Gets the value of the ingestOrder property.
     * 
     * @return
     *     possible object is
     *     {@link IngestOrder }
     *     
     */
    public IngestOrder getIngestOrder() {
        return ingestOrder;
    }

    /**
     * Sets the value of the ingestOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link IngestOrder }
     *     
     */
    public void setIngestOrder(IngestOrder value) {
        this.ingestOrder = value;
    }

    /**
     * Gets the value of the destinationIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDestinationID }
     *     
     */
    public ArrayOfDestinationID getDestinationIDs() {
        return destinationIDs;
    }

    /**
     * Sets the value of the destinationIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDestinationID }
     *     
     */
    public void setDestinationIDs(ArrayOfDestinationID value) {
        this.destinationIDs = value;
    }

    /**
     * Gets the value of the cartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCartNumber() {
        return cartNumber;
    }

    /**
     * Sets the value of the cartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCartNumber(String value) {
        this.cartNumber = value;
    }

    /**
     * Gets the value of the adbankLevelID property.
     * 
     * @return
     *     possible object is
     *     {@link AdbankLevelID }
     *     
     */
    public AdbankLevelID getAdbankLevelID() {
        return adbankLevelID;
    }

    /**
     * Sets the value of the adbankLevelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdbankLevelID }
     *     
     */
    public void setAdbankLevelID(AdbankLevelID value) {
        this.adbankLevelID = value;
    }

    /**
     * Gets the value of the assetMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link AssetMetadata }
     *     
     */
    public AssetMetadata getAssetMetadata() {
        return assetMetadata;
    }

    /**
     * Sets the value of the assetMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetMetadata }
     *     
     */
    public void setAssetMetadata(AssetMetadata value) {
        this.assetMetadata = value;
    }

    /**
     * Gets the value of the assetGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetGuid() {
        return assetGuid;
    }

    /**
     * Sets the value of the assetGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetGuid(String value) {
        this.assetGuid = value;
    }

    /**
     * Gets the value of the statusID property.
     * 
     */
    public int getStatusID() {
        return statusID;
    }

    /**
     * Sets the value of the statusID property.
     * 
     */
    public void setStatusID(int value) {
        this.statusID = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the agencyGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyGuid() {
        return agencyGuid;
    }

    /**
     * Sets the value of the agencyGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyGuid(String value) {
        this.agencyGuid = value;
    }

    /**
     * Gets the value of the a5Struct property.
     * 
     * @return
     *     possible object is
     *     {@link A5Struct }
     *     
     */
    public A5Struct getA5Struct() {
        return a5Struct;
    }

    /**
     * Sets the value of the a5Struct property.
     * 
     * @param value
     *     allowed object is
     *     {@link A5Struct }
     *     
     */
    public void setA5Struct(A5Struct value) {
        this.a5Struct = value;
    }

    /**
     * Gets the value of the assetTypeID property.
     * 
     */
    public int getAssetTypeID() {
        return assetTypeID;
    }

    /**
     * Sets the value of the assetTypeID property.
     * 
     */
    public void setAssetTypeID(int value) {
        this.assetTypeID = value;
    }

    /**
     * Gets the value of the subAssetTypeID property.
     * 
     */
    public int getSubAssetTypeID() {
        return subAssetTypeID;
    }

    /**
     * Sets the value of the subAssetTypeID property.
     * 
     */
    public void setSubAssetTypeID(int value) {
        this.subAssetTypeID = value;
    }

    /**
     * Gets the value of the uniqueKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueKey() {
        return uniqueKey;
    }

    /**
     * Sets the value of the uniqueKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueKey(String value) {
        this.uniqueKey = value;
    }

}
