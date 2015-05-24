package local.charles.main;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.sound.sampled.Port;

public class SyslogServerThread extends Thread {
	
	protected DatagramSocket ds;
	protected int port;
	protected boolean shutdown;
	protected static final int SYSLOG_BUFFER_SIZE = 1024;
	
	public SyslogServerThread( int port) {
		// TODO Auto-generated constructor stub
		this.port = port;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			this.ds = new DatagramSocket(port);
			this.shutdown = false;
			
		} catch (SocketException se) {
			return;
			
		}
		
		while(!this.shutdown) {
			DatagramPacket dp = null;
			byte[] receiveData = new byte[SYSLOG_BUFFER_SIZE];
			try {
				dp = new DatagramPacket(receiveData,receiveData.length);				
				this.ds.receive(dp);
				System.out.println("IP："+ dp.getAddress());
		        System.out.println("Port："+ dp.getPort());
		        System.out.println("Content："+new String( dp.getData()).trim());
												
			} catch (SocketException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
	
}
