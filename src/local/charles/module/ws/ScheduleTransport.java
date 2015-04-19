
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduleTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}ConfigurationTransport">
 *       &lt;sequence>
 *         &lt;element name="hourOfWeek" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleTransport", propOrder = {
    "hourOfWeek"
})
public class ScheduleTransport
    extends ConfigurationTransport
{

    @XmlElement(required = true, nillable = true)
    protected String hourOfWeek;

    /**
     * Gets the value of the hourOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHourOfWeek() {
        return hourOfWeek;
    }

    /**
     * Sets the value of the hourOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHourOfWeek(String value) {
        this.hourOfWeek = value;
    }

}
