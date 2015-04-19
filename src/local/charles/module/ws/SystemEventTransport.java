
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SystemEventTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemEventTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}TransportObject">
 *       &lt;sequence>
 *         &lt;element name="actionPerformedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="event" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eventID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="eventOrigin" type="{urn:Manager}EnumEventOrigin"/>
 *         &lt;element name="managerHostname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="systemEventID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tags" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="target" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="targetType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemEventTransport", propOrder = {
    "actionPerformedBy",
    "description",
    "event",
    "eventID",
    "eventOrigin",
    "managerHostname",
    "systemEventID",
    "tags",
    "target",
    "targetID",
    "targetType",
    "time",
    "type"
})
public class SystemEventTransport
    extends TransportObject
{

    @XmlElement(required = true, nillable = true)
    protected String actionPerformedBy;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(required = true, nillable = true)
    protected String event;
    protected int eventID;
    @XmlElement(required = true, nillable = true)
    protected EnumEventOrigin eventOrigin;
    @XmlElement(required = true, nillable = true)
    protected String managerHostname;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer systemEventID;
    @XmlElement(required = true, nillable = true)
    protected String tags;
    @XmlElement(required = true, nillable = true)
    protected String target;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer targetID;
    @XmlElement(required = true, nillable = true)
    protected String targetType;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    @XmlElement(required = true, nillable = true)
    protected String type;

    /**
     * Gets the value of the actionPerformedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionPerformedBy() {
        return actionPerformedBy;
    }

    /**
     * Sets the value of the actionPerformedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionPerformedBy(String value) {
        this.actionPerformedBy = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvent(String value) {
        this.event = value;
    }

    /**
     * Gets the value of the eventID property.
     * 
     */
    public int getEventID() {
        return eventID;
    }

    /**
     * Sets the value of the eventID property.
     * 
     */
    public void setEventID(int value) {
        this.eventID = value;
    }

    /**
     * Gets the value of the eventOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link EnumEventOrigin }
     *     
     */
    public EnumEventOrigin getEventOrigin() {
        return eventOrigin;
    }

    /**
     * Sets the value of the eventOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumEventOrigin }
     *     
     */
    public void setEventOrigin(EnumEventOrigin value) {
        this.eventOrigin = value;
    }

    /**
     * Gets the value of the managerHostname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerHostname() {
        return managerHostname;
    }

    /**
     * Sets the value of the managerHostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerHostname(String value) {
        this.managerHostname = value;
    }

    /**
     * Gets the value of the systemEventID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSystemEventID() {
        return systemEventID;
    }

    /**
     * Sets the value of the systemEventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSystemEventID(Integer value) {
        this.systemEventID = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTags(String value) {
        this.tags = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the targetID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTargetID() {
        return targetID;
    }

    /**
     * Sets the value of the targetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTargetID(Integer value) {
        this.targetID = value;
    }

    /**
     * Gets the value of the targetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetType() {
        return targetType;
    }

    /**
     * Sets the value of the targetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetType(String value) {
        this.targetType = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
