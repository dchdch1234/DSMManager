
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumDPIRuleTemplateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumDPIRuleTemplateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CUSTOM_XML"/>
 *     &lt;enumeration value="SIGNATURE"/>
 *     &lt;enumeration value="START_END_PATTERNS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumDPIRuleTemplateType")
@XmlEnum
public enum EnumDPIRuleTemplateType {

    CUSTOM_XML,
    SIGNATURE,
    START_END_PATTERNS;

    public String value() {
        return name();
    }

    public static EnumDPIRuleTemplateType fromValue(String v) {
        return valueOf(v);
    }

}
