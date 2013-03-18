
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
 *         &lt;element name="findOrdersCountResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "findOrdersCountResult"
})
@XmlRootElement(name = "findOrdersCountResponse")
public class FindOrdersCountResponse {

    protected int findOrdersCountResult;

    /**
     * Gets the value of the findOrdersCountResult property.
     * 
     */
    public int getFindOrdersCountResult() {
        return findOrdersCountResult;
    }

    /**
     * Sets the value of the findOrdersCountResult property.
     * 
     */
    public void setFindOrdersCountResult(int value) {
        this.findOrdersCountResult = value;
    }

}
