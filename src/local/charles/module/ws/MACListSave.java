
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
 *         &lt;element name="ml" type="{urn:Manager}MACListTransport"/>
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
    "ml",
    "sid"
})
@XmlRootElement(name = "MACListSave")
public class MACListSave {

    @XmlElement(required = true)
    protected MACListTransport ml;
    @XmlElement(name = "sID", required = true)
    protected String sid;

    /**
     * Gets the value of the ml property.
     * 
     * @return
     *     possible object is
     *     {@link MACListTransport }
     *     
     */
    public MACListTransport getMl() {
        return ml;
    }

    /**
     * Sets the value of the ml property.
     * 
     * @param value
     *     allowed object is
     *     {@link MACListTransport }
     *     
     */
    public void setMl(MACListTransport value) {
        this.ml = value;
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
