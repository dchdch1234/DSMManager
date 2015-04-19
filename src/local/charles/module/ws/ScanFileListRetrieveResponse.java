
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
 *         &lt;element name="scanFileListRetrieveReturn" type="{urn:Manager}ScanFileListTransport"/>
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
    "scanFileListRetrieveReturn"
})
@XmlRootElement(name = "scanFileListRetrieveResponse")
public class ScanFileListRetrieveResponse {

    @XmlElement(required = true)
    protected ScanFileListTransport scanFileListRetrieveReturn;

    /**
     * Gets the value of the scanFileListRetrieveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ScanFileListTransport }
     *     
     */
    public ScanFileListTransport getScanFileListRetrieveReturn() {
        return scanFileListRetrieveReturn;
    }

    /**
     * Sets the value of the scanFileListRetrieveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScanFileListTransport }
     *     
     */
    public void setScanFileListRetrieveReturn(ScanFileListTransport value) {
        this.scanFileListRetrieveReturn = value;
    }

}
