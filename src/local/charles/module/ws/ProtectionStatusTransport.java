
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ProtectionStatusTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProtectionStatusTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}TransportObject">
 *       &lt;sequence>
 *         &lt;element name="dpiStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fingerprint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firewallStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="integrityMonitoringStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastSuccessfulCommunication" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="lastSuccessfulUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="logInspectionStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="protectionType" type="{urn:Manager}EnumProtectionType"/>
 *         &lt;element name="state" type="{urn:Manager}EnumState"/>
 *         &lt;element name="stateDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="componentInfoTransports" type="{urn:Manager}ArrayOfComponentInfoTransport"/>
 *         &lt;element name="webReputationStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="antiMalwareStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtectionStatusTransport", propOrder = {
    "dpiStatus",
    "fingerprint",
    "firewallStatus",
    "integrityMonitoringStatus",
    "lastSuccessfulCommunication",
    "lastSuccessfulUpdate",
    "logInspectionStatus",
    "protectionType",
    "state",
    "stateDescription",
    "status",
    "version",
    "componentInfoTransports",
    "webReputationStatus",
    "antiMalwareStatus"
})
public class ProtectionStatusTransport
    extends TransportObject
{

    @XmlElement(required = true, nillable = true)
    protected String dpiStatus;
    @XmlElement(required = true, nillable = true)
    protected String fingerprint;
    @XmlElement(required = true, nillable = true)
    protected String firewallStatus;
    @XmlElement(required = true, nillable = true)
    protected String integrityMonitoringStatus;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSuccessfulCommunication;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSuccessfulUpdate;
    @XmlElement(required = true, nillable = true)
    protected String logInspectionStatus;
    @XmlElement(required = true, nillable = true)
    protected EnumProtectionType protectionType;
    @XmlElement(required = true, nillable = true)
    protected EnumState state;
    @XmlElement(required = true, nillable = true)
    protected String stateDescription;
    @XmlElement(required = true, nillable = true)
    protected String status;
    @XmlElement(required = true, nillable = true)
    protected String version;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfComponentInfoTransport componentInfoTransports;
    @XmlElement(required = true, nillable = true)
    protected String webReputationStatus;
    @XmlElement(required = true, nillable = true)
    protected String antiMalwareStatus;

    /**
     * Gets the value of the dpiStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDpiStatus() {
        return dpiStatus;
    }

    /**
     * Sets the value of the dpiStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDpiStatus(String value) {
        this.dpiStatus = value;
    }

    /**
     * Gets the value of the fingerprint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFingerprint() {
        return fingerprint;
    }

    /**
     * Sets the value of the fingerprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFingerprint(String value) {
        this.fingerprint = value;
    }

    /**
     * Gets the value of the firewallStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirewallStatus() {
        return firewallStatus;
    }

    /**
     * Sets the value of the firewallStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirewallStatus(String value) {
        this.firewallStatus = value;
    }

    /**
     * Gets the value of the integrityMonitoringStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrityMonitoringStatus() {
        return integrityMonitoringStatus;
    }

    /**
     * Sets the value of the integrityMonitoringStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrityMonitoringStatus(String value) {
        this.integrityMonitoringStatus = value;
    }

    /**
     * Gets the value of the lastSuccessfulCommunication property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSuccessfulCommunication() {
        return lastSuccessfulCommunication;
    }

    /**
     * Sets the value of the lastSuccessfulCommunication property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSuccessfulCommunication(XMLGregorianCalendar value) {
        this.lastSuccessfulCommunication = value;
    }

    /**
     * Gets the value of the lastSuccessfulUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSuccessfulUpdate() {
        return lastSuccessfulUpdate;
    }

    /**
     * Sets the value of the lastSuccessfulUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSuccessfulUpdate(XMLGregorianCalendar value) {
        this.lastSuccessfulUpdate = value;
    }

    /**
     * Gets the value of the logInspectionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogInspectionStatus() {
        return logInspectionStatus;
    }

    /**
     * Sets the value of the logInspectionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogInspectionStatus(String value) {
        this.logInspectionStatus = value;
    }

    /**
     * Gets the value of the protectionType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumProtectionType }
     *     
     */
    public EnumProtectionType getProtectionType() {
        return protectionType;
    }

    /**
     * Sets the value of the protectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumProtectionType }
     *     
     */
    public void setProtectionType(EnumProtectionType value) {
        this.protectionType = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link EnumState }
     *     
     */
    public EnumState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumState }
     *     
     */
    public void setState(EnumState value) {
        this.state = value;
    }

    /**
     * Gets the value of the stateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateDescription() {
        return stateDescription;
    }

    /**
     * Sets the value of the stateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateDescription(String value) {
        this.stateDescription = value;
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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the componentInfoTransports property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfComponentInfoTransport }
     *     
     */
    public ArrayOfComponentInfoTransport getComponentInfoTransports() {
        return componentInfoTransports;
    }

    /**
     * Sets the value of the componentInfoTransports property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfComponentInfoTransport }
     *     
     */
    public void setComponentInfoTransports(ArrayOfComponentInfoTransport value) {
        this.componentInfoTransports = value;
    }

    /**
     * Gets the value of the webReputationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebReputationStatus() {
        return webReputationStatus;
    }

    /**
     * Sets the value of the webReputationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebReputationStatus(String value) {
        this.webReputationStatus = value;
    }

    /**
     * Gets the value of the antiMalwareStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntiMalwareStatus() {
        return antiMalwareStatus;
    }

    /**
     * Sets the value of the antiMalwareStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntiMalwareStatus(String value) {
        this.antiMalwareStatus = value;
    }

}
