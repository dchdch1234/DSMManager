
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebReputationEventListTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebReputationEventListTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}TruncatableListTransport">
 *       &lt;sequence>
 *         &lt;element name="webReputationEvents" type="{urn:Manager}ArrayOfWebReputationEventTransport"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebReputationEventListTransport", propOrder = {
    "webReputationEvents"
})
public class WebReputationEventListTransport
    extends TruncatableListTransport
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfWebReputationEventTransport webReputationEvents;

    /**
     * Gets the value of the webReputationEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWebReputationEventTransport }
     *     
     */
    public ArrayOfWebReputationEventTransport getWebReputationEvents() {
        return webReputationEvents;
    }

    /**
     * Sets the value of the webReputationEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWebReputationEventTransport }
     *     
     */
    public void setWebReputationEvents(ArrayOfWebReputationEventTransport value) {
        this.webReputationEvents = value;
    }

}
