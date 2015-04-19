
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
 *         &lt;element name="statefulConfigurationRetrieveByNameReturn" type="{urn:Manager}StatefulConfigurationTransport"/>
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
    "statefulConfigurationRetrieveByNameReturn"
})
@XmlRootElement(name = "statefulConfigurationRetrieveByNameResponse")
public class StatefulConfigurationRetrieveByNameResponse {

    @XmlElement(required = true)
    protected StatefulConfigurationTransport statefulConfigurationRetrieveByNameReturn;

    /**
     * Gets the value of the statefulConfigurationRetrieveByNameReturn property.
     * 
     * @return
     *     possible object is
     *     {@link StatefulConfigurationTransport }
     *     
     */
    public StatefulConfigurationTransport getStatefulConfigurationRetrieveByNameReturn() {
        return statefulConfigurationRetrieveByNameReturn;
    }

    /**
     * Sets the value of the statefulConfigurationRetrieveByNameReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatefulConfigurationTransport }
     *     
     */
    public void setStatefulConfigurationRetrieveByNameReturn(StatefulConfigurationTransport value) {
        this.statefulConfigurationRetrieveByNameReturn = value;
    }

}
