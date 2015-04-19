
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TimeFilterTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeFilterTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}TransportObject">
 *       &lt;sequence>
 *         &lt;element name="rangeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="rangeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="specificTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="type" type="{urn:Manager}EnumTimeFilterType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeFilterTransport", propOrder = {
    "rangeFrom",
    "rangeTo",
    "specificTime",
    "type"
})
public class TimeFilterTransport
    extends TransportObject
{

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rangeFrom;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rangeTo;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar specificTime;
    @XmlElement(required = true, nillable = true)
    protected EnumTimeFilterType type;

    /**
     * Gets the value of the rangeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRangeFrom() {
        return rangeFrom;
    }

    /**
     * Sets the value of the rangeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRangeFrom(XMLGregorianCalendar value) {
        this.rangeFrom = value;
    }

    /**
     * Gets the value of the rangeTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRangeTo() {
        return rangeTo;
    }

    /**
     * Sets the value of the rangeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRangeTo(XMLGregorianCalendar value) {
        this.rangeTo = value;
    }

    /**
     * Gets the value of the specificTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpecificTime() {
        return specificTime;
    }

    /**
     * Sets the value of the specificTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpecificTime(XMLGregorianCalendar value) {
        this.specificTime = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EnumTimeFilterType }
     *     
     */
    public EnumTimeFilterType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTimeFilterType }
     *     
     */
    public void setType(EnumTimeFilterType value) {
        this.type = value;
    }

}
