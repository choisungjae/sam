package net_p;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketFileMain {

	public static void main(String[] args) {
		String fileName = "child_4.jpg";
		ServerSocket server = null;
		byte [] buf = new byte[1024];
		try {
			server = new ServerSocket(7777);
			
			while(true) {  
				System.out.println("서버 대기");
				//클라이언트 접속
				Socket client = server.accept();
				System.out.println(client.getInetAddress()+" 접속");
				OutputStream  os = client.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				//461013
				FileInputStream fis = new FileInputStream("fff/"+fileName);
			
				dos.writeUTF(fileName);
				dos.writeInt(fis.available());
				int i = 0;
				while(fis.available()>0) {
					int cnt = fis.read(buf);
					dos.write(buf,0,cnt);
					i++;
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println(i);
				fis.close();
				dos.close();
				os.close();
				
				client.close();
				
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//server.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	/*
	      서버         클라이언트

            <---- 자니?

            안자 ----->

            <---- 왜안자?
 */
	//접속한 클라이언트에게 파일을 전송하세요

}
