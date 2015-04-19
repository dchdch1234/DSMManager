
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
 *         &lt;element name="hostRetrieveReturn" type="{urn:Manager}HostTransport"/>
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
    "hostRetrieveReturn"
})
@XmlRootElement(name = "hostRetrieveResponse")
public class HostRetrieveResponse {

    @XmlElement(required = true)
    protected HostTransport hostRetrieveReturn;

    /**
     * Gets the value of the hostRetrieveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link HostTransport }
     *     
     */
    public HostTransport getHostRetrieveReturn() {
        return hostRetrieveReturn;
    }

    /**
     * Sets the value of the hostRetrieveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostTransport }
     *     
     */
    public void setHostRetrieveReturn(HostTransport value) {
        this.hostRetrieveReturn = value;
    }

}
