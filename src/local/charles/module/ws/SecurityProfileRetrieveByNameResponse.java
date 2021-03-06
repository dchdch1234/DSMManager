
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
 *         &lt;element name="securityProfileRetrieveByNameReturn" type="{urn:Manager}SecurityProfileTransport"/>
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
    "securityProfileRetrieveByNameReturn"
})
@XmlRootElement(name = "securityProfileRetrieveByNameResponse")
public class SecurityProfileRetrieveByNameResponse {

    @XmlElement(required = true)
    protected SecurityProfileTransport securityProfileRetrieveByNameReturn;

    /**
     * Gets the value of the securityProfileRetrieveByNameReturn property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityProfileTransport }
     *     
     */
    public SecurityProfileTransport getSecurityProfileRetrieveByNameReturn() {
        return securityProfileRetrieveByNameReturn;
    }

    /**
     * Sets the value of the securityProfileRetrieveByNameReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityProfileTransport }
     *     
     */
    public void setSecurityProfileRetrieveByNameReturn(SecurityProfileTransport value) {
        this.securityProfileRetrieveByNameReturn = value;
    }

}
