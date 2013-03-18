
package com.adstream.webservice.orders;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTvDestinationGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTvDestinationGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TvDestinationGroup" type="{http://www.adstream.com/WebService/Orders}TvDestinationGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTvDestinationGroup", propOrder = {
    "tvDestinationGroup"
})
public class ArrayOfTvDestinationGroup {

    @XmlElement(name = "TvDestinationGroup", nillable = true)
    protected List<TvDestinationGroup> tvDestinationGroup;

    /**
     * Gets the value of the tvDestinationGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tvDestinationGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTvDestinationGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TvDestinationGroup }
     * 
     * 
     */
    public List<TvDestinationGroup> getTvDestinationGroup() {
        if (tvDestinationGroup == null) {
            tvDestinationGroup = new ArrayList<TvDestinationGroup>();
        }
        return this.tvDestinationGroup;
    }

}
