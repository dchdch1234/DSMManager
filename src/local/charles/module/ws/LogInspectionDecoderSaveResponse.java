
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
 *         &lt;element name="logInspectionDecoderSaveReturn" type="{urn:Manager}LogInspectionDecoderTransport"/>
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
    "logInspectionDecoderSaveReturn"
})
@XmlRootElement(name = "logInspectionDecoderSaveResponse")
public class LogInspectionDecoderSaveResponse {

    @XmlElement(required = true)
    protected LogInspectionDecoderTransport logInspectionDecoderSaveReturn;

    /**
     * Gets the value of the logInspectionDecoderSaveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link LogInspectionDecoderTransport }
     *     
     */
    public LogInspectionDecoderTransport getLogInspectionDecoderSaveReturn() {
        return logInspectionDecoderSaveReturn;
    }

    /**
     * Sets the value of the logInspectionDecoderSaveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogInspectionDecoderTransport }
     *     
     */
    public void setLogInspectionDecoderSaveReturn(LogInspectionDecoderTransport value) {
        this.logInspectionDecoderSaveReturn = value;
    }

}
