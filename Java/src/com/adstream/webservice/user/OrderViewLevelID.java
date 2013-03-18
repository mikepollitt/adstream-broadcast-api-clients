
package com.adstream.webservice.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderViewLevelID.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderViewLevelID">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OWN_ORDERS"/>
 *     &lt;enumeration value="ALL_ORDERS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderViewLevelID")
@XmlEnum
public enum OrderViewLevelID {

    OWN_ORDERS,
    ALL_ORDERS;

    public String value() {
        return name();
    }

    public static OrderViewLevelID fromValue(String v) {
        return valueOf(v);
    }

}
