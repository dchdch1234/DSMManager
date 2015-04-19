
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
 *         &lt;element name="statusSummaryRetrieveReturn" type="{urn:Manager}StatusSummaryTransport"/>
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
    "statusSummaryRetrieveReturn"
})
@XmlRootElement(name = "statusSummaryRetrieveResponse")
public class StatusSummaryRetrieveResponse {

    @XmlElement(required = true)
    protected StatusSummaryTransport statusSummaryRetrieveReturn;

    /**
     * Gets the value of the statusSummaryRetrieveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link StatusSummaryTransport }
     *     
     */
    public StatusSummaryTransport getStatusSummaryRetrieveReturn() {
        return statusSummaryRetrieveReturn;
    }

    /**
     * Sets the value of the statusSummaryRetrieveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusSummaryTransport }
     *     
     */
    public void setStatusSummaryRetrieveReturn(StatusSummaryTransport value) {
        this.statusSummaryRetrieveReturn = value;
    }

}
