
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusSummaryTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusSummaryTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}TransportObject">
 *       &lt;sequence>
 *         &lt;element name="alertErrorNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="alertWarningNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hostStatusSummary" type="{urn:Manager}HostStatusSummaryTransport"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusSummaryTransport", propOrder = {
    "alertErrorNum",
    "alertWarningNum",
    "hostStatusSummary"
})
public class StatusSummaryTransport
    extends TransportObject
{

    protected int alertErrorNum;
    protected int alertWarningNum;
    @XmlElement(required = true, nillable = true)
    protected HostStatusSummaryTransport hostStatusSummary;

    /**
     * Gets the value of the alertErrorNum property.
     * 
     */
    public int getAlertErrorNum() {
        return alertErrorNum;
    }

    /**
     * Sets the value of the alertErrorNum property.
     * 
     */
    public void setAlertErrorNum(int value) {
        this.alertErrorNum = value;
    }

    /**
     * Gets the value of the alertWarningNum property.
     * 
     */
    public int getAlertWarningNum() {
        return alertWarningNum;
    }

    /**
     * Sets the value of the alertWarningNum property.
     * 
     */
    public void setAlertWarningNum(int value) {
        this.alertWarningNum = value;
    }

    /**
     * Gets the value of the hostStatusSummary property.
     * 
     * @return
     *     possible object is
     *     {@link HostStatusSummaryTransport }
     *     
     */
    public HostStatusSummaryTransport getHostStatusSummary() {
        return hostStatusSummary;
    }

    /**
     * Sets the value of the hostStatusSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostStatusSummaryTransport }
     *     
     */
    public void setHostStatusSummary(HostStatusSummaryTransport value) {
        this.hostStatusSummary = value;
    }

}
