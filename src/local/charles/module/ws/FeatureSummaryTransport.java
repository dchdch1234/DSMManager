
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeatureSummaryTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureSummaryTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}TransportObject">
 *       &lt;sequence>
 *         &lt;element name="featureSummaryDetails" type="{urn:Manager}ArrayOfFeatureSummaryDetailTransport"/>
 *         &lt;element name="totalComputerNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureSummaryTransport", propOrder = {
    "featureSummaryDetails",
    "totalComputerNum"
})
public class FeatureSummaryTransport
    extends TransportObject
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfFeatureSummaryDetailTransport featureSummaryDetails;
    protected int totalComputerNum;

    /**
     * Gets the value of the featureSummaryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFeatureSummaryDetailTransport }
     *     
     */
    public ArrayOfFeatureSummaryDetailTransport getFeatureSummaryDetails() {
        return featureSummaryDetails;
    }

    /**
     * Sets the value of the featureSummaryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFeatureSummaryDetailTransport }
     *     
     */
    public void setFeatureSummaryDetails(ArrayOfFeatureSummaryDetailTransport value) {
        this.featureSummaryDetails = value;
    }

    /**
     * Gets the value of the totalComputerNum property.
     * 
     */
    public int getTotalComputerNum() {
        return totalComputerNum;
    }

    /**
     * Sets the value of the totalComputerNum property.
     * 
     */
    public void setTotalComputerNum(int value) {
        this.totalComputerNum = value;
    }

}
