
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GREATER_THAN"/>
 *     &lt;enumeration value="LESS_THAN"/>
 *     &lt;enumeration value="EQUAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumOperator")
@XmlEnum
public enum EnumOperator {

    GREATER_THAN,
    LESS_THAN,
    EQUAL;

    public String value() {
        return name();
    }

    public static EnumOperator fromValue(String v) {
        return valueOf(v);
    }

}
