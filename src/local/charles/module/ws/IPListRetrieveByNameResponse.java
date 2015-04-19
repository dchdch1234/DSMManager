
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
 *         &lt;element name="IPListRetrieveByNameReturn" type="{urn:Manager}IPListTransport"/>
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
    "ipListRetrieveByNameReturn"
})
@XmlRootElement(name = "IPListRetrieveByNameResponse")
public class IPListRetrieveByNameResponse {

    @XmlElement(name = "IPListRetrieveByNameReturn", required = true)
    protected IPListTransport ipListRetrieveByNameReturn;

    /**
     * Gets the value of the ipListRetrieveByNameReturn property.
     * 
     * @return
     *     possible object is
     *     {@link IPListTransport }
     *     
     */
    public IPListTransport getIPListRetrieveByNameReturn() {
        return ipListRetrieveByNameReturn;
    }

    /**
     * Sets the value of the ipListRetrieveByNameReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPListTransport }
     *     
     */
    public void setIPListRetrieveByNameReturn(IPListTransport value) {
        this.ipListRetrieveByNameReturn = value;
    }

}
