
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
 *         &lt;element name="userRetrieveReturn" type="{urn:Manager}UserTransport"/>
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
    "userRetrieveReturn"
})
@XmlRootElement(name = "userRetrieveResponse")
public class UserRetrieveResponse {

    @XmlElement(required = true)
    protected UserTransport userRetrieveReturn;

    /**
     * Gets the value of the userRetrieveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link UserTransport }
     *     
     */
    public UserTransport getUserRetrieveReturn() {
        return userRetrieveReturn;
    }

    /**
     * Sets the value of the userRetrieveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserTransport }
     *     
     */
    public void setUserRetrieveReturn(UserTransport value) {
        this.userRetrieveReturn = value;
    }

}
