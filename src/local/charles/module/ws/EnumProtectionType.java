
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumProtectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumProtectionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="AGENT"/>
 *     &lt;enumeration value="APPLIANCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumProtectionType")
@XmlEnum
public enum EnumProtectionType {

    NONE,
    AGENT,
    APPLIANCE;

    public String value() {
        return name();
    }

    public static EnumProtectionType fromValue(String v) {
        return valueOf(v);
    }

}
