package net_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiverMain {

	public static void main(String[] args) {
		
		try {
			byte [] arr = new byte[1024];
			DatagramPacket data = new DatagramPacket(arr, arr.length);
			DatagramSocket socket = new DatagramSocket(7777);
			socket.receive(data);
			socket.close();
			
			System.out.println(data.getAddress());
			System.out.println(new String(arr));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
