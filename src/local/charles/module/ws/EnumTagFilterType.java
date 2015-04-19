
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumTagFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumTagFilterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="UNTAGGED"/>
 *     &lt;enumeration value="TAGS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumTagFilterType")
@XmlEnum
public enum EnumTagFilterType {

    ALL,
    UNTAGGED,
    TAGS;

    public String value() {
        return name();
    }

    public static EnumTagFilterType fromValue(String v) {
        return valueOf(v);
    }

}
