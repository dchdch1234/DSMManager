
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationTypeTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationTypeTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}ConfigurationTransport">
 *       &lt;sequence>
 *         &lt;element name="TBUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="authoritative" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="direction" type="{urn:Manager}EnumDirection"/>
 *         &lt;element name="ignoreRecommendations" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="protocolIcmp" type="{urn:Manager}ProtocolIcmp"/>
 *         &lt;element name="protocolPortBased" type="{urn:Manager}ProtocolPortBased"/>
 *         &lt;element name="protocolType" type="{urn:Manager}EnumApplicationTypeProtocolType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationTypeTransport", propOrder = {
    "tbuid",
    "authoritative",
    "direction",
    "ignoreRecommendations",
    "protocolIcmp",
    "protocolPortBased",
    "protocolType"
})
public class ApplicationTypeTransport
    extends ConfigurationTransport
{

    @XmlElement(name = "TBUID", required = true, nillable = true)
    protected String tbuid;
    protected boolean authoritative;
    @XmlElement(required = true, nillable = true)
    protected EnumDirection direction;
    protected boolean ignoreRecommendations;
    @XmlElement(required = true, nillable = true)
    protected ProtocolIcmp protocolIcmp;
    @XmlElement(required = true, nillable = true)
    protected ProtocolPortBased protocolPortBased;
    @XmlElement(required = true, nillable = true)
    protected EnumApplicationTypeProtocolType protocolType;

    /**
     * Gets the value of the tbuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTBUID() {
        return tbuid;
    }

    /**
     * Sets the value of the tbuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTBUID(String value) {
        this.tbuid = value;
    }

    /**
     * Gets the value of the authoritative property.
     * 
     */
    public boolean isAuthoritative() {
        return authoritative;
    }

    /**
     * Sets the value of the authoritative property.
     * 
     */
    public void setAuthoritative(boolean value) {
        this.authoritative = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link EnumDirection }
     *     
     */
    public EnumDirection getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumDirection }
     *     
     */
    public void setDirection(EnumDirection value) {
        this.direction = value;
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

    /**
     * Gets the value of the protocolIcmp property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolIcmp }
     *     
     */
    public ProtocolIcmp getProtocolIcmp() {
        return protocolIcmp;
    }

    /**
     * Sets the value of the protocolIcmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolIcmp }
     *     
     */
    public void setProtocolIcmp(ProtocolIcmp value) {
        this.protocolIcmp = value;
    }

    /**
     * Gets the value of the protocolPortBased property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolPortBased }
     *     
     */
    public ProtocolPortBased getProtocolPortBased() {
        return protocolPortBased;
    }

    /**
     * Sets the value of the protocolPortBased property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolPortBased }
     *     
     */
    public void setProtocolPortBased(ProtocolPortBased value) {
        this.protocolPortBased = value;
    }

    /**
     * Gets the value of the protocolType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumApplicationTypeProtocolType }
     *     
     */
    public EnumApplicationTypeProtocolType getProtocolType() {
        return protocolType;
    }

    /**
     * Sets the value of the protocolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumApplicationTypeProtocolType }
     *     
     */
    public void setProtocolType(EnumApplicationTypeProtocolType value) {
        this.protocolType = value;
    }

}
