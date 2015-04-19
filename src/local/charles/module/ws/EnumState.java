
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEUTRAL"/>
 *     &lt;enumeration value="VM_STOPPED"/>
 *     &lt;enumeration value="VM_PAUSED"/>
 *     &lt;enumeration value="STANDBY"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="INSTALLED"/>
 *     &lt;enumeration value="HAS_DSM_CERT"/>
 *     &lt;enumeration value="ACTIVATED"/>
 *     &lt;enumeration value="OTHER_DSM_AGENT"/>
 *     &lt;enumeration value="OFFLINE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumState")
@XmlEnum
public enum EnumState {

    NEUTRAL,
    VM_STOPPED,
    VM_PAUSED,
    STANDBY,
    UNKNOWN,
    NONE,
    INSTALLED,
    HAS_DSM_CERT,
    ACTIVATED,
    OTHER_DSM_AGENT,
    OFFLINE;

    public String value() {
        return name();
    }

    public static EnumState fromValue(String v) {
        return valueOf(v);
    }

}
