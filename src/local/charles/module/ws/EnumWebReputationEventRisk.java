
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumWebReputationEventRisk.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumWebReputationEventRisk">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUSPICIOUS"/>
 *     &lt;enumeration value="HIGHLYSUSPICIOUS"/>
 *     &lt;enumeration value="DANGEROUS"/>
 *     &lt;enumeration value="UNTESTED"/>
 *     &lt;enumeration value="BLOCKEDBYADMINISTRATOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumWebReputationEventRisk")
@XmlEnum
public enum EnumWebReputationEventRisk {

    SUSPICIOUS,
    HIGHLYSUSPICIOUS,
    DANGEROUS,
    UNTESTED,
    BLOCKEDBYADMINISTRATOR;

    public String value() {
        return name();
    }

    public static EnumWebReputationEventRisk fromValue(String v) {
        return valueOf(v);
    }

}
