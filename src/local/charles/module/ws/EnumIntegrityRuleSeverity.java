
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumIntegrityRuleSeverity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumIntegrityRuleSeverity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CRITICAL"/>
 *     &lt;enumeration value="HIGH"/>
 *     &lt;enumeration value="MEDIUM"/>
 *     &lt;enumeration value="LOW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumIntegrityRuleSeverity")
@XmlEnum
public enum EnumIntegrityRuleSeverity {

    CRITICAL,
    HIGH,
    MEDIUM,
    LOW;

    public String value() {
        return name();
    }

    public static EnumIntegrityRuleSeverity fromValue(String v) {
        return valueOf(v);
    }

}
