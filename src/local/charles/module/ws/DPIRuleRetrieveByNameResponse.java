
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
 *         &lt;element name="DPIRuleRetrieveByNameReturn" type="{urn:Manager}DPIRuleTransport"/>
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
    "dpiRuleRetrieveByNameReturn"
})
@XmlRootElement(name = "DPIRuleRetrieveByNameResponse")
public class DPIRuleRetrieveByNameResponse {

    @XmlElement(name = "DPIRuleRetrieveByNameReturn", required = true)
    protected DPIRuleTransport dpiRuleRetrieveByNameReturn;

    /**
     * Gets the value of the dpiRuleRetrieveByNameReturn property.
     * 
     * @return
     *     possible object is
     *     {@link DPIRuleTransport }
     *     
     */
    public DPIRuleTransport getDPIRuleRetrieveByNameReturn() {
        return dpiRuleRetrieveByNameReturn;
    }

    /**
     * Sets the value of the dpiRuleRetrieveByNameReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DPIRuleTransport }
     *     
     */
    public void setDPIRuleRetrieveByNameReturn(DPIRuleTransport value) {
        this.dpiRuleRetrieveByNameReturn = value;
    }

}
