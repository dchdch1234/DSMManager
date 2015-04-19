
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
 *         &lt;element name="pluginRequestReturn" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "pluginRequestReturn"
})
@XmlRootElement(name = "pluginRequestResponse")
public class PluginRequestResponse {

    @XmlElement(required = true)
    protected String pluginRequestReturn;

    /**
     * Gets the value of the pluginRequestReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluginRequestReturn() {
        return pluginRequestReturn;
    }

    /**
     * Sets the value of the pluginRequestReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluginRequestReturn(String value) {
        this.pluginRequestReturn = value;
    }

}
