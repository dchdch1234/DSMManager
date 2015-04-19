
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LogInspectionEventTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogInspectionEventTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}TransportObject">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="command" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinationIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinationPort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinationUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fullEvent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groups" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hostID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="logInspectionEventID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="logInspectionRuleID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="logTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="programName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="protocol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ruleID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="severity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceHostName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourcePort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="systemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tags" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogInspectionEventTransport", propOrder = {
    "action",
    "command",
    "data",
    "description",
    "destinationIP",
    "destinationPort",
    "destinationUser",
    "fullEvent",
    "groups",
    "hostID",
    "hostName",
    "location",
    "logInspectionEventID",
    "logInspectionRuleID",
    "logTime",
    "message",
    "programName",
    "protocol",
    "rank",
    "reason",
    "ruleID",
    "severity",
    "sourceHostName",
    "sourceID",
    "sourceIP",
    "sourcePort",
    "sourceUser",
    "status",
    "systemName",
    "tags",
    "url"
})
public class LogInspectionEventTransport
    extends TransportObject
{

    @XmlElement(required = true, nillable = true)
    protected String action;
    @XmlElement(required = true, nillable = true)
    protected String command;
    @XmlElement(required = true, nillable = true)
    protected String data;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(required = true, nillable = true)
    protected String destinationIP;
    @XmlElement(required = true, nillable = true)
    protected String destinationPort;
    @XmlElement(required = true, nillable = true)
    protected String destinationUser;
    @XmlElement(required = true, nillable = true)
    protected String fullEvent;
    @XmlElement(required = true, nillable = true)
    protected String groups;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer hostID;
    @XmlElement(required = true, nillable = true)
    protected String hostName;
    @XmlElement(required = true, nillable = true)
    protected String location;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer logInspectionEventID;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer logInspectionRuleID;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar logTime;
    @XmlElement(required = true, nillable = true)
    protected String message;
    @XmlElement(required = true, nillable = true)
    protected String programName;
    @XmlElement(required = true, nillable = true)
    protected String protocol;
    protected int rank;
    @XmlElement(required = true, nillable = true)
    protected String reason;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer ruleID;
    @XmlElement(required = true, nillable = true)
    protected String severity;
    @XmlElement(required = true, nillable = true)
    protected String sourceHostName;
    @XmlElement(required = true, nillable = true)
    protected String sourceID;
    @XmlElement(required = true, nillable = true)
    protected String sourceIP;
    @XmlElement(required = true, nillable = true)
    protected String sourcePort;
    @XmlElement(required = true, nillable = true)
    protected String sourceUser;
    @XmlElement(required = true, nillable = true)
    protected String status;
    @XmlElement(required = true, nillable = true)
    protected String systemName;
    @XmlElement(required = true, nillable = true)
    protected String tags;
    @XmlElement(required = true, nillable = true)
    protected String url;

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
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
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
     * Gets the value of the destinationUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationUser() {
        return destinationUser;
    }

    /**
     * Sets the value of the destinationUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationUser(String value) {
        this.destinationUser = value;
    }

    /**
     * Gets the value of the fullEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullEvent() {
        return fullEvent;
    }

    /**
     * Sets the value of the fullEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullEvent(String value) {
        this.fullEvent = value;
    }

    /**
     * Gets the value of the groups property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroups() {
        return groups;
    }

    /**
     * Sets the value of the groups property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroups(String value) {
        this.groups = value;
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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the logInspectionEventID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLogInspectionEventID() {
        return logInspectionEventID;
    }

    /**
     * Sets the value of the logInspectionEventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLogInspectionEventID(Integer value) {
        this.logInspectionEventID = value;
    }

    /**
     * Gets the value of the logInspectionRuleID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLogInspectionRuleID() {
        return logInspectionRuleID;
    }

    /**
     * Sets the value of the logInspectionRuleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLogInspectionRuleID(Integer value) {
        this.logInspectionRuleID = value;
    }

    /**
     * Gets the value of the logTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLogTime() {
        return logTime;
    }

    /**
     * Sets the value of the logTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLogTime(XMLGregorianCalendar value) {
        this.logTime = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the programName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramName(String value) {
        this.programName = value;
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
     * Gets the value of the ruleID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRuleID() {
        return ruleID;
    }

    /**
     * Sets the value of the ruleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRuleID(Integer value) {
        this.ruleID = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    /**
     * Gets the value of the sourceHostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceHostName() {
        return sourceHostName;
    }

    /**
     * Sets the value of the sourceHostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceHostName(String value) {
        this.sourceHostName = value;
    }

    /**
     * Gets the value of the sourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceID() {
        return sourceID;
    }

    /**
     * Sets the value of the sourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceID(String value) {
        this.sourceID = value;
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
     * Gets the value of the sourceUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceUser() {
        return sourceUser;
    }

    /**
     * Sets the value of the sourceUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceUser(String value) {
        this.sourceUser = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the systemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemName() {
        return systemName;
    }

    /**
     * Sets the value of the systemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemName(String value) {
        this.systemName = value;
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
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

}
