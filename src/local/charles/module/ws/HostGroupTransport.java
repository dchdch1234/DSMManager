
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostGroupTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostGroupTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}ConfigurationTransport">
 *       &lt;sequence>
 *         &lt;element name="external" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="externalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentGroupID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostGroupTransport", propOrder = {
    "external",
    "externalID",
    "parentGroupID"
})
public class HostGroupTransport
    extends ConfigurationTransport
{

    protected boolean external;
    @XmlElement(required = true, nillable = true)
    protected String externalID;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer parentGroupID;

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
     * Gets the value of the parentGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentGroupID() {
        return parentGroupID;
    }

    /**
     * Sets the value of the parentGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentGroupID(Integer value) {
        this.parentGroupID = value;
    }

}
