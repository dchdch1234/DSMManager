
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FirewallEventTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FirewallEventTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}TransportObject">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="dataFlags" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dataIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="destinationIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinationMAC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinationPort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="direction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="driverTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="eventOrigin" type="{urn:Manager}EnumEventOrigin"/>
 *         &lt;element name="firewallEventID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="flags" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flow" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="frameType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hostID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iface" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="packetSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="protocol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="repeatCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sourceIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceMAC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourcePort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tags" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FirewallEventTransport", propOrder = {
    "action",
    "data",
    "dataFlags",
    "dataIndex",
    "destinationIP",
    "destinationMAC",
    "destinationPort",
    "direction",
    "driverTime",
    "endTime",
    "eventOrigin",
    "firewallEventID",
    "flags",
    "flow",
    "frameType",
    "hostID",
    "hostName",
    "iface",
    "note",
    "packetSize",
    "protocol",
    "rank",
    "reason",
    "repeatCount",
    "sourceIP",
    "sourceMAC",
    "sourcePort",
    "startTime",
    "status",
    "tags"
})
public class FirewallEventTransport
    extends TransportObject
{

    @XmlElement(required = true, nillable = true)
    protected String action;
    @XmlElement(required = true, nillable = true)
    protected byte[] data;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer dataFlags;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer dataIndex;
    @XmlElement(required = true, nillable = true)
    protected String destinationIP;
    @XmlElement(required = true, nillable = true)
    protected String destinationMAC;
    @XmlElement(required = true, nillable = true)
    protected String destinationPort;
    @XmlElement(required = true, nillable = true)
    protected String direction;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long driverTime;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(required = true, nillable = true)
    protected EnumEventOrigin eventOrigin;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer firewallEventID;
    @XmlElement(required = true, nillable = true)
    protected String flags;
    @XmlElement(required = true, nillable = true)
    protected String flow;
    @XmlElement(required = true, nillable = true)
    protected String frameType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer hostID;
    @XmlElement(required = true, nillable = true)
    protected String hostName;
    @XmlElement(required = true, nillable = true)
    protected String iface;
    @XmlElement(required = true, nillable = true)
    protected String note;
    protected int packetSize;
    @XmlElement(required = true, nillable = true)
    protected String protocol;
    protected int rank;
    @XmlElement(required = true, nillable = true)
    protected String reason;
    protected int repeatCount;
    @XmlElement(required = true, nillable = true)
    protected String sourceIP;
    @XmlElement(required = true, nillable = true)
    protected String sourceMAC;
    @XmlElement(required = true, nillable = true)
    protected String sourcePort;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer status;
    @XmlElement(required = true, nillable = true)
    protected String tags;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setData(byte[] value) {
        this.data = ((byte[]) value);
    }

    /**
     * Gets the value of the dataFlags property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataFlags() {
        return dataFlags;
    }

    /**
     * Sets the value of the dataFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataFlags(Integer value) {
        this.dataFlags = value;
    }

    /**
     * Gets the value of the dataIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataIndex() {
        return dataIndex;
    }

    /**
     * Sets the value of the dataIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataIndex(Integer value) {
        this.dataIndex = value;
    }

    /**
     * Gets the value of the destinationIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationIP() {
        return destinationIP;
    }

    /**
     * Sets the value of the destinationIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationIP(String value) {
        this.destinationIP = value;
    }

    /**
     * Gets the value of the destinationMAC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationMAC() {
        return destinationMAC;
    }

    /**
     * Sets the value of the destinationMAC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationMAC(String value) {
        this.destinationMAC = value;
    }

    /**
     * Gets the value of the destinationPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationPort() {
        return destinationPort;
    }

    /**
     * Sets the value of the destinationPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationPort(String value) {
        this.destinationPort = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the driverTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDriverTime() {
        return driverTime;
    }

    /**
     * Sets the value of the driverTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDriverTime(Long value) {
        this.driverTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
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
     * Gets the value of the firewallEventID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFirewallEventID() {
        return firewallEventID;
    }

    /**
     * Sets the value of the firewallEventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirewallEventID(Integer value) {
        this.firewallEventID = value;
    }

    /**
     * Gets the value of the flags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlags() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlags(String value) {
        this.flags = value;
    }

    /**
     * Gets the value of the flow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlow() {
        return flow;
    }

    /**
     * Sets the value of the flow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlow(String value) {
        this.flow = value;
    }

    /**
     * Gets the value of the frameType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrameType() {
        return frameType;
    }

    /**
     * Sets the value of the frameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrameType(String value) {
        this.frameType = value;
    }

    /**
     * Gets the value of the hostID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHostID() {
        return hostID;
    }

    /**
     * Sets the value of the hostID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHostID(Integer value) {
        this.hostID = value;
    }

    /**
     * Gets the value of the hostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostName(String value) {
        this.hostName = value;
    }

    /**
     * Gets the value of the iface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIface() {
        return iface;
    }

    /**
     * Sets the value of the iface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIface(String value) {
        this.iface = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the packetSize property.
     * 
     */
    public int getPacketSize() {
        return packetSize;
    }

    /**
     * Sets the value of the packetSize property.
     * 
     */
    public void setPacketSize(int value) {
        this.packetSize = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocol(String value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the rank property.
     * 
     */
    public int getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     */
    public void setRank(int value) {
        this.rank = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the repeatCount property.
     * 
     */
    public int getRepeatCount() {
        return repeatCount;
    }

    /**
     * Sets the value of the repeatCount property.
     * 
     */
    public void setRepeatCount(int value) {
        this.repeatCount = value;
    }

    /**
     * Gets the value of the sourceIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceIP() {
        return sourceIP;
    }

    /**
     * Sets the value of the sourceIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceIP(String value) {
        this.sourceIP = value;
    }

    /**
     * Gets the value of the sourceMAC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceMAC() {
        return sourceMAC;
    }

    /**
     * Sets the value of the sourceMAC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceMAC(String value) {
        this.sourceMAC = value;
    }

    /**
     * Gets the value of the sourcePort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcePort() {
        return sourcePort;
    }

    /**
     * Sets the value of the sourcePort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcePort(String value) {
        this.sourcePort = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
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

}
