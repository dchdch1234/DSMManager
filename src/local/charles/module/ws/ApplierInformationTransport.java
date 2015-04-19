
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplierInformationTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplierInformationTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}TransportObject">
 *       &lt;sequence>
 *         &lt;element name="DPIRulesAdded" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DPIRulesAddedAndAssigned" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DPIRulesDeleted" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DPIRulesUpdated" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="applicationTypesAdded" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="applicationTypesDeleted" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="applicationTypesUpdated" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="detailedSummary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="integrityMonitoringRulesAdded" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="integrityMonitoringRulesDeleted" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="integrityMonitoringRulesUpdated" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="logInspectionDecodersAdded" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="logInspectionDecodersDeleted" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="logInspectionDecodersUpdated" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="logInspectionRulesAdded" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="logInspectionRulesDeleted" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="logInspectionRulesUpdated" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="portListsAdded" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="portListsUpdated" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplierInformationTransport", propOrder = {
    "dpiRulesAdded",
    "dpiRulesAddedAndAssigned",
    "dpiRulesDeleted",
    "dpiRulesUpdated",
    "applicationTypesAdded",
    "applicationTypesDeleted",
    "applicationTypesUpdated",
    "detailedSummary",
    "integrityMonitoringRulesAdded",
    "integrityMonitoringRulesDeleted",
    "integrityMonitoringRulesUpdated",
    "logInspectionDecodersAdded",
    "logInspectionDecodersDeleted",
    "logInspectionDecodersUpdated",
    "logInspectionRulesAdded",
    "logInspectionRulesDeleted",
    "logInspectionRulesUpdated",
    "portListsAdded",
    "portListsUpdated"
})
public class ApplierInformationTransport
    extends TransportObject
{

    @XmlElement(name = "DPIRulesAdded")
    protected int dpiRulesAdded;
    @XmlElement(name = "DPIRulesAddedAndAssigned")
    protected int dpiRulesAddedAndAssigned;
    @XmlElement(name = "DPIRulesDeleted")
    protected int dpiRulesDeleted;
    @XmlElement(name = "DPIRulesUpdated")
    protected int dpiRulesUpdated;
    protected int applicationTypesAdded;
    protected int applicationTypesDeleted;
    protected int applicationTypesUpdated;
    @XmlElement(required = true, nillable = true)
    protected String detailedSummary;
    protected int integrityMonitoringRulesAdded;
    protected int integrityMonitoringRulesDeleted;
    protected int integrityMonitoringRulesUpdated;
    protected int logInspectionDecodersAdded;
    protected int logInspectionDecodersDeleted;
    protected int logInspectionDecodersUpdated;
    protected int logInspectionRulesAdded;
    protected int logInspectionRulesDeleted;
    protected int logInspectionRulesUpdated;
    protected int portListsAdded;
    protected int portListsUpdated;

    /**
     * Gets the value of the dpiRulesAdded property.
     * 
     */
    public int getDPIRulesAdded() {
        return dpiRulesAdded;
    }

    /**
     * Sets the value of the dpiRulesAdded property.
     * 
     */
    public void setDPIRulesAdded(int value) {
        this.dpiRulesAdded = value;
    }

    /**
     * Gets the value of the dpiRulesAddedAndAssigned property.
     * 
     */
    public int getDPIRulesAddedAndAssigned() {
        return dpiRulesAddedAndAssigned;
    }

    /**
     * Sets the value of the dpiRulesAddedAndAssigned property.
     * 
     */
    public void setDPIRulesAddedAndAssigned(int value) {
        this.dpiRulesAddedAndAssigned = value;
    }

    /**
     * Gets the value of the dpiRulesDeleted property.
     * 
     */
    public int getDPIRulesDeleted() {
        return dpiRulesDeleted;
    }

    /**
     * Sets the value of the dpiRulesDeleted property.
     * 
     */
    public void setDPIRulesDeleted(int value) {
        this.dpiRulesDeleted = value;
    }

    /**
     * Gets the value of the dpiRulesUpdated property.
     * 
     */
    public int getDPIRulesUpdated() {
        return dpiRulesUpdated;
    }

    /**
     * Sets the value of the dpiRulesUpdated property.
     * 
     */
    public void setDPIRulesUpdated(int value) {
        this.dpiRulesUpdated = value;
    }

    /**
     * Gets the value of the applicationTypesAdded property.
     * 
     */
    public int getApplicationTypesAdded() {
        return applicationTypesAdded;
    }

    /**
     * Sets the value of the applicationTypesAdded property.
     * 
     */
    public void setApplicationTypesAdded(int value) {
        this.applicationTypesAdded = value;
    }

    /**
     * Gets the value of the applicationTypesDeleted property.
     * 
     */
    public int getApplicationTypesDeleted() {
        return applicationTypesDeleted;
    }

    /**
     * Sets the value of the applicationTypesDeleted property.
     * 
     */
    public void setApplicationTypesDeleted(int value) {
        this.applicationTypesDeleted = value;
    }

    /**
     * Gets the value of the applicationTypesUpdated property.
     * 
     */
    public int getApplicationTypesUpdated() {
        return applicationTypesUpdated;
    }

    /**
     * Sets the value of the applicationTypesUpdated property.
     * 
     */
    public void setApplicationTypesUpdated(int value) {
        this.applicationTypesUpdated = value;
    }

    /**
     * Gets the value of the detailedSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailedSummary() {
        return detailedSummary;
    }

    /**
     * Sets the value of the detailedSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailedSummary(String value) {
        this.detailedSummary = value;
    }

    /**
     * Gets the value of the integrityMonitoringRulesAdded property.
     * 
     */
    public int getIntegrityMonitoringRulesAdded() {
        return integrityMonitoringRulesAdded;
    }

    /**
     * Sets the value of the integrityMonitoringRulesAdded property.
     * 
     */
    public void setIntegrityMonitoringRulesAdded(int value) {
        this.integrityMonitoringRulesAdded = value;
    }

    /**
     * Gets the value of the integrityMonitoringRulesDeleted property.
     * 
     */
    public int getIntegrityMonitoringRulesDeleted() {
        return integrityMonitoringRulesDeleted;
    }

    /**
     * Sets the value of the integrityMonitoringRulesDeleted property.
     * 
     */
    public void setIntegrityMonitoringRulesDeleted(int value) {
        this.integrityMonitoringRulesDeleted = value;
    }

    /**
     * Gets the value of the integrityMonitoringRulesUpdated property.
     * 
     */
    public int getIntegrityMonitoringRulesUpdated() {
        return integrityMonitoringRulesUpdated;
    }

    /**
     * Sets the value of the integrityMonitoringRulesUpdated property.
     * 
     */
    public void setIntegrityMonitoringRulesUpdated(int value) {
        this.integrityMonitoringRulesUpdated = value;
    }

    /**
     * Gets the value of the logInspectionDecodersAdded property.
     * 
     */
    public int getLogInspectionDecodersAdded() {
        return logInspectionDecodersAdded;
    }

    /**
     * Sets the value of the logInspectionDecodersAdded property.
     * 
     */
    public void setLogInspectionDecodersAdded(int value) {
        this.logInspectionDecodersAdded = value;
    }

    /**
     * Gets the value of the logInspectionDecodersDeleted property.
     * 
     */
    public int getLogInspectionDecodersDeleted() {
        return logInspectionDecodersDeleted;
    }

    /**
     * Sets the value of the logInspectionDecodersDeleted property.
     * 
     */
    public void setLogInspectionDecodersDeleted(int value) {
        this.logInspectionDecodersDeleted = value;
    }

    /**
     * Gets the value of the logInspectionDecodersUpdated property.
     * 
     */
    public int getLogInspectionDecodersUpdated() {
        return logInspectionDecodersUpdated;
    }

    /**
     * Sets the value of the logInspectionDecodersUpdated property.
     * 
     */
    public void setLogInspectionDecodersUpdated(int value) {
        this.logInspectionDecodersUpdated = value;
    }

    /**
     * Gets the value of the logInspectionRulesAdded property.
     * 
     */
    public int getLogInspectionRulesAdded() {
        return logInspectionRulesAdded;
    }

    /**
     * Sets the value of the logInspectionRulesAdded property.
     * 
     */
    public void setLogInspectionRulesAdded(int value) {
        this.logInspectionRulesAdded = value;
    }

    /**
     * Gets the value of the logInspectionRulesDeleted property.
     * 
     */
    public int getLogInspectionRulesDeleted() {
        return logInspectionRulesDeleted;
    }

    /**
     * Sets the value of the logInspectionRulesDeleted property.
     * 
     */
    public void setLogInspectionRulesDeleted(int value) {
        this.logInspectionRulesDeleted = value;
    }

    /**
     * Gets the value of the logInspectionRulesUpdated property.
     * 
     */
    public int getLogInspectionRulesUpdated() {
        return logInspectionRulesUpdated;
    }

    /**
     * Sets the value of the logInspectionRulesUpdated property.
     * 
     */
    public void setLogInspectionRulesUpdated(int value) {
        this.logInspectionRulesUpdated = value;
    }

    /**
     * Gets the value of the portListsAdded property.
     * 
     */
    public int getPortListsAdded() {
        return portListsAdded;
    }

    /**
     * Sets the value of the portListsAdded property.
     * 
     */
    public void setPortListsAdded(int value) {
        this.portListsAdded = value;
    }

    /**
     * Gets the value of the portListsUpdated property.
     * 
     */
    public int getPortListsUpdated() {
        return portListsUpdated;
    }

    /**
     * Sets the value of the portListsUpdated property.
     * 
     */
    public void setPortListsUpdated(int value) {
        this.portListsUpdated = value;
    }

}
