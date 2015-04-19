
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumEditableSettingStoredScope.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumEditableSettingStoredScope">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HOST"/>
 *     &lt;enumeration value="PROFILE"/>
 *     &lt;enumeration value="SYSTEM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumEditableSettingStoredScope")
@XmlEnum
public enum EnumEditableSettingStoredScope {

    HOST,
    PROFILE,
    SYSTEM;

    public String value() {
        return name();
    }

    public static EnumEditableSettingStoredScope fromValue(String v) {
        return valueOf(v);
    }

}
