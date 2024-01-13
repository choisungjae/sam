package T1216;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
class Receiver extends Thread{

	public Receiver() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void run() {
//		while(true) {
		try {
			sleep(10);
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
//		}
}
class Spender extends Thread{

	public Spender() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void run() {
//		while(true) {
		try {
			sleep(10);
			InetAddress addr = InetAddress.getByName("192.168.1.59");
			
			Scanner sc = new Scanner(System.in);
			String chat =sc.next();
			System.out.println("채팅입력하세요");
			
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
//	}
}
public class UDPReceiverMain {

	public static void main(String[] args) {
		
		new Receiver().start();
		new Spender().start();
	}

}