
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HostDetailTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostDetailTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}HostTransport">
 *       &lt;sequence>
 *         &lt;element name="antiMalwareClassicPatternVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="antiMalwareEngineVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="antiMalwareIntelliTrapExceptionVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="antiMalwareIntelliTrapVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="antiMalwareSmartScanPatternVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="antiMalwareSpywarePatternVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cloudObjectImageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cloudObjectInstanceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cloudObjectInternalUniqueId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cloudObjectSecurityGroupIds" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cloudObjectType" type="{urn:Manager}EnumCloudObjectType"/>
 *         &lt;element name="componentKlasses" type="{urn:Manager}ArrayOf_xsd_int"/>
 *         &lt;element name="componentNames" type="{urn:Manager}ArrayOf_xsd_string"/>
 *         &lt;element name="componentTypes" type="{urn:Manager}ArrayOf_xsd_int"/>
 *         &lt;element name="componentVersions" type="{urn:Manager}ArrayOf_xsd_string"/>
 *         &lt;element name="hostGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hostInterfaces" type="{urn:Manager}ArrayOfHostInterfaceTransport"/>
 *         &lt;element name="hostLight" type="{urn:Manager}EnumHostLight"/>
 *         &lt;element name="lastAnitMalwareScheduledScan" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="lastAntiMalwareEvent" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="lastAntiMalwareManualScan" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="lastDpiEvent" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="lastFirewallEvent" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="lastIPUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastIntegrityMonitoringEvent" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="lastLogInspectionEvent" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="lastWebReputationEvent" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="light" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="locked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="overallAntiMalwareStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="overallDpiStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="overallFirewallStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="overallIntegrityMonitoringStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="overallLastRecommendationScan" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="overallLastSuccessfulCommunication" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="overallLastSuccessfulUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="overallLastUpdateRequired" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="overallLogInspectionStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="overallStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="overallVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="overallWebReputationStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="securityProfileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="virtualName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="virtualUuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDetailTransport", propOrder = {
    "antiMalwareClassicPatternVersion",
    "antiMalwareEngineVersion",
    "antiMalwareIntelliTrapExceptionVersion",
    "antiMalwareIntelliTrapVersion",
    "antiMalwareSmartScanPatternVersion",
    "antiMalwareSpywarePatternVersion",
    "cloudObjectImageId",
    "cloudObjectInstanceId",
    "cloudObjectInternalUniqueId",
    "cloudObjectSecurityGroupIds",
    "cloudObjectType",
    "componentKlasses",
    "componentNames",
    "componentTypes",
    "componentVersions",
    "hostGroupName",
    "hostInterfaces",
    "hostLight",
    "lastAnitMalwareScheduledScan",
    "lastAntiMalwareEvent",
    "lastAntiMalwareManualScan",
    "lastDpiEvent",
    "lastFirewallEvent",
    "lastIPUsed",
    "lastIntegrityMonitoringEvent",
    "lastLogInspectionEvent",
    "lastWebReputationEvent",
    "light",
    "locked",
    "overallAntiMalwareStatus",
    "overallDpiStatus",
    "overallFirewallStatus",
    "overallIntegrityMonitoringStatus",
    "overallLastRecommendationScan",
    "overallLastSuccessfulCommunication",
    "overallLastSuccessfulUpdate",
    "overallLastUpdateRequired",
    "overallLogInspectionStatus",
    "overallStatus",
    "overallVersion",
    "overallWebReputationStatus",
    "securityProfileName",
    "virtualName",
    "virtualUuid"
})
public class HostDetailTransport
    extends HostTransport
{

    @XmlElement(required = true, nillable = true)
    protected String antiMalwareClassicPatternVersion;
    @XmlElement(required = true, nillable = true)
    protected String antiMalwareEngineVersion;
    @XmlElement(required = true, nillable = true)
    protected String antiMalwareIntelliTrapExceptionVersion;
    @XmlElement(required = true, nillable = true)
    protected String antiMalwareIntelliTrapVersion;
    @XmlElement(required = true, nillable = true)
    protected String antiMalwareSmartScanPatternVersion;
    @XmlElement(required = true, nillable = true)
    protected String antiMalwareSpywarePatternVersion;
    @XmlElement(required = true, nillable = true)
    protected String cloudObjectImageId;
    @XmlElement(required = true, nillable = true)
    protected String cloudObjectInstanceId;
    @XmlElement(required = true, nillable = true)
    protected String cloudObjectInternalUniqueId;
    @XmlElement(required = true, nillable = true)
    protected String cloudObjectSecurityGroupIds;
    @XmlElement(required = true, nillable = true)
    protected EnumCloudObjectType cloudObjectType;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdInt componentKlasses;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdString componentNames;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdInt componentTypes;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdString componentVersions;
    @XmlElement(required = true, nillable = true)
    protected String hostGroupName;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfHostInterfaceTransport hostInterfaces;
    @XmlElement(required = true, nillable = true)
    protected EnumHostLight hostLight;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAnitMalwareScheduledScan;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAntiMalwareEvent;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAntiMalwareManualScan;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastDpiEvent;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastFirewallEvent;
    @XmlElement(required = true, nillable = true)
    protected String lastIPUsed;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastIntegrityMonitoringEvent;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastLogInspectionEvent;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastWebReputationEvent;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer light;
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
    protected XMLGregorianCalendar overallLastRecommendationScan;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar overallLastSuccessfulCommunication;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar overallLastSuccessfulUpdate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar overallLastUpdateRequired;
    @XmlElement(required = true, nillable = true)
    protected String overallLogInspectionStatus;
    @XmlElement(required = true, nillable = true)
    protected String overallStatus;
    @XmlElement(required = true, nillable = true)
    protected String overallVersion;
    @XmlElement(required = true, nillable = true)
    protected String overallWebReputationStatus;
    @XmlElement(required = true, nillable = true)
    protected String securityProfileName;
    @XmlElement(required = true, nillable = true)
    protected String virtualName;
    @XmlElement(required = true, nillable = true)
    protected String virtualUuid;

    /**
     * Gets the value of the antiMalwareClassicPatternVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntiMalwareClassicPatternVersion() {
        return antiMalwareClassicPatternVersion;
    }

    /**
     * Sets the value of the antiMalwareClassicPatternVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntiMalwareClassicPatternVersion(String value) {
        this.antiMalwareClassicPatternVersion = value;
    }

    /**
     * Gets the value of the antiMalwareEngineVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntiMalwareEngineVersion() {
        return antiMalwareEngineVersion;
    }

    /**
     * Sets the value of the antiMalwareEngineVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntiMalwareEngineVersion(String value) {
        this.antiMalwareEngineVersion = value;
    }

    /**
     * Gets the value of the antiMalwareIntelliTrapExceptionVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntiMalwareIntelliTrapExceptionVersion() {
        return antiMalwareIntelliTrapExceptionVersion;
    }

    /**
     * Sets the value of the antiMalwareIntelliTrapExceptionVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntiMalwareIntelliTrapExceptionVersion(String value) {
        this.antiMalwareIntelliTrapExceptionVersion = value;
    }

    /**
     * Gets the value of the antiMalwareIntelliTrapVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntiMalwareIntelliTrapVersion() {
        return antiMalwareIntelliTrapVersion;
    }

    /**
     * Sets the value of the antiMalwareIntelliTrapVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntiMalwareIntelliTrapVersion(String value) {
        this.antiMalwareIntelliTrapVersion = value;
    }

    /**
     * Gets the value of the antiMalwareSmartScanPatternVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntiMalwareSmartScanPatternVersion() {
        return antiMalwareSmartScanPatternVersion;
    }

    /**
     * Sets the value of the antiMalwareSmartScanPatternVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntiMalwareSmartScanPatternVersion(String value) {
        this.antiMalwareSmartScanPatternVersion = value;
    }

    /**
     * Gets the value of the antiMalwareSpywarePatternVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntiMalwareSpywarePatternVersion() {
        return antiMalwareSpywarePatternVersion;
    }

    /**
     * Sets the value of the antiMalwareSpywarePatternVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntiMalwareSpywarePatternVersion(String value) {
        this.antiMalwareSpywarePatternVersion = value;
    }

    /**
     * Gets the value of the cloudObjectImageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloudObjectImageId() {
        return cloudObjectImageId;
    }

    /**
     * Sets the value of the cloudObjectImageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloudObjectImageId(String value) {
        this.cloudObjectImageId = value;
    }

    /**
     * Gets the value of the cloudObjectInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloudObjectInstanceId() {
        return cloudObjectInstanceId;
    }

    /**
     * Sets the value of the cloudObjectInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloudObjectInstanceId(String value) {
        this.cloudObjectInstanceId = value;
    }

    /**
     * Gets the value of the cloudObjectInternalUniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloudObjectInternalUniqueId() {
        return cloudObjectInternalUniqueId;
    }

    /**
     * Sets the value of the cloudObjectInternalUniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloudObjectInternalUniqueId(String value) {
        this.cloudObjectInternalUniqueId = value;
    }

    /**
     * Gets the value of the cloudObjectSecurityGroupIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloudObjectSecurityGroupIds() {
        return cloudObjectSecurityGroupIds;
    }

    /**
     * Sets the value of the cloudObjectSecurityGroupIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloudObjectSecurityGroupIds(String value) {
        this.cloudObjectSecurityGroupIds = value;
    }

    /**
     * Gets the value of the cloudObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumCloudObjectType }
     *     
     */
    public EnumCloudObjectType getCloudObjectType() {
        return cloudObjectType;
    }

    /**
     * Sets the value of the cloudObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCloudObjectType }
     *     
     */
    public void setCloudObjectType(EnumCloudObjectType value) {
        this.cloudObjectType = value;
    }

    /**
     * Gets the value of the componentKlasses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdInt }
     *     
     */
    public ArrayOfXsdInt getComponentKlasses() {
        return componentKlasses;
    }

    /**
     * Sets the value of the componentKlasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdInt }
     *     
     */
    public void setComponentKlasses(ArrayOfXsdInt value) {
        this.componentKlasses = value;
    }

    /**
     * Gets the value of the componentNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public ArrayOfXsdString getComponentNames() {
        return componentNames;
    }

    /**
     * Sets the value of the componentNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public void setComponentNames(ArrayOfXsdString value) {
        this.componentNames = value;
    }

    /**
     * Gets the value of the componentTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdInt }
     *     
     */
    public ArrayOfXsdInt getComponentTypes() {
        return componentTypes;
    }

    /**
     * Sets the value of the componentTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdInt }
     *     
     */
    public void setComponentTypes(ArrayOfXsdInt value) {
        this.componentTypes = value;
    }

    /**
     * Gets the value of the componentVersions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public ArrayOfXsdString getComponentVersions() {
        return componentVersions;
    }

    /**
     * Sets the value of the componentVersions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public void setComponentVersions(ArrayOfXsdString value) {
        this.componentVersions = value;
    }

    /**
     * Gets the value of the hostGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostGroupName() {
        return hostGroupName;
    }

    /**
     * Sets the value of the hostGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostGroupName(String value) {
        this.hostGroupName = value;
    }

    /**
     * Gets the value of the hostInterfaces property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHostInterfaceTransport }
     *     
     */
    public ArrayOfHostInterfaceTransport getHostInterfaces() {
        return hostInterfaces;
    }

    /**
     * Sets the value of the hostInterfaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHostInterfaceTransport }
     *     
     */
    public void setHostInterfaces(ArrayOfHostInterfaceTransport value) {
        this.hostInterfaces = value;
    }

    /**
     * Gets the value of the hostLight property.
     * 
     * @return
     *     possible object is
     *     {@link EnumHostLight }
     *     
     */
    public EnumHostLight getHostLight() {
        return hostLight;
    }

    /**
     * Sets the value of the hostLight property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumHostLight }
     *     
     */
    public void setHostLight(EnumHostLight value) {
        this.hostLight = value;
    }

    /**
     * Gets the value of the lastAnitMalwareScheduledScan property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastAnitMalwareScheduledScan() {
        return lastAnitMalwareScheduledScan;
    }

    /**
     * Sets the value of the lastAnitMalwareScheduledScan property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastAnitMalwareScheduledScan(XMLGregorianCalendar value) {
        this.lastAnitMalwareScheduledScan = value;
    }

    /**
     * Gets the value of the lastAntiMalwareEvent property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastAntiMalwareEvent() {
        return lastAntiMalwareEvent;
    }

    /**
     * Sets the value of the lastAntiMalwareEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastAntiMalwareEvent(XMLGregorianCalendar value) {
        this.lastAntiMalwareEvent = value;
    }

    /**
     * Gets the value of the lastAntiMalwareManualScan property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastAntiMalwareManualScan() {
        return lastAntiMalwareManualScan;
    }

    /**
     * Sets the value of the lastAntiMalwareManualScan property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastAntiMalwareManualScan(XMLGregorianCalendar value) {
        this.lastAntiMalwareManualScan = value;
    }

    /**
     * Gets the value of the lastDpiEvent property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDpiEvent() {
        return lastDpiEvent;
    }

    /**
     * Sets the value of the lastDpiEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDpiEvent(XMLGregorianCalendar value) {
        this.lastDpiEvent = value;
    }

    /**
     * Gets the value of the lastFirewallEvent property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastFirewallEvent() {
        return lastFirewallEvent;
    }

    /**
     * Sets the value of the lastFirewallEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastFirewallEvent(XMLGregorianCalendar value) {
        this.lastFirewallEvent = value;
    }

    /**
     * Gets the value of the lastIPUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastIPUsed() {
        return lastIPUsed;
    }

    /**
     * Sets the value of the lastIPUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastIPUsed(String value) {
        this.lastIPUsed = value;
    }

    /**
     * Gets the value of the lastIntegrityMonitoringEvent property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastIntegrityMonitoringEvent() {
        return lastIntegrityMonitoringEvent;
    }

    /**
     * Sets the value of the lastIntegrityMonitoringEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastIntegrityMonitoringEvent(XMLGregorianCalendar value) {
        this.lastIntegrityMonitoringEvent = value;
    }

    /**
     * Gets the value of the lastLogInspectionEvent property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastLogInspectionEvent() {
        return lastLogInspectionEvent;
    }

    /**
     * Sets the value of the lastLogInspectionEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastLogInspectionEvent(XMLGregorianCalendar value) {
        this.lastLogInspectionEvent = value;
    }

    /**
     * Gets the value of the lastWebReputationEvent property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastWebReputationEvent() {
        return lastWebReputationEvent;
    }

    /**
     * Sets the value of the lastWebReputationEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastWebReputationEvent(XMLGregorianCalendar value) {
        this.lastWebReputationEvent = value;
    }

    /**
     * Gets the value of the light property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLight() {
        return light;
    }

    /**
     * Sets the value of the light property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLight(Integer value) {
        this.light = value;
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
     * Gets the value of the overallLastRecommendationScan property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOverallLastRecommendationScan() {
        return overallLastRecommendationScan;
    }

    /**
     * Sets the value of the overallLastRecommendationScan property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOverallLastRecommendationScan(XMLGregorianCalendar value) {
        this.overallLastRecommendationScan = value;
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
     * Gets the value of the overallLastUpdateRequired property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOverallLastUpdateRequired() {
        return overallLastUpdateRequired;
    }

    /**
     * Sets the value of the overallLastUpdateRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOverallLastUpdateRequired(XMLGregorianCalendar value) {
        this.overallLastUpdateRequired = value;
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
     * Gets the value of the overallVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverallVersion() {
        return overallVersion;
    }

    /**
     * Sets the value of the overallVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverallVersion(String value) {
        this.overallVersion = value;
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

    /**
     * Gets the value of the securityProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityProfileName() {
        return securityProfileName;
    }

    /**
     * Sets the value of the securityProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityProfileName(String value) {
        this.securityProfileName = value;
    }

    /**
     * Gets the value of the virtualName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualName() {
        return virtualName;
    }

    /**
     * Sets the value of the virtualName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualName(String value) {
        this.virtualName = value;
    }

    /**
     * Gets the value of the virtualUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualUuid() {
        return virtualUuid;
    }

    /**
     * Sets the value of the virtualUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualUuid(String value) {
        this.virtualUuid = value;
    }

}
