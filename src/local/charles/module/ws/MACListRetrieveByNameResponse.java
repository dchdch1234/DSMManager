
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
 *         &lt;element name="MACListRetrieveByNameReturn" type="{urn:Manager}MACListTransport"/>
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
    "macListRetrieveByNameReturn"
})
@XmlRootElement(name = "MACListRetrieveByNameResponse")
public class MACListRetrieveByNameResponse {

    @XmlElement(name = "MACListRetrieveByNameReturn", required = true)
    protected MACListTransport macListRetrieveByNameReturn;

    /**
     * Gets the value of the macListRetrieveByNameReturn property.
     * 
     * @return
     *     possible object is
     *     {@link MACListTransport }
     *     
     */
    public MACListTransport getMACListRetrieveByNameReturn() {
        return macListRetrieveByNameReturn;
    }

    /**
     * Sets the value of the macListRetrieveByNameReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MACListTransport }
     *     
     */
    public void setMACListRetrieveByNameReturn(MACListTransport value) {
        this.macListRetrieveByNameReturn = value;
    }

}
