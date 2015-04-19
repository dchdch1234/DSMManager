
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumEditableSettingUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumEditableSettingUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IPLIST_ID"/>
 *     &lt;enumeration value="PORTLIST_ID"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="SECONDS"/>
 *     &lt;enumeration value="MINUTES"/>
 *     &lt;enumeration value="HOURS"/>
 *     &lt;enumeration value="DAYS"/>
 *     &lt;enumeration value="WEEKS"/>
 *     &lt;enumeration value="MONTHS"/>
 *     &lt;enumeration value="YEARS"/>
 *     &lt;enumeration value="KBYTES"/>
 *     &lt;enumeration value="PERCENT"/>
 *     &lt;enumeration value="PORT"/>
 *     &lt;enumeration value="HOST"/>
 *     &lt;enumeration value="EMAIL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumEditableSettingUnit")
@XmlEnum
public enum EnumEditableSettingUnit {

    IPLIST_ID,
    PORTLIST_ID,
    NONE,
    SECONDS,
    MINUTES,
    HOURS,
    DAYS,
    WEEKS,
    MONTHS,
    YEARS,
    KBYTES,
    PERCENT,
    PORT,
    HOST,
    EMAIL;

    public String value() {
        return name();
    }

    public static EnumEditableSettingUnit fromValue(String v) {
        return valueOf(v);
    }

}
