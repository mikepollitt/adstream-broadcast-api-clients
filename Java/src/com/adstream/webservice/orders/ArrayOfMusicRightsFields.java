
package com.adstream.webservice.orders;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMusicRightsFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMusicRightsFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MusicRightsFields" type="{http://www.adstream.com/WebService/Orders}MusicRightsFields" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMusicRightsFields", propOrder = {
    "musicRightsFields"
})
public class ArrayOfMusicRightsFields {

    @XmlElement(name = "MusicRightsFields")
    protected List<MusicRightsFields> musicRightsFields;

    /**
     * Gets the value of the musicRightsFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the musicRightsFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMusicRightsFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MusicRightsFields }
     * 
     * 
     */
    public List<MusicRightsFields> getMusicRightsFields() {
        if (musicRightsFields == null) {
            musicRightsFields = new ArrayList<MusicRightsFields>();
        }
        return this.musicRightsFields;
    }

}
