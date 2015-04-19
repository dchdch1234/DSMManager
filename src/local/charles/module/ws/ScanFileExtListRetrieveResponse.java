
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
 *         &lt;element name="scanFileExtListRetrieveReturn" type="{urn:Manager}ScanFileExtListTransport"/>
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
    "scanFileExtListRetrieveReturn"
})
@XmlRootElement(name = "scanFileExtListRetrieveResponse")
public class ScanFileExtListRetrieveResponse {

    @XmlElement(required = true)
    protected ScanFileExtListTransport scanFileExtListRetrieveReturn;

    /**
     * Gets the value of the scanFileExtListRetrieveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ScanFileExtListTransport }
     *     
     */
    public ScanFileExtListTransport getScanFileExtListRetrieveReturn() {
        return scanFileExtListRetrieveReturn;
    }

    /**
     * Sets the value of the scanFileExtListRetrieveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScanFileExtListTransport }
     *     
     */
    public void setScanFileExtListRetrieveReturn(ScanFileExtListTransport value) {
        this.scanFileExtListRetrieveReturn = value;
    }

}
