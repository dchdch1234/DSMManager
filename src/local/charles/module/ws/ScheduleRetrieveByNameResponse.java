
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
 *         &lt;element name="scheduleRetrieveByNameReturn" type="{urn:Manager}ScheduleTransport"/>
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
    "scheduleRetrieveByNameReturn"
})
@XmlRootElement(name = "scheduleRetrieveByNameResponse")
public class ScheduleRetrieveByNameResponse {

    @XmlElement(required = true)
    protected ScheduleTransport scheduleRetrieveByNameReturn;

    /**
     * Gets the value of the scheduleRetrieveByNameReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleTransport }
     *     
     */
    public ScheduleTransport getScheduleRetrieveByNameReturn() {
        return scheduleRetrieveByNameReturn;
    }

    /**
     * Sets the value of the scheduleRetrieveByNameReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleTransport }
     *     
     */
    public void setScheduleRetrieveByNameReturn(ScheduleTransport value) {
        this.scheduleRetrieveByNameReturn = value;
    }

}
