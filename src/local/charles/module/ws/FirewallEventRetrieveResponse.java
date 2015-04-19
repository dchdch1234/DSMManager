
package local.charles.module.ws;

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
 *         &lt;element name="firewallEventRetrieveReturn" type="{urn:Manager}FirewallEventListTransport"/>
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
    "firewallEventRetrieveReturn"
})
@XmlRootElement(name = "firewallEventRetrieveResponse")
public class FirewallEventRetrieveResponse {

    @XmlElement(required = true)
    protected FirewallEventListTransport firewallEventRetrieveReturn;

    /**
     * Gets the value of the firewallEventRetrieveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link FirewallEventListTransport }
     *     
     */
    public FirewallEventListTransport getFirewallEventRetrieveReturn() {
        return firewallEventRetrieveReturn;
    }

    /**
     * Sets the value of the firewallEventRetrieveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirewallEventListTransport }
     *     
     */
    public void setFirewallEventRetrieveReturn(FirewallEventListTransport value) {
        this.firewallEventRetrieveReturn = value;
    }

}
