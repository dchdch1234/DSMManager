
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
 *         &lt;element name="DPIRuleSaveReturn" type="{urn:Manager}DPIRuleTransport"/>
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
    "dpiRuleSaveReturn"
})
@XmlRootElement(name = "DPIRuleSaveResponse")
public class DPIRuleSaveResponse {

    @XmlElement(name = "DPIRuleSaveReturn", required = true)
    protected DPIRuleTransport dpiRuleSaveReturn;

    /**
     * Gets the value of the dpiRuleSaveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link DPIRuleTransport }
     *     
     */
    public DPIRuleTransport getDPIRuleSaveReturn() {
        return dpiRuleSaveReturn;
    }

    /**
     * Sets the value of the dpiRuleSaveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DPIRuleTransport }
     *     
     */
    public void setDPIRuleSaveReturn(DPIRuleTransport value) {
        this.dpiRuleSaveReturn = value;
    }

}
