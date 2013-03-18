
package com.adstream.webservice.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IngestOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IngestOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IngestOrderGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IngestOrder", propOrder = {
    "ingestOrderGuid"
})
public class IngestOrder {

    @XmlElement(name = "IngestOrderGuid")
    protected String ingestOrderGuid;

    /**
     * Gets the value of the ingestOrderGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngestOrderGuid() {
        return ingestOrderGuid;
    }

    /**
     * Sets the value of the ingestOrderGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngestOrderGuid(String value) {
        this.ingestOrderGuid = value;
    }

}
