
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumHostType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumHostType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STANDARD"/>
 *     &lt;enumeration value="ESX"/>
 *     &lt;enumeration value="APPLIANCE"/>
 *     &lt;enumeration value="VM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumHostType")
@XmlEnum
public enum EnumHostType {

    STANDARD,
    ESX,
    APPLIANCE,
    VM;

    public String value() {
        return name();
    }

    public static EnumHostType fromValue(String v) {
        return valueOf(v);
    }

}
