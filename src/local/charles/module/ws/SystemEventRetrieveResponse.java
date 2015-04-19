
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
 *         &lt;element name="systemEventRetrieveReturn" type="{urn:Manager}SystemEventListTransport"/>
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
    "systemEventRetrieveReturn"
})
@XmlRootElement(name = "systemEventRetrieveResponse")
public class SystemEventRetrieveResponse {

    @XmlElement(required = true)
    protected SystemEventListTransport systemEventRetrieveReturn;

    /**
     * Gets the value of the systemEventRetrieveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link SystemEventListTransport }
     *     
     */
    public SystemEventListTransport getSystemEventRetrieveReturn() {
        return systemEventRetrieveReturn;
    }

    /**
     * Sets the value of the systemEventRetrieveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemEventListTransport }
     *     
     */
    public void setSystemEventRetrieveReturn(SystemEventListTransport value) {
        this.systemEventRetrieveReturn = value;
    }

}
