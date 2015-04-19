
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumSecurityProfileLogInspectionState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumSecurityProfileLogInspectionState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ON"/>
 *     &lt;enumeration value="OFF"/>
 *     &lt;enumeration value="INHERITED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumSecurityProfileLogInspectionState")
@XmlEnum
public enum EnumSecurityProfileLogInspectionState {

    ON,
    OFF,
    INHERITED;

    public String value() {
        return name();
    }

    public static EnumSecurityProfileLogInspectionState fromValue(String v) {
        return valueOf(v);
    }

}
