
package com.adstream.webservice.orders;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TVMMStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TVMMStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MachineNotSetUp"/>
 *     &lt;enumeration value="Online"/>
 *     &lt;enumeration value="PollingError"/>
 *     &lt;enumeration value="NotResponding"/>
 *     &lt;enumeration value="OffLine"/>
 *     &lt;enumeration value="OffLineScheduledOutage"/>
 *     &lt;enumeration value="Disabled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TVMMStatus")
@XmlEnum
public enum TVMMStatus {

    @XmlEnumValue("MachineNotSetUp")
    MACHINE_NOT_SET_UP("MachineNotSetUp"),
    @XmlEnumValue("Online")
    ONLINE("Online"),
    @XmlEnumValue("PollingError")
    POLLING_ERROR("PollingError"),
    @XmlEnumValue("NotResponding")
    NOT_RESPONDING("NotResponding"),
    @XmlEnumValue("OffLine")
    OFF_LINE("OffLine"),
    @XmlEnumValue("OffLineScheduledOutage")
    OFF_LINE_SCHEDULED_OUTAGE("OffLineScheduledOutage"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled");
    private final String value;

    TVMMStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TVMMStatus fromValue(String v) {
        for (TVMMStatus c: TVMMStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
