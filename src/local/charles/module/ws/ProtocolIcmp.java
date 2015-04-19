
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtocolIcmp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProtocolIcmp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{urn:Manager}EnumProtocolIcmpType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtocolIcmp", propOrder = {
    "type"
})
public class ProtocolIcmp {

    @XmlElement(required = true, nillable = true)
    protected EnumProtocolIcmpType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EnumProtocolIcmpType }
     *     
     */
    public EnumProtocolIcmpType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumProtocolIcmpType }
     *     
     */
    public void setType(EnumProtocolIcmpType value) {
        this.type = value;
    }

}
