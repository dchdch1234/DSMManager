
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
 *         &lt;element name="webReputationEventRetrieveReturn" type="{urn:Manager}WebReputationEventListTransport"/>
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
    "webReputationEventRetrieveReturn"
})
@XmlRootElement(name = "webReputationEventRetrieveResponse")
public class WebReputationEventRetrieveResponse {

    @XmlElement(required = true)
    protected WebReputationEventListTransport webReputationEventRetrieveReturn;

    /**
     * Gets the value of the webReputationEventRetrieveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link WebReputationEventListTransport }
     *     
     */
    public WebReputationEventListTransport getWebReputationEventRetrieveReturn() {
        return webReputationEventRetrieveReturn;
    }

    /**
     * Sets the value of the webReputationEventRetrieveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebReputationEventListTransport }
     *     
     */
    public void setWebReputationEventRetrieveReturn(WebReputationEventListTransport value) {
        this.webReputationEventRetrieveReturn = value;
    }

}
