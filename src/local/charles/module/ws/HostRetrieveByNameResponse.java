
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
 *         &lt;element name="hostRetrieveByNameReturn" type="{urn:Manager}HostTransport"/>
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
    "hostRetrieveByNameReturn"
})
@XmlRootElement(name = "hostRetrieveByNameResponse")
public class HostRetrieveByNameResponse {

    @XmlElement(required = true)
    protected HostTransport hostRetrieveByNameReturn;

    /**
     * Gets the value of the hostRetrieveByNameReturn property.
     * 
     * @return
     *     possible object is
     *     {@link HostTransport }
     *     
     */
    public HostTransport getHostRetrieveByNameReturn() {
        return hostRetrieveByNameReturn;
    }

    /**
     * Sets the value of the hostRetrieveByNameReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostTransport }
     *     
     */
    public void setHostRetrieveByNameReturn(HostTransport value) {
        this.hostRetrieveByNameReturn = value;
    }

}
