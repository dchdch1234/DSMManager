
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
 *         &lt;element name="retrieveLicenseProfileReturn" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "retrieveLicenseProfileReturn"
})
@XmlRootElement(name = "retrieveLicenseProfileResponse")
public class RetrieveLicenseProfileResponse {

    @XmlElement(required = true)
    protected String retrieveLicenseProfileReturn;

    /**
     * Gets the value of the retrieveLicenseProfileReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetrieveLicenseProfileReturn() {
        return retrieveLicenseProfileReturn;
    }

    /**
     * Sets the value of the retrieveLicenseProfileReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetrieveLicenseProfileReturn(String value) {
        this.retrieveLicenseProfileReturn = value;
    }

}
