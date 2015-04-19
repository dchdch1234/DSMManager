
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtocolPortBased complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProtocolPortBased">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="portListID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="portType" type="{urn:Manager}EnumPortType"/>
 *         &lt;element name="ports" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtocolPortBased", propOrder = {
    "portListID",
    "portType",
    "ports"
})
public class ProtocolPortBased {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer portListID;
    @XmlElement(required = true, nillable = true)
    protected EnumPortType portType;
    @XmlElement(required = true, nillable = true)
    protected String ports;

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

}
