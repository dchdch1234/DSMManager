
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
 *         &lt;element name="DPIRuleRetrieveReturn" type="{urn:Manager}DPIRuleTransport"/>
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
    "dpiRuleRetrieveReturn"
})
@XmlRootElement(name = "DPIRuleRetrieveResponse")
public class DPIRuleRetrieveResponse {

    @XmlElement(name = "DPIRuleRetrieveReturn", required = true)
    protected DPIRuleTransport dpiRuleRetrieveReturn;

    /**
     * Gets the value of the dpiRuleRetrieveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link DPIRuleTransport }
     *     
     */
    public DPIRuleTransport getDPIRuleRetrieveReturn() {
        return dpiRuleRetrieveReturn;
    }

    /**
     * Sets the value of the dpiRuleRetrieveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DPIRuleTransport }
     *     
     */
    public void setDPIRuleRetrieveReturn(DPIRuleTransport value) {
        this.dpiRuleRetrieveReturn = value;
    }

}
