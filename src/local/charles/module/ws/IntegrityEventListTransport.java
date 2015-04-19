
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntegrityEventListTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntegrityEventListTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}TruncatableListTransport">
 *       &lt;sequence>
 *         &lt;element name="integrityEvents" type="{urn:Manager}ArrayOfIntegrityEventTransport"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegrityEventListTransport", propOrder = {
    "integrityEvents"
})
public class IntegrityEventListTransport
    extends TruncatableListTransport
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfIntegrityEventTransport integrityEvents;

    /**
     * Gets the value of the integrityEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIntegrityEventTransport }
     *     
     */
    public ArrayOfIntegrityEventTransport getIntegrityEvents() {
        return integrityEvents;
    }

    /**
     * Sets the value of the integrityEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIntegrityEventTransport }
     *     
     */
    public void setIntegrityEvents(ArrayOfIntegrityEventTransport value) {
        this.integrityEvents = value;
    }

}
