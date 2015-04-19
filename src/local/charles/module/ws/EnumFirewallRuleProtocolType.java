
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumFirewallRuleProtocolType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumFirewallRuleProtocolType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANY"/>
 *     &lt;enumeration value="ICMP"/>
 *     &lt;enumeration value="ICMPV6"/>
 *     &lt;enumeration value="IGMP"/>
 *     &lt;enumeration value="GGP"/>
 *     &lt;enumeration value="TCP"/>
 *     &lt;enumeration value="PUP"/>
 *     &lt;enumeration value="UDP"/>
 *     &lt;enumeration value="IDP"/>
 *     &lt;enumeration value="ND"/>
 *     &lt;enumeration value="RAW"/>
 *     &lt;enumeration value="TCP_UDP"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumFirewallRuleProtocolType")
@XmlEnum
public enum EnumFirewallRuleProtocolType {

    ANY("ANY"),
    ICMP("ICMP"),
    @XmlEnumValue("ICMPV6")
    ICMPV_6("ICMPV6"),
    IGMP("IGMP"),
    GGP("GGP"),
    TCP("TCP"),
    PUP("PUP"),
    UDP("UDP"),
    IDP("IDP"),
    ND("ND"),
    RAW("RAW"),
    TCP_UDP("TCP_UDP"),
    OTHER("OTHER");
    private final String value;

    EnumFirewallRuleProtocolType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumFirewallRuleProtocolType fromValue(String v) {
        for (EnumFirewallRuleProtocolType c: EnumFirewallRuleProtocolType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
