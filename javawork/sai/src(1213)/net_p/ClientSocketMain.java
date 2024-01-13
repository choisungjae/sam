package net_p;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClientSocketMain {

	public static void main(String[] args) {
		try {
			//서버접속
			Socket socket = new Socket("192.168.200.107", 3692);
			System.out.println("클라이언트 서버 접속 성공");
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			System.out.println("받음:"+dis.readUTF());
			dis.close();
			is.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
