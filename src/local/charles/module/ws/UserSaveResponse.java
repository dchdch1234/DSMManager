
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
 *         &lt;element name="userSaveReturn" type="{urn:Manager}UserTransport"/>
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
    "userSaveReturn"
})
@XmlRootElement(name = "userSaveResponse")
public class UserSaveResponse {

    @XmlElement(required = true)
    protected UserTransport userSaveReturn;

    /**
     * Gets the value of the userSaveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link UserTransport }
     *     
     */
    public UserTransport getUserSaveReturn() {
        return userSaveReturn;
    }

    /**
     * Sets the value of the userSaveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserTransport }
     *     
     */
    public void setUserSaveReturn(UserTransport value) {
        this.userSaveReturn = value;
    }

}
