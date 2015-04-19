
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumEventOrigin.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumEventOrigin">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="AGENT"/>
 *     &lt;enumeration value="GUESTAGENT"/>
 *     &lt;enumeration value="APPLIANCEAGENT"/>
 *     &lt;enumeration value="MANAGER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumEventOrigin")
@XmlEnum
public enum EnumEventOrigin {

    UNKNOWN,
    AGENT,
    GUESTAGENT,
    APPLIANCEAGENT,
    MANAGER;

    public String value() {
        return name();
    }

    public static EnumEventOrigin fromValue(String v) {
        return valueOf(v);
    }

}
