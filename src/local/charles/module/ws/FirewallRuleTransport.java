
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FirewallRuleTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FirewallRuleTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}ConfigurationTransport">
 *       &lt;sequence>
 *         &lt;element name="action" type="{urn:Manager}EnumFirewallRuleAction"/>
 *         &lt;element name="anyFlags" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="destinationIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinationIPListID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="destinationIPMask" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinationIPNot" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="destinationIPRangeFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinationIPRangeTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinationIPType" type="{urn:Manager}EnumFirewallRuleIPType"/>
 *         &lt;element name="destinationMAC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinationMACListID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="destinationMACNot" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="destinationMACType" type="{urn:Manager}EnumMACType"/>
 *         &lt;element name="destinationPortListID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="destinationPortNot" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="destinationPortType" type="{urn:Manager}EnumPortType"/>
 *         &lt;element name="destinationPorts" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinationSingleIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="disabledLog" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="frameNot" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="frameNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="frameType" type="{urn:Manager}EnumFirewallRuleFrameType"/>
 *         &lt;element name="icmpCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="icmpNot" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="icmpType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="packetDirection" type="{urn:Manager}EnumDirection"/>
 *         &lt;element name="priority" type="{urn:Manager}EnumFirewallRulePriority"/>
 *         &lt;element name="protocolNot" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="protocolNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="protocolType" type="{urn:Manager}EnumFirewallRuleProtocolType"/>
 *         &lt;element name="raiseAlert" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="scheduleID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sourceIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceIPListID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sourceIPMask" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceIPNot" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sourceIPRangeFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceIPRangeTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceIPType" type="{urn:Manager}EnumFirewallRuleIPType"/>
 *         &lt;element name="sourceMAC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceMACListID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sourceMACNot" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sourceMACType" type="{urn:Manager}EnumMACType"/>
 *         &lt;element name="sourcePortListID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sourcePortNot" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sourcePortType" type="{urn:Manager}EnumPortType"/>
 *         &lt;element name="sourcePorts" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceSingleIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tcpFlagACK" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tcpFlagFIN" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tcpFlagPSH" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tcpFlagRST" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tcpFlagSYN" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tcpFlagURG" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tcpNot" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FirewallRuleTransport", propOrder = {
    "action",
    "anyFlags",
    "destinationIP",
    "destinationIPListID",
    "destinationIPMask",
    "destinationIPNot",
    "destinationIPRangeFrom",
    "destinationIPRangeTo",
    "destinationIPType",
    "destinationMAC",
    "destinationMACListID",
    "destinationMACNot",
    "destinationMACType",
    "destinationPortListID",
    "destinationPortNot",
    "destinationPortType",
    "destinationPorts",
    "destinationSingleIP",
    "disabledLog",
    "frameNot",
    "frameNumber",
    "frameType",
    "icmpCode",
    "icmpNot",
    "icmpType",
    "packetDirection",
    "priority",
    "protocolNot",
    "protocolNumber",
    "protocolType",
    "raiseAlert",
    "scheduleID",
    "sourceIP",
    "sourceIPListID",
    "sourceIPMask",
    "sourceIPNot",
    "sourceIPRangeFrom",
    "sourceIPRangeTo",
    "sourceIPType",
    "sourceMAC",
    "sourceMACListID",
    "sourceMACNot",
    "sourceMACType",
    "sourcePortListID",
    "sourcePortNot",
    "sourcePortType",
    "sourcePorts",
    "sourceSingleIP",
    "tcpFlagACK",
    "tcpFlagFIN",
    "tcpFlagPSH",
    "tcpFlagRST",
    "tcpFlagSYN",
    "tcpFlagURG",
    "tcpNot"
})
public class FirewallRuleTransport
    extends ConfigurationTransport
{

    @XmlElement(required = true, nillable = true)
    protected EnumFirewallRuleAction action;
    protected boolean anyFlags;
    @XmlElement(required = true, nillable = true)
    protected String destinationIP;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer destinationIPListID;
    @XmlElement(required = true, nillable = true)
    protected String destinationIPMask;
    protected boolean destinationIPNot;
    @XmlElement(required = true, nillable = true)
    protected String destinationIPRangeFrom;
    @XmlElement(required = true, nillable = true)
    protected String destinationIPRangeTo;
    @XmlElement(required = true, nillable = true)
    protected EnumFirewallRuleIPType destinationIPType;
    @XmlElement(required = true, nillable = true)
    protected String destinationMAC;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer destinationMACListID;
    protected boolean destinationMACNot;
    @XmlElement(required = true, nillable = true)
    protected EnumMACType destinationMACType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer destinationPortListID;
    protected boolean destinationPortNot;
    @XmlElement(required = true, nillable = true)
    protected EnumPortType destinationPortType;
    @XmlElement(required = true, nillable = true)
    protected String destinationPorts;
    @XmlElement(required = true, nillable = true)
    protected String destinationSingleIP;
    protected boolean disabledLog;
    protected boolean frameNot;
    @XmlElement(required = true, nillable = true)
    protected String frameNumber;
    @XmlElement(required = true, nillable = true)
    protected EnumFirewallRuleFrameType frameType;
    protected int icmpCode;
    protected boolean icmpNot;
    protected int icmpType;
    @XmlElement(required = true, nillable = true)
    protected EnumDirection packetDirection;
    @XmlElement(required = true, nillable = true)
    protected EnumFirewallRulePriority priority;
    protected boolean protocolNot;
    protected int protocolNumber;
    @XmlElement(required = true, nillable = true)
    protected EnumFirewallRuleProtocolType protocolType;
    protected boolean raiseAlert;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer scheduleID;
    @XmlElement(required = true, nillable = true)
    protected String sourceIP;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer sourceIPListID;
    @XmlElement(required = true, nillable = true)
    protected String sourceIPMask;
    protected boolean sourceIPNot;
    @XmlElement(required = true, nillable = true)
    protected String sourceIPRangeFrom;
    @XmlElement(required = true, nillable = true)
    protected String sourceIPRangeTo;
    @XmlElement(required = true, nillable = true)
    protected EnumFirewallRuleIPType sourceIPType;
    @XmlElement(required = true, nillable = true)
    protected String sourceMAC;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer sourceMACListID;
    protected boolean sourceMACNot;
    @XmlElement(required = true, nillable = true)
    protected EnumMACType sourceMACType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer sourcePortListID;
    protected boolean sourcePortNot;
    @XmlElement(required = true, nillable = true)
    protected EnumPortType sourcePortType;
    @XmlElement(required = true, nillable = true)
    protected String sourcePorts;
    @XmlElement(required = true, nillable = true)
    protected String sourceSingleIP;
    protected boolean tcpFlagACK;
    protected boolean tcpFlagFIN;
    protected boolean tcpFlagPSH;
    protected boolean tcpFlagRST;
    protected boolean tcpFlagSYN;
    protected boolean tcpFlagURG;
    protected boolean tcpNot;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link EnumFirewallRuleAction }
     *     
     */
    public EnumFirewallRuleAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumFirewallRuleAction }
     *     
     */
    public void setAction(EnumFirewallRuleAction value) {
        this.action = value;
    }

    /**
     * Gets the value of the anyFlags property.
     * 
     */
    public boolean isAnyFlags() {
        return anyFlags;
    }

    /**
     * Sets the value of the anyFlags property.
     * 
     */
    public void setAnyFlags(boolean value) {
        this.anyFlags = value;
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
     * Gets the value of the destinationIPListID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDestinationIPListID() {
        return destinationIPListID;
    }

    /**
     * Sets the value of the destinationIPListID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDestinationIPListID(Integer value) {
        this.destinationIPListID = value;
    }

    /**
     * Gets the value of the destinationIPMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationIPMask() {
        return destinationIPMask;
    }

    /**
     * Sets the value of the destinationIPMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationIPMask(String value) {
        this.destinationIPMask = value;
    }

    /**
     * Gets the value of the destinationIPNot property.
     * 
     */
    public boolean isDestinationIPNot() {
        return destinationIPNot;
    }

    /**
     * Sets the value of the destinationIPNot property.
     * 
     */
    public void setDestinationIPNot(boolean value) {
        this.destinationIPNot = value;
    }

    /**
     * Gets the value of the destinationIPRangeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationIPRangeFrom() {
        return destinationIPRangeFrom;
    }

    /**
     * Sets the value of the destinationIPRangeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationIPRangeFrom(String value) {
        this.destinationIPRangeFrom = value;
    }

    /**
     * Gets the value of the destinationIPRangeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationIPRangeTo() {
        return destinationIPRangeTo;
    }

    /**
     * Sets the value of the destinationIPRangeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationIPRangeTo(String value) {
        this.destinationIPRangeTo = value;
    }

    /**
     * Gets the value of the destinationIPType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumFirewallRuleIPType }
     *     
     */
    public EnumFirewallRuleIPType getDestinationIPType() {
        return destinationIPType;
    }

    /**
     * Sets the value of the destinationIPType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumFirewallRuleIPType }
     *     
     */
    public void setDestinationIPType(EnumFirewallRuleIPType value) {
        this.destinationIPType = value;
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
     * Gets the value of the destinationMACListID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDestinationMACListID() {
        return destinationMACListID;
    }

    /**
     * Sets the value of the destinationMACListID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDestinationMACListID(Integer value) {
        this.destinationMACListID = value;
    }

    /**
     * Gets the value of the destinationMACNot property.
     * 
     */
    public boolean isDestinationMACNot() {
        return destinationMACNot;
    }

    /**
     * Sets the value of the destinationMACNot property.
     * 
     */
    public void setDestinationMACNot(boolean value) {
        this.destinationMACNot = value;
    }

    /**
     * Gets the value of the destinationMACType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumMACType }
     *     
     */
    public EnumMACType getDestinationMACType() {
        return destinationMACType;
    }

    /**
     * Sets the value of the destinationMACType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumMACType }
     *     
     */
    public void setDestinationMACType(EnumMACType value) {
        this.destinationMACType = value;
    }

    /**
     * Gets the value of the destinationPortListID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDestinationPortListID() {
        return destinationPortListID;
    }

    /**
     * Sets the value of the destinationPortListID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDestinationPortListID(Integer value) {
        this.destinationPortListID = value;
    }

    /**
     * Gets the value of the destinationPortNot property.
     * 
     */
    public boolean isDestinationPortNot() {
        return destinationPortNot;
    }

    /**
     * Sets the value of the destinationPortNot property.
     * 
     */
    public void setDestinationPortNot(boolean value) {
        this.destinationPortNot = value;
    }

    /**
     * Gets the value of the destinationPortType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumPortType }
     *     
     */
    public EnumPortType getDestinationPortType() {
        return destinationPortType;
    }

    /**
     * Sets the value of the destinationPortType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumPortType }
     *     
     */
    public void setDestinationPortType(EnumPortType value) {
        this.destinationPortType = value;
    }

    /**
     * Gets the value of the destinationPorts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationPorts() {
        return destinationPorts;
    }

    /**
     * Sets the value of the destinationPorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationPorts(String value) {
        this.destinationPorts = value;
    }

    /**
     * Gets the value of the destinationSingleIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationSingleIP() {
        return destinationSingleIP;
    }

    /**
     * Sets the value of the destinationSingleIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationSingleIP(String value) {
        this.destinationSingleIP = value;
    }

    /**
     * Gets the value of the disabledLog property.
     * 
     */
    public boolean isDisabledLog() {
        return disabledLog;
    }

    /**
     * Sets the value of the disabledLog property.
     * 
     */
    public void setDisabledLog(boolean value) {
        this.disabledLog = value;
    }

    /**
     * Gets the value of the frameNot property.
     * 
     */
    public boolean isFrameNot() {
        return frameNot;
    }

    /**
     * Sets the value of the frameNot property.
     * 
     */
    public void setFrameNot(boolean value) {
        this.frameNot = value;
    }

    /**
     * Gets the value of the frameNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrameNumber() {
        return frameNumber;
    }

    /**
     * Sets the value of the frameNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrameNumber(String value) {
        this.frameNumber = value;
    }

    /**
     * Gets the value of the frameType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumFirewallRuleFrameType }
     *     
     */
    public EnumFirewallRuleFrameType getFrameType() {
        return frameType;
    }

    /**
     * Sets the value of the frameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumFirewallRuleFrameType }
     *     
     */
    public void setFrameType(EnumFirewallRuleFrameType value) {
        this.frameType = value;
    }

    /**
     * Gets the value of the icmpCode property.
     * 
     */
    public int getIcmpCode() {
        return icmpCode;
    }

    /**
     * Sets the value of the icmpCode property.
     * 
     */
    public void setIcmpCode(int value) {
        this.icmpCode = value;
    }

    /**
     * Gets the value of the icmpNot property.
     * 
     */
    public boolean isIcmpNot() {
        return icmpNot;
    }

    /**
     * Sets the value of the icmpNot property.
     * 
     */
    public void setIcmpNot(boolean value) {
        this.icmpNot = value;
    }

    /**
     * Gets the value of the icmpType property.
     * 
     */
    public int getIcmpType() {
        return icmpType;
    }

    /**
     * Sets the value of the icmpType property.
     * 
     */
    public void setIcmpType(int value) {
        this.icmpType = value;
    }

    /**
     * Gets the value of the packetDirection property.
     * 
     * @return
     *     possible object is
     *     {@link EnumDirection }
     *     
     */
    public EnumDirection getPacketDirection() {
        return packetDirection;
    }

    /**
     * Sets the value of the packetDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumDirection }
     *     
     */
    public void setPacketDirection(EnumDirection value) {
        this.packetDirection = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link EnumFirewallRulePriority }
     *     
     */
    public EnumFirewallRulePriority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumFirewallRulePriority }
     *     
     */
    public void setPriority(EnumFirewallRulePriority value) {
        this.priority = value;
    }

    /**
     * Gets the value of the protocolNot property.
     * 
     */
    public boolean isProtocolNot() {
        return protocolNot;
    }

    /**
     * Sets the value of the protocolNot property.
     * 
     */
    public void setProtocolNot(boolean value) {
        this.protocolNot = value;
    }

    /**
     * Gets the value of the protocolNumber property.
     * 
     */
    public int getProtocolNumber() {
        return protocolNumber;
    }

    /**
     * Sets the value of the protocolNumber property.
     * 
     */
    public void setProtocolNumber(int value) {
        this.protocolNumber = value;
    }

    /**
     * Gets the value of the protocolType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumFirewallRuleProtocolType }
     *     
     */
    public EnumFirewallRuleProtocolType getProtocolType() {
        return protocolType;
    }

    /**
     * Sets the value of the protocolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumFirewallRuleProtocolType }
     *     
     */
    public void setProtocolType(EnumFirewallRuleProtocolType value) {
        this.protocolType = value;
    }

    /**
     * Gets the value of the raiseAlert property.
     * 
     */
    public boolean isRaiseAlert() {
        return raiseAlert;
    }

    /**
     * Sets the value of the raiseAlert property.
     * 
     */
    public void setRaiseAlert(boolean value) {
        this.raiseAlert = value;
    }

    /**
     * Gets the value of the scheduleID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScheduleID() {
        return scheduleID;
    }

    /**
     * Sets the value of the scheduleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScheduleID(Integer value) {
        this.scheduleID = value;
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
     * Gets the value of the sourceIPListID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSourceIPListID() {
        return sourceIPListID;
    }

    /**
     * Sets the value of the sourceIPListID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSourceIPListID(Integer value) {
        this.sourceIPListID = value;
    }

    /**
     * Gets the value of the sourceIPMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceIPMask() {
        return sourceIPMask;
    }

    /**
     * Sets the value of the sourceIPMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceIPMask(String value) {
        this.sourceIPMask = value;
    }

    /**
     * Gets the value of the sourceIPNot property.
     * 
     */
    public boolean isSourceIPNot() {
        return sourceIPNot;
    }

    /**
     * Sets the value of the sourceIPNot property.
     * 
     */
    public void setSourceIPNot(boolean value) {
        this.sourceIPNot = value;
    }

    /**
     * Gets the value of the sourceIPRangeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceIPRangeFrom() {
        return sourceIPRangeFrom;
    }

    /**
     * Sets the value of the sourceIPRangeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceIPRangeFrom(String value) {
        this.sourceIPRangeFrom = value;
    }

    /**
     * Gets the value of the sourceIPRangeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceIPRangeTo() {
        return sourceIPRangeTo;
    }

    /**
     * Sets the value of the sourceIPRangeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceIPRangeTo(String value) {
        this.sourceIPRangeTo = value;
    }

    /**
     * Gets the value of the sourceIPType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumFirewallRuleIPType }
     *     
     */
    public EnumFirewallRuleIPType getSourceIPType() {
        return sourceIPType;
    }

    /**
     * Sets the value of the sourceIPType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumFirewallRuleIPType }
     *     
     */
    public void setSourceIPType(EnumFirewallRuleIPType value) {
        this.sourceIPType = value;
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
     * Gets the value of the sourceMACListID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSourceMACListID() {
        return sourceMACListID;
    }

    /**
     * Sets the value of the sourceMACListID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSourceMACListID(Integer value) {
        this.sourceMACListID = value;
    }

    /**
     * Gets the value of the sourceMACNot property.
     * 
     */
    public boolean isSourceMACNot() {
        return sourceMACNot;
    }

    /**
     * Sets the value of the sourceMACNot property.
     * 
     */
    public void setSourceMACNot(boolean value) {
        this.sourceMACNot = value;
    }

    /**
     * Gets the value of the sourceMACType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumMACType }
     *     
     */
    public EnumMACType getSourceMACType() {
        return sourceMACType;
    }

    /**
     * Sets the value of the sourceMACType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumMACType }
     *     
     */
    public void setSourceMACType(EnumMACType value) {
        this.sourceMACType = value;
    }

    /**
     * Gets the value of the sourcePortListID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSourcePortListID() {
        return sourcePortListID;
    }

    /**
     * Sets the value of the sourcePortListID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSourcePortListID(Integer value) {
        this.sourcePortListID = value;
    }

    /**
     * Gets the value of the sourcePortNot property.
     * 
     */
    public boolean isSourcePortNot() {
        return sourcePortNot;
    }

    /**
     * Sets the value of the sourcePortNot property.
     * 
     */
    public void setSourcePortNot(boolean value) {
        this.sourcePortNot = value;
    }

    /**
     * Gets the value of the sourcePortType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumPortType }
     *     
     */
    public EnumPortType getSourcePortType() {
        return sourcePortType;
    }

    /**
     * Sets the value of the sourcePortType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumPortType }
     *     
     */
    public void setSourcePortType(EnumPortType value) {
        this.sourcePortType = value;
    }

    /**
     * Gets the value of the sourcePorts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcePorts() {
        return sourcePorts;
    }

    /**
     * Sets the value of the sourcePorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcePorts(String value) {
        this.sourcePorts = value;
    }

    /**
     * Gets the value of the sourceSingleIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSingleIP() {
        return sourceSingleIP;
    }

    /**
     * Sets the value of the sourceSingleIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSingleIP(String value) {
        this.sourceSingleIP = value;
    }

    /**
     * Gets the value of the tcpFlagACK property.
     * 
     */
    public boolean isTcpFlagACK() {
        return tcpFlagACK;
    }

    /**
     * Sets the value of the tcpFlagACK property.
     * 
     */
    public void setTcpFlagACK(boolean value) {
        this.tcpFlagACK = value;
    }

    /**
     * Gets the value of the tcpFlagFIN property.
     * 
     */
    public boolean isTcpFlagFIN() {
        return tcpFlagFIN;
    }

    /**
     * Sets the value of the tcpFlagFIN property.
     * 
     */
    public void setTcpFlagFIN(boolean value) {
        this.tcpFlagFIN = value;
    }

    /**
     * Gets the value of the tcpFlagPSH property.
     * 
     */
    public boolean isTcpFlagPSH() {
        return tcpFlagPSH;
    }

    /**
     * Sets the value of the tcpFlagPSH property.
     * 
     */
    public void setTcpFlagPSH(boolean value) {
        this.tcpFlagPSH = value;
    }

    /**
     * Gets the value of the tcpFlagRST property.
     * 
     */
    public boolean isTcpFlagRST() {
        return tcpFlagRST;
    }

    /**
     * Sets the value of the tcpFlagRST property.
     * 
     */
    public void setTcpFlagRST(boolean value) {
        this.tcpFlagRST = value;
    }

    /**
     * Gets the value of the tcpFlagSYN property.
     * 
     */
    public boolean isTcpFlagSYN() {
        return tcpFlagSYN;
    }

    /**
     * Sets the value of the tcpFlagSYN property.
     * 
     */
    public void setTcpFlagSYN(boolean value) {
        this.tcpFlagSYN = value;
    }

    /**
     * Gets the value of the tcpFlagURG property.
     * 
     */
    public boolean isTcpFlagURG() {
        return tcpFlagURG;
    }

    /**
     * Sets the value of the tcpFlagURG property.
     * 
     */
    public void setTcpFlagURG(boolean value) {
        this.tcpFlagURG = value;
    }

    /**
     * Gets the value of the tcpNot property.
     * 
     */
    public boolean isTcpNot() {
        return tcpNot;
    }

    /**
     * Sets the value of the tcpNot property.
     * 
     */
    public void setTcpNot(boolean value) {
        this.tcpNot = value;
    }

}
