
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumExternalFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumExternalFilterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL_EXT_HOSTS"/>
 *     &lt;enumeration value="HOSTS_IN_EXT_GROUP"/>
 *     &lt;enumeration value="HOSTS_IN_EXT_GROUP_AND_ALL_SUBGROUPS"/>
 *     &lt;enumeration value="SPECIFIC_EXT_HOST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumExternalFilterType")
@XmlEnum
public enum EnumExternalFilterType {

    ALL_EXT_HOSTS,
    HOSTS_IN_EXT_GROUP,
    HOSTS_IN_EXT_GROUP_AND_ALL_SUBGROUPS,
    SPECIFIC_EXT_HOST;

    public String value() {
        return name();
    }

    public static EnumExternalFilterType fromValue(String v) {
        return valueOf(v);
    }

}
