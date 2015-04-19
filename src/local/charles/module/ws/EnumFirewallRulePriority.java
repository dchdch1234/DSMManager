
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumFirewallRulePriority.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumFirewallRulePriority">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HIGHEST"/>
 *     &lt;enumeration value="HIGH"/>
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="LOW"/>
 *     &lt;enumeration value="LOWEST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumFirewallRulePriority")
@XmlEnum
public enum EnumFirewallRulePriority {

    HIGHEST,
    HIGH,
    NORMAL,
    LOW,
    LOWEST;

    public String value() {
        return name();
    }

    public static EnumFirewallRulePriority fromValue(String v) {
        return valueOf(v);
    }

}
