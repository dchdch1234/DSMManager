
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumCounterSumFilter.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumCounterSumFilter">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FIREWALL_PREVENT_ACTIVITY"/>
 *     &lt;enumeration value="FIREWALL_DETECT_ACTIVITY"/>
 *     &lt;enumeration value="FIREWALL_PREVENT_RULES"/>
 *     &lt;enumeration value="FIREWALL_DETECT_RULES"/>
 *     &lt;enumeration value="FIREWALL_PREVENT_COMMON_EVENTS"/>
 *     &lt;enumeration value="FIREWALL_DETECT_COMMON_EVENTS"/>
 *     &lt;enumeration value="DPI_PREVENT_ACTIVITY"/>
 *     &lt;enumeration value="DPI_DETECT_ACTIVITY"/>
 *     &lt;enumeration value="DPI_PREVENT_RULES"/>
 *     &lt;enumeration value="DPI_DETECT_RULES"/>
 *     &lt;enumeration value="DPI_PREVENT_COMMON_EVENTS"/>
 *     &lt;enumeration value="DPI_DETECT_COMMON_EVENTS"/>
 *     &lt;enumeration value="INTEGRITY_ACTIVITY"/>
 *     &lt;enumeration value="ANTI_MALWARE_ACTIVITY"/>
 *     &lt;enumeration value="LOG_INSPECTION_ACTIVITY"/>
 *     &lt;enumeration value="LOG_INSPECTION_SEVERITY_LOW"/>
 *     &lt;enumeration value="LOG_INSPECTION_SEVERITY_MEDIUM"/>
 *     &lt;enumeration value="LOG_INSPECTION_SEVERITY_HIGH"/>
 *     &lt;enumeration value="LOG_INSPECTION_SEVERITY_CRITICAL"/>
 *     &lt;enumeration value="INTEGRITY_SEVERITY_LOW"/>
 *     &lt;enumeration value="INTEGRITY_SEVERITY_MEDIUM"/>
 *     &lt;enumeration value="INTEGRITY_SEVERITY_HIGH"/>
 *     &lt;enumeration value="INTEGRITY_SEVERITY_CRITICAL"/>
 *     &lt;enumeration value="ANTI_MALWARE_SCANACTION_PASS"/>
 *     &lt;enumeration value="ANTI_MALWARE_SCANACTION_DELETE"/>
 *     &lt;enumeration value="ANTI_MALWARE_SCANACTION_QUARANTINE"/>
 *     &lt;enumeration value="ANTI_MALWARE_SCANACTION_CLEAN"/>
 *     &lt;enumeration value="ANTI_MALWARE_SCANACTION_DENY_ACCESS"/>
 *     &lt;enumeration value="ANTI_MALWARE_SCANACTION_FAILED"/>
 *     &lt;enumeration value="WEB_REPUTATION_ACTIVITY"/>
 *     &lt;enumeration value="WEB_REPUTATION_RISK_UNTESTED"/>
 *     &lt;enumeration value="WEB_REPUTATION_RISK_BLOCKED"/>
 *     &lt;enumeration value="WEB_REPUTATION_RISK_SAFE"/>
 *     &lt;enumeration value="WEB_REPUTATION_RISK_SUSPICIOUS"/>
 *     &lt;enumeration value="WEB_REPUTATION_RISK_HIGHLY_SUSPICIOUS"/>
 *     &lt;enumeration value="WEB_REPUTATION_RISK_DANGEROUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumCounterSumFilter")
@XmlEnum
public enum EnumCounterSumFilter {

    FIREWALL_PREVENT_ACTIVITY,
    FIREWALL_DETECT_ACTIVITY,
    FIREWALL_PREVENT_RULES,
    FIREWALL_DETECT_RULES,
    FIREWALL_PREVENT_COMMON_EVENTS,
    FIREWALL_DETECT_COMMON_EVENTS,
    DPI_PREVENT_ACTIVITY,
    DPI_DETECT_ACTIVITY,
    DPI_PREVENT_RULES,
    DPI_DETECT_RULES,
    DPI_PREVENT_COMMON_EVENTS,
    DPI_DETECT_COMMON_EVENTS,
    INTEGRITY_ACTIVITY,
    ANTI_MALWARE_ACTIVITY,
    LOG_INSPECTION_ACTIVITY,
    LOG_INSPECTION_SEVERITY_LOW,
    LOG_INSPECTION_SEVERITY_MEDIUM,
    LOG_INSPECTION_SEVERITY_HIGH,
    LOG_INSPECTION_SEVERITY_CRITICAL,
    INTEGRITY_SEVERITY_LOW,
    INTEGRITY_SEVERITY_MEDIUM,
    INTEGRITY_SEVERITY_HIGH,
    INTEGRITY_SEVERITY_CRITICAL,
    ANTI_MALWARE_SCANACTION_PASS,
    ANTI_MALWARE_SCANACTION_DELETE,
    ANTI_MALWARE_SCANACTION_QUARANTINE,
    ANTI_MALWARE_SCANACTION_CLEAN,
    ANTI_MALWARE_SCANACTION_DENY_ACCESS,
    ANTI_MALWARE_SCANACTION_FAILED,
    WEB_REPUTATION_ACTIVITY,
    WEB_REPUTATION_RISK_UNTESTED,
    WEB_REPUTATION_RISK_BLOCKED,
    WEB_REPUTATION_RISK_SAFE,
    WEB_REPUTATION_RISK_SUSPICIOUS,
    WEB_REPUTATION_RISK_HIGHLY_SUSPICIOUS,
    WEB_REPUTATION_RISK_DANGEROUS;

    public String value() {
        return name();
    }

    public static EnumCounterSumFilter fromValue(String v) {
        return valueOf(v);
    }

}
