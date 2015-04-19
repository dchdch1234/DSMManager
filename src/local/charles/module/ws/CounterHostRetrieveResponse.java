
package local.charles.module.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="counterHostRetrieveReturn" type="{urn:Manager}CounterHostTransport" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "counterHostRetrieveReturn"
})
@XmlRootElement(name = "counterHostRetrieveResponse")
public class CounterHostRetrieveResponse {

    @XmlElement(required = true)
    protected List<CounterHostTransport> counterHostRetrieveReturn;

    /**
     * Gets the value of the counterHostRetrieveReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the counterHostRetrieveReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCounterHostRetrieveReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CounterHostTransport }
     * 
     * 
     */
    public List<CounterHostTransport> getCounterHostRetrieveReturn() {
        if (counterHostRetrieveReturn == null) {
            counterHostRetrieveReturn = new ArrayList<CounterHostTransport>();
        }
        return this.counterHostRetrieveReturn;
    }

}
