
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SecurityUpdateTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityUpdateTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}TransportObject">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="appliedState" type="{urn:Manager}EnumSecurityUpdateAppliedState"/>
 *         &lt;element name="contentSummary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="detectOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="downloaded" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="released" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityUpdateTransport", propOrder = {
    "id",
    "appliedState",
    "contentSummary",
    "detectOnly",
    "downloaded",
    "name",
    "released"
})
public class SecurityUpdateTransport
    extends TransportObject
{

    @XmlElement(name = "ID", required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, nillable = true)
    protected EnumSecurityUpdateAppliedState appliedState;
    @XmlElement(required = true, nillable = true)
    protected String contentSummary;
    protected boolean detectOnly;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar downloaded;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar released;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the appliedState property.
     * 
     * @return
     *     possible object is
     *     {@link EnumSecurityUpdateAppliedState }
     *     
     */
    public EnumSecurityUpdateAppliedState getAppliedState() {
        return appliedState;
    }

    /**
     * Sets the value of the appliedState property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumSecurityUpdateAppliedState }
     *     
     */
    public void setAppliedState(EnumSecurityUpdateAppliedState value) {
        this.appliedState = value;
    }

    /**
     * Gets the value of the contentSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentSummary() {
        return contentSummary;
    }

    /**
     * Sets the value of the contentSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentSummary(String value) {
        this.contentSummary = value;
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
     * Gets the value of the downloaded property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDownloaded() {
        return downloaded;
    }

    /**
     * Sets the value of the downloaded property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDownloaded(XMLGregorianCalendar value) {
        this.downloaded = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the released property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReleased() {
        return released;
    }

    /**
     * Sets the value of the released property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReleased(XMLGregorianCalendar value) {
        this.released = value;
    }

}
