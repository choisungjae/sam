package S4000;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class SJmulticastMain {

	public static void main(String[] args) {
		
		MulticastSocket ms = null;
		try {
			ms = new MulticastSocket();
			String msg = "여긴 우리그";
			InetAddress ia = InetAddress.getByName("230.0.0.1");
			DatagramPacket data = new DatagramPacket(
					msg.getBytes(),
					msg.getBytes().length, 
					ia, 
					7777);
			
			ms.send(data);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ms.close();
		}
		
		
		

	}

}