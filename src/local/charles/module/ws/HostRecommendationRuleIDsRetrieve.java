
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
 *         &lt;element name="hostID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="onlyunassigned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "hostID",
    "type",
    "onlyunassigned",
    "sid"
})
@XmlRootElement(name = "hostRecommendationRuleIDsRetrieve")
public class HostRecommendationRuleIDsRetrieve {

    protected int hostID;
    protected int type;
    protected boolean onlyunassigned;
    @XmlElement(name = "sID", required = true)
    protected String sid;

    /**
     * Gets the value of the hostID property.
     * 
     */
    public int getHostID() {
        return hostID;
    }

    /**
     * Sets the value of the hostID property.
     * 
     */
    public void setHostID(int value) {
        this.hostID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

    /**
     * Gets the value of the onlyunassigned property.
     * 
     */
    public boolean isOnlyunassigned() {
        return onlyunassigned;
    }

    /**
     * Sets the value of the onlyunassigned property.
     * 
     */
    public void setOnlyunassigned(boolean value) {
        this.onlyunassigned = value;
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
