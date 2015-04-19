
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumDPIRulePriority.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumDPIRulePriority">
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
@XmlType(name = "EnumDPIRulePriority")
@XmlEnum
public enum EnumDPIRulePriority {

    HIGHEST,
    HIGH,
    NORMAL,
    LOW,
    LOWEST;

    public String value() {
        return name();
    }

    public static EnumDPIRulePriority fromValue(String v) {
        return valueOf(v);
    }

}
