
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AlertStatusTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertStatusTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}TransportObject">
 *       &lt;sequence>
 *         &lt;element name="alertDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="alertType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="severity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="severityText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertStatusTransport", propOrder = {
    "alertDate",
    "alertType",
    "severity",
    "severityText"
})
public class AlertStatusTransport
    extends TransportObject
{

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar alertDate;
    @XmlElement(required = true, nillable = true)
    protected String alertType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer severity;
    @XmlElement(required = true, nillable = true)
    protected String severityText;

    /**
     * Gets the value of the alertDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlertDate() {
        return alertDate;
    }

    /**
     * Sets the value of the alertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlertDate(XMLGregorianCalendar value) {
        this.alertDate = value;
    }

    /**
     * Gets the value of the alertType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertType() {
        return alertType;
    }

    /**
     * Sets the value of the alertType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertType(String value) {
        this.alertType = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeverity(Integer value) {
        this.severity = value;
    }

    /**
     * Gets the value of the severityText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverityText() {
        return severityText;
    }

    /**
     * Sets the value of the severityText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverityText(String value) {
        this.severityText = value;
    }

}
