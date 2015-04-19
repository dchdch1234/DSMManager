
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationTypeOverrideTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationTypeOverrideTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}TransportObject">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="applicationTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="securityProfileID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="portType" type="{urn:Manager}EnumPortType"/>
 *         &lt;element name="ports" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="portListID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ignoreRecommendations" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationTypeOverrideTransport", propOrder = {
    "id",
    "applicationTypeID",
    "securityProfileID",
    "portType",
    "ports",
    "portListID",
    "ignoreRecommendations"
})
public class ApplicationTypeOverrideTransport
    extends TransportObject
{

    @XmlElement(name = "ID", required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer applicationTypeID;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer securityProfileID;
    @XmlElement(required = true, nillable = true)
    protected EnumPortType portType;
    @XmlElement(required = true, nillable = true)
    protected String ports;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer portListID;
    protected boolean ignoreRecommendations;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the applicationTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApplicationTypeID() {
        return applicationTypeID;
    }

    /**
     * Sets the value of the applicationTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApplicationTypeID(Integer value) {
        this.applicationTypeID = value;
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
     * Gets the value of the portType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumPortType }
     *     
     */
    public EnumPortType getPortType() {
        return portType;
    }

    /**
     * Sets the value of the portType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumPortType }
     *     
     */
    public void setPortType(EnumPortType value) {
        this.portType = value;
    }

    /**
     * Gets the value of the ports property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPorts() {
        return ports;
    }

    /**
     * Sets the value of the ports property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPorts(String value) {
        this.ports = value;
    }

    /**
     * Gets the value of the portListID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPortListID() {
        return portListID;
    }

    /**
     * Sets the value of the portListID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPortListID(Integer value) {
        this.portListID = value;
    }

    /**
     * Gets the value of the ignoreRecommendations property.
     * 
     */
    public boolean isIgnoreRecommendations() {
        return ignoreRecommendations;
    }

    /**
     * Sets the value of the ignoreRecommendations property.
     * 
     */
    public void setIgnoreRecommendations(boolean value) {
        this.ignoreRecommendations = value;
    }

}
