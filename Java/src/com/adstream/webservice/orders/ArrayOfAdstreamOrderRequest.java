
package com.adstream.webservice.orders;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdstreamOrderRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdstreamOrderRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdstreamOrderRequest" type="{http://www.adstream.com/WebService/Orders}AdstreamOrderRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdstreamOrderRequest", propOrder = {
    "adstreamOrderRequest"
})
public class ArrayOfAdstreamOrderRequest {

    @XmlElement(name = "AdstreamOrderRequest", nillable = true)
    protected List<AdstreamOrderRequest> adstreamOrderRequest;

    /**
     * Gets the value of the adstreamOrderRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adstreamOrderRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdstreamOrderRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdstreamOrderRequest }
     * 
     * 
     */
    public List<AdstreamOrderRequest> getAdstreamOrderRequest() {
        if (adstreamOrderRequest == null) {
            adstreamOrderRequest = new ArrayList<AdstreamOrderRequest>();
        }
        return this.adstreamOrderRequest;
    }

}
