
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
 *         &lt;element name="firewallRuleRetrieveReturn" type="{urn:Manager}FirewallRuleTransport"/>
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
    "firewallRuleRetrieveReturn"
})
@XmlRootElement(name = "firewallRuleRetrieveResponse")
public class FirewallRuleRetrieveResponse {

    @XmlElement(required = true)
    protected FirewallRuleTransport firewallRuleRetrieveReturn;

    /**
     * Gets the value of the firewallRuleRetrieveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link FirewallRuleTransport }
     *     
     */
    public FirewallRuleTransport getFirewallRuleRetrieveReturn() {
        return firewallRuleRetrieveReturn;
    }

    /**
     * Sets the value of the firewallRuleRetrieveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirewallRuleTransport }
     *     
     */
    public void setFirewallRuleRetrieveReturn(FirewallRuleTransport value) {
        this.firewallRuleRetrieveReturn = value;
    }

}
