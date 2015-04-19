
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
 *         &lt;element name="integrityRuleRetrieveReturn" type="{urn:Manager}IntegrityRuleTransport"/>
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
    "integrityRuleRetrieveReturn"
})
@XmlRootElement(name = "integrityRuleRetrieveResponse")
public class IntegrityRuleRetrieveResponse {

    @XmlElement(required = true)
    protected IntegrityRuleTransport integrityRuleRetrieveReturn;

    /**
     * Gets the value of the integrityRuleRetrieveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrityRuleTransport }
     *     
     */
    public IntegrityRuleTransport getIntegrityRuleRetrieveReturn() {
        return integrityRuleRetrieveReturn;
    }

    /**
     * Sets the value of the integrityRuleRetrieveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrityRuleTransport }
     *     
     */
    public void setIntegrityRuleRetrieveReturn(IntegrityRuleTransport value) {
        this.integrityRuleRetrieveReturn = value;
    }

}
