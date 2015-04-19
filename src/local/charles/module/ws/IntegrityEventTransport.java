
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for IntegrityEventTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntegrityEventTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}TransportObject">
 *       &lt;sequence>
 *         &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hostID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="integrityEventID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="integrityRuleID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isEntity" type="{urn:Manager}EntityTransport"/>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="logTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="process" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="severity" type="{urn:Manager}EnumIntegrityRuleSeverity"/>
 *         &lt;element name="tags" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wasEntity" type="{urn:Manager}EntityTransport"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegrityEventTransport", propOrder = {
    "change",
    "description",
    "hostID",
    "hostName",
    "integrityEventID",
    "integrityRuleID",
    "isEntity",
    "key",
    "logTime",
    "process",
    "rank",
    "reason",
    "severity",
    "tags",
    "type",
    "user",
    "wasEntity"
})
public class IntegrityEventTransport
    extends TransportObject
{

    @XmlElement(required = true, nillable = true)
    protected String change;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer hostID;
    @XmlElement(required = true, nillable = true)
    protected String hostName;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer integrityEventID;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer integrityRuleID;
    @XmlElement(required = true, nillable = true)
    protected EntityTransport isEntity;
    @XmlElement(required = true, nillable = true)
    protected String key;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar logTime;
    @XmlElement(required = true, nillable = true)
    protected String process;
    protected int rank;
    @XmlElement(required = true, nillable = true)
    protected String reason;
    @XmlElement(required = true, nillable = true)
    protected EnumIntegrityRuleSeverity severity;
    @XmlElement(required = true, nillable = true)
    protected String tags;
    @XmlElement(required = true, nillable = true)
    protected String type;
    @XmlElement(required = true, nillable = true)
    protected String user;
    @XmlElement(required = true, nillable = true)
    protected EntityTransport wasEntity;

    /**
     * Gets the value of the change property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChange() {
        return change;
    }

    /**
     * Sets the value of the change property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChange(String value) {
        this.change = value;
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
     * Gets the value of the integrityEventID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntegrityEventID() {
        return integrityEventID;
    }

    /**
     * Sets the value of the integrityEventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntegrityEventID(Integer value) {
        this.integrityEventID = value;
    }

    /**
     * Gets the value of the integrityRuleID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntegrityRuleID() {
        return integrityRuleID;
    }

    /**
     * Sets the value of the integrityRuleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntegrityRuleID(Integer value) {
        this.integrityRuleID = value;
    }

    /**
     * Gets the value of the isEntity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityTransport }
     *     
     */
    public EntityTransport getIsEntity() {
        return isEntity;
    }

    /**
     * Sets the value of the isEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityTransport }
     *     
     */
    public void setIsEntity(EntityTransport value) {
        this.isEntity = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
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
     * Gets the value of the process property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcess() {
        return process;
    }

    /**
     * Sets the value of the process property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcess(String value) {
        this.process = value;
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
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link EnumIntegrityRuleSeverity }
     *     
     */
    public EnumIntegrityRuleSeverity getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumIntegrityRuleSeverity }
     *     
     */
    public void setSeverity(EnumIntegrityRuleSeverity value) {
        this.severity = value;
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

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the wasEntity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityTransport }
     *     
     */
    public EntityTransport getWasEntity() {
        return wasEntity;
    }

    /**
     * Sets the value of the wasEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityTransport }
     *     
     */
    public void setWasEntity(EntityTransport value) {
        this.wasEntity = value;
    }

}
