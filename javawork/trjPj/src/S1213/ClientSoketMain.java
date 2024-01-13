package S1213;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSoketMain {
//내가 192.168.1.59
	public static void main(String[] args) {
	     try { 
//			Socket socket =new Socket("192.168.200.87",7777);
			Socket socket =new Socket("192.168.200.102",7777);
//			System.out.println("자니");
			
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos=new DataOutputStream(os);
			
			dos.writeUTF("자냐 성재야");
			System.out.println("내가보낸글:"+dis.readUTF());
			
			
			System.out.println("서버답변:"+dis.readUTF());
//		    
			dos.writeUTF("왜안자");
			System.out.println("내가보낸글:"+dis.readUTF());

		    
			dis.close();
			is.close();
			dos.close();
			os.close();
			socket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
