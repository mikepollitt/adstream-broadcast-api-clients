
package com.adstream.webservice.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SystemManager"/>
 *     &lt;enumeration value="ProductionManager"/>
 *     &lt;enumeration value="Ingestion"/>
 *     &lt;enumeration value="Agency"/>
 *     &lt;enumeration value="TapeReceipting"/>
 *     &lt;enumeration value="TrafficManager"/>
 *     &lt;enumeration value="SystemProcess"/>
 *     &lt;enumeration value="Accounts"/>
 *     &lt;enumeration value="CustomerService"/>
 *     &lt;enumeration value="Guest"/>
 *     &lt;enumeration value="NOCOperator"/>
 *     &lt;enumeration value="RadioTrafficManager"/>
 *     &lt;enumeration value="Reseller"/>
 *     &lt;enumeration value="RadioNetworkUser"/>
 *     &lt;enumeration value="WatermarkOperator"/>
 *     &lt;enumeration value="Vendor"/>
 *     &lt;enumeration value="TrafficManagerLegal"/>
 *     &lt;enumeration value="LegalManager"/>
 *     &lt;enumeration value="LegalUserBrowse"/>
 *     &lt;enumeration value="LegalUserApprove"/>
 *     &lt;enumeration value="TrafficUser"/>
 *     &lt;enumeration value="IngestUser"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserType")
@XmlEnum
public enum UserType {

    @XmlEnumValue("SystemManager")
    SYSTEM_MANAGER("SystemManager"),
    @XmlEnumValue("ProductionManager")
    PRODUCTION_MANAGER("ProductionManager"),
    @XmlEnumValue("Ingestion")
    INGESTION("Ingestion"),
    @XmlEnumValue("Agency")
    AGENCY("Agency"),
    @XmlEnumValue("TapeReceipting")
    TAPE_RECEIPTING("TapeReceipting"),
    @XmlEnumValue("TrafficManager")
    TRAFFIC_MANAGER("TrafficManager"),
    @XmlEnumValue("SystemProcess")
    SYSTEM_PROCESS("SystemProcess"),
    @XmlEnumValue("Accounts")
    ACCOUNTS("Accounts"),
    @XmlEnumValue("CustomerService")
    CUSTOMER_SERVICE("CustomerService"),
    @XmlEnumValue("Guest")
    GUEST("Guest"),
    @XmlEnumValue("NOCOperator")
    NOC_OPERATOR("NOCOperator"),
    @XmlEnumValue("RadioTrafficManager")
    RADIO_TRAFFIC_MANAGER("RadioTrafficManager"),
    @XmlEnumValue("Reseller")
    RESELLER("Reseller"),
    @XmlEnumValue("RadioNetworkUser")
    RADIO_NETWORK_USER("RadioNetworkUser"),
    @XmlEnumValue("WatermarkOperator")
    WATERMARK_OPERATOR("WatermarkOperator"),
    @XmlEnumValue("Vendor")
    VENDOR("Vendor"),
    @XmlEnumValue("TrafficManagerLegal")
    TRAFFIC_MANAGER_LEGAL("TrafficManagerLegal"),
    @XmlEnumValue("LegalManager")
    LEGAL_MANAGER("LegalManager"),
    @XmlEnumValue("LegalUserBrowse")
    LEGAL_USER_BROWSE("LegalUserBrowse"),
    @XmlEnumValue("LegalUserApprove")
    LEGAL_USER_APPROVE("LegalUserApprove"),
    @XmlEnumValue("TrafficUser")
    TRAFFIC_USER("TrafficUser"),
    @XmlEnumValue("IngestUser")
    INGEST_USER("IngestUser");
    private final String value;

    UserType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserType fromValue(String v) {
        for (UserType c: UserType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
