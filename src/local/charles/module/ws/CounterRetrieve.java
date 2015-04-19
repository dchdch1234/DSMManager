
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
 *         &lt;element name="counterFilter" type="{urn:Manager}EnumCounterFilter"/>
 *         &lt;element name="timeFilter" type="{urn:Manager}TimeFilterTransport"/>
 *         &lt;element name="hostFilter" type="{urn:Manager}HostFilterTransport"/>
 *         &lt;element name="tagFilter" type="{urn:Manager}TagFilterTransport"/>
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
    "counterFilter",
    "timeFilter",
    "hostFilter",
    "tagFilter",
    "sid"
})
@XmlRootElement(name = "counterRetrieve")
public class CounterRetrieve {

    @XmlElement(required = true)
    protected EnumCounterFilter counterFilter;
    @XmlElement(required = true)
    protected TimeFilterTransport timeFilter;
    @XmlElement(required = true)
    protected HostFilterTransport hostFilter;
    @XmlElement(required = true)
    protected TagFilterTransport tagFilter;
    @XmlElement(name = "sID", required = true)
    protected String sid;

    /**
     * Gets the value of the counterFilter property.
     * 
     * @return
     *     possible object is
     *     {@link EnumCounterFilter }
     *     
     */
    public EnumCounterFilter getCounterFilter() {
        return counterFilter;
    }

    /**
     * Sets the value of the counterFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCounterFilter }
     *     
     */
    public void setCounterFilter(EnumCounterFilter value) {
        this.counterFilter = value;
    }

    /**
     * Gets the value of the timeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TimeFilterTransport }
     *     
     */
    public TimeFilterTransport getTimeFilter() {
        return timeFilter;
    }

    /**
     * Sets the value of the timeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFilterTransport }
     *     
     */
    public void setTimeFilter(TimeFilterTransport value) {
        this.timeFilter = value;
    }

    /**
     * Gets the value of the hostFilter property.
     * 
     * @return
     *     possible object is
     *     {@link HostFilterTransport }
     *     
     */
    public HostFilterTransport getHostFilter() {
        return hostFilter;
    }

    /**
     * Sets the value of the hostFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostFilterTransport }
     *     
     */
    public void setHostFilter(HostFilterTransport value) {
        this.hostFilter = value;
    }

    /**
     * Gets the value of the tagFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TagFilterTransport }
     *     
     */
    public TagFilterTransport getTagFilter() {
        return tagFilter;
    }

    /**
     * Sets the value of the tagFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TagFilterTransport }
     *     
     */
    public void setTagFilter(TagFilterTransport value) {
        this.tagFilter = value;
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
