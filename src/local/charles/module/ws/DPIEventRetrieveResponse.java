
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
 *         &lt;element name="DPIEventRetrieveReturn" type="{urn:Manager}DPIEventListTransport"/>
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
    "dpiEventRetrieveReturn"
})
@XmlRootElement(name = "DPIEventRetrieveResponse")
public class DPIEventRetrieveResponse {

    @XmlElement(name = "DPIEventRetrieveReturn", required = true)
    protected DPIEventListTransport dpiEventRetrieveReturn;

    /**
     * Gets the value of the dpiEventRetrieveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link DPIEventListTransport }
     *     
     */
    public DPIEventListTransport getDPIEventRetrieveReturn() {
        return dpiEventRetrieveReturn;
    }

    /**
     * Sets the value of the dpiEventRetrieveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DPIEventListTransport }
     *     
     */
    public void setDPIEventRetrieveReturn(DPIEventListTransport value) {
        this.dpiEventRetrieveReturn = value;
    }

}
