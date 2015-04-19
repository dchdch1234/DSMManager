
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
 *         &lt;element name="IPListRetrieveReturn" type="{urn:Manager}IPListTransport"/>
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
    "ipListRetrieveReturn"
})
@XmlRootElement(name = "IPListRetrieveResponse")
public class IPListRetrieveResponse {

    @XmlElement(name = "IPListRetrieveReturn", required = true)
    protected IPListTransport ipListRetrieveReturn;

    /**
     * Gets the value of the ipListRetrieveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link IPListTransport }
     *     
     */
    public IPListTransport getIPListRetrieveReturn() {
        return ipListRetrieveReturn;
    }

    /**
     * Sets the value of the ipListRetrieveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPListTransport }
     *     
     */
    public void setIPListRetrieveReturn(IPListTransport value) {
        this.ipListRetrieveReturn = value;
    }

}
