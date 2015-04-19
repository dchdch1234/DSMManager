
package local.charles.module.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="type" type="{urn:Manager}EnumJobType"/>
 *         &lt;element name="sinceManagerTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="hostIDs" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
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
    "type",
    "sinceManagerTime",
    "hostIDs",
    "sid"
})
@XmlRootElement(name = "hostJobProgress")
public class HostJobProgress {

    @XmlElement(required = true)
    protected EnumJobType type;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sinceManagerTime;
    @XmlElement(type = Integer.class)
    protected List<Integer> hostIDs;
    @XmlElement(name = "sID", required = true)
    protected String sid;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EnumJobType }
     *     
     */
    public EnumJobType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumJobType }
     *     
     */
    public void setType(EnumJobType value) {
        this.type = value;
    }

    /**
     * Gets the value of the sinceManagerTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSinceManagerTime() {
        return sinceManagerTime;
    }

    /**
     * Sets the value of the sinceManagerTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSinceManagerTime(XMLGregorianCalendar value) {
        this.sinceManagerTime = value;
    }

    /**
     * Gets the value of the hostIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getHostIDs() {
        if (hostIDs == null) {
            hostIDs = new ArrayList<Integer>();
        }
        return this.hostIDs;
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
