
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
 *         &lt;element name="hostJobProgressReturn" type="{urn:Manager}JobProgressTransport"/>
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
    "hostJobProgressReturn"
})
@XmlRootElement(name = "hostJobProgressResponse")
public class HostJobProgressResponse {

    @XmlElement(required = true)
    protected JobProgressTransport hostJobProgressReturn;

    /**
     * Gets the value of the hostJobProgressReturn property.
     * 
     * @return
     *     possible object is
     *     {@link JobProgressTransport }
     *     
     */
    public JobProgressTransport getHostJobProgressReturn() {
        return hostJobProgressReturn;
    }

    /**
     * Sets the value of the hostJobProgressReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobProgressTransport }
     *     
     */
    public void setHostJobProgressReturn(JobProgressTransport value) {
        this.hostJobProgressReturn = value;
    }

}
