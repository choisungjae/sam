package S완성;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

class rere extends Thread{
	
	public rere() {
		super();
		
	}
	
	public void run() {
		while(true) {
	
			MulticastSocket ms = null;
			InetAddress ia = null;
			try {
				ms = new MulticastSocket(7777);
				ia = InetAddress.getByName("230.0.0.1");
				ms.joinGroup(ia);
				
				byte [] arr = new byte[1024];
				DatagramPacket data = new DatagramPacket(arr, arr.length);
				ms.receive(data);

				System.out.println(ia.getHostName()+":"+new String(arr));
				
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
}
class spen extends Thread{
	
public spen() {
	super();
		
	}
public void run() {
	
	while(true) {
		MulticastSocket ms = null;
		try {
		
			ms = new MulticastSocket();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("채팅입력하세요");
			String chat =sc.nextLine();
			InetAddress ia = InetAddress.getByName("230.0.0.1");
			
			DatagramPacket data = new DatagramPacket(
				    chat.getBytes(),
					chat.getBytes().length, 
					ia, 
					7777);
			
			ms.send(data);
			
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		ms.close();
	}
	
	
	

}

}
}

public class M멀티챗쓰레드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new rere().start();
		new spen().start();
		}

}
