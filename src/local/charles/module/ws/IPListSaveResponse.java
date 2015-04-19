
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
 *         &lt;element name="IPListSaveReturn" type="{urn:Manager}IPListTransport"/>
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
    "ipListSaveReturn"
})
@XmlRootElement(name = "IPListSaveResponse")
public class IPListSaveResponse {

    @XmlElement(name = "IPListSaveReturn", required = true)
    protected IPListTransport ipListSaveReturn;

    /**
     * Gets the value of the ipListSaveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link IPListTransport }
     *     
     */
    public IPListTransport getIPListSaveReturn() {
        return ipListSaveReturn;
    }

    /**
     * Sets the value of the ipListSaveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPListTransport }
     *     
     */
    public void setIPListSaveReturn(IPListTransport value) {
        this.ipListSaveReturn = value;
    }

}
