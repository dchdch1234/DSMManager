
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumDPIRuleAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumDPIRuleAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DROP_CLOSE"/>
 *     &lt;enumeration value="LOG_ONLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumDPIRuleAction")
@XmlEnum
public enum EnumDPIRuleAction {

    DROP_CLOSE,
    LOG_ONLY;

    public String value() {
        return name();
    }

    public static EnumDPIRuleAction fromValue(String v) {
        return valueOf(v);
    }

}
