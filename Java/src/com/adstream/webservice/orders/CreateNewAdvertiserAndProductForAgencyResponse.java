
package com.adstream.webservice.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="createNewAdvertiserAndProductForAgencyResult" type="{http://www.adstream.com/WebService/Orders}AdvertiserProduct" minOccurs="0"/>
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
    "createNewAdvertiserAndProductForAgencyResult"
})
@XmlRootElement(name = "createNewAdvertiserAndProductForAgencyResponse")
public class CreateNewAdvertiserAndProductForAgencyResponse {

    protected AdvertiserProduct createNewAdvertiserAndProductForAgencyResult;

    /**
     * Gets the value of the createNewAdvertiserAndProductForAgencyResult property.
     * 
     * @return
     *     possible object is
     *     {@link AdvertiserProduct }
     *     
     */
    public AdvertiserProduct getCreateNewAdvertiserAndProductForAgencyResult() {
        return createNewAdvertiserAndProductForAgencyResult;
    }

    /**
     * Sets the value of the createNewAdvertiserAndProductForAgencyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvertiserProduct }
     *     
     */
    public void setCreateNewAdvertiserAndProductForAgencyResult(AdvertiserProduct value) {
        this.createNewAdvertiserAndProductForAgencyResult = value;
    }

}
