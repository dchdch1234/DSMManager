package local.charles.module.ws;

import java.awt.List;
import java.util.ArrayList;

import javax.lang.model.element.ExecutableElement;

public class DSMWebService {
	
	private Manager manager;
	private String username;
	private String password;
	private String sid;
	
	
	private boolean login() {
		boolean result = false;
		try {
			sid = manager.authenticate(this.username, this.password);
			result = true;
		} catch (ManagerAuthenticationException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ManagerCommunicationException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ManagerException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ManagerLockoutException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ManagerMaxSessionsException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ManagerSecurityException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return result;
	}
	
	private void logout(){
		manager.endSession(sid);
	}
	
	public DSMWebService( String username, String password ) {
		// TODO Auto-generated constructor stub
		ManagerService ms = new ManagerService();
		manager = ms.getManager();
		this.username = username;
		this.password = password;				
		login();
	}

	public Object invokeMethod(String methodName, Object[] args)
			throws Exception {

		
		@SuppressWarnings("rawtypes")
		ArrayList<Class> argsClass = new ArrayList<Class>();
		ArrayList<Object> newargs = new ArrayList<Object>();
		
		// Add sid parameter into args
		if ( args != null ) {							
			for (int i = 0, j = args.length; i < j; i++) {				
				argsClass.add(args[i].getClass());
				newargs.add(args[i]);
			}
		}
		argsClass.add(String.class);				
		newargs.add(sid);
		Object result = null;
	
		try {
			result = Manager.class.getMethod(methodName,  (Class[]) argsClass.toArray(new Class[0])).invoke(manager, newargs.toArray());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
			
	}
	
	public boolean addFirewallRuleToComputer(){
		FirewallRuleTransport rt = new FirewallRuleTransport();
		rt.setName("New firewall rule");
		rt.setDescription("Add by DSMManager");
		rt.setAction(EnumFirewallRuleAction.DENY);
//		rt.setPriority(EnumFirewallRulePriority.HIGHEST);
		rt.setFrameType(EnumFirewallRuleFrameType.IP);
		rt.setPacketDirection(EnumDirection.INCOMING);
		rt.setSourceIPType(EnumFirewallRuleIPType.SINGLE_IP);
		rt.setSourceSingleIP("8.8.8.8");
		try {
			manager.firewallRuleSave(rt, sid);
		} catch (ManagerAuthenticationException_Exception
				| ManagerAuthorizationException_Exception
				| ManagerException_Exception
				| ManagerIntegrityConstraintException_Exception
				| ManagerTimeoutException_Exception
				| ManagerValidationException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public void close() {
		this.logout();
	}
	
	
	
	
	
	

}
