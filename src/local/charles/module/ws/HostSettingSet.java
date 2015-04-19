
package local.charles.module.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hostID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="editableSettings" type="{urn:Manager}EditableSettingTransport" maxOccurs="unbounded"/>
 *         &lt;element name="sID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hostID",
    "editableSettings",
    "sid"
})
@XmlRootElement(name = "hostSettingSet")
public class HostSettingSet {

    protected int hostID;
    @XmlElement(required = true)
    protected List<EditableSettingTransport> editableSettings;
    @XmlElement(name = "sID", required = true)
    protected String sid;

    /**
     * Gets the value of the hostID property.
     * 
     */
    public int getHostID() {
        return hostID;
    }

    /**
     * Sets the value of the hostID property.
     * 
     */
    public void setHostID(int value) {
        this.hostID = value;
    }

    /**
     * Gets the value of the editableSettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the editableSettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEditableSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EditableSettingTransport }
     * 
     * 
     */
    public List<EditableSettingTransport> getEditableSettings() {
        if (editableSettings == null) {
            editableSettings = new ArrayList<EditableSettingTransport>();
        }
        return this.editableSettings;
    }

    /**
     * Gets the value of the sid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSID() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSID(String value) {
        this.sid = value;
    }

}
