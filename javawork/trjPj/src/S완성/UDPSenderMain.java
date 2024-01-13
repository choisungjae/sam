package S완성;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
class Receiver2 extends Thread{

	public Receiver2() {
		super();
		// Courier New     TODO Auto-generated constructor stub
	}
	
	public void run() {
		while(true) {
			try {
//				sleep(10);
			byte [] arr = new byte[1024];
			DatagramPacket data = new DatagramPacket(arr, arr.length);
			DatagramSocket socket = new DatagramSocket(7777);
			socket.receive(data);
			socket.close();
			
//			System.out.println(data.getAddress());
			System.out.println("이름:"+data.getAddress()+"받은메세지:"+new String(arr));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
class Spender2 extends Thread{

	public Spender2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void run() {
		while(true) {
			try {
				sleep(10);
			InetAddress addr = InetAddress.getByName("192.168.200.96");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("채팅입력하세요");
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
}
public class UDPSenderMain {

	public static void main(String[] args) {
		
		new Receiver2().start();
		
		new Spender2().start();
		}

}