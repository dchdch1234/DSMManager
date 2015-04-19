
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DPIRuleTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DPIRuleTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}ConfigurationTransport">
 *       &lt;sequence>
 *         &lt;element name="TBUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="applicationTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="authoritative" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cvssScore" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="detectOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="disableEvent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="eventOnPacketDrop" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="eventOnPacketModify" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ignoreRecommendations" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includePacketData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="issued" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="patternAction" type="{urn:Manager}EnumDPIRuleAction"/>
 *         &lt;element name="patternCaseSensitive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="patternEnd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patternIf" type="{urn:Manager}EnumDPIRuleIf"/>
 *         &lt;element name="patternPatterns" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patternStart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="priority" type="{urn:Manager}EnumDPIRulePriority"/>
 *         &lt;element name="raiseAlert" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ruleXML" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scheduleID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="severity" type="{urn:Manager}EnumDPIRuleSeverity"/>
 *         &lt;element name="signatureAction" type="{urn:Manager}EnumDPIRuleAction"/>
 *         &lt;element name="signatureCaseSensitive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="signatureSignature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templateType" type="{urn:Manager}EnumDPIRuleTemplateType"/>
 *         &lt;element name="cveList" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DPIRuleTransport", propOrder = {
    "tbuid",
    "applicationTypeID",
    "authoritative",
    "cvssScore",
    "detectOnly",
    "disableEvent",
    "eventOnPacketDrop",
    "eventOnPacketModify",
    "identifier",
    "ignoreRecommendations",
    "includePacketData",
    "issued",
    "patternAction",
    "patternCaseSensitive",
    "patternEnd",
    "patternIf",
    "patternPatterns",
    "patternStart",
    "priority",
    "raiseAlert",
    "ruleXML",
    "scheduleID",
    "severity",
    "signatureAction",
    "signatureCaseSensitive",
    "signatureSignature",
    "templateType",
    "cveList"
})
public class DPIRuleTransport
    extends ConfigurationTransport
{

    @XmlElement(name = "TBUID", required = true, nillable = true)
    protected String tbuid;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer applicationTypeID;
    protected boolean authoritative;
    protected double cvssScore;
    protected boolean detectOnly;
    protected boolean disableEvent;
    protected boolean eventOnPacketDrop;
    protected boolean eventOnPacketModify;
    @XmlElement(required = true, nillable = true)
    protected String identifier;
    protected boolean ignoreRecommendations;
    protected boolean includePacketData;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issued;
    @XmlElement(required = true, nillable = true)
    protected EnumDPIRuleAction patternAction;
    protected boolean patternCaseSensitive;
    @XmlElement(required = true, nillable = true)
    protected String patternEnd;
    @XmlElement(required = true, nillable = true)
    protected EnumDPIRuleIf patternIf;
    @XmlElement(required = true, nillable = true)
    protected String patternPatterns;
    @XmlElement(required = true, nillable = true)
    protected String patternStart;
    @XmlElement(required = true, nillable = true)
    protected EnumDPIRulePriority priority;
    protected boolean raiseAlert;
    @XmlElement(required = true, nillable = true)
    protected String ruleXML;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer scheduleID;
    @XmlElement(required = true, nillable = true)
    protected EnumDPIRuleSeverity severity;
    @XmlElement(required = true, nillable = true)
    protected EnumDPIRuleAction signatureAction;
    protected boolean signatureCaseSensitive;
    @XmlElement(required = true, nillable = true)
    protected String signatureSignature;
    @XmlElement(required = true, nillable = true)
    protected EnumDPIRuleTemplateType templateType;
    @XmlElement(required = true, nillable = true)
    protected String cveList;

    /**
     * Gets the value of the tbuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTBUID() {
        return tbuid;
    }

    /**
     * Sets the value of the tbuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTBUID(String value) {
        this.tbuid = value;
    }

    /**
     * Gets the value of the applicationTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApplicationTypeID() {
        return applicationTypeID;
    }

    /**
     * Sets the value of the applicationTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApplicationTypeID(Integer value) {
        this.applicationTypeID = value;
    }

    /**
     * Gets the value of the authoritative property.
     * 
     */
    public boolean isAuthoritative() {
        return authoritative;
    }

    /**
     * Sets the value of the authoritative property.
     * 
     */
    public void setAuthoritative(boolean value) {
        this.authoritative = value;
    }

    /**
     * Gets the value of the cvssScore property.
     * 
     */
    public double getCvssScore() {
        return cvssScore;
    }

    /**
     * Sets the value of the cvssScore property.
     * 
     */
    public void setCvssScore(double value) {
        this.cvssScore = value;
    }

    /**
     * Gets the value of the detectOnly property.
     * 
     */
    public boolean isDetectOnly() {
        return detectOnly;
    }

    /**
     * Sets the value of the detectOnly property.
     * 
     */
    public void setDetectOnly(boolean value) {
        this.detectOnly = value;
    }

    /**
     * Gets the value of the disableEvent property.
     * 
     */
    public boolean isDisableEvent() {
        return disableEvent;
    }

    /**
     * Sets the value of the disableEvent property.
     * 
     */
    public void setDisableEvent(boolean value) {
        this.disableEvent = value;
    }

    /**
     * Gets the value of the eventOnPacketDrop property.
     * 
     */
    public boolean isEventOnPacketDrop() {
        return eventOnPacketDrop;
    }

    /**
     * Sets the value of the eventOnPacketDrop property.
     * 
     */
    public void setEventOnPacketDrop(boolean value) {
        this.eventOnPacketDrop = value;
    }

    /**
     * Gets the value of the eventOnPacketModify property.
     * 
     */
    public boolean isEventOnPacketModify() {
        return eventOnPacketModify;
    }

    /**
     * Sets the value of the eventOnPacketModify property.
     * 
     */
    public void setEventOnPacketModify(boolean value) {
        this.eventOnPacketModify = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the ignoreRecommendations property.
     * 
     */
    public boolean isIgnoreRecommendations() {
        return ignoreRecommendations;
    }

    /**
     * Sets the value of the ignoreRecommendations property.
     * 
     */
    public void setIgnoreRecommendations(boolean value) {
        this.ignoreRecommendations = value;
    }

    /**
     * Gets the value of the includePacketData property.
     * 
     */
    public boolean isIncludePacketData() {
        return includePacketData;
    }

    /**
     * Sets the value of the includePacketData property.
     * 
     */
    public void setIncludePacketData(boolean value) {
        this.includePacketData = value;
    }

    /**
     * Gets the value of the issued property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssued() {
        return issued;
    }

    /**
     * Sets the value of the issued property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssued(XMLGregorianCalendar value) {
        this.issued = value;
    }

    /**
     * Gets the value of the patternAction property.
     * 
     * @return
     *     possible object is
     *     {@link EnumDPIRuleAction }
     *     
     */
    public EnumDPIRuleAction getPatternAction() {
        return patternAction;
    }

    /**
     * Sets the value of the patternAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumDPIRuleAction }
     *     
     */
    public void setPatternAction(EnumDPIRuleAction value) {
        this.patternAction = value;
    }

    /**
     * Gets the value of the patternCaseSensitive property.
     * 
     */
    public boolean isPatternCaseSensitive() {
        return patternCaseSensitive;
    }

    /**
     * Sets the value of the patternCaseSensitive property.
     * 
     */
    public void setPatternCaseSensitive(boolean value) {
        this.patternCaseSensitive = value;
    }

    /**
     * Gets the value of the patternEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternEnd() {
        return patternEnd;
    }

    /**
     * Sets the value of the patternEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternEnd(String value) {
        this.patternEnd = value;
    }

    /**
     * Gets the value of the patternIf property.
     * 
     * @return
     *     possible object is
     *     {@link EnumDPIRuleIf }
     *     
     */
    public EnumDPIRuleIf getPatternIf() {
        return patternIf;
    }

    /**
     * Sets the value of the patternIf property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumDPIRuleIf }
     *     
     */
    public void setPatternIf(EnumDPIRuleIf value) {
        this.patternIf = value;
    }

    /**
     * Gets the value of the patternPatterns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternPatterns() {
        return patternPatterns;
    }

    /**
     * Sets the value of the patternPatterns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternPatterns(String value) {
        this.patternPatterns = value;
    }

    /**
     * Gets the value of the patternStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternStart() {
        return patternStart;
    }

    /**
     * Sets the value of the patternStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternStart(String value) {
        this.patternStart = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link EnumDPIRulePriority }
     *     
     */
    public EnumDPIRulePriority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumDPIRulePriority }
     *     
     */
    public void setPriority(EnumDPIRulePriority value) {
        this.priority = value;
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
     * Gets the value of the ruleXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleXML() {
        return ruleXML;
    }

    /**
     * Sets the value of the ruleXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleXML(String value) {
        this.ruleXML = value;
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
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link EnumDPIRuleSeverity }
     *     
     */
    public EnumDPIRuleSeverity getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumDPIRuleSeverity }
     *     
     */
    public void setSeverity(EnumDPIRuleSeverity value) {
        this.severity = value;
    }

    /**
     * Gets the value of the signatureAction property.
     * 
     * @return
     *     possible object is
     *     {@link EnumDPIRuleAction }
     *     
     */
    public EnumDPIRuleAction getSignatureAction() {
        return signatureAction;
    }

    /**
     * Sets the value of the signatureAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumDPIRuleAction }
     *     
     */
    public void setSignatureAction(EnumDPIRuleAction value) {
        this.signatureAction = value;
    }

    /**
     * Gets the value of the signatureCaseSensitive property.
     * 
     */
    public boolean isSignatureCaseSensitive() {
        return signatureCaseSensitive;
    }

    /**
     * Sets the value of the signatureCaseSensitive property.
     * 
     */
    public void setSignatureCaseSensitive(boolean value) {
        this.signatureCaseSensitive = value;
    }

    /**
     * Gets the value of the signatureSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureSignature() {
        return signatureSignature;
    }

    /**
     * Sets the value of the signatureSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureSignature(String value) {
        this.signatureSignature = value;
    }

    /**
     * Gets the value of the templateType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumDPIRuleTemplateType }
     *     
     */
    public EnumDPIRuleTemplateType getTemplateType() {
        return templateType;
    }

    /**
     * Sets the value of the templateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumDPIRuleTemplateType }
     *     
     */
    public void setTemplateType(EnumDPIRuleTemplateType value) {
        this.templateType = value;
    }

    /**
     * Gets the value of the cveList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCveList() {
        return cveList;
    }

    /**
     * Sets the value of the cveList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCveList(String value) {
        this.cveList = value;
    }

}
