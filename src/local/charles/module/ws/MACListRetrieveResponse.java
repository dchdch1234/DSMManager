
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
 *         &lt;element name="MACListRetrieveReturn" type="{urn:Manager}MACListTransport"/>
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
    "macListRetrieveReturn"
})
@XmlRootElement(name = "MACListRetrieveResponse")
public class MACListRetrieveResponse {

    @XmlElement(name = "MACListRetrieveReturn", required = true)
    protected MACListTransport macListRetrieveReturn;

    /**
     * Gets the value of the macListRetrieveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link MACListTransport }
     *     
     */
    public MACListTransport getMACListRetrieveReturn() {
        return macListRetrieveReturn;
    }

    /**
     * Sets the value of the macListRetrieveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MACListTransport }
     *     
     */
    public void setMACListRetrieveReturn(MACListTransport value) {
        this.macListRetrieveReturn = value;
    }

}
