
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
 *         &lt;element name="logInspectionDecoderRetrieveByNameReturn" type="{urn:Manager}LogInspectionDecoderTransport"/>
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
    "logInspectionDecoderRetrieveByNameReturn"
})
@XmlRootElement(name = "logInspectionDecoderRetrieveByNameResponse")
public class LogInspectionDecoderRetrieveByNameResponse {

    @XmlElement(required = true)
    protected LogInspectionDecoderTransport logInspectionDecoderRetrieveByNameReturn;

    /**
     * Gets the value of the logInspectionDecoderRetrieveByNameReturn property.
     * 
     * @return
     *     possible object is
     *     {@link LogInspectionDecoderTransport }
     *     
     */
    public LogInspectionDecoderTransport getLogInspectionDecoderRetrieveByNameReturn() {
        return logInspectionDecoderRetrieveByNameReturn;
    }

    /**
     * Sets the value of the logInspectionDecoderRetrieveByNameReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogInspectionDecoderTransport }
     *     
     */
    public void setLogInspectionDecoderRetrieveByNameReturn(LogInspectionDecoderTransport value) {
        this.logInspectionDecoderRetrieveByNameReturn = value;
    }

}
