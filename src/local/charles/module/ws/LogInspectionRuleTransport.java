
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LogInspectionRuleTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogInspectionRuleTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}ConfigurationTransport">
 *       &lt;sequence>
 *         &lt;element name="TBUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alertMinSeverity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="authoritative" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="files" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ignoreRecommendations" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="issued" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="minAgentVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="minManagerVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="raiseAlert" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogInspectionRuleTransport", propOrder = {
    "tbuid",
    "alertMinSeverity",
    "authoritative",
    "content",
    "files",
    "identifier",
    "ignoreRecommendations",
    "issued",
    "minAgentVersion",
    "minManagerVersion",
    "raiseAlert"
})
public class LogInspectionRuleTransport
    extends ConfigurationTransport
{

    @XmlElement(name = "TBUID", required = true, nillable = true)
    protected String tbuid;
    protected int alertMinSeverity;
    protected boolean authoritative;
    @XmlElement(required = true, nillable = true)
    protected String content;
    @XmlElement(required = true, nillable = true)
    protected String files;
    @XmlElement(required = true, nillable = true)
    protected String identifier;
    protected boolean ignoreRecommendations;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issued;
    @XmlElement(required = true, nillable = true)
    protected String minAgentVersion;
    @XmlElement(required = true, nillable = true)
    protected String minManagerVersion;
    protected boolean raiseAlert;

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
     * Gets the value of the alertMinSeverity property.
     * 
     */
    public int getAlertMinSeverity() {
        return alertMinSeverity;
    }

    /**
     * Sets the value of the alertMinSeverity property.
     * 
     */
    public void setAlertMinSeverity(int value) {
        this.alertMinSeverity = value;
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
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the files property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiles() {
        return files;
    }

    /**
     * Sets the value of the files property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiles(String value) {
        this.files = value;
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
     * Gets the value of the minAgentVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinAgentVersion() {
        return minAgentVersion;
    }

    /**
     * Sets the value of the minAgentVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinAgentVersion(String value) {
        this.minAgentVersion = value;
    }

    /**
     * Gets the value of the minManagerVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinManagerVersion() {
        return minManagerVersion;
    }

    /**
     * Sets the value of the minManagerVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinManagerVersion(String value) {
        this.minManagerVersion = value;
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

}
