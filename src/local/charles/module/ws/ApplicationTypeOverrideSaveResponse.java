
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
 *         &lt;element name="applicationTypeOverrideSaveReturn" type="{urn:Manager}ApplicationTypeOverrideTransport"/>
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
    "applicationTypeOverrideSaveReturn"
})
@XmlRootElement(name = "applicationTypeOverrideSaveResponse")
public class ApplicationTypeOverrideSaveResponse {

    @XmlElement(required = true)
    protected ApplicationTypeOverrideTransport applicationTypeOverrideSaveReturn;

    /**
     * Gets the value of the applicationTypeOverrideSaveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationTypeOverrideTransport }
     *     
     */
    public ApplicationTypeOverrideTransport getApplicationTypeOverrideSaveReturn() {
        return applicationTypeOverrideSaveReturn;
    }

    /**
     * Sets the value of the applicationTypeOverrideSaveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationTypeOverrideTransport }
     *     
     */
    public void setApplicationTypeOverrideSaveReturn(ApplicationTypeOverrideTransport value) {
        this.applicationTypeOverrideSaveReturn = value;
    }

}
