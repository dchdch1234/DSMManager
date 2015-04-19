
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HostStatusTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostStatusTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}TransportObject">
 *       &lt;sequence>
 *         &lt;element name="applianceID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="applianceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="esxServerFastPathDriverVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="esxServerID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="esxServerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="esxServerVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="overallAntiMalwareStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="overallDpiStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="overallFirewallStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="overallIntegrityMonitoringStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="overallLastSuccessfulCommunication" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="overallLastSuccessfulUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="overallLogInspectionStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="overallStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="protectionStatusTransports" type="{urn:Manager}ArrayOfProtectionStatusTransport"/>
 *         &lt;element name="overallWebReputationStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostStatusTransport", propOrder = {
    "applianceID",
    "applianceName",
    "esxServerFastPathDriverVersion",
    "esxServerID",
    "esxServerName",
    "esxServerVersion",
    "locked",
    "overallAntiMalwareStatus",
    "overallDpiStatus",
    "overallFirewallStatus",
    "overallIntegrityMonitoringStatus",
    "overallLastSuccessfulCommunication",
    "overallLastSuccessfulUpdate",
    "overallLogInspectionStatus",
    "overallStatus",
    "protectionStatusTransports",
    "overallWebReputationStatus"
})
public class HostStatusTransport
    extends TransportObject
{

    protected int applianceID;
    @XmlElement(required = true, nillable = true)
    protected String applianceName;
    @XmlElement(required = true, nillable = true)
    protected String esxServerFastPathDriverVersion;
    protected int esxServerID;
    @XmlElement(required = true, nillable = true)
    protected String esxServerName;
    @XmlElement(required = true, nillable = true)
    protected String esxServerVersion;
    protected boolean locked;
    @XmlElement(required = true, nillable = true)
    protected String overallAntiMalwareStatus;
    @XmlElement(required = true, nillable = true)
    protected String overallDpiStatus;
    @XmlElement(required = true, nillable = true)
    protected String overallFirewallStatus;
    @XmlElement(required = true, nillable = true)
    protected String overallIntegrityMonitoringStatus;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar overallLastSuccessfulCommunication;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar overallLastSuccessfulUpdate;
    @XmlElement(required = true, nillable = true)
    protected String overallLogInspectionStatus;
    @XmlElement(required = true, nillable = true)
    protected String overallStatus;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfProtectionStatusTransport protectionStatusTransports;
    @XmlElement(required = true, nillable = true)
    protected String overallWebReputationStatus;

    /**
     * Gets the value of the applianceID property.
     * 
     */
    public int getApplianceID() {
        return applianceID;
    }

    /**
     * Sets the value of the applianceID property.
     * 
     */
    public void setApplianceID(int value) {
        this.applianceID = value;
    }

    /**
     * Gets the value of the applianceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplianceName() {
        return applianceName;
    }

    /**
     * Sets the value of the applianceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplianceName(String value) {
        this.applianceName = value;
    }

    /**
     * Gets the value of the esxServerFastPathDriverVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsxServerFastPathDriverVersion() {
        return esxServerFastPathDriverVersion;
    }

    /**
     * Sets the value of the esxServerFastPathDriverVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsxServerFastPathDriverVersion(String value) {
        this.esxServerFastPathDriverVersion = value;
    }

    /**
     * Gets the value of the esxServerID property.
     * 
     */
    public int getEsxServerID() {
        return esxServerID;
    }

    /**
     * Sets the value of the esxServerID property.
     * 
     */
    public void setEsxServerID(int value) {
        this.esxServerID = value;
    }

    /**
     * Gets the value of the esxServerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsxServerName() {
        return esxServerName;
    }

    /**
     * Sets the value of the esxServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsxServerName(String value) {
        this.esxServerName = value;
    }

    /**
     * Gets the value of the esxServerVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsxServerVersion() {
        return esxServerVersion;
    }

    /**
     * Sets the value of the esxServerVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsxServerVersion(String value) {
        this.esxServerVersion = value;
    }

    /**
     * Gets the value of the locked property.
     * 
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     */
    public void setLocked(boolean value) {
        this.locked = value;
    }

    /**
     * Gets the value of the overallAntiMalwareStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverallAntiMalwareStatus() {
        return overallAntiMalwareStatus;
    }

    /**
     * Sets the value of the overallAntiMalwareStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverallAntiMalwareStatus(String value) {
        this.overallAntiMalwareStatus = value;
    }

    /**
     * Gets the value of the overallDpiStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverallDpiStatus() {
        return overallDpiStatus;
    }

    /**
     * Sets the value of the overallDpiStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverallDpiStatus(String value) {
        this.overallDpiStatus = value;
    }

    /**
     * Gets the value of the overallFirewallStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverallFirewallStatus() {
        return overallFirewallStatus;
    }

    /**
     * Sets the value of the overallFirewallStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverallFirewallStatus(String value) {
        this.overallFirewallStatus = value;
    }

    /**
     * Gets the value of the overallIntegrityMonitoringStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverallIntegrityMonitoringStatus() {
        return overallIntegrityMonitoringStatus;
    }

    /**
     * Sets the value of the overallIntegrityMonitoringStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverallIntegrityMonitoringStatus(String value) {
        this.overallIntegrityMonitoringStatus = value;
    }

    /**
     * Gets the value of the overallLastSuccessfulCommunication property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOverallLastSuccessfulCommunication() {
        return overallLastSuccessfulCommunication;
    }

    /**
     * Sets the value of the overallLastSuccessfulCommunication property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOverallLastSuccessfulCommunication(XMLGregorianCalendar value) {
        this.overallLastSuccessfulCommunication = value;
    }

    /**
     * Gets the value of the overallLastSuccessfulUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOverallLastSuccessfulUpdate() {
        return overallLastSuccessfulUpdate;
    }

    /**
     * Sets the value of the overallLastSuccessfulUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOverallLastSuccessfulUpdate(XMLGregorianCalendar value) {
        this.overallLastSuccessfulUpdate = value;
    }

    /**
     * Gets the value of the overallLogInspectionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverallLogInspectionStatus() {
        return overallLogInspectionStatus;
    }

    /**
     * Sets the value of the overallLogInspectionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverallLogInspectionStatus(String value) {
        this.overallLogInspectionStatus = value;
    }

    /**
     * Gets the value of the overallStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverallStatus() {
        return overallStatus;
    }

    /**
     * Sets the value of the overallStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverallStatus(String value) {
        this.overallStatus = value;
    }

    /**
     * Gets the value of the protectionStatusTransports property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProtectionStatusTransport }
     *     
     */
    public ArrayOfProtectionStatusTransport getProtectionStatusTransports() {
        return protectionStatusTransports;
    }

    /**
     * Sets the value of the protectionStatusTransports property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProtectionStatusTransport }
     *     
     */
    public void setProtectionStatusTransports(ArrayOfProtectionStatusTransport value) {
        this.protectionStatusTransports = value;
    }

    /**
     * Gets the value of the overallWebReputationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverallWebReputationStatus() {
        return overallWebReputationStatus;
    }

    /**
     * Sets the value of the overallWebReputationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverallWebReputationStatus(String value) {
        this.overallWebReputationStatus = value;
    }

}
