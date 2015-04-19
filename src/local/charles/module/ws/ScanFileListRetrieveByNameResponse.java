
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
 *         &lt;element name="scanFileListRetrieveByNameReturn" type="{urn:Manager}ScanFileListTransport"/>
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
    "scanFileListRetrieveByNameReturn"
})
@XmlRootElement(name = "scanFileListRetrieveByNameResponse")
public class ScanFileListRetrieveByNameResponse {

    @XmlElement(required = true)
    protected ScanFileListTransport scanFileListRetrieveByNameReturn;

    /**
     * Gets the value of the scanFileListRetrieveByNameReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ScanFileListTransport }
     *     
     */
    public ScanFileListTransport getScanFileListRetrieveByNameReturn() {
        return scanFileListRetrieveByNameReturn;
    }

    /**
     * Sets the value of the scanFileListRetrieveByNameReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScanFileListTransport }
     *     
     */
    public void setScanFileListRetrieveByNameReturn(ScanFileListTransport value) {
        this.scanFileListRetrieveByNameReturn = value;
    }

}
