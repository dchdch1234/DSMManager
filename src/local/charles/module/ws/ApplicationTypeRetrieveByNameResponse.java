
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
 *         &lt;element name="applicationTypeRetrieveByNameReturn" type="{urn:Manager}ApplicationTypeTransport"/>
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
    "applicationTypeRetrieveByNameReturn"
})
@XmlRootElement(name = "applicationTypeRetrieveByNameResponse")
public class ApplicationTypeRetrieveByNameResponse {

    @XmlElement(required = true)
    protected ApplicationTypeTransport applicationTypeRetrieveByNameReturn;

    /**
     * Gets the value of the applicationTypeRetrieveByNameReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationTypeTransport }
     *     
     */
    public ApplicationTypeTransport getApplicationTypeRetrieveByNameReturn() {
        return applicationTypeRetrieveByNameReturn;
    }

    /**
     * Sets the value of the applicationTypeRetrieveByNameReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationTypeTransport }
     *     
     */
    public void setApplicationTypeRetrieveByNameReturn(ApplicationTypeTransport value) {
        this.applicationTypeRetrieveByNameReturn = value;
    }

}