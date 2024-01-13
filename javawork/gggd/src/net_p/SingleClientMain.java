package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
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
	
	void fileGO() throws Exception {//서버에파일전송
		Scanner sc = new Scanner(System.in);
		String fileName;
		String fi; 
		while(true) {
			
			System.out.println("보내실파일명을 입력하세요");
			fi=sc.nextLine();
			File tt= new File("fff/"+fi);
			if(tt.exists()) {
				fileName=fi;
				System.out.println("파일명확인완료:"+fileName);
				dos.writeUTF(fileName);//서버에파일명전송
//				System.out.println(tt.exists());//true 
				break;
			}else {System.out.println("그런파일없습니다. 다시입력하세요.");}
			
		}	
		   //서버에 파일전송시작
		    byte[] buf = new byte[1024];
		
			while(true) {  

				OutputStream  os = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				FileInputStream fis = new FileInputStream("fff/"+fileName);
				dos.writeUTF(fileName);
				dos.writeInt(fis.available());
			
				while(fis.available()>0) {
					int cnt = fis.read(buf);
					dos.write(buf,0,cnt);
					
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				fis.close();
				dos.close();
				os.close();
				  System.out.println("파일:"+fileName+"_전송완료");//완
				  return;//다시채팅으로
			}
	}
	
	void filere() {//서버에서파일받기
		try {
			byte [] buf = new byte[1024];

			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			FileOutputStream fos = new FileOutputStream("dst/"+dis.readUTF());
			
			int fileSize = dis.readInt();
			int readCnt = fileSize/buf.length;
			
			if(fileSize%buf.length!=0) {
				readCnt++;
			}	
			for (int i = 0; i <readCnt; i++) {
				dis.read(buf);
				fos.write(buf);
			}
			fos.close();
			dis.close();
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		try {
			
			nameGo();
			
			while(dos!=null) {
				System.out.println("채팅을입력하세요_[파일을첨부하려면 @파일첨부 입력]");
				if(sc.nextLine().equals("@파일첨부")) {
//					dos.writeUTF("@파일첨부");
					fileGO();
					
				}else {
				dos.writeUTF(sc.nextLine());}
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
			Socket socket = new Socket("192.168.1.59", 7777);
			System.out.println("클라이언트 서버 접속");
			
			
			//new SingleSender(socket).start();
			new MultiSender(socket).start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
