
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalFilterTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalFilterTransport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hostExternalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hostGroupExternalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{urn:Manager}EnumExternalFilterType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalFilterTransport", propOrder = {
    "hostExternalID",
    "hostGroupExternalID",
    "type"
})
public class ExternalFilterTransport {

    @XmlElement(required = true, nillable = true)
    protected String hostExternalID;
    @XmlElement(required = true, nillable = true)
    protected String hostGroupExternalID;
    @XmlElement(required = true, nillable = true)
    protected EnumExternalFilterType type;

    /**
     * Gets the value of the hostExternalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostExternalID() {
        return hostExternalID;
    }

    /**
     * Sets the value of the hostExternalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostExternalID(String value) {
        this.hostExternalID = value;
    }

    /**
     * Gets the value of the hostGroupExternalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostGroupExternalID() {
        return hostGroupExternalID;
    }

    /**
     * Sets the value of the hostGroupExternalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostGroupExternalID(String value) {
        this.hostGroupExternalID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EnumExternalFilterType }
     *     
     */
    public EnumExternalFilterType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumExternalFilterType }
     *     
     */
    public void setType(EnumExternalFilterType value) {
        this.type = value;
    }

}
