
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CounterAlertTypeTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CounterAlertTypeTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}CounterTransport">
 *       &lt;sequence>
 *         &lt;element name="severity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="percentOpen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="averageTimeOpen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterAlertTypeTransport", propOrder = {
    "severity",
    "percentOpen",
    "averageTimeOpen"
})
public class CounterAlertTypeTransport
    extends CounterTransport
{

    protected int severity;
    @XmlElement(required = true, nillable = true)
    protected String percentOpen;
    @XmlElement(required = true, nillable = true)
    protected String averageTimeOpen;

    /**
     * Gets the value of the severity property.
     * 
     */
    public int getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     */
    public void setSeverity(int value) {
        this.severity = value;
    }

    /**
     * Gets the value of the percentOpen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentOpen() {
        return percentOpen;
    }

    /**
     * Sets the value of the percentOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentOpen(String value) {
        this.percentOpen = value;
    }

    /**
     * Gets the value of the averageTimeOpen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAverageTimeOpen() {
        return averageTimeOpen;
    }

    /**
     * Sets the value of the averageTimeOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAverageTimeOpen(String value) {
        this.averageTimeOpen = value;
    }

}
