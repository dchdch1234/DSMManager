
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumSecurityProfileRecommendationState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumSecurityProfileRecommendationState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OFF"/>
 *     &lt;enumeration value="ONGOING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumSecurityProfileRecommendationState")
@XmlEnum
public enum EnumSecurityProfileRecommendationState {

    OFF,
    ONGOING;

    public String value() {
        return name();
    }

    public static EnumSecurityProfileRecommendationState fromValue(String v) {
        return valueOf(v);
    }

}
