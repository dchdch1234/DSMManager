
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="updateComponentsReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "updateComponentsReturn"
})
@XmlRootElement(name = "updateComponentsResponse")
public class UpdateComponentsResponse {

    protected boolean updateComponentsReturn;

    /**
     * Gets the value of the updateComponentsReturn property.
     * 
     */
    public boolean isUpdateComponentsReturn() {
        return updateComponentsReturn;
    }

    /**
     * Sets the value of the updateComponentsReturn property.
     * 
     */
    public void setUpdateComponentsReturn(boolean value) {
        this.updateComponentsReturn = value;
    }

}
