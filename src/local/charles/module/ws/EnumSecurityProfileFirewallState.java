
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumSecurityProfileFirewallState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumSecurityProfileFirewallState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ON"/>
 *     &lt;enumeration value="OFF"/>
 *     &lt;enumeration value="INHERITED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumSecurityProfileFirewallState")
@XmlEnum
public enum EnumSecurityProfileFirewallState {

    ON,
    OFF,
    INHERITED;

    public String value() {
        return name();
    }

    public static EnumSecurityProfileFirewallState fromValue(String v) {
        return valueOf(v);
    }

}
