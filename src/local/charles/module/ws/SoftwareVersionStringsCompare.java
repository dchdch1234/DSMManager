
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
 *         &lt;element name="version1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="version2" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "version1",
    "version2",
    "sid"
})
@XmlRootElement(name = "softwareVersionStringsCompare")
public class SoftwareVersionStringsCompare {

    @XmlElement(required = true)
    protected String version1;
    @XmlElement(required = true)
    protected String version2;
    @XmlElement(name = "sID", required = true)
    protected String sid;

    /**
     * Gets the value of the version1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion1() {
        return version1;
    }

    /**
     * Sets the value of the version1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion1(String value) {
        this.version1 = value;
    }

    /**
     * Gets the value of the version2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion2() {
        return version2;
    }

    /**
     * Sets the value of the version2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion2(String value) {
        this.version2 = value;
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
