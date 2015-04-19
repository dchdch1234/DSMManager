
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumCounterFilter.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumCounterFilter">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANTI_MALWARE_COMPUTER_ACTIVITY"/>
 *     &lt;enumeration value="INTEGRITY_COMPUTER_ACTIVITY"/>
 *     &lt;enumeration value="LOG_INSPECTION_COMPUTER_ACTIVITY"/>
 *     &lt;enumeration value="FIREWALL_DETECT_COMPUTER_ACTIVITY"/>
 *     &lt;enumeration value="FIREWALL_PREVENT_COMPUTER_ACTIVITY"/>
 *     &lt;enumeration value="FIREWALL_ALL_COMPUTER_ACTIVITY"/>
 *     &lt;enumeration value="DPI_DETECT_COMPUTER_ACTIVITY"/>
 *     &lt;enumeration value="DPI_PREVENT_COMPUTER_ACTIVITY"/>
 *     &lt;enumeration value="DPI_ALL_COMPUTER_ACTIVITY"/>
 *     &lt;enumeration value="ANTI_MALWARE_ACTIVITY"/>
 *     &lt;enumeration value="ANTI_MALWARE_INCOMPLETE_SCAN"/>
 *     &lt;enumeration value="FIREWALL_PREVENT_RULES"/>
 *     &lt;enumeration value="FIREWALL_DETECT_RULES"/>
 *     &lt;enumeration value="FIREWALL_PREVENT_COMMON_EVENTS"/>
 *     &lt;enumeration value="FIREWALL_DETECT_COMMON_EVENTS"/>
 *     &lt;enumeration value="FIREWALL_PREVENT_ACTIVITY"/>
 *     &lt;enumeration value="FIREWALL_DETECT_ACTIVITY"/>
 *     &lt;enumeration value="FIREWALL_ALL_ACTIVITY"/>
 *     &lt;enumeration value="FIREWALL_PREVENT_IP_ACTIVITY"/>
 *     &lt;enumeration value="FIREWALL_DETECT_IP_ACTIVITY"/>
 *     &lt;enumeration value="FIREWALL_PREVENT_PORT_ACTIVITY"/>
 *     &lt;enumeration value="FIREWALL_DETECT_PORT_ACTIVITY"/>
 *     &lt;enumeration value="DPI_PREVENT_RULES"/>
 *     &lt;enumeration value="DPI_DETECT_RULES"/>
 *     &lt;enumeration value="DPI_ALL_RULES"/>
 *     &lt;enumeration value="DPI_PREVENT_COMMON_EVENTS"/>
 *     &lt;enumeration value="DPI_DETECT_COMMON_EVENTS"/>
 *     &lt;enumeration value="DPI_ALL_COMMON_EVENTS"/>
 *     &lt;enumeration value="DPI_PREVENT_ACTIVITY"/>
 *     &lt;enumeration value="DPI_DETECT_ACTIVITY"/>
 *     &lt;enumeration value="DPI_PREVENT_IP_ACTIVITY"/>
 *     &lt;enumeration value="DPI_DETECT_IP_ACTIVITY"/>
 *     &lt;enumeration value="DPI_PREVENT_APP_TYPE_ACTIVITY"/>
 *     &lt;enumeration value="DPI_DETECT_APP_TYPE_ACTIVITY"/>
 *     &lt;enumeration value="INTEGRITY_ACTIVITY"/>
 *     &lt;enumeration value="INTEGRITY_KEY_ACTIVITY"/>
 *     &lt;enumeration value="LOG_INSPECTION_ACTIVITY"/>
 *     &lt;enumeration value="LOG_INSPECTION_DESCRIPTION_ACTIVITY"/>
 *     &lt;enumeration value="ALERT_TYPE"/>
 *     &lt;enumeration value="RECONNAISSANCE_SCAN_ACTIVITY"/>
 *     &lt;enumeration value="SYSTEM_EVENT_SUMMARY"/>
 *     &lt;enumeration value="WEB_REPUTATION_COMPUTER_ACTIVITY"/>
 *     &lt;enumeration value="WEB_REPUTATION_URL_ACTIVITY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumCounterFilter")
@XmlEnum
public enum EnumCounterFilter {

    ANTI_MALWARE_COMPUTER_ACTIVITY,
    INTEGRITY_COMPUTER_ACTIVITY,
    LOG_INSPECTION_COMPUTER_ACTIVITY,
    FIREWALL_DETECT_COMPUTER_ACTIVITY,
    FIREWALL_PREVENT_COMPUTER_ACTIVITY,
    FIREWALL_ALL_COMPUTER_ACTIVITY,
    DPI_DETECT_COMPUTER_ACTIVITY,
    DPI_PREVENT_COMPUTER_ACTIVITY,
    DPI_ALL_COMPUTER_ACTIVITY,
    ANTI_MALWARE_ACTIVITY,
    ANTI_MALWARE_INCOMPLETE_SCAN,
    FIREWALL_PREVENT_RULES,
    FIREWALL_DETECT_RULES,
    FIREWALL_PREVENT_COMMON_EVENTS,
    FIREWALL_DETECT_COMMON_EVENTS,
    FIREWALL_PREVENT_ACTIVITY,
    FIREWALL_DETECT_ACTIVITY,
    FIREWALL_ALL_ACTIVITY,
    FIREWALL_PREVENT_IP_ACTIVITY,
    FIREWALL_DETECT_IP_ACTIVITY,
    FIREWALL_PREVENT_PORT_ACTIVITY,
    FIREWALL_DETECT_PORT_ACTIVITY,
    DPI_PREVENT_RULES,
    DPI_DETECT_RULES,
    DPI_ALL_RULES,
    DPI_PREVENT_COMMON_EVENTS,
    DPI_DETECT_COMMON_EVENTS,
    DPI_ALL_COMMON_EVENTS,
    DPI_PREVENT_ACTIVITY,
    DPI_DETECT_ACTIVITY,
    DPI_PREVENT_IP_ACTIVITY,
    DPI_DETECT_IP_ACTIVITY,
    DPI_PREVENT_APP_TYPE_ACTIVITY,
    DPI_DETECT_APP_TYPE_ACTIVITY,
    INTEGRITY_ACTIVITY,
    INTEGRITY_KEY_ACTIVITY,
    LOG_INSPECTION_ACTIVITY,
    LOG_INSPECTION_DESCRIPTION_ACTIVITY,
    ALERT_TYPE,
    RECONNAISSANCE_SCAN_ACTIVITY,
    SYSTEM_EVENT_SUMMARY,
    WEB_REPUTATION_COMPUTER_ACTIVITY,
    WEB_REPUTATION_URL_ACTIVITY;

    public String value() {
        return name();
    }

    public static EnumCounterFilter fromValue(String v) {
        return valueOf(v);
    }

}
