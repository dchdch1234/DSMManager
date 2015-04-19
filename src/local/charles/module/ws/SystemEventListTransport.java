
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemEventListTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemEventListTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}TruncatableListTransport">
 *       &lt;sequence>
 *         &lt;element name="systemEvents" type="{urn:Manager}ArrayOfSystemEventTransport"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemEventListTransport", propOrder = {
    "systemEvents"
})
public class SystemEventListTransport
    extends TruncatableListTransport
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfSystemEventTransport systemEvents;

    /**
     * Gets the value of the systemEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSystemEventTransport }
     *     
     */
    public ArrayOfSystemEventTransport getSystemEvents() {
        return systemEvents;
    }

    /**
     * Sets the value of the systemEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSystemEventTransport }
     *     
     */
    public void setSystemEvents(ArrayOfSystemEventTransport value) {
        this.systemEvents = value;
    }

}
