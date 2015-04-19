
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditableSettingTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditableSettingTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}TransportObject">
 *       &lt;sequence>
 *         &lt;element name="settingKey" type="{urn:Manager}EnumEditableSettingKey"/>
 *         &lt;element name="settingUnit" type="{urn:Manager}EnumEditableSettingUnit"/>
 *         &lt;element name="settingValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditableSettingTransport", propOrder = {
    "settingKey",
    "settingUnit",
    "settingValue"
})
@XmlSeeAlso({
    EditableSettingStoredTransport.class
})
public class EditableSettingTransport
    extends TransportObject
{

    @XmlElement(required = true, nillable = true)
    protected String settingKey;
    @XmlElement(required = true, nillable = true)
    protected EnumEditableSettingUnit settingUnit;
    @XmlElement(required = true, nillable = true)
    protected String settingValue;

    /**
     * Gets the value of the settingKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettingKey() {
        return settingKey;
    }

    /**
     * Sets the value of the settingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettingKey(String value) {
        this.settingKey = value;
    }

    /**
     * Gets the value of the settingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link EnumEditableSettingUnit }
     *     
     */
    public EnumEditableSettingUnit getSettingUnit() {
        return settingUnit;
    }

    /**
     * Sets the value of the settingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumEditableSettingUnit }
     *     
     */
    public void setSettingUnit(EnumEditableSettingUnit value) {
        this.settingUnit = value;
    }

    /**
     * Gets the value of the settingValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettingValue() {
        return settingValue;
    }

    /**
     * Sets the value of the settingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettingValue(String value) {
        this.settingValue = value;
    }

}
