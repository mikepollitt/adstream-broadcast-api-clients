
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
 *         &lt;element name="getUserGroupsResult" type="{http://www.adstream.com/WebService/Orders}ArrayOfUserGroup" minOccurs="0"/>
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
    "getUserGroupsResult"
})
@XmlRootElement(name = "getUserGroupsResponse")
public class GetUserGroupsResponse {

    protected ArrayOfUserGroup getUserGroupsResult;

    /**
     * Gets the value of the getUserGroupsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserGroup }
     *     
     */
    public ArrayOfUserGroup getGetUserGroupsResult() {
        return getUserGroupsResult;
    }

    /**
     * Sets the value of the getUserGroupsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserGroup }
     *     
     */
    public void setGetUserGroupsResult(ArrayOfUserGroup value) {
        this.getUserGroupsResult = value;
    }

}
