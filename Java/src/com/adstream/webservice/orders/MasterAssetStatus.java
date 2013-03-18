
package com.adstream.webservice.orders;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MasterAssetStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MasterAssetStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="AwaitingTape"/>
 *     &lt;enumeration value="AwaitingIngestion"/>
 *     &lt;enumeration value="ClapperDoesNotMatch"/>
 *     &lt;enumeration value="TapeFailed"/>
 *     &lt;enumeration value="FileFailed"/>
 *     &lt;enumeration value="TransferringFromIngestion"/>
 *     &lt;enumeration value="UploadingFiles"/>
 *     &lt;enumeration value="AwaitingCaptioning"/>
 *     &lt;enumeration value="IngestedOK"/>
 *     &lt;enumeration value="VideoCancelled"/>
 *     &lt;enumeration value="AwaitingFile"/>
 *     &lt;enumeration value="FileReceivedOK"/>
 *     &lt;enumeration value="FileReceivedAwaitingQA"/>
 *     &lt;enumeration value="Available"/>
 *     &lt;enumeration value="OtherCancelled"/>
 *     &lt;enumeration value="FileUploading"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MasterAssetStatus")
@XmlEnum
public enum MasterAssetStatus {

    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("AwaitingTape")
    AWAITING_TAPE("AwaitingTape"),
    @XmlEnumValue("AwaitingIngestion")
    AWAITING_INGESTION("AwaitingIngestion"),
    @XmlEnumValue("ClapperDoesNotMatch")
    CLAPPER_DOES_NOT_MATCH("ClapperDoesNotMatch"),
    @XmlEnumValue("TapeFailed")
    TAPE_FAILED("TapeFailed"),
    @XmlEnumValue("FileFailed")
    FILE_FAILED("FileFailed"),
    @XmlEnumValue("TransferringFromIngestion")
    TRANSFERRING_FROM_INGESTION("TransferringFromIngestion"),
    @XmlEnumValue("UploadingFiles")
    UPLOADING_FILES("UploadingFiles"),
    @XmlEnumValue("AwaitingCaptioning")
    AWAITING_CAPTIONING("AwaitingCaptioning"),
    @XmlEnumValue("IngestedOK")
    INGESTED_OK("IngestedOK"),
    @XmlEnumValue("VideoCancelled")
    VIDEO_CANCELLED("VideoCancelled"),
    @XmlEnumValue("AwaitingFile")
    AWAITING_FILE("AwaitingFile"),
    @XmlEnumValue("FileReceivedOK")
    FILE_RECEIVED_OK("FileReceivedOK"),
    @XmlEnumValue("FileReceivedAwaitingQA")
    FILE_RECEIVED_AWAITING_QA("FileReceivedAwaitingQA"),
    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("OtherCancelled")
    OTHER_CANCELLED("OtherCancelled"),
    @XmlEnumValue("FileUploading")
    FILE_UPLOADING("FileUploading");
    private final String value;

    MasterAssetStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MasterAssetStatus fromValue(String v) {
        for (MasterAssetStatus c: MasterAssetStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
