
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumDirection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INCOMING"/>
 *     &lt;enumeration value="OUTGOING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumDirection")
@XmlEnum
public enum EnumDirection {

    INCOMING,
    OUTGOING;

    public String value() {
        return name();
    }

    public static EnumDirection fromValue(String v) {
        return valueOf(v);
    }

}
