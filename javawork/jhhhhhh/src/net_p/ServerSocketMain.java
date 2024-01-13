package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/*
SERVER						CLIENT

서버생성 1
ServerSocket

클라이언트 접속대기	2			서버접속 3 
accept     <----------		Socket

스트림 생성 4					스트림 생성 4
OutputStream 				InputStream

스트림으로 데이터 송신 5 			스트림으로 데이터 수신 6
writeUTF	------------>	readUTF

스트림종료 7						스트림종료 7
클라이언트소켓종료 8				소켓종료 8
 
서버종료 9
 * */
public class ServerSocketMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			server = new ServerSocket(7777);
			
			while(true) {  
				System.out.println("서버 대기");
				//클라이언트 접속
				Socket client = server.accept();
				System.out.println(client.getInetAddress()+" 접속");
				OutputStream  os = client.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				InputStream is = client.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				
				System.out.println("서버받음:"+dis.readUTF());
				
				dos.writeUTF("안자");
				
				System.out.println("서버받음:"+dis.readUTF());
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
	/*
	      서버         클라이언트

            <---- 자니?

            안자 ----->

            <---- 왜안자?
 */
	//접속한 클라이언트에게 파일을 전송하세요

}
