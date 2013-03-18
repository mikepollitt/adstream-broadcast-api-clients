
package com.adstream.webservice.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import tv.adstream.publicapi.adbank.SortDirection;


/**
 * <p>Java class for OrderQuerySort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderQuerySort">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SortField" type="{http://www.adstream.com/WebService/Orders}SearchOrderSortBy"/>
 *         &lt;element name="SortOrder" type="{http://www.adstream.tv/PublicAPI/Adbank/}SortDirection"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderQuerySort", propOrder = {
    "sortField",
    "sortOrder"
})
public class OrderQuerySort {

    @XmlElement(name = "SortField", required = true)
    protected SearchOrderSortBy sortField;
    @XmlElement(name = "SortOrder", required = true)
    protected SortDirection sortOrder;

    /**
     * Gets the value of the sortField property.
     * 
     * @return
     *     possible object is
     *     {@link SearchOrderSortBy }
     *     
     */
    public SearchOrderSortBy getSortField() {
        return sortField;
    }

    /**
     * Sets the value of the sortField property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchOrderSortBy }
     *     
     */
    public void setSortField(SearchOrderSortBy value) {
        this.sortField = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SortDirection }
     *     
     */
    public SortDirection getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortDirection }
     *     
     */
    public void setSortOrder(SortDirection value) {
        this.sortOrder = value;
    }

}
