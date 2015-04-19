
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
 *         &lt;element name="securityUpdateRetrieveReturn" type="{urn:Manager}SecurityUpdateTransport"/>
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
    "securityUpdateRetrieveReturn"
})
@XmlRootElement(name = "securityUpdateRetrieveResponse")
public class SecurityUpdateRetrieveResponse {

    @XmlElement(required = true)
    protected SecurityUpdateTransport securityUpdateRetrieveReturn;

    /**
     * Gets the value of the securityUpdateRetrieveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityUpdateTransport }
     *     
     */
    public SecurityUpdateTransport getSecurityUpdateRetrieveReturn() {
        return securityUpdateRetrieveReturn;
    }

    /**
     * Sets the value of the securityUpdateRetrieveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityUpdateTransport }
     *     
     */
    public void setSecurityUpdateRetrieveReturn(SecurityUpdateTransport value) {
        this.securityUpdateRetrieveReturn = value;
    }

}
