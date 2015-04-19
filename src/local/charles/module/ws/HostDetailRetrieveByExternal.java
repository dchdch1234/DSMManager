
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
 *         &lt;element name="externalFilter" type="{urn:Manager}ExternalFilterTransport"/>
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
    "externalFilter",
    "hostDetailLevel",
    "sid"
})
@XmlRootElement(name = "hostDetailRetrieveByExternal")
public class HostDetailRetrieveByExternal {

    @XmlElement(required = true)
    protected ExternalFilterTransport externalFilter;
    @XmlElement(required = true)
    protected EnumHostDetailLevel hostDetailLevel;
    @XmlElement(name = "sID", required = true)
    protected String sid;

    /**
     * Gets the value of the externalFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalFilterTransport }
     *     
     */
    public ExternalFilterTransport getExternalFilter() {
        return externalFilter;
    }

    /**
     * Sets the value of the externalFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalFilterTransport }
     *     
     */
    public void setExternalFilter(ExternalFilterTransport value) {
        this.externalFilter = value;
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
