
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
 *         &lt;element name="integrityEventRetrieveReturn" type="{urn:Manager}IntegrityEventListTransport"/>
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
    "integrityEventRetrieveReturn"
})
@XmlRootElement(name = "integrityEventRetrieveResponse")
public class IntegrityEventRetrieveResponse {

    @XmlElement(required = true)
    protected IntegrityEventListTransport integrityEventRetrieveReturn;

    /**
     * Gets the value of the integrityEventRetrieveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrityEventListTransport }
     *     
     */
    public IntegrityEventListTransport getIntegrityEventRetrieveReturn() {
        return integrityEventRetrieveReturn;
    }

    /**
     * Sets the value of the integrityEventRetrieveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrityEventListTransport }
     *     
     */
    public void setIntegrityEventRetrieveReturn(IntegrityEventListTransport value) {
        this.integrityEventRetrieveReturn = value;
    }

}
