
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumDPIRuleIf.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumDPIRuleIf">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL_PATTERNS_FOUND"/>
 *     &lt;enumeration value="ANY_PATTERNS_FOUND"/>
 *     &lt;enumeration value="NO_PATTERNS_FOUND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumDPIRuleIf")
@XmlEnum
public enum EnumDPIRuleIf {

    ALL_PATTERNS_FOUND,
    ANY_PATTERNS_FOUND,
    NO_PATTERNS_FOUND;

    public String value() {
        return name();
    }

    public static EnumDPIRuleIf fromValue(String v) {
        return valueOf(v);
    }

}
