
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
 *         &lt;element name="scheduleSaveReturn" type="{urn:Manager}ScheduleTransport"/>
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
    "scheduleSaveReturn"
})
@XmlRootElement(name = "scheduleSaveResponse")
public class ScheduleSaveResponse {

    @XmlElement(required = true)
    protected ScheduleTransport scheduleSaveReturn;

    /**
     * Gets the value of the scheduleSaveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleTransport }
     *     
     */
    public ScheduleTransport getScheduleSaveReturn() {
        return scheduleSaveReturn;
    }

    /**
     * Sets the value of the scheduleSaveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleTransport }
     *     
     */
    public void setScheduleSaveReturn(ScheduleTransport value) {
        this.scheduleSaveReturn = value;
    }

}
