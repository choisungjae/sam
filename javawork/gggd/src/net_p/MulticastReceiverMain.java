package net_p;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastReceiverMain {

	public static void main(String[] args) {

		MulticastSocket ms = null;
		InetAddress ia = null;
		try {
			ms = new MulticastSocket(7777);
			ia = InetAddress.getByName("230.0.0.1");
			ms.joinGroup(ia);
			
			byte [] arr = new byte[1024];
			DatagramPacket data = new DatagramPacket(arr, arr.length);
			ms.receive(data);
			
			System.out.println(new String(arr));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ms.leaveGroup(ia);
				ms.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		

	}

}
