
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemsTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemsTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}ConfigurationTransport">
 *       &lt;sequence>
 *         &lt;element name="items" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemsTransport", propOrder = {
    "items"
})
@XmlSeeAlso({
    IPListTransport.class,
    ScanFileExtListTransport.class,
    ScanDirectoryListTransport.class,
    MACListTransport.class,
    PortListTransport.class,
    ScanFileListTransport.class
})
public class ItemsTransport
    extends ConfigurationTransport
{

    @XmlElement(required = true, nillable = true)
    protected String items;

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItems(String value) {
        this.items = value;
    }

}
