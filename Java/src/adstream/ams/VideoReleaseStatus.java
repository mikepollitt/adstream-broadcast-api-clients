
package adstream.ams;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoReleaseStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoReleaseStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="AwaitingCopy"/>
 *     &lt;enumeration value="AwaitingApproval"/>
 *     &lt;enumeration value="AwaitingTransfer"/>
 *     &lt;enumeration value="TransferQueued"/>
 *     &lt;enumeration value="SchedulingIssue"/>
 *     &lt;enumeration value="TransferInProgress"/>
 *     &lt;enumeration value="AwaitingCRC32Check"/>
 *     &lt;enumeration value="AwaitingUnzipping"/>
 *     &lt;enumeration value="TransferCompleteCRC32Check"/>
 *     &lt;enumeration value="TransferCompleteUnzipping"/>
 *     &lt;enumeration value="TransferFailedRetrying"/>
 *     &lt;enumeration value="TransferFailed"/>
 *     &lt;enumeration value="TransferComplete"/>
 *     &lt;enumeration value="PlayedOut"/>
 *     &lt;enumeration value="Cancelling"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="DeliverInProgress"/>
 *     &lt;enumeration value="TranscodingForDestination"/>
 *     &lt;enumeration value="AwaitingStationRelease"/>
 *     &lt;enumeration value="AwaitingDelivery"/>
 *     &lt;enumeration value="AwaitingReset"/>
 *     &lt;enumeration value="AwaitingYADNTransfer"/>
 *     &lt;enumeration value="ReadyForTransfer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoReleaseStatus", namespace = "urn:Adstream:AMS")
@XmlEnum
public enum VideoReleaseStatus {

    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("AwaitingCopy")
    AWAITING_COPY("AwaitingCopy"),
    @XmlEnumValue("AwaitingApproval")
    AWAITING_APPROVAL("AwaitingApproval"),
    @XmlEnumValue("AwaitingTransfer")
    AWAITING_TRANSFER("AwaitingTransfer"),
    @XmlEnumValue("TransferQueued")
    TRANSFER_QUEUED("TransferQueued"),
    @XmlEnumValue("SchedulingIssue")
    SCHEDULING_ISSUE("SchedulingIssue"),
    @XmlEnumValue("TransferInProgress")
    TRANSFER_IN_PROGRESS("TransferInProgress"),
    @XmlEnumValue("AwaitingCRC32Check")
    AWAITING_CRC_32_CHECK("AwaitingCRC32Check"),
    @XmlEnumValue("AwaitingUnzipping")
    AWAITING_UNZIPPING("AwaitingUnzipping"),
    @XmlEnumValue("TransferCompleteCRC32Check")
    TRANSFER_COMPLETE_CRC_32_CHECK("TransferCompleteCRC32Check"),
    @XmlEnumValue("TransferCompleteUnzipping")
    TRANSFER_COMPLETE_UNZIPPING("TransferCompleteUnzipping"),
    @XmlEnumValue("TransferFailedRetrying")
    TRANSFER_FAILED_RETRYING("TransferFailedRetrying"),
    @XmlEnumValue("TransferFailed")
    TRANSFER_FAILED("TransferFailed"),
    @XmlEnumValue("TransferComplete")
    TRANSFER_COMPLETE("TransferComplete"),
    @XmlEnumValue("PlayedOut")
    PLAYED_OUT("PlayedOut"),
    @XmlEnumValue("Cancelling")
    CANCELLING("Cancelling"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("DeliverInProgress")
    DELIVER_IN_PROGRESS("DeliverInProgress"),
    @XmlEnumValue("TranscodingForDestination")
    TRANSCODING_FOR_DESTINATION("TranscodingForDestination"),
    @XmlEnumValue("AwaitingStationRelease")
    AWAITING_STATION_RELEASE("AwaitingStationRelease"),
    @XmlEnumValue("AwaitingDelivery")
    AWAITING_DELIVERY("AwaitingDelivery"),
    @XmlEnumValue("AwaitingReset")
    AWAITING_RESET("AwaitingReset"),
    @XmlEnumValue("AwaitingYADNTransfer")
    AWAITING_YADN_TRANSFER("AwaitingYADNTransfer"),
    @XmlEnumValue("ReadyForTransfer")
    READY_FOR_TRANSFER("ReadyForTransfer");
    private final String value;

    VideoReleaseStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VideoReleaseStatus fromValue(String v) {
        for (VideoReleaseStatus c: VideoReleaseStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
