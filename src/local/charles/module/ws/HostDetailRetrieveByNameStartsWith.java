
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
 *         &lt;element name="startsWithHostname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hostDetailLevel" type="{urn:Manager}EnumHostDetailLevel"/>
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
    "startsWithHostname",
    "hostDetailLevel",
    "sid"
})
@XmlRootElement(name = "hostDetailRetrieveByNameStartsWith")
public class HostDetailRetrieveByNameStartsWith {

    @XmlElement(required = true)
    protected String startsWithHostname;
    @XmlElement(required = true)
    protected EnumHostDetailLevel hostDetailLevel;
    @XmlElement(name = "sID", required = true)
    protected String sid;

    /**
     * Gets the value of the startsWithHostname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartsWithHostname() {
        return startsWithHostname;
    }

    /**
     * Sets the value of the startsWithHostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartsWithHostname(String value) {
        this.startsWithHostname = value;
    }

    /**
     * Gets the value of the hostDetailLevel property.
     * 
     * @return
     *     possible object is
     *     {@link EnumHostDetailLevel }
     *     
     */
    public EnumHostDetailLevel getHostDetailLevel() {
        return hostDetailLevel;
    }

    /**
     * Sets the value of the hostDetailLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumHostDetailLevel }
     *     
     */
    public void setHostDetailLevel(EnumHostDetailLevel value) {
        this.hostDetailLevel = value;
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
