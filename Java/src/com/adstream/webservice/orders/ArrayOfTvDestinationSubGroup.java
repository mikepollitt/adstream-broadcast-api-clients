
package com.adstream.webservice.orders;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTvDestinationSubGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTvDestinationSubGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TvDestinationSubGroup" type="{http://www.adstream.com/WebService/Orders}TvDestinationSubGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTvDestinationSubGroup", propOrder = {
    "tvDestinationSubGroup"
})
public class ArrayOfTvDestinationSubGroup {

    @XmlElement(name = "TvDestinationSubGroup", nillable = true)
    protected List<TvDestinationSubGroup> tvDestinationSubGroup;

    /**
     * Gets the value of the tvDestinationSubGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tvDestinationSubGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTvDestinationSubGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TvDestinationSubGroup }
     * 
     * 
     */
    public List<TvDestinationSubGroup> getTvDestinationSubGroup() {
        if (tvDestinationSubGroup == null) {
            tvDestinationSubGroup = new ArrayList<TvDestinationSubGroup>();
        }
        return this.tvDestinationSubGroup;
    }

}
