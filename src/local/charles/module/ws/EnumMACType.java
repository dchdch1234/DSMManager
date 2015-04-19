
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumMACType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumMACType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANY"/>
 *     &lt;enumeration value="MAC"/>
 *     &lt;enumeration value="DEFINED_LIST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumMACType")
@XmlEnum
public enum EnumMACType {

    ANY,
    MAC,
    DEFINED_LIST;

    public String value() {
        return name();
    }

    public static EnumMACType fromValue(String v) {
        return valueOf(v);
    }

}
