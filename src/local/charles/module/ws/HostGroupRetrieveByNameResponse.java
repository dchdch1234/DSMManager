
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
 *         &lt;element name="hostGroupRetrieveByNameReturn" type="{urn:Manager}HostGroupTransport"/>
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
    "hostGroupRetrieveByNameReturn"
})
@XmlRootElement(name = "hostGroupRetrieveByNameResponse")
public class HostGroupRetrieveByNameResponse {

    @XmlElement(required = true)
    protected HostGroupTransport hostGroupRetrieveByNameReturn;

    /**
     * Gets the value of the hostGroupRetrieveByNameReturn property.
     * 
     * @return
     *     possible object is
     *     {@link HostGroupTransport }
     *     
     */
    public HostGroupTransport getHostGroupRetrieveByNameReturn() {
        return hostGroupRetrieveByNameReturn;
    }

    /**
     * Sets the value of the hostGroupRetrieveByNameReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostGroupTransport }
     *     
     */
    public void setHostGroupRetrieveByNameReturn(HostGroupTransport value) {
        this.hostGroupRetrieveByNameReturn = value;
    }

}
