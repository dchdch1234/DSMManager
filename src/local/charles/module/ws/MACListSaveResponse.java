
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
 *         &lt;element name="MACListSaveReturn" type="{urn:Manager}MACListTransport"/>
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
    "macListSaveReturn"
})
@XmlRootElement(name = "MACListSaveResponse")
public class MACListSaveResponse {

    @XmlElement(name = "MACListSaveReturn", required = true)
    protected MACListTransport macListSaveReturn;

    /**
     * Gets the value of the macListSaveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link MACListTransport }
     *     
     */
    public MACListTransport getMACListSaveReturn() {
        return macListSaveReturn;
    }

    /**
     * Sets the value of the macListSaveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MACListTransport }
     *     
     */
    public void setMACListSaveReturn(MACListTransport value) {
        this.macListSaveReturn = value;
    }

}
