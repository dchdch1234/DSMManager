package local.charles.main;

import java.util.ArrayList;

import local.charles.module.ws.*;

public class DSMManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		DSMWebService dsmws = new DSMWebService(args[0], args[1]);
		try {
			ArrayList<UserTransport> userlist = null;
			userlist = (ArrayList<UserTransport>) dsmws.invokeMethod("userRetrieveAll", null);
			System.out.println(userlist.toString());
			dsmws.addFirewallRuleToComputer();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		UserTransport ut = null;
		
		dsmws.close();
		*/
		
		SyslogServerThread st = new SyslogServerThread(520);
		st.start();	
		
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
