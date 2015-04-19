
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostStatusSummaryTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostStatusSummaryTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}TransportObject">
 *       &lt;sequence>
 *         &lt;element name="criticalHosts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lockedHosts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="onlineHosts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="unmanageHosts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="warningHosts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostStatusSummaryTransport", propOrder = {
    "criticalHosts",
    "lockedHosts",
    "onlineHosts",
    "unmanageHosts",
    "warningHosts"
})
public class HostStatusSummaryTransport
    extends TransportObject
{

    protected int criticalHosts;
    protected int lockedHosts;
    protected int onlineHosts;
    protected int unmanageHosts;
    protected int warningHosts;

    /**
     * Gets the value of the criticalHosts property.
     * 
     */
    public int getCriticalHosts() {
        return criticalHosts;
    }

    /**
     * Sets the value of the criticalHosts property.
     * 
     */
    public void setCriticalHosts(int value) {
        this.criticalHosts = value;
    }

    /**
     * Gets the value of the lockedHosts property.
     * 
     */
    public int getLockedHosts() {
        return lockedHosts;
    }

    /**
     * Sets the value of the lockedHosts property.
     * 
     */
    public void setLockedHosts(int value) {
        this.lockedHosts = value;
    }

    /**
     * Gets the value of the onlineHosts property.
     * 
     */
    public int getOnlineHosts() {
        return onlineHosts;
    }

    /**
     * Sets the value of the onlineHosts property.
     * 
     */
    public void setOnlineHosts(int value) {
        this.onlineHosts = value;
    }

    /**
     * Gets the value of the unmanageHosts property.
     * 
     */
    public int getUnmanageHosts() {
        return unmanageHosts;
    }

    /**
     * Sets the value of the unmanageHosts property.
     * 
     */
    public void setUnmanageHosts(int value) {
        this.unmanageHosts = value;
    }

    /**
     * Gets the value of the warningHosts property.
     * 
     */
    public int getWarningHosts() {
        return warningHosts;
    }

    /**
     * Sets the value of the warningHosts property.
     * 
     */
    public void setWarningHosts(int value) {
        this.warningHosts = value;
    }

}
