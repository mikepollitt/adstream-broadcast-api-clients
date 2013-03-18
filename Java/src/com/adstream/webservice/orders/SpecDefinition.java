
package com.adstream.webservice.orders;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecDefinition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecDefinition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="HD"/>
 *     &lt;enumeration value="SD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpecDefinition")
@XmlEnum
public enum SpecDefinition {

    @XmlEnumValue("Other")
    OTHER("Other"),
    HD("HD"),
    SD("SD");
    private final String value;

    SpecDefinition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecDefinition fromValue(String v) {
        for (SpecDefinition c: SpecDefinition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
