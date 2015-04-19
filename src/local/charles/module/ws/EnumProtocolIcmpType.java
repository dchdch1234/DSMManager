
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumProtocolIcmpType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumProtocolIcmpType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ICMP_ECHO"/>
 *     &lt;enumeration value="ICMP_TIMESTAMP"/>
 *     &lt;enumeration value="ICMP_INFORMATION"/>
 *     &lt;enumeration value="ICMP_ADDRESS_MASK"/>
 *     &lt;enumeration value="ICMP_MOBILE_REGISTRATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumProtocolIcmpType")
@XmlEnum
public enum EnumProtocolIcmpType {

    ICMP_ECHO,
    ICMP_TIMESTAMP,
    ICMP_INFORMATION,
    ICMP_ADDRESS_MASK,
    ICMP_MOBILE_REGISTRATION;

    public String value() {
        return name();
    }

    public static EnumProtocolIcmpType fromValue(String v) {
        return valueOf(v);
    }

}
