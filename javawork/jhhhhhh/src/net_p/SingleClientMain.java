package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


class MultiSender extends Thread{
	
	
	DataOutputStream dos;
	DataInputStream dis;
	Socket socket;
	public MultiSender(Socket socket) {
		try {
			this.socket = socket;
			dos = new DataOutputStream(socket.getOutputStream());
			dis = new DataInputStream(socket.getInputStream());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void nameGo() throws Exception {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String str;
			System.out.print("이름:");
			str = sc.nextLine();
			dos.writeUTF(str);
			if(dis.readBoolean()) {
				System.out.println("접속성공");
				new SingleReceiver(socket).start();
				break;
			}
			System.out.println("이름중복");
		}
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		try {
			
			nameGo();
			
			while(dos!=null) {
				
				dos.writeUTF(sc.nextLine());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class SingleClientMain {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.200.87", 7777);
			System.out.println("클라이언트 서버 접속");
			
			
			//new SingleSender(socket).start();
			new MultiSender(socket).start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//1. 대화명을 지정하여 넣으세요
		//2. 자동완성을 실행해 주세요
	}

}
