
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DPIEventListTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DPIEventListTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}TruncatableListTransport">
 *       &lt;sequence>
 *         &lt;element name="DPIEvents" type="{urn:Manager}ArrayOfDPIEventTransport"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DPIEventListTransport", propOrder = {
    "dpiEvents"
})
public class DPIEventListTransport
    extends TruncatableListTransport
{

    @XmlElement(name = "DPIEvents", required = true, nillable = true)
    protected ArrayOfDPIEventTransport dpiEvents;

    /**
     * Gets the value of the dpiEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPIEventTransport }
     *     
     */
    public ArrayOfDPIEventTransport getDPIEvents() {
        return dpiEvents;
    }

    /**
     * Sets the value of the dpiEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPIEventTransport }
     *     
     */
    public void setDPIEvents(ArrayOfDPIEventTransport value) {
        this.dpiEvents = value;
    }

}
