
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumPortType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumPortType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANY"/>
 *     &lt;enumeration value="PORTS"/>
 *     &lt;enumeration value="DEFINED_LIST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumPortType")
@XmlEnum
public enum EnumPortType {

    ANY,
    PORTS,
    DEFINED_LIST;

    public String value() {
        return name();
    }

    public static EnumPortType fromValue(String v) {
        return valueOf(v);
    }

}
