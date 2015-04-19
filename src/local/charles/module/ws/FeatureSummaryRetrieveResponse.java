
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
 *         &lt;element name="featureSummaryRetrieveReturn" type="{urn:Manager}FeatureSummaryTransport"/>
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
    "featureSummaryRetrieveReturn"
})
@XmlRootElement(name = "featureSummaryRetrieveResponse")
public class FeatureSummaryRetrieveResponse {

    @XmlElement(required = true)
    protected FeatureSummaryTransport featureSummaryRetrieveReturn;

    /**
     * Gets the value of the featureSummaryRetrieveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureSummaryTransport }
     *     
     */
    public FeatureSummaryTransport getFeatureSummaryRetrieveReturn() {
        return featureSummaryRetrieveReturn;
    }

    /**
     * Sets the value of the featureSummaryRetrieveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureSummaryTransport }
     *     
     */
    public void setFeatureSummaryRetrieveReturn(FeatureSummaryTransport value) {
        this.featureSummaryRetrieveReturn = value;
    }

}
