package T1216;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDrExamre {
public static void main(String[] args) {
		
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
