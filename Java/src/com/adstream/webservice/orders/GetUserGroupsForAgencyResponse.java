
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
 *         &lt;element name="getUserGroupsForAgencyResult" type="{http://www.adstream.com/WebService/Orders}ArrayOfUserGroup" minOccurs="0"/>
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
    "getUserGroupsForAgencyResult"
})
@XmlRootElement(name = "getUserGroupsForAgencyResponse")
public class GetUserGroupsForAgencyResponse {

    protected ArrayOfUserGroup getUserGroupsForAgencyResult;

    /**
     * Gets the value of the getUserGroupsForAgencyResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserGroup }
     *     
     */
    public ArrayOfUserGroup getGetUserGroupsForAgencyResult() {
        return getUserGroupsForAgencyResult;
    }

    /**
     * Sets the value of the getUserGroupsForAgencyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserGroup }
     *     
     */
    public void setGetUserGroupsForAgencyResult(ArrayOfUserGroup value) {
        this.getUserGroupsForAgencyResult = value;
    }

}
