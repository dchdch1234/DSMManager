
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumFirewallRuleAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumFirewallRuleAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LOG_ONLY"/>
 *     &lt;enumeration value="ALLOW"/>
 *     &lt;enumeration value="DENY"/>
 *     &lt;enumeration value="FORCE_ALLOW"/>
 *     &lt;enumeration value="BYPASS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumFirewallRuleAction")
@XmlEnum
public enum EnumFirewallRuleAction {

    LOG_ONLY,
    ALLOW,
    DENY,
    FORCE_ALLOW,
    BYPASS;

    public String value() {
        return name();
    }

    public static EnumFirewallRuleAction fromValue(String v) {
        return valueOf(v);
    }

}
