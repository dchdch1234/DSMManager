
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
 *         &lt;element name="softwareVersionStringsCompareReturn" type="{urn:Manager}EnumCompareResults"/>
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
    "softwareVersionStringsCompareReturn"
})
@XmlRootElement(name = "softwareVersionStringsCompareResponse")
public class SoftwareVersionStringsCompareResponse {

    @XmlElement(required = true)
    protected EnumCompareResults softwareVersionStringsCompareReturn;

    /**
     * Gets the value of the softwareVersionStringsCompareReturn property.
     * 
     * @return
     *     possible object is
     *     {@link EnumCompareResults }
     *     
     */
    public EnumCompareResults getSoftwareVersionStringsCompareReturn() {
        return softwareVersionStringsCompareReturn;
    }

    /**
     * Sets the value of the softwareVersionStringsCompareReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCompareResults }
     *     
     */
    public void setSoftwareVersionStringsCompareReturn(EnumCompareResults value) {
        this.softwareVersionStringsCompareReturn = value;
    }

}
