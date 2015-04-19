
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortListTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortListTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}ItemsTransport">
 *       &lt;sequence>
 *         &lt;element name="TBUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortListTransport", propOrder = {
    "tbuid"
})
public class PortListTransport
    extends ItemsTransport
{

    @XmlElement(name = "TBUID", required = true, nillable = true)
    protected String tbuid;

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

}
