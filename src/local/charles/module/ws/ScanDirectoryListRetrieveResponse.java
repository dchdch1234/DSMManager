
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
 *         &lt;element name="scanDirectoryListRetrieveReturn" type="{urn:Manager}ScanDirectoryListTransport"/>
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
    "scanDirectoryListRetrieveReturn"
})
@XmlRootElement(name = "scanDirectoryListRetrieveResponse")
public class ScanDirectoryListRetrieveResponse {

    @XmlElement(required = true)
    protected ScanDirectoryListTransport scanDirectoryListRetrieveReturn;

    /**
     * Gets the value of the scanDirectoryListRetrieveReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ScanDirectoryListTransport }
     *     
     */
    public ScanDirectoryListTransport getScanDirectoryListRetrieveReturn() {
        return scanDirectoryListRetrieveReturn;
    }

    /**
     * Sets the value of the scanDirectoryListRetrieveReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScanDirectoryListTransport }
     *     
     */
    public void setScanDirectoryListRetrieveReturn(ScanDirectoryListTransport value) {
        this.scanDirectoryListRetrieveReturn = value;
    }

}
