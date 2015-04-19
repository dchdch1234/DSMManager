
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogInspectionEventListTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogInspectionEventListTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}TruncatableListTransport">
 *       &lt;sequence>
 *         &lt;element name="logInspectionEvents" type="{urn:Manager}ArrayOfLogInspectionEventTransport"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogInspectionEventListTransport", propOrder = {
    "logInspectionEvents"
})
public class LogInspectionEventListTransport
    extends TruncatableListTransport
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfLogInspectionEventTransport logInspectionEvents;

    /**
     * Gets the value of the logInspectionEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLogInspectionEventTransport }
     *     
     */
    public ArrayOfLogInspectionEventTransport getLogInspectionEvents() {
        return logInspectionEvents;
    }

    /**
     * Sets the value of the logInspectionEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLogInspectionEventTransport }
     *     
     */
    public void setLogInspectionEvents(ArrayOfLogInspectionEventTransport value) {
        this.logInspectionEvents = value;
    }

}
