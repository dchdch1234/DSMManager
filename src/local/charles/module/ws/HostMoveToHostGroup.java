
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
 *         &lt;element name="hostIDs" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
 *         &lt;element name="hostGroupID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "hostIDs",
    "hostGroupID",
    "sid"
})
@XmlRootElement(name = "hostMoveToHostGroup")
public class HostMoveToHostGroup {

    @XmlElement(type = Integer.class)
    protected List<Integer> hostIDs;
    protected int hostGroupID;
    @XmlElement(name = "sID", required = true)
    protected String sid;

    /**
     * Gets the value of the hostIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getHostIDs() {
        if (hostIDs == null) {
            hostIDs = new ArrayList<Integer>();
        }
        return this.hostIDs;
    }

    /**
     * Gets the value of the hostGroupID property.
     * 
     */
    public int getHostGroupID() {
        return hostGroupID;
    }

    /**
     * Sets the value of the hostGroupID property.
     * 
     */
    public void setHostGroupID(int value) {
        this.hostGroupID = value;
    }

    /**
     * Gets the value of the sid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSID() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSID(String value) {
        this.sid = value;
    }

}
