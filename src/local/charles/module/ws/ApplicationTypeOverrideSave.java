
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
 *         &lt;element name="at" type="{urn:Manager}ApplicationTypeOverrideTransport"/>
 *         &lt;element name="sID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "at",
    "sid"
})
@XmlRootElement(name = "applicationTypeOverrideSave")
public class ApplicationTypeOverrideSave {

    @XmlElement(required = true)
    protected ApplicationTypeOverrideTransport at;
    @XmlElement(name = "sID", required = true)
    protected String sid;

    /**
     * Gets the value of the at property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationTypeOverrideTransport }
     *     
     */
    public ApplicationTypeOverrideTransport getAt() {
        return at;
    }

    /**
     * Sets the value of the at property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationTypeOverrideTransport }
     *     
     */
    public void setAt(ApplicationTypeOverrideTransport value) {
        this.at = value;
    }

    /**
     * Gets the value of the sid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSID() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSID(String value) {
        this.sid = value;
    }

}
