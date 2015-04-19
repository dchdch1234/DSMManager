
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
 *         &lt;element name="portListRetrieveByNameReturn" type="{urn:Manager}PortListTransport"/>
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
    "portListRetrieveByNameReturn"
})
@XmlRootElement(name = "portListRetrieveByNameResponse")
public class PortListRetrieveByNameResponse {

    @XmlElement(required = true)
    protected PortListTransport portListRetrieveByNameReturn;

    /**
     * Gets the value of the portListRetrieveByNameReturn property.
     * 
     * @return
     *     possible object is
     *     {@link PortListTransport }
     *     
     */
    public PortListTransport getPortListRetrieveByNameReturn() {
        return portListRetrieveByNameReturn;
    }

    /**
     * Sets the value of the portListRetrieveByNameReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortListTransport }
     *     
     */
    public void setPortListRetrieveByNameReturn(PortListTransport value) {
        this.portListRetrieveByNameReturn = value;
    }

}
