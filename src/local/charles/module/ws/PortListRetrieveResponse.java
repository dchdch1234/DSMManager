
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
 *         &lt;element name="portListRetrieveReturn" type="{urn:Manager}PortListTransport"/>
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
    "portListRetrieveReturn"
})
@XmlRootElement(name = "portListRetrieveResponse")
public class PortListRetrieveResponse {

    @XmlElement(required = true)
    protected PortListTransport portListRetrieveReturn;

    /**
     * Gets the value of the portListRetrieveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link PortListTransport }
     *     
     */
    public PortListTransport getPortListRetrieveReturn() {
        return portListRetrieveReturn;
    }

    /**
     * Sets the value of the portListRetrieveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortListTransport }
     *     
     */
    public void setPortListRetrieveReturn(PortListTransport value) {
        this.portListRetrieveReturn = value;
    }

}
