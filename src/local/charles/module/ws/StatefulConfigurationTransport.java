
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatefulConfigurationTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatefulConfigurationTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}ConfigurationTransport">
 *       &lt;sequence>
 *         &lt;element name="ackStormDropConnection" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ackStormProtection" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ackStormProtectionThreshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="allowIncomingActiveFTP" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allowIncomingPassiveFTP" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allowOutgoingActiveFTP" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allowOutgoingPassiveFTP" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="denyFragmentedPackets" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="denyTcpCwrEceFlags" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="enableICMPStatefulInspection" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="enableICMPStatefulLogging" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="enableTCPStatefulInspection" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="enableTCPStatefulLogging" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="enableUDPStatefulInspection" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="enableUDPStatefulLogging" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="limitHalfOpenConnections" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="limitHalfOpenConnectionsTo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="limitIncomingConnections" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="limitIncomingConnectionsTo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="limitOutgoingConnections" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="limitOutgoingConnectionsTo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="synFloodProtection" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="synFloodProtectionThreshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatefulConfigurationTransport", propOrder = {
    "ackStormDropConnection",
    "ackStormProtection",
    "ackStormProtectionThreshold",
    "allowIncomingActiveFTP",
    "allowIncomingPassiveFTP",
    "allowOutgoingActiveFTP",
    "allowOutgoingPassiveFTP",
    "denyFragmentedPackets",
    "denyTcpCwrEceFlags",
    "enableICMPStatefulInspection",
    "enableICMPStatefulLogging",
    "enableTCPStatefulInspection",
    "enableTCPStatefulLogging",
    "enableUDPStatefulInspection",
    "enableUDPStatefulLogging",
    "limitHalfOpenConnections",
    "limitHalfOpenConnectionsTo",
    "limitIncomingConnections",
    "limitIncomingConnectionsTo",
    "limitOutgoingConnections",
    "limitOutgoingConnectionsTo",
    "synFloodProtection",
    "synFloodProtectionThreshold"
})
public class StatefulConfigurationTransport
    extends ConfigurationTransport
{

    protected boolean ackStormDropConnection;
    protected boolean ackStormProtection;
    protected int ackStormProtectionThreshold;
    protected boolean allowIncomingActiveFTP;
    protected boolean allowIncomingPassiveFTP;
    protected boolean allowOutgoingActiveFTP;
    protected boolean allowOutgoingPassiveFTP;
    protected boolean denyFragmentedPackets;
    protected boolean denyTcpCwrEceFlags;
    protected boolean enableICMPStatefulInspection;
    protected boolean enableICMPStatefulLogging;
    protected boolean enableTCPStatefulInspection;
    protected boolean enableTCPStatefulLogging;
    protected boolean enableUDPStatefulInspection;
    protected boolean enableUDPStatefulLogging;
    protected boolean limitHalfOpenConnections;
    protected int limitHalfOpenConnectionsTo;
    protected boolean limitIncomingConnections;
    protected int limitIncomingConnectionsTo;
    protected boolean limitOutgoingConnections;
    protected int limitOutgoingConnectionsTo;
    protected boolean synFloodProtection;
    protected int synFloodProtectionThreshold;

    /**
     * Gets the value of the ackStormDropConnection property.
     * 
     */
    public boolean isAckStormDropConnection() {
        return ackStormDropConnection;
    }

    /**
     * Sets the value of the ackStormDropConnection property.
     * 
     */
    public void setAckStormDropConnection(boolean value) {
        this.ackStormDropConnection = value;
    }

    /**
     * Gets the value of the ackStormProtection property.
     * 
     */
    public boolean isAckStormProtection() {
        return ackStormProtection;
    }

    /**
     * Sets the value of the ackStormProtection property.
     * 
     */
    public void setAckStormProtection(boolean value) {
        this.ackStormProtection = value;
    }

    /**
     * Gets the value of the ackStormProtectionThreshold property.
     * 
     */
    public int getAckStormProtectionThreshold() {
        return ackStormProtectionThreshold;
    }

    /**
     * Sets the value of the ackStormProtectionThreshold property.
     * 
     */
    public void setAckStormProtectionThreshold(int value) {
        this.ackStormProtectionThreshold = value;
    }

    /**
     * Gets the value of the allowIncomingActiveFTP property.
     * 
     */
    public boolean isAllowIncomingActiveFTP() {
        return allowIncomingActiveFTP;
    }

    /**
     * Sets the value of the allowIncomingActiveFTP property.
     * 
     */
    public void setAllowIncomingActiveFTP(boolean value) {
        this.allowIncomingActiveFTP = value;
    }

    /**
     * Gets the value of the allowIncomingPassiveFTP property.
     * 
     */
    public boolean isAllowIncomingPassiveFTP() {
        return allowIncomingPassiveFTP;
    }

    /**
     * Sets the value of the allowIncomingPassiveFTP property.
     * 
     */
    public void setAllowIncomingPassiveFTP(boolean value) {
        this.allowIncomingPassiveFTP = value;
    }

    /**
     * Gets the value of the allowOutgoingActiveFTP property.
     * 
     */
    public boolean isAllowOutgoingActiveFTP() {
        return allowOutgoingActiveFTP;
    }

    /**
     * Sets the value of the allowOutgoingActiveFTP property.
     * 
     */
    public void setAllowOutgoingActiveFTP(boolean value) {
        this.allowOutgoingActiveFTP = value;
    }

    /**
     * Gets the value of the allowOutgoingPassiveFTP property.
     * 
     */
    public boolean isAllowOutgoingPassiveFTP() {
        return allowOutgoingPassiveFTP;
    }

    /**
     * Sets the value of the allowOutgoingPassiveFTP property.
     * 
     */
    public void setAllowOutgoingPassiveFTP(boolean value) {
        this.allowOutgoingPassiveFTP = value;
    }

    /**
     * Gets the value of the denyFragmentedPackets property.
     * 
     */
    public boolean isDenyFragmentedPackets() {
        return denyFragmentedPackets;
    }

    /**
     * Sets the value of the denyFragmentedPackets property.
     * 
     */
    public void setDenyFragmentedPackets(boolean value) {
        this.denyFragmentedPackets = value;
    }

    /**
     * Gets the value of the denyTcpCwrEceFlags property.
     * 
     */
    public boolean isDenyTcpCwrEceFlags() {
        return denyTcpCwrEceFlags;
    }

    /**
     * Sets the value of the denyTcpCwrEceFlags property.
     * 
     */
    public void setDenyTcpCwrEceFlags(boolean value) {
        this.denyTcpCwrEceFlags = value;
    }

    /**
     * Gets the value of the enableICMPStatefulInspection property.
     * 
     */
    public boolean isEnableICMPStatefulInspection() {
        return enableICMPStatefulInspection;
    }

    /**
     * Sets the value of the enableICMPStatefulInspection property.
     * 
     */
    public void setEnableICMPStatefulInspection(boolean value) {
        this.enableICMPStatefulInspection = value;
    }

    /**
     * Gets the value of the enableICMPStatefulLogging property.
     * 
     */
    public boolean isEnableICMPStatefulLogging() {
        return enableICMPStatefulLogging;
    }

    /**
     * Sets the value of the enableICMPStatefulLogging property.
     * 
     */
    public void setEnableICMPStatefulLogging(boolean value) {
        this.enableICMPStatefulLogging = value;
    }

    /**
     * Gets the value of the enableTCPStatefulInspection property.
     * 
     */
    public boolean isEnableTCPStatefulInspection() {
        return enableTCPStatefulInspection;
    }

    /**
     * Sets the value of the enableTCPStatefulInspection property.
     * 
     */
    public void setEnableTCPStatefulInspection(boolean value) {
        this.enableTCPStatefulInspection = value;
    }

    /**
     * Gets the value of the enableTCPStatefulLogging property.
     * 
     */
    public boolean isEnableTCPStatefulLogging() {
        return enableTCPStatefulLogging;
    }

    /**
     * Sets the value of the enableTCPStatefulLogging property.
     * 
     */
    public void setEnableTCPStatefulLogging(boolean value) {
        this.enableTCPStatefulLogging = value;
    }

    /**
     * Gets the value of the enableUDPStatefulInspection property.
     * 
     */
    public boolean isEnableUDPStatefulInspection() {
        return enableUDPStatefulInspection;
    }

    /**
     * Sets the value of the enableUDPStatefulInspection property.
     * 
     */
    public void setEnableUDPStatefulInspection(boolean value) {
        this.enableUDPStatefulInspection = value;
    }

    /**
     * Gets the value of the enableUDPStatefulLogging property.
     * 
     */
    public boolean isEnableUDPStatefulLogging() {
        return enableUDPStatefulLogging;
    }

    /**
     * Sets the value of the enableUDPStatefulLogging property.
     * 
     */
    public void setEnableUDPStatefulLogging(boolean value) {
        this.enableUDPStatefulLogging = value;
    }

    /**
     * Gets the value of the limitHalfOpenConnections property.
     * 
     */
    public boolean isLimitHalfOpenConnections() {
        return limitHalfOpenConnections;
    }

    /**
     * Sets the value of the limitHalfOpenConnections property.
     * 
     */
    public void setLimitHalfOpenConnections(boolean value) {
        this.limitHalfOpenConnections = value;
    }

    /**
     * Gets the value of the limitHalfOpenConnectionsTo property.
     * 
     */
    public int getLimitHalfOpenConnectionsTo() {
        return limitHalfOpenConnectionsTo;
    }

    /**
     * Sets the value of the limitHalfOpenConnectionsTo property.
     * 
     */
    public void setLimitHalfOpenConnectionsTo(int value) {
        this.limitHalfOpenConnectionsTo = value;
    }

    /**
     * Gets the value of the limitIncomingConnections property.
     * 
     */
    public boolean isLimitIncomingConnections() {
        return limitIncomingConnections;
    }

    /**
     * Sets the value of the limitIncomingConnections property.
     * 
     */
    public void setLimitIncomingConnections(boolean value) {
        this.limitIncomingConnections = value;
    }

    /**
     * Gets the value of the limitIncomingConnectionsTo property.
     * 
     */
    public int getLimitIncomingConnectionsTo() {
        return limitIncomingConnectionsTo;
    }

    /**
     * Sets the value of the limitIncomingConnectionsTo property.
     * 
     */
    public void setLimitIncomingConnectionsTo(int value) {
        this.limitIncomingConnectionsTo = value;
    }

    /**
     * Gets the value of the limitOutgoingConnections property.
     * 
     */
    public boolean isLimitOutgoingConnections() {
        return limitOutgoingConnections;
    }

    /**
     * Sets the value of the limitOutgoingConnections property.
     * 
     */
    public void setLimitOutgoingConnections(boolean value) {
        this.limitOutgoingConnections = value;
    }

    /**
     * Gets the value of the limitOutgoingConnectionsTo property.
     * 
     */
    public int getLimitOutgoingConnectionsTo() {
        return limitOutgoingConnectionsTo;
    }

    /**
     * Sets the value of the limitOutgoingConnectionsTo property.
     * 
     */
    public void setLimitOutgoingConnectionsTo(int value) {
        this.limitOutgoingConnectionsTo = value;
    }

    /**
     * Gets the value of the synFloodProtection property.
     * 
     */
    public boolean isSynFloodProtection() {
        return synFloodProtection;
    }

    /**
     * Sets the value of the synFloodProtection property.
     * 
     */
    public void setSynFloodProtection(boolean value) {
        this.synFloodProtection = value;
    }

    /**
     * Gets the value of the synFloodProtectionThreshold property.
     * 
     */
    public int getSynFloodProtectionThreshold() {
        return synFloodProtectionThreshold;
    }

    /**
     * Sets the value of the synFloodProtectionThreshold property.
     * 
     */
    public void setSynFloodProtectionThreshold(int value) {
        this.synFloodProtectionThreshold = value;
    }

}
