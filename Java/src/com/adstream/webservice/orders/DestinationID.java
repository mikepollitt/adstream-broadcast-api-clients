
package com.adstream.webservice.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for DestinationID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DestinationID">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
 *       &lt;attribute name="ServiceLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="DisplayableStatusID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Market" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CartNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestinationID", propOrder = {
    "value"
})
public class DestinationID {

    @XmlValue
    protected int value;
    @XmlAttribute(name = "ServiceLevel", required = true)
    protected int serviceLevel;
    @XmlAttribute(name = "DisplayableStatusID", required = true)
    protected int displayableStatusID;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "Market")
    protected String market;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "CartNumber")
    protected String cartNumber;

    /**
     * Gets the value of the value property.
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Gets the value of the serviceLevel property.
     * 
     */
    public int getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Sets the value of the serviceLevel property.
     * 
     */
    public void setServiceLevel(int value) {
        this.serviceLevel = value;
    }

    /**
     * Gets the value of the displayableStatusID property.
     * 
     */
    public int getDisplayableStatusID() {
        return displayableStatusID;
    }

    /**
     * Sets the value of the displayableStatusID property.
     * 
     */
    public void setDisplayableStatusID(int value) {
        this.displayableStatusID = value;
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
     * Gets the value of the market property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarket() {
        return market;
    }

    /**
     * Sets the value of the market property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarket(String value) {
        this.market = value;
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

}
