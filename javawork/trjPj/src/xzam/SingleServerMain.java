package xzam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.regex.Pattern;

class SingleSender extends Thread{
	
	String name;
	DataOutputStream dos;
	
	public SingleSender(Socket socket) {
		try {
//			name = "["+InetAddress.getLocalHost()+"]";
			name = "성재님:";
			dos = new DataOutputStream(socket.getOutputStream());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		
			
		try {
			while(dos!=null) {
				String str = sc.nextLine();
				
				if(Pattern.matches("[0-9]", str)) {
					str="성재형님최고요";
				}
				else if(Pattern.matches("[.*ㅊㅅㅈ.*]{1,}", str)) {
					str="최성재";
				}
				else if(Pattern.matches("[.*ㅇㄴ.*]{1,}", str)) {
					str="안녕";
				}else if(Pattern.matches("[.*ㅇㄴㅎㅅㅇ.*]{1,}", str)) {
					str="안녕하세요";
				}
			
				
				
				
				
				
				dos.writeUTF(name+str);
			}
		} catch (IOException e) {
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

class SingleReceiver extends Thread{
	DataInputStream dis;
	public SingleReceiver(Socket socket) {
		try {
			dis = new DataInputStream(socket.getInputStream());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		try {
			
//			if(Pattern.matches("[.*ㅊㅅㅈ.*]{1,}", dis)) {
//				dis="최성재";
//			}
//			if(Pattern.matches("[.*ㅇㄴ.*]{1,}", dis)) {
//				dis="안녕";
//			}
		
			
			while(dis!=null) {
				System.out.println(dis.readUTF());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class SingleServerMain {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("서버대기");
			
			Socket client = server.accept();
			System.out.println(client.getInetAddress() + "접속");
			new SingleSender(client).start();
			new SingleReceiver(client).start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}