
package local.charles.module.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagerAuthenticationException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagerAuthenticationException">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Manager}ManagerSecurityException">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagerAuthenticationException")
@XmlSeeAlso({
    ManagerLockoutException.class,
    ManagerMaxSessionsException.class,
    ManagerTimeoutException.class
})
public class ManagerAuthenticationException
    extends ManagerSecurityException
{


}
