
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobProgressTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobProgressTransport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}TransportObject">
 *       &lt;sequence>
 *         &lt;element name="complete" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pending" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="unable" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobProgressTransport", propOrder = {
    "complete",
    "error",
    "pending",
    "unable"
})
public class JobProgressTransport
    extends TransportObject
{

    protected int complete;
    protected int error;
    protected int pending;
    protected int unable;

    /**
     * Gets the value of the complete property.
     * 
     */
    public int getComplete() {
        return complete;
    }

    /**
     * Sets the value of the complete property.
     * 
     */
    public void setComplete(int value) {
        this.complete = value;
    }

    /**
     * Gets the value of the error property.
     * 
     */
    public int getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     */
    public void setError(int value) {
        this.error = value;
    }

    /**
     * Gets the value of the pending property.
     * 
     */
    public int getPending() {
        return pending;
    }

    /**
     * Sets the value of the pending property.
     * 
     */
    public void setPending(int value) {
        this.pending = value;
    }

    /**
     * Gets the value of the unable property.
     * 
     */
    public int getUnable() {
        return unable;
    }

    /**
     * Sets the value of the unable property.
     * 
     */
    public void setUnable(int value) {
        this.unable = value;
    }

}
