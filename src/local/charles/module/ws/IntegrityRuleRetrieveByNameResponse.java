
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
 *         &lt;element name="integrityRuleRetrieveByNameReturn" type="{urn:Manager}IntegrityRuleTransport"/>
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
    "integrityRuleRetrieveByNameReturn"
})
@XmlRootElement(name = "integrityRuleRetrieveByNameResponse")
public class IntegrityRuleRetrieveByNameResponse {

    @XmlElement(required = true)
    protected IntegrityRuleTransport integrityRuleRetrieveByNameReturn;

    /**
     * Gets the value of the integrityRuleRetrieveByNameReturn property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrityRuleTransport }
     *     
     */
    public IntegrityRuleTransport getIntegrityRuleRetrieveByNameReturn() {
        return integrityRuleRetrieveByNameReturn;
    }

    /**
     * Sets the value of the integrityRuleRetrieveByNameReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrityRuleTransport }
     *     
     */
    public void setIntegrityRuleRetrieveByNameReturn(IntegrityRuleTransport value) {
        this.integrityRuleRetrieveByNameReturn = value;
    }

}
