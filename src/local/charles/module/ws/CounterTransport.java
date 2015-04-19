
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CounterTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CounterTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}TransportObject">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="percentOfTotal" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="percentOfTotalString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="valueString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="previousValue" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterTransport", propOrder = {
    "description",
    "percentOfTotal",
    "percentOfTotalString",
    "text",
    "value",
    "valueString",
    "previousValue"
})
@XmlSeeAlso({
    CounterWithIDTransport.class,
    CounterAlertTypeTransport.class,
    CounterHostTransport.class
})
public class CounterTransport
    extends TransportObject
{

    @XmlElement(required = true, nillable = true)
    protected String description;
    protected float percentOfTotal;
    @XmlElement(required = true, nillable = true)
    protected String percentOfTotalString;
    @XmlElement(required = true, nillable = true)
    protected String text;
    protected long value;
    @XmlElement(required = true, nillable = true)
    protected String valueString;
    protected long previousValue;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the percentOfTotal property.
     * 
     */
    public float getPercentOfTotal() {
        return percentOfTotal;
    }

    /**
     * Sets the value of the percentOfTotal property.
     * 
     */
    public void setPercentOfTotal(float value) {
        this.percentOfTotal = value;
    }

    /**
     * Gets the value of the percentOfTotalString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentOfTotalString() {
        return percentOfTotalString;
    }

    /**
     * Sets the value of the percentOfTotalString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentOfTotalString(String value) {
        this.percentOfTotalString = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public long getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(long value) {
        this.value = value;
    }

    /**
     * Gets the value of the valueString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueString() {
        return valueString;
    }

    /**
     * Sets the value of the valueString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueString(String value) {
        this.valueString = value;
    }

    /**
     * Gets the value of the previousValue property.
     * 
     */
    public long getPreviousValue() {
        return previousValue;
    }

    /**
     * Sets the value of the previousValue property.
     * 
     */
    public void setPreviousValue(long value) {
        this.previousValue = value;
    }

}
