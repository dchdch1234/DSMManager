
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumTimeFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumTimeFilterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LAST_HOUR"/>
 *     &lt;enumeration value="LAST_24_HOURS"/>
 *     &lt;enumeration value="LAST_7_DAYS"/>
 *     &lt;enumeration value="CUSTOM_RANGE"/>
 *     &lt;enumeration value="SPECIFIC_TIME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumTimeFilterType")
@XmlEnum
public enum EnumTimeFilterType {

    LAST_HOUR,
    LAST_24_HOURS,
    LAST_7_DAYS,
    CUSTOM_RANGE,
    SPECIFIC_TIME;

    public String value() {
        return name();
    }

    public static EnumTimeFilterType fromValue(String v) {
        return valueOf(v);
    }

}
