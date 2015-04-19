
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostFilterTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostFilterTransport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hostGroupID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hostID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="securityProfileID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="type" type="{urn:Manager}EnumHostFilterType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFilterTransport", propOrder = {
    "hostGroupID",
    "hostID",
    "securityProfileID",
    "type"
})
public class HostFilterTransport {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer hostGroupID;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer hostID;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer securityProfileID;
    @XmlElement(required = true, nillable = true)
    protected EnumHostFilterType type;

    /**
     * Gets the value of the hostGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHostGroupID() {
        return hostGroupID;
    }

    /**
     * Sets the value of the hostGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHostGroupID(Integer value) {
        this.hostGroupID = value;
    }

    /**
     * Gets the value of the hostID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHostID() {
        return hostID;
    }

    /**
     * Sets the value of the hostID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHostID(Integer value) {
        this.hostID = value;
    }

    /**
     * Gets the value of the securityProfileID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecurityProfileID() {
        return securityProfileID;
    }

    /**
     * Sets the value of the securityProfileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecurityProfileID(Integer value) {
        this.securityProfileID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EnumHostFilterType }
     *     
     */
    public EnumHostFilterType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumHostFilterType }
     *     
     */
    public void setType(EnumHostFilterType value) {
        this.type = value;
    }

}
