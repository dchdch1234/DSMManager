
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
 *         &lt;element name="timeFilter" type="{urn:Manager}TimeFilterTransport"/>
 *         &lt;element name="previousTimeFilter" type="{urn:Manager}TimeFilterTransport"/>
 *         &lt;element name="sID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "timeFilter",
    "previousTimeFilter",
    "sid"
})
@XmlRootElement(name = "featureSummaryRetrieve")
public class FeatureSummaryRetrieve {

    @XmlElement(required = true)
    protected TimeFilterTransport timeFilter;
    @XmlElement(required = true)
    protected TimeFilterTransport previousTimeFilter;
    @XmlElement(name = "sID", required = true)
    protected String sid;

    /**
     * Gets the value of the timeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TimeFilterTransport }
     *     
     */
    public TimeFilterTransport getTimeFilter() {
        return timeFilter;
    }

    /**
     * Sets the value of the timeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFilterTransport }
     *     
     */
    public void setTimeFilter(TimeFilterTransport value) {
        this.timeFilter = value;
    }

    /**
     * Gets the value of the previousTimeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TimeFilterTransport }
     *     
     */
    public TimeFilterTransport getPreviousTimeFilter() {
        return previousTimeFilter;
    }

    /**
     * Sets the value of the previousTimeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFilterTransport }
     *     
     */
    public void setPreviousTimeFilter(TimeFilterTransport value) {
        this.previousTimeFilter = value;
    }

    /**
     * Gets the value of the sid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSID() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSID(String value) {
        this.sid = value;
    }

}
