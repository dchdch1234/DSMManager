
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CounterWithIDTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CounterWithIDTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}CounterTransport">
 *       &lt;sequence>
 *         &lt;element name="itemID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterWithIDTransport", propOrder = {
    "itemID"
})
public class CounterWithIDTransport
    extends CounterTransport
{

    protected int itemID;

    /**
     * Gets the value of the itemID property.
     * 
     */
    public int getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     */
    public void setItemID(int value) {
        this.itemID = value;
    }

}
