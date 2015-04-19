
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TruncatableListTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TruncatableListTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}TransportObject">
 *       &lt;sequence>
 *         &lt;element name="truncated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TruncatableListTransport", propOrder = {
    "truncated"
})
@XmlSeeAlso({
    FirewallEventListTransport.class,
    IntegrityEventListTransport.class,
    DPIEventListTransport.class,
    LogInspectionEventListTransport.class,
    WebReputationEventListTransport.class,
    AntiMalwareEventListTransport.class,
    SystemEventListTransport.class
})
public class TruncatableListTransport
    extends TransportObject
{

    protected boolean truncated;

    /**
     * Gets the value of the truncated property.
     * 
     */
    public boolean isTruncated() {
        return truncated;
    }

    /**
     * Sets the value of the truncated property.
     * 
     */
    public void setTruncated(boolean value) {
        this.truncated = value;
    }

}
