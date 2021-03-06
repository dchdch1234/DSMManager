
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
 *         &lt;element name="securityUpdateApplyReturn" type="{urn:Manager}ApplierInformationTransport"/>
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
    "securityUpdateApplyReturn"
})
@XmlRootElement(name = "securityUpdateApplyResponse")
public class SecurityUpdateApplyResponse {

    @XmlElement(required = true)
    protected ApplierInformationTransport securityUpdateApplyReturn;

    /**
     * Gets the value of the securityUpdateApplyReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ApplierInformationTransport }
     *     
     */
    public ApplierInformationTransport getSecurityUpdateApplyReturn() {
        return securityUpdateApplyReturn;
    }

    /**
     * Sets the value of the securityUpdateApplyReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplierInformationTransport }
     *     
     */
    public void setSecurityUpdateApplyReturn(ApplierInformationTransport value) {
        this.securityUpdateApplyReturn = value;
    }

}
