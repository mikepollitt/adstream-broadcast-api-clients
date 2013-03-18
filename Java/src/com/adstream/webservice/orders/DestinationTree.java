
package com.adstream.webservice.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DestinationTree complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DestinationTree">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Children" type="{http://www.adstream.com/WebService/Orders}ArrayOfDestinationTree" minOccurs="0"/>
 *         &lt;element name="ServiceLevels" type="{http://www.adstream.com/WebService/Orders}ArrayOfShort" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusID" type="{http://www.adstream.com/WebService/Orders}TVMMStatus"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestinationTree", propOrder = {
    "children",
    "serviceLevels",
    "id",
    "name",
    "statusID",
    "company"
})
public class DestinationTree {

    @XmlElement(name = "Children")
    protected ArrayOfDestinationTree children;
    @XmlElement(name = "ServiceLevels")
    protected ArrayOfShort serviceLevels;
    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "StatusID", required = true)
    protected TVMMStatus statusID;
    @XmlElement(name = "Company")
    protected String company;

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDestinationTree }
     *     
     */
    public ArrayOfDestinationTree getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDestinationTree }
     *     
     */
    public void setChildren(ArrayOfDestinationTree value) {
        this.children = value;
    }

    /**
     * Gets the value of the serviceLevels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfShort }
     *     
     */
    public ArrayOfShort getServiceLevels() {
        return serviceLevels;
    }

    /**
     * Sets the value of the serviceLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfShort }
     *     
     */
    public void setServiceLevels(ArrayOfShort value) {
        this.serviceLevels = value;
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
     * Gets the value of the statusID property.
     * 
     * @return
     *     possible object is
     *     {@link TVMMStatus }
     *     
     */
    public TVMMStatus getStatusID() {
        return statusID;
    }

    /**
     * Sets the value of the statusID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TVMMStatus }
     *     
     */
    public void setStatusID(TVMMStatus value) {
        this.statusID = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

}
