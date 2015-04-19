
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
 *         &lt;element name="logInspectionRuleRetrieveReturn" type="{urn:Manager}LogInspectionRuleTransport"/>
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
    "logInspectionRuleRetrieveReturn"
})
@XmlRootElement(name = "logInspectionRuleRetrieveResponse")
public class LogInspectionRuleRetrieveResponse {

    @XmlElement(required = true)
    protected LogInspectionRuleTransport logInspectionRuleRetrieveReturn;

    /**
     * Gets the value of the logInspectionRuleRetrieveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link LogInspectionRuleTransport }
     *     
     */
    public LogInspectionRuleTransport getLogInspectionRuleRetrieveReturn() {
        return logInspectionRuleRetrieveReturn;
    }

    /**
     * Sets the value of the logInspectionRuleRetrieveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogInspectionRuleTransport }
     *     
     */
    public void setLogInspectionRuleRetrieveReturn(LogInspectionRuleTransport value) {
        this.logInspectionRuleRetrieveReturn = value;
    }

}
