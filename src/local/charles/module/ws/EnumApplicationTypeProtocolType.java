
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumApplicationTypeProtocolType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumApplicationTypeProtocolType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ICMP"/>
 *     &lt;enumeration value="TCP"/>
 *     &lt;enumeration value="UDP"/>
 *     &lt;enumeration value="TCP_UDP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumApplicationTypeProtocolType")
@XmlEnum
public enum EnumApplicationTypeProtocolType {

    ICMP,
    TCP,
    UDP,
    TCP_UDP;

    public String value() {
        return name();
    }

    public static EnumApplicationTypeProtocolType fromValue(String v) {
        return valueOf(v);
    }

}
