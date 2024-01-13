package net_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSenderMain {

	public static void main(String[] args) {
		
		try {
			String msg = "안녕하세요";
			InetAddress addr = InetAddress.getByName("192.168.200.87");
			
			DatagramPacket data = new DatagramPacket(
					msg.getBytes(), 
					msg.getBytes().length,
					addr, 
					7777);
			
			DatagramSocket socket = new DatagramSocket();
			socket.send(data);
			socket.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
