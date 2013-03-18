
package com.adstream.webservice.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TvDestinationGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TvDestinationGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TvDestinationSubGroups" type="{http://www.adstream.com/WebService/Orders}ArrayOfTvDestinationSubGroup" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TvDestinationGroup", propOrder = {
    "tvDestinationSubGroups",
    "country",
    "id",
    "name",
    "priority"
})
public class TvDestinationGroup {

    @XmlElement(name = "TvDestinationSubGroups")
    protected ArrayOfTvDestinationSubGroup tvDestinationSubGroups;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Priority")
    protected int priority;

    /**
     * Gets the value of the tvDestinationSubGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTvDestinationSubGroup }
     *     
     */
    public ArrayOfTvDestinationSubGroup getTvDestinationSubGroups() {
        return tvDestinationSubGroups;
    }

    /**
     * Sets the value of the tvDestinationSubGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTvDestinationSubGroup }
     *     
     */
    public void setTvDestinationSubGroups(ArrayOfTvDestinationSubGroup value) {
        this.tvDestinationSubGroups = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     */
    public void setPriority(int value) {
        this.priority = value;
    }

}
