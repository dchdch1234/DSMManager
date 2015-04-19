
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CounterHostTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CounterHostTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}CounterTransport">
 *       &lt;sequence>
 *         &lt;element name="hostID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterHostTransport", propOrder = {
    "hostID",
    "icon"
})
public class CounterHostTransport
    extends CounterTransport
{

    protected int hostID;
    @XmlElement(required = true, nillable = true)
    protected String icon;

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
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcon(String value) {
        this.icon = value;
    }

}
