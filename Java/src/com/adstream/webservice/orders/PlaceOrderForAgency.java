
package com.adstream.webservice.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdstreamOrder" type="{http://www.adstream.com/WebService/Orders}AdstreamOrderRequest" minOccurs="0"/>
 *         &lt;element name="AgencyGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Basket" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "adstreamOrder",
    "agencyGuid",
    "basket"
})
@XmlRootElement(name = "placeOrderForAgency")
public class PlaceOrderForAgency {

    @XmlElement(name = "AdstreamOrder")
    protected AdstreamOrderRequest adstreamOrder;
    @XmlElement(name = "AgencyGuid")
    protected String agencyGuid;
    @XmlElement(name = "Basket", required = true, type = Boolean.class, nillable = true)
    protected Boolean basket;

    /**
     * Gets the value of the adstreamOrder property.
     * 
     * @return
     *     possible object is
     *     {@link AdstreamOrderRequest }
     *     
     */
    public AdstreamOrderRequest getAdstreamOrder() {
        return adstreamOrder;
    }

    /**
     * Sets the value of the adstreamOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdstreamOrderRequest }
     *     
     */
    public void setAdstreamOrder(AdstreamOrderRequest value) {
        this.adstreamOrder = value;
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
     * Gets the value of the basket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBasket() {
        return basket;
    }

    /**
     * Sets the value of the basket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBasket(Boolean value) {
        this.basket = value;
    }

}
