
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FirewallEventListTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FirewallEventListTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}TruncatableListTransport">
 *       &lt;sequence>
 *         &lt;element name="firewallEvents" type="{urn:Manager}ArrayOfFirewallEventTransport"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FirewallEventListTransport", propOrder = {
    "firewallEvents"
})
public class FirewallEventListTransport
    extends TruncatableListTransport
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfFirewallEventTransport firewallEvents;

    /**
     * Gets the value of the firewallEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFirewallEventTransport }
     *     
     */
    public ArrayOfFirewallEventTransport getFirewallEvents() {
        return firewallEvents;
    }

    /**
     * Sets the value of the firewallEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFirewallEventTransport }
     *     
     */
    public void setFirewallEvents(ArrayOfFirewallEventTransport value) {
        this.firewallEvents = value;
    }

}
