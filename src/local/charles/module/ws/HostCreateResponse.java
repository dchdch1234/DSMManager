
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
 *         &lt;element name="hostCreateReturn" type="{urn:Manager}HostTransport"/>
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
    "hostCreateReturn"
})
@XmlRootElement(name = "hostCreateResponse")
public class HostCreateResponse {

    @XmlElement(required = true)
    protected HostTransport hostCreateReturn;

    /**
     * Gets the value of the hostCreateReturn property.
     * 
     * @return
     *     possible object is
     *     {@link HostTransport }
     *     
     */
    public HostTransport getHostCreateReturn() {
        return hostCreateReturn;
    }

    /**
     * Sets the value of the hostCreateReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostTransport }
     *     
     */
    public void setHostCreateReturn(HostTransport value) {
        this.hostCreateReturn = value;
    }

}
