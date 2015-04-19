
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumCompareResults.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumCompareResults">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LESS_THAN"/>
 *     &lt;enumeration value="EQUAL_TO"/>
 *     &lt;enumeration value="GREATER_THAN"/>
 *     &lt;enumeration value="INCOMPATABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumCompareResults")
@XmlEnum
public enum EnumCompareResults {

    LESS_THAN,
    EQUAL_TO,
    GREATER_THAN,
    INCOMPATABLE;

    public String value() {
        return name();
    }

    public static EnumCompareResults fromValue(String v) {
        return valueOf(v);
    }

}
