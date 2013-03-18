
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
 *         &lt;element name="DeliveryID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Reingest" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Resend" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "deliveryID",
    "reingest",
    "resend",
    "comment"
})
@XmlRootElement(name = "reject")
public class Reject {

    @XmlElement(name = "DeliveryID", required = true)
    protected String deliveryID;
    @XmlElement(name = "Reingest")
    protected boolean reingest;
    @XmlElement(name = "Resend")
    protected boolean resend;
    @XmlElement(name = "Comment")
    protected String comment;

    /**
     * Gets the value of the deliveryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryID() {
        return deliveryID;
    }

    /**
     * Sets the value of the deliveryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryID(String value) {
        this.deliveryID = value;
    }

    /**
     * Gets the value of the reingest property.
     * 
     */
    public boolean isReingest() {
        return reingest;
    }

    /**
     * Sets the value of the reingest property.
     * 
     */
    public void setReingest(boolean value) {
        this.reingest = value;
    }

    /**
     * Gets the value of the resend property.
     * 
     */
    public boolean isResend() {
        return resend;
    }

    /**
     * Sets the value of the resend property.
     * 
     */
    public void setResend(boolean value) {
        this.resend = value;
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

}
