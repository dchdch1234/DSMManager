
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumSecurityUpdateAppliedState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumSecurityUpdateAppliedState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPLIED"/>
 *     &lt;enumeration value="APPLIED_CURRENT"/>
 *     &lt;enumeration value="NOT_APPLIED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumSecurityUpdateAppliedState")
@XmlEnum
public enum EnumSecurityUpdateAppliedState {

    APPLIED,
    APPLIED_CURRENT,
    NOT_APPLIED;

    public String value() {
        return name();
    }

    public static EnumSecurityUpdateAppliedState fromValue(String v) {
        return valueOf(v);
    }

}
