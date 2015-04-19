
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityProfileTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityProfileTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}ConfigurationTransport">
 *       &lt;sequence>
 *         &lt;element name="DPIRuleIDs" type="{urn:Manager}ArrayOf_xsd_int"/>
 *         &lt;element name="DPIState" type="{urn:Manager}EnumSecurityProfileDPIState"/>
 *         &lt;element name="antiMalwareManualID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="antiMalwareManualInherit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="antiMalwareRealTimeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="antiMalwareRealTimeInherit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="antiMalwareRealTimeScheduleID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="antiMalwareScheduledID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="antiMalwareScheduledInherit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="antiMalwareState" type="{urn:Manager}EnumSecurityProfileAntiMalwareState"/>
 *         &lt;element name="applicationTypeIDs" type="{urn:Manager}ArrayOf_xsd_int"/>
 *         &lt;element name="firewallRuleIDs" type="{urn:Manager}ArrayOf_xsd_int"/>
 *         &lt;element name="firewallState" type="{urn:Manager}EnumSecurityProfileFirewallState"/>
 *         &lt;element name="integrityRuleIDs" type="{urn:Manager}ArrayOf_xsd_int"/>
 *         &lt;element name="integrityState" type="{urn:Manager}EnumSecurityProfileIntegrityState"/>
 *         &lt;element name="logInspectionRuleIDs" type="{urn:Manager}ArrayOf_xsd_int"/>
 *         &lt;element name="logInspectionState" type="{urn:Manager}EnumSecurityProfileLogInspectionState"/>
 *         &lt;element name="parentSecurityProfileID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="recommendationState" type="{urn:Manager}EnumSecurityProfileRecommendationState"/>
 *         &lt;element name="scheduleID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="statefulConfigurationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityProfileTransport", propOrder = {
    "dpiRuleIDs",
    "dpiState",
    "antiMalwareManualID",
    "antiMalwareManualInherit",
    "antiMalwareRealTimeID",
    "antiMalwareRealTimeInherit",
    "antiMalwareRealTimeScheduleID",
    "antiMalwareScheduledID",
    "antiMalwareScheduledInherit",
    "antiMalwareState",
    "applicationTypeIDs",
    "firewallRuleIDs",
    "firewallState",
    "integrityRuleIDs",
    "integrityState",
    "logInspectionRuleIDs",
    "logInspectionState",
    "parentSecurityProfileID",
    "recommendationState",
    "scheduleID",
    "statefulConfigurationID"
})
public class SecurityProfileTransport
    extends ConfigurationTransport
{

    @XmlElement(name = "DPIRuleIDs", required = true, nillable = true)
    protected ArrayOfXsdInt dpiRuleIDs;
    @XmlElement(name = "DPIState", required = true, nillable = true)
    protected EnumSecurityProfileDPIState dpiState;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer antiMalwareManualID;
    protected boolean antiMalwareManualInherit;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer antiMalwareRealTimeID;
    protected boolean antiMalwareRealTimeInherit;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer antiMalwareRealTimeScheduleID;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer antiMalwareScheduledID;
    protected boolean antiMalwareScheduledInherit;
    @XmlElement(required = true, nillable = true)
    protected EnumSecurityProfileAntiMalwareState antiMalwareState;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdInt applicationTypeIDs;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdInt firewallRuleIDs;
    @XmlElement(required = true, nillable = true)
    protected EnumSecurityProfileFirewallState firewallState;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdInt integrityRuleIDs;
    @XmlElement(required = true, nillable = true)
    protected EnumSecurityProfileIntegrityState integrityState;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdInt logInspectionRuleIDs;
    @XmlElement(required = true, nillable = true)
    protected EnumSecurityProfileLogInspectionState logInspectionState;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer parentSecurityProfileID;
    @XmlElement(required = true, nillable = true)
    protected EnumSecurityProfileRecommendationState recommendationState;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer scheduleID;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer statefulConfigurationID;

    /**
     * Gets the value of the dpiRuleIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdInt }
     *     
     */
    public ArrayOfXsdInt getDPIRuleIDs() {
        return dpiRuleIDs;
    }

    /**
     * Sets the value of the dpiRuleIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdInt }
     *     
     */
    public void setDPIRuleIDs(ArrayOfXsdInt value) {
        this.dpiRuleIDs = value;
    }

    /**
     * Gets the value of the dpiState property.
     * 
     * @return
     *     possible object is
     *     {@link EnumSecurityProfileDPIState }
     *     
     */
    public EnumSecurityProfileDPIState getDPIState() {
        return dpiState;
    }

    /**
     * Sets the value of the dpiState property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumSecurityProfileDPIState }
     *     
     */
    public void setDPIState(EnumSecurityProfileDPIState value) {
        this.dpiState = value;
    }

    /**
     * Gets the value of the antiMalwareManualID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAntiMalwareManualID() {
        return antiMalwareManualID;
    }

    /**
     * Sets the value of the antiMalwareManualID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAntiMalwareManualID(Integer value) {
        this.antiMalwareManualID = value;
    }

    /**
     * Gets the value of the antiMalwareManualInherit property.
     * 
     */
    public boolean isAntiMalwareManualInherit() {
        return antiMalwareManualInherit;
    }

    /**
     * Sets the value of the antiMalwareManualInherit property.
     * 
     */
    public void setAntiMalwareManualInherit(boolean value) {
        this.antiMalwareManualInherit = value;
    }

    /**
     * Gets the value of the antiMalwareRealTimeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAntiMalwareRealTimeID() {
        return antiMalwareRealTimeID;
    }

    /**
     * Sets the value of the antiMalwareRealTimeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAntiMalwareRealTimeID(Integer value) {
        this.antiMalwareRealTimeID = value;
    }

    /**
     * Gets the value of the antiMalwareRealTimeInherit property.
     * 
     */
    public boolean isAntiMalwareRealTimeInherit() {
        return antiMalwareRealTimeInherit;
    }

    /**
     * Sets the value of the antiMalwareRealTimeInherit property.
     * 
     */
    public void setAntiMalwareRealTimeInherit(boolean value) {
        this.antiMalwareRealTimeInherit = value;
    }

    /**
     * Gets the value of the antiMalwareRealTimeScheduleID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAntiMalwareRealTimeScheduleID() {
        return antiMalwareRealTimeScheduleID;
    }

    /**
     * Sets the value of the antiMalwareRealTimeScheduleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAntiMalwareRealTimeScheduleID(Integer value) {
        this.antiMalwareRealTimeScheduleID = value;
    }

    /**
     * Gets the value of the antiMalwareScheduledID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAntiMalwareScheduledID() {
        return antiMalwareScheduledID;
    }

    /**
     * Sets the value of the antiMalwareScheduledID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAntiMalwareScheduledID(Integer value) {
        this.antiMalwareScheduledID = value;
    }

    /**
     * Gets the value of the antiMalwareScheduledInherit property.
     * 
     */
    public boolean isAntiMalwareScheduledInherit() {
        return antiMalwareScheduledInherit;
    }

    /**
     * Sets the value of the antiMalwareScheduledInherit property.
     * 
     */
    public void setAntiMalwareScheduledInherit(boolean value) {
        this.antiMalwareScheduledInherit = value;
    }

    /**
     * Gets the value of the antiMalwareState property.
     * 
     * @return
     *     possible object is
     *     {@link EnumSecurityProfileAntiMalwareState }
     *     
     */
    public EnumSecurityProfileAntiMalwareState getAntiMalwareState() {
        return antiMalwareState;
    }

    /**
     * Sets the value of the antiMalwareState property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumSecurityProfileAntiMalwareState }
     *     
     */
    public void setAntiMalwareState(EnumSecurityProfileAntiMalwareState value) {
        this.antiMalwareState = value;
    }

    /**
     * Gets the value of the applicationTypeIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdInt }
     *     
     */
    public ArrayOfXsdInt getApplicationTypeIDs() {
        return applicationTypeIDs;
    }

    /**
     * Sets the value of the applicationTypeIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdInt }
     *     
     */
    public void setApplicationTypeIDs(ArrayOfXsdInt value) {
        this.applicationTypeIDs = value;
    }

    /**
     * Gets the value of the firewallRuleIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdInt }
     *     
     */
    public ArrayOfXsdInt getFirewallRuleIDs() {
        return firewallRuleIDs;
    }

    /**
     * Sets the value of the firewallRuleIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdInt }
     *     
     */
    public void setFirewallRuleIDs(ArrayOfXsdInt value) {
        this.firewallRuleIDs = value;
    }

    /**
     * Gets the value of the firewallState property.
     * 
     * @return
     *     possible object is
     *     {@link EnumSecurityProfileFirewallState }
     *     
     */
    public EnumSecurityProfileFirewallState getFirewallState() {
        return firewallState;
    }

    /**
     * Sets the value of the firewallState property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumSecurityProfileFirewallState }
     *     
     */
    public void setFirewallState(EnumSecurityProfileFirewallState value) {
        this.firewallState = value;
    }

    /**
     * Gets the value of the integrityRuleIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdInt }
     *     
     */
    public ArrayOfXsdInt getIntegrityRuleIDs() {
        return integrityRuleIDs;
    }

    /**
     * Sets the value of the integrityRuleIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdInt }
     *     
     */
    public void setIntegrityRuleIDs(ArrayOfXsdInt value) {
        this.integrityRuleIDs = value;
    }

    /**
     * Gets the value of the integrityState property.
     * 
     * @return
     *     possible object is
     *     {@link EnumSecurityProfileIntegrityState }
     *     
     */
    public EnumSecurityProfileIntegrityState getIntegrityState() {
        return integrityState;
    }

    /**
     * Sets the value of the integrityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumSecurityProfileIntegrityState }
     *     
     */
    public void setIntegrityState(EnumSecurityProfileIntegrityState value) {
        this.integrityState = value;
    }

    /**
     * Gets the value of the logInspectionRuleIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdInt }
     *     
     */
    public ArrayOfXsdInt getLogInspectionRuleIDs() {
        return logInspectionRuleIDs;
    }

    /**
     * Sets the value of the logInspectionRuleIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdInt }
     *     
     */
    public void setLogInspectionRuleIDs(ArrayOfXsdInt value) {
        this.logInspectionRuleIDs = value;
    }

    /**
     * Gets the value of the logInspectionState property.
     * 
     * @return
     *     possible object is
     *     {@link EnumSecurityProfileLogInspectionState }
     *     
     */
    public EnumSecurityProfileLogInspectionState getLogInspectionState() {
        return logInspectionState;
    }

    /**
     * Sets the value of the logInspectionState property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumSecurityProfileLogInspectionState }
     *     
     */
    public void setLogInspectionState(EnumSecurityProfileLogInspectionState value) {
        this.logInspectionState = value;
    }

    /**
     * Gets the value of the parentSecurityProfileID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentSecurityProfileID() {
        return parentSecurityProfileID;
    }

    /**
     * Sets the value of the parentSecurityProfileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentSecurityProfileID(Integer value) {
        this.parentSecurityProfileID = value;
    }

    /**
     * Gets the value of the recommendationState property.
     * 
     * @return
     *     possible object is
     *     {@link EnumSecurityProfileRecommendationState }
     *     
     */
    public EnumSecurityProfileRecommendationState getRecommendationState() {
        return recommendationState;
    }

    /**
     * Sets the value of the recommendationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumSecurityProfileRecommendationState }
     *     
     */
    public void setRecommendationState(EnumSecurityProfileRecommendationState value) {
        this.recommendationState = value;
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
     * Gets the value of the statefulConfigurationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatefulConfigurationID() {
        return statefulConfigurationID;
    }

    /**
     * Sets the value of the statefulConfigurationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatefulConfigurationID(Integer value) {
        this.statefulConfigurationID = value;
    }

}
