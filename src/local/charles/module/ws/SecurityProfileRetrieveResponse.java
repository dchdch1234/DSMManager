
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
 *         &lt;element name="securityProfileRetrieveReturn" type="{urn:Manager}SecurityProfileTransport"/>
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
    "securityProfileRetrieveReturn"
})
@XmlRootElement(name = "securityProfileRetrieveResponse")
public class SecurityProfileRetrieveResponse {

    @XmlElement(required = true)
    protected SecurityProfileTransport securityProfileRetrieveReturn;

    /**
     * Gets the value of the securityProfileRetrieveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityProfileTransport }
     *     
     */
    public SecurityProfileTransport getSecurityProfileRetrieveReturn() {
        return securityProfileRetrieveReturn;
    }

    /**
     * Sets the value of the securityProfileRetrieveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityProfileTransport }
     *     
     */
    public void setSecurityProfileRetrieveReturn(SecurityProfileTransport value) {
        this.securityProfileRetrieveReturn = value;
    }

}
