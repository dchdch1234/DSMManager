
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
 *         &lt;element name="securityProfileSaveReturn" type="{urn:Manager}SecurityProfileTransport"/>
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
    "securityProfileSaveReturn"
})
@XmlRootElement(name = "securityProfileSaveResponse")
public class SecurityProfileSaveResponse {

    @XmlElement(required = true)
    protected SecurityProfileTransport securityProfileSaveReturn;

    /**
     * Gets the value of the securityProfileSaveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityProfileTransport }
     *     
     */
    public SecurityProfileTransport getSecurityProfileSaveReturn() {
        return securityProfileSaveReturn;
    }

    /**
     * Sets the value of the securityProfileSaveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityProfileTransport }
     *     
     */
    public void setSecurityProfileSaveReturn(SecurityProfileTransport value) {
        this.securityProfileSaveReturn = value;
    }

}
