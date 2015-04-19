
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeatureSummaryDetailTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureSummaryDetailTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}TransportObject">
 *       &lt;sequence>
 *         &lt;element name="featureName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="protectedComputerNum" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalEventNum" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="preventedEventNum" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="detectedEventNum" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="previousTotalEventNum" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="previousPreventedEventNum" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="previousDetectedEventNum" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureSummaryDetailTransport", propOrder = {
    "featureName",
    "protectedComputerNum",
    "totalEventNum",
    "preventedEventNum",
    "detectedEventNum",
    "previousTotalEventNum",
    "previousPreventedEventNum",
    "previousDetectedEventNum"
})
public class FeatureSummaryDetailTransport
    extends TransportObject
{

    @XmlElement(required = true)
    protected String featureName;
    protected long protectedComputerNum;
    protected long totalEventNum;
    protected long preventedEventNum;
    protected long detectedEventNum;
    protected long previousTotalEventNum;
    protected long previousPreventedEventNum;
    protected long previousDetectedEventNum;

    /**
     * Gets the value of the featureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureName() {
        return featureName;
    }

    /**
     * Sets the value of the featureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureName(String value) {
        this.featureName = value;
    }

    /**
     * Gets the value of the protectedComputerNum property.
     * 
     */
    public long getProtectedComputerNum() {
        return protectedComputerNum;
    }

    /**
     * Sets the value of the protectedComputerNum property.
     * 
     */
    public void setProtectedComputerNum(long value) {
        this.protectedComputerNum = value;
    }

    /**
     * Gets the value of the totalEventNum property.
     * 
     */
    public long getTotalEventNum() {
        return totalEventNum;
    }

    /**
     * Sets the value of the totalEventNum property.
     * 
     */
    public void setTotalEventNum(long value) {
        this.totalEventNum = value;
    }

    /**
     * Gets the value of the preventedEventNum property.
     * 
     */
    public long getPreventedEventNum() {
        return preventedEventNum;
    }

    /**
     * Sets the value of the preventedEventNum property.
     * 
     */
    public void setPreventedEventNum(long value) {
        this.preventedEventNum = value;
    }

    /**
     * Gets the value of the detectedEventNum property.
     * 
     */
    public long getDetectedEventNum() {
        return detectedEventNum;
    }

    /**
     * Sets the value of the detectedEventNum property.
     * 
     */
    public void setDetectedEventNum(long value) {
        this.detectedEventNum = value;
    }

    /**
     * Gets the value of the previousTotalEventNum property.
     * 
     */
    public long getPreviousTotalEventNum() {
        return previousTotalEventNum;
    }

    /**
     * Sets the value of the previousTotalEventNum property.
     * 
     */
    public void setPreviousTotalEventNum(long value) {
        this.previousTotalEventNum = value;
    }

    /**
     * Gets the value of the previousPreventedEventNum property.
     * 
     */
    public long getPreviousPreventedEventNum() {
        return previousPreventedEventNum;
    }

    /**
     * Sets the value of the previousPreventedEventNum property.
     * 
     */
    public void setPreviousPreventedEventNum(long value) {
        this.previousPreventedEventNum = value;
    }

    /**
     * Gets the value of the previousDetectedEventNum property.
     * 
     */
    public long getPreviousDetectedEventNum() {
        return previousDetectedEventNum;
    }

    /**
     * Sets the value of the previousDetectedEventNum property.
     * 
     */
    public void setPreviousDetectedEventNum(long value) {
        this.previousDetectedEventNum = value;
    }

}
