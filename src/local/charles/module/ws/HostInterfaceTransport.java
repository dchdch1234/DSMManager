
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostInterfaceTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostInterfaceTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}HostTransport">
 *       &lt;sequence>
 *         &lt;element name="dhcp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hostBridgeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="interfaceTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mac" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="virtualDeviceKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInterfaceTransport", propOrder = {
    "dhcp",
    "hostBridgeId",
    "interfaceTypeId",
    "mac",
    "notAvailable",
    "virtualDeviceKey"
})
public class HostInterfaceTransport
    extends HostTransport
{

    protected boolean dhcp;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer hostBridgeId;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer interfaceTypeId;
    @XmlElement(required = true, nillable = true)
    protected String mac;
    protected boolean notAvailable;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer virtualDeviceKey;

    /**
     * Gets the value of the dhcp property.
     * 
     */
    public boolean isDhcp() {
        return dhcp;
    }

    /**
     * Sets the value of the dhcp property.
     * 
     */
    public void setDhcp(boolean value) {
        this.dhcp = value;
    }

    /**
     * Gets the value of the hostBridgeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHostBridgeId() {
        return hostBridgeId;
    }

    /**
     * Sets the value of the hostBridgeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHostBridgeId(Integer value) {
        this.hostBridgeId = value;
    }

    /**
     * Gets the value of the interfaceTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterfaceTypeId() {
        return interfaceTypeId;
    }

    /**
     * Sets the value of the interfaceTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterfaceTypeId(Integer value) {
        this.interfaceTypeId = value;
    }

    /**
     * Gets the value of the mac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMac() {
        return mac;
    }

    /**
     * Sets the value of the mac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMac(String value) {
        this.mac = value;
    }

    /**
     * Gets the value of the notAvailable property.
     * 
     */
    public boolean isNotAvailable() {
        return notAvailable;
    }

    /**
     * Sets the value of the notAvailable property.
     * 
     */
    public void setNotAvailable(boolean value) {
        this.notAvailable = value;
    }

    /**
     * Gets the value of the virtualDeviceKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVirtualDeviceKey() {
        return virtualDeviceKey;
    }

    /**
     * Sets the value of the virtualDeviceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVirtualDeviceKey(Integer value) {
        this.virtualDeviceKey = value;
    }

}
