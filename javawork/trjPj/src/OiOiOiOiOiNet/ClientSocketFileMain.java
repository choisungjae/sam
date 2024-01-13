package OiOiOiOiOiNet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientSocketFileMain {

	public static void main(String[] args) {
		try {
			byte [] buf = new byte[1024];
			//서버접속
			Socket socket = new Socket("192.168.200.87", 7777);
			System.out.println("클라이언트 서버 접속 성공");
			
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			FileOutputStream fos = new FileOutputStream("dst/"+dis.readUTF());
			
			int fileSize = dis.readInt();
			int readCnt = fileSize/buf.length;
			
			if(fileSize%buf.length!=0) {
				readCnt++;
			}
			System.out.println("크기:"+fileSize+","+readCnt);
			
			
			for (int i = 0; i <readCnt; i++) {
				//System.out.println("클라이언트 받음:"+);
				dis.read(buf);
				fos.write(buf);
				System.out.println("클라이언트 받음:"+i);
			}
			fos.close();
			
			
			
			dis.close();
			is.close();
		
			
			//socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
