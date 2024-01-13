package S1213;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
// 
public class ServerSocketMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			server = new ServerSocket(7777);
			 
			while(true) {
				System.out.println("서버대기1111");
				Socket client =server.accept();
				InputStream is = client.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				
				System.out.println(client.getInetAddress()+"접속대기");
				OutputStream os = client.getOutputStream();
				DataOutputStream dos=new DataOutputStream(os);
				

				
//				dis.readUTF();//"자냐성재야가 옴"
				dos.writeUTF(dis.readUTF());
				dos.writeUTF("성재 안잔다");
//
//				dis.readUTF();//"왜안자" 가 옴
				dos.writeUTF(dis.readUTF());
				
				dis.close();
				is.close();;
				dos.close();
				os.close();
				
				client.close();
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}//접속한 클라이언트 에게 파일을 전송하세요.


