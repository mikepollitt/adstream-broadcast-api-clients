
package com.adstream.webservice.orders;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AssetMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FullDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FirstActiveFrame" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="CADNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreativeDirector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArtDirector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Producer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Director" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductionCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostProduction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostHouseContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FirstAirDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AudioFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AudioChannels" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AspectRatio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Resolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdvertiserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdvertiserProductID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CampaignGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MusicRightsFieldsList" type="{http://www.adstream.com/WebService/Orders}ArrayOfMusicRightsFields" minOccurs="0"/>
 *         &lt;element name="Advertiser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdvertiserProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CampaignName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Classification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Adbanked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ClosedCaptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClosedCaptionStatusID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Definition" type="{http://www.adstream.com/WebService/Orders}SpecDefinition"/>
 *         &lt;element name="SpecDBDocID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isAlreadyClosedCaption" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isCaptioningRequired" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isCurrentVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetMetadata", propOrder = {
    "title",
    "fileName",
    "adDuration",
    "fullDuration",
    "firstActiveFrame",
    "cadNo",
    "creativeDirector",
    "artDirector",
    "producer",
    "director",
    "productionCompany",
    "postProduction",
    "postHouseContact",
    "contactPhone",
    "productionDate",
    "firstAirDate",
    "audioFormat",
    "audioChannels",
    "aspectRatio",
    "resolution",
    "comments",
    "groupID",
    "advertiserID",
    "advertiserProductID",
    "campaignGuid",
    "musicRightsFieldsList",
    "advertiser",
    "advertiserProduct",
    "campaignName",
    "classification",
    "adbanked",
    "closedCaptionText",
    "closedCaptionStatusID",
    "definition",
    "specDBDocID"
})
public class AssetMetadata {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "FileName")
    protected String fileName;
    @XmlElement(name = "AdDuration", required = true, type = Integer.class, nillable = true)
    protected Integer adDuration;
    @XmlElement(name = "FullDuration", required = true, type = Integer.class, nillable = true)
    protected Integer fullDuration;
    @XmlElement(name = "FirstActiveFrame")
    protected BigInteger firstActiveFrame;
    @XmlElement(name = "CADNo")
    protected String cadNo;
    @XmlElement(name = "CreativeDirector")
    protected String creativeDirector;
    @XmlElement(name = "ArtDirector")
    protected String artDirector;
    @XmlElement(name = "Producer")
    protected String producer;
    @XmlElement(name = "Director")
    protected String director;
    @XmlElement(name = "ProductionCompany")
    protected String productionCompany;
    @XmlElement(name = "PostProduction")
    protected String postProduction;
    @XmlElement(name = "PostHouseContact")
    protected String postHouseContact;
    @XmlElement(name = "ContactPhone")
    protected String contactPhone;
    @XmlElement(name = "ProductionDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar productionDate;
    @XmlElement(name = "FirstAirDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstAirDate;
    @XmlElement(name = "AudioFormat")
    protected String audioFormat;
    @XmlElement(name = "AudioChannels", required = true, type = Integer.class, nillable = true)
    protected Integer audioChannels;
    @XmlElement(name = "AspectRatio")
    protected String aspectRatio;
    @XmlElement(name = "Resolution")
    protected String resolution;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "GroupID")
    protected String groupID;
    @XmlElement(name = "AdvertiserID")
    protected String advertiserID;
    @XmlElement(name = "AdvertiserProductID")
    protected String advertiserProductID;
    @XmlElement(name = "CampaignGuid")
    protected String campaignGuid;
    @XmlElement(name = "MusicRightsFieldsList")
    protected ArrayOfMusicRightsFields musicRightsFieldsList;
    @XmlElement(name = "Advertiser")
    protected String advertiser;
    @XmlElement(name = "AdvertiserProduct")
    protected String advertiserProduct;
    @XmlElement(name = "CampaignName")
    protected String campaignName;
    @XmlElement(name = "Classification")
    protected String classification;
    @XmlElement(name = "Adbanked")
    protected boolean adbanked;
    @XmlElement(name = "ClosedCaptionText")
    protected String closedCaptionText;
    @XmlElement(name = "ClosedCaptionStatusID")
    protected int closedCaptionStatusID;
    @XmlElement(name = "Definition", required = true, nillable = true)
    protected SpecDefinition definition;
    @XmlElement(name = "SpecDBDocID")
    protected String specDBDocID;
    @XmlAttribute(required = true)
    protected boolean isAlreadyClosedCaption;
    @XmlAttribute(required = true)
    protected boolean isCaptioningRequired;
    @XmlAttribute(required = true)
    protected boolean isCurrentVersion;

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
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the adDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdDuration() {
        return adDuration;
    }

    /**
     * Sets the value of the adDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdDuration(Integer value) {
        this.adDuration = value;
    }

    /**
     * Gets the value of the fullDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFullDuration() {
        return fullDuration;
    }

    /**
     * Sets the value of the fullDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFullDuration(Integer value) {
        this.fullDuration = value;
    }

    /**
     * Gets the value of the firstActiveFrame property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstActiveFrame() {
        return firstActiveFrame;
    }

    /**
     * Sets the value of the firstActiveFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirstActiveFrame(BigInteger value) {
        this.firstActiveFrame = value;
    }

    /**
     * Gets the value of the cadNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCADNo() {
        return cadNo;
    }

    /**
     * Sets the value of the cadNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCADNo(String value) {
        this.cadNo = value;
    }

    /**
     * Gets the value of the creativeDirector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreativeDirector() {
        return creativeDirector;
    }

    /**
     * Sets the value of the creativeDirector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreativeDirector(String value) {
        this.creativeDirector = value;
    }

    /**
     * Gets the value of the artDirector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtDirector() {
        return artDirector;
    }

    /**
     * Sets the value of the artDirector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtDirector(String value) {
        this.artDirector = value;
    }

    /**
     * Gets the value of the producer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducer() {
        return producer;
    }

    /**
     * Sets the value of the producer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducer(String value) {
        this.producer = value;
    }

    /**
     * Gets the value of the director property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirector() {
        return director;
    }

    /**
     * Sets the value of the director property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirector(String value) {
        this.director = value;
    }

    /**
     * Gets the value of the productionCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductionCompany() {
        return productionCompany;
    }

    /**
     * Sets the value of the productionCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionCompany(String value) {
        this.productionCompany = value;
    }

    /**
     * Gets the value of the postProduction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostProduction() {
        return postProduction;
    }

    /**
     * Sets the value of the postProduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostProduction(String value) {
        this.postProduction = value;
    }

    /**
     * Gets the value of the postHouseContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostHouseContact() {
        return postHouseContact;
    }

    /**
     * Sets the value of the postHouseContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostHouseContact(String value) {
        this.postHouseContact = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the productionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProductionDate() {
        return productionDate;
    }

    /**
     * Sets the value of the productionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProductionDate(XMLGregorianCalendar value) {
        this.productionDate = value;
    }

    /**
     * Gets the value of the firstAirDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstAirDate() {
        return firstAirDate;
    }

    /**
     * Sets the value of the firstAirDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstAirDate(XMLGregorianCalendar value) {
        this.firstAirDate = value;
    }

    /**
     * Gets the value of the audioFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioFormat() {
        return audioFormat;
    }

    /**
     * Sets the value of the audioFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioFormat(String value) {
        this.audioFormat = value;
    }

    /**
     * Gets the value of the audioChannels property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAudioChannels() {
        return audioChannels;
    }

    /**
     * Sets the value of the audioChannels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAudioChannels(Integer value) {
        this.audioChannels = value;
    }

    /**
     * Gets the value of the aspectRatio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAspectRatio() {
        return aspectRatio;
    }

    /**
     * Sets the value of the aspectRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAspectRatio(String value) {
        this.aspectRatio = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolution(String value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the groupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupID() {
        return groupID;
    }

    /**
     * Sets the value of the groupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupID(String value) {
        this.groupID = value;
    }

    /**
     * Gets the value of the advertiserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvertiserID() {
        return advertiserID;
    }

    /**
     * Sets the value of the advertiserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvertiserID(String value) {
        this.advertiserID = value;
    }

    /**
     * Gets the value of the advertiserProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvertiserProductID() {
        return advertiserProductID;
    }

    /**
     * Sets the value of the advertiserProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvertiserProductID(String value) {
        this.advertiserProductID = value;
    }

    /**
     * Gets the value of the campaignGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignGuid() {
        return campaignGuid;
    }

    /**
     * Sets the value of the campaignGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignGuid(String value) {
        this.campaignGuid = value;
    }

    /**
     * Gets the value of the musicRightsFieldsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMusicRightsFields }
     *     
     */
    public ArrayOfMusicRightsFields getMusicRightsFieldsList() {
        return musicRightsFieldsList;
    }

    /**
     * Sets the value of the musicRightsFieldsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMusicRightsFields }
     *     
     */
    public void setMusicRightsFieldsList(ArrayOfMusicRightsFields value) {
        this.musicRightsFieldsList = value;
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
     * Gets the value of the advertiserProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvertiserProduct() {
        return advertiserProduct;
    }

    /**
     * Sets the value of the advertiserProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvertiserProduct(String value) {
        this.advertiserProduct = value;
    }

    /**
     * Gets the value of the campaignName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the value of the campaignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignName(String value) {
        this.campaignName = value;
    }

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassification(String value) {
        this.classification = value;
    }

    /**
     * Gets the value of the adbanked property.
     * 
     */
    public boolean isAdbanked() {
        return adbanked;
    }

    /**
     * Sets the value of the adbanked property.
     * 
     */
    public void setAdbanked(boolean value) {
        this.adbanked = value;
    }

    /**
     * Gets the value of the closedCaptionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosedCaptionText() {
        return closedCaptionText;
    }

    /**
     * Sets the value of the closedCaptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosedCaptionText(String value) {
        this.closedCaptionText = value;
    }

    /**
     * Gets the value of the closedCaptionStatusID property.
     * 
     */
    public int getClosedCaptionStatusID() {
        return closedCaptionStatusID;
    }

    /**
     * Sets the value of the closedCaptionStatusID property.
     * 
     */
    public void setClosedCaptionStatusID(int value) {
        this.closedCaptionStatusID = value;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link SpecDefinition }
     *     
     */
    public SpecDefinition getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecDefinition }
     *     
     */
    public void setDefinition(SpecDefinition value) {
        this.definition = value;
    }

    /**
     * Gets the value of the specDBDocID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDBDocID() {
        return specDBDocID;
    }

    /**
     * Sets the value of the specDBDocID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDBDocID(String value) {
        this.specDBDocID = value;
    }

    /**
     * Gets the value of the isAlreadyClosedCaption property.
     * 
     */
    public boolean isIsAlreadyClosedCaption() {
        return isAlreadyClosedCaption;
    }

    /**
     * Sets the value of the isAlreadyClosedCaption property.
     * 
     */
    public void setIsAlreadyClosedCaption(boolean value) {
        this.isAlreadyClosedCaption = value;
    }

    /**
     * Gets the value of the isCaptioningRequired property.
     * 
     */
    public boolean isIsCaptioningRequired() {
        return isCaptioningRequired;
    }

    /**
     * Sets the value of the isCaptioningRequired property.
     * 
     */
    public void setIsCaptioningRequired(boolean value) {
        this.isCaptioningRequired = value;
    }

    /**
     * Gets the value of the isCurrentVersion property.
     * 
     */
    public boolean isIsCurrentVersion() {
        return isCurrentVersion;
    }

    /**
     * Sets the value of the isCurrentVersion property.
     * 
     */
    public void setIsCurrentVersion(boolean value) {
        this.isCurrentVersion = value;
    }

}
