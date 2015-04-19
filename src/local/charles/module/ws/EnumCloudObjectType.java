
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumCloudObjectType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumCloudObjectType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AMAZON_VM"/>
 *     &lt;enumeration value="VCLOUD_VM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumCloudObjectType")
@XmlEnum
public enum EnumCloudObjectType {

    AMAZON_VM,
    VCLOUD_VM;

    public String value() {
        return name();
    }

    public static EnumCloudObjectType fromValue(String v) {
        return valueOf(v);
    }

}
