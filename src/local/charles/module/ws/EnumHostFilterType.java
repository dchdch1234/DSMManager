
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumHostFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumHostFilterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL_HOSTS"/>
 *     &lt;enumeration value="HOSTS_IN_GROUP"/>
 *     &lt;enumeration value="HOSTS_USING_SECURITY_PROFILE"/>
 *     &lt;enumeration value="HOSTS_IN_GROUP_AND_ALL_SUBGROUPS"/>
 *     &lt;enumeration value="SPECIFIC_HOST"/>
 *     &lt;enumeration value="MY_HOSTS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumHostFilterType")
@XmlEnum
public enum EnumHostFilterType {

    ALL_HOSTS,
    HOSTS_IN_GROUP,
    HOSTS_USING_SECURITY_PROFILE,
    HOSTS_IN_GROUP_AND_ALL_SUBGROUPS,
    SPECIFIC_HOST,
    MY_HOSTS;

    public String value() {
        return name();
    }

    public static EnumHostFilterType fromValue(String v) {
        return valueOf(v);
    }

}
