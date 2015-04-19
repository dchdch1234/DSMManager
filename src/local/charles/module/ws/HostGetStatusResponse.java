
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
 *         &lt;element name="hostGetStatusReturn" type="{urn:Manager}HostStatusTransport"/>
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
    "hostGetStatusReturn"
})
@XmlRootElement(name = "hostGetStatusResponse")
public class HostGetStatusResponse {

    @XmlElement(required = true)
    protected HostStatusTransport hostGetStatusReturn;

    /**
     * Gets the value of the hostGetStatusReturn property.
     * 
     * @return
     *     possible object is
     *     {@link HostStatusTransport }
     *     
     */
    public HostStatusTransport getHostGetStatusReturn() {
        return hostGetStatusReturn;
    }

    /**
     * Sets the value of the hostGetStatusReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostStatusTransport }
     *     
     */
    public void setHostGetStatusReturn(HostStatusTransport value) {
        this.hostGetStatusReturn = value;
    }

}
