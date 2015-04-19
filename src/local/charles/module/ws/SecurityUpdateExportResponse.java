
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
 *         &lt;element name="securityUpdateExportReturn" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
    "securityUpdateExportReturn"
})
@XmlRootElement(name = "securityUpdateExportResponse")
public class SecurityUpdateExportResponse {

    @XmlElement(required = true)
    protected byte[] securityUpdateExportReturn;

    /**
     * Gets the value of the securityUpdateExportReturn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSecurityUpdateExportReturn() {
        return securityUpdateExportReturn;
    }

    /**
     * Sets the value of the securityUpdateExportReturn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSecurityUpdateExportReturn(byte[] value) {
        this.securityUpdateExportReturn = ((byte[]) value);
    }

}
