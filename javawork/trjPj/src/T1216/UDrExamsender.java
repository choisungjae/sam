package T1216;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDrExamsender {

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
		
		try {
		
			InetAddress addr = InetAddress.getByName("192.168.1.59");
			Scanner sc = new Scanner(System.in);
			String chat =sc.nextLine();
			
			
			DatagramPacket data = new DatagramPacket(
					chat.getBytes(),
					chat.getBytes().length,
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