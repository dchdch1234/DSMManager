
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditableSettingStoredTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditableSettingStoredTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}EditableSettingTransport">
 *       &lt;sequence>
 *         &lt;element name="settingScope" type="{urn:Manager}EnumEditableSettingStoredScope"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditableSettingStoredTransport", propOrder = {
    "settingScope"
})
public class EditableSettingStoredTransport
    extends EditableSettingTransport
{

    @XmlElement(required = true, nillable = true)
    protected EnumEditableSettingStoredScope settingScope;

    /**
     * Gets the value of the settingScope property.
     * 
     * @return
     *     possible object is
     *     {@link EnumEditableSettingStoredScope }
     *     
     */
    public EnumEditableSettingStoredScope getSettingScope() {
        return settingScope;
    }

    /**
     * Sets the value of the settingScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumEditableSettingStoredScope }
     *     
     */
    public void setSettingScope(EnumEditableSettingStoredScope value) {
        this.settingScope = value;
    }

}
