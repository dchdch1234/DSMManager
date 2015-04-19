
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
 *         &lt;element name="ipl" type="{urn:Manager}IPListTransport"/>
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
    "ipl",
    "sid"
})
@XmlRootElement(name = "IPListSave")
public class IPListSave {

    @XmlElement(required = true)
    protected IPListTransport ipl;
    @XmlElement(name = "sID", required = true)
    protected String sid;

    /**
     * Gets the value of the ipl property.
     * 
     * @return
     *     possible object is
     *     {@link IPListTransport }
     *     
     */
    public IPListTransport getIpl() {
        return ipl;
    }

    /**
     * Sets the value of the ipl property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPListTransport }
     *     
     */
    public void setIpl(IPListTransport value) {
        this.ipl = value;
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
