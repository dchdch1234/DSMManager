
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumFirewallRuleFrameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumFirewallRuleFrameType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANY"/>
 *     &lt;enumeration value="IP"/>
 *     &lt;enumeration value="ARP"/>
 *     &lt;enumeration value="REVARP"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumFirewallRuleFrameType")
@XmlEnum
public enum EnumFirewallRuleFrameType {

    ANY,
    IP,
    ARP,
    REVARP,
    OTHER;

    public String value() {
        return name();
    }

    public static EnumFirewallRuleFrameType fromValue(String v) {
        return valueOf(v);
    }

}
