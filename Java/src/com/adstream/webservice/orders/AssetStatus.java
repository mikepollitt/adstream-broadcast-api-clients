
package com.adstream.webservice.orders;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Destination" type="{http://www.adstream.com/WebService/Orders}Destination" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Uniquekey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CADNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetStatus", propOrder = {
    "destination"
})
public class AssetStatus {

    @XmlElement(name = "Destination")
    protected List<Destination> destination;
    @XmlAttribute(name = "Uniquekey")
    protected String uniquekey;
    @XmlAttribute(name = "CADNo")
    protected String cadNo;

    /**
     * Gets the value of the destination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Destination }
     * 
     * 
     */
    public List<Destination> getDestination() {
        if (destination == null) {
            destination = new ArrayList<Destination>();
        }
        return this.destination;
    }

    /**
     * Gets the value of the uniquekey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniquekey() {
        return uniquekey;
    }

    /**
     * Sets the value of the uniquekey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniquekey(String value) {
        this.uniquekey = value;
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

}
