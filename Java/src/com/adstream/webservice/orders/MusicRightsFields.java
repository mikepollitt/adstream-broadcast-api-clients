
package com.adstream.webservice.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MusicRightsFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MusicRightsFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MusicRightsFieldsGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Artist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Composer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Publisher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CatalogueNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MusicRightsFields", propOrder = {
    "musicRightsFieldsGUID",
    "title",
    "artist",
    "composer",
    "publisher",
    "recordCompany",
    "catalogueNumber",
    "trackDuration",
    "idNumber"
})
public class MusicRightsFields {

    @XmlElement(name = "MusicRightsFieldsGUID")
    protected String musicRightsFieldsGUID;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Artist")
    protected String artist;
    @XmlElement(name = "Composer")
    protected String composer;
    @XmlElement(name = "Publisher")
    protected String publisher;
    @XmlElement(name = "RecordCompany")
    protected String recordCompany;
    @XmlElement(name = "CatalogueNumber")
    protected String catalogueNumber;
    @XmlElement(name = "TrackDuration")
    protected String trackDuration;
    @XmlElement(name = "IDNumber")
    protected String idNumber;

    /**
     * Gets the value of the musicRightsFieldsGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMusicRightsFieldsGUID() {
        return musicRightsFieldsGUID;
    }

    /**
     * Sets the value of the musicRightsFieldsGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMusicRightsFieldsGUID(String value) {
        this.musicRightsFieldsGUID = value;
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
     * Gets the value of the artist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Sets the value of the artist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtist(String value) {
        this.artist = value;
    }

    /**
     * Gets the value of the composer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComposer() {
        return composer;
    }

    /**
     * Sets the value of the composer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComposer(String value) {
        this.composer = value;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisher(String value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the recordCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordCompany() {
        return recordCompany;
    }

    /**
     * Sets the value of the recordCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordCompany(String value) {
        this.recordCompany = value;
    }

    /**
     * Gets the value of the catalogueNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogueNumber() {
        return catalogueNumber;
    }

    /**
     * Sets the value of the catalogueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogueNumber(String value) {
        this.catalogueNumber = value;
    }

    /**
     * Gets the value of the trackDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackDuration() {
        return trackDuration;
    }

    /**
     * Sets the value of the trackDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackDuration(String value) {
        this.trackDuration = value;
    }

    /**
     * Gets the value of the idNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNumber() {
        return idNumber;
    }

    /**
     * Sets the value of the idNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNumber(String value) {
        this.idNumber = value;
    }

}
