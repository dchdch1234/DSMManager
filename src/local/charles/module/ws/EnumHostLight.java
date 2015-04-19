
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumHostLight.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumHostLight">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GREEN"/>
 *     &lt;enumeration value="YELLOW"/>
 *     &lt;enumeration value="RED"/>
 *     &lt;enumeration value="GREY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumHostLight")
@XmlEnum
public enum EnumHostLight {

    GREEN,
    YELLOW,
    RED,
    GREY;

    public String value() {
        return name();
    }

    public static EnumHostLight fromValue(String v) {
        return valueOf(v);
    }

}
