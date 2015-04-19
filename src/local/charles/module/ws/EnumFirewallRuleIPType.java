
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumFirewallRuleIPType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumFirewallRuleIPType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANY"/>
 *     &lt;enumeration value="MASKED_IP"/>
 *     &lt;enumeration value="RANGE"/>
 *     &lt;enumeration value="DEFINED_LIST"/>
 *     &lt;enumeration value="SINGLE_IP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumFirewallRuleIPType")
@XmlEnum
public enum EnumFirewallRuleIPType {

    ANY,
    MASKED_IP,
    RANGE,
    DEFINED_LIST,
    SINGLE_IP;

    public String value() {
        return name();
    }

    public static EnumFirewallRuleIPType fromValue(String v) {
        return valueOf(v);
    }

}
