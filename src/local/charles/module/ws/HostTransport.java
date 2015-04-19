
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}ConfigurationTransport">
 *       &lt;sequence>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="external" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="externalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hostGroupID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hostType" type="{urn:Manager}EnumHostType"/>
 *         &lt;element name="platform" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="securityProfileID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostTransport", propOrder = {
    "displayName",
    "external",
    "externalID",
    "hostGroupID",
    "hostType",
    "platform",
    "securityProfileID"
})
@XmlSeeAlso({
    HostDetailTransport.class,
    HostInterfaceTransport.class
})
public class HostTransport
    extends ConfigurationTransport
{

    @XmlElement(required = true, nillable = true)
    protected String displayName;
    protected boolean external;
    @XmlElement(required = true, nillable = true)
    protected String externalID;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer hostGroupID;
    @XmlElement(required = true, nillable = true)
    protected EnumHostType hostType;
    @XmlElement(required = true, nillable = true)
    protected String platform;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer securityProfileID;

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the external property.
     * 
     */
    public boolean isExternal() {
        return external;
    }

    /**
     * Sets the value of the external property.
     * 
     */
    public void setExternal(boolean value) {
        this.external = value;
    }

    /**
     * Gets the value of the externalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalID() {
        return externalID;
    }

    /**
     * Sets the value of the externalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalID(String value) {
        this.externalID = value;
    }

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
     * Gets the value of the hostType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumHostType }
     *     
     */
    public EnumHostType getHostType() {
        return hostType;
    }

    /**
     * Sets the value of the hostType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumHostType }
     *     
     */
    public void setHostType(EnumHostType value) {
        this.hostType = value;
    }

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatform(String value) {
        this.platform = value;
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

}
