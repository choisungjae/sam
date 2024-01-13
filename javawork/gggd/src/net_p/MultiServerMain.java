package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;

public class MultiServerMain {

	HashMap<String,DataOutputStream> map = new HashMap<String,DataOutputStream>();
	public MultiServerMain() {
		
		Collections.synchronizedMap(map);
		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("서버시작-");
			
			while(true) {
				Socket client = server.accept();
				new MulReceiver(client).start();
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//서버에서 유저에게 파일받기-완 -> 다른유저들에게 보낼때 소켓이닫혀서 막힘
	
	class MulReceiver extends Thread{
		String name;
		DataOutputStream dos;
		DataInputStream dis;
		Socket client;
		String fileName;
		public MulReceiver(Socket client) {
			try {
				//name = "["+client.getInetAddress()+"]";
				dos = new DataOutputStream(client.getOutputStream());
				dis = new DataInputStream(client.getInputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			try {
				nameGo();
				
				while(dis!=null) {
					String msg = dis.readUTF();
					System.out.println(msg);
					if(msg.equals("@파일첨부")){
						fiLeReceive();
						
					}else {
						sendToAll("["+name+"]"+msg);
					}
					
				}
			}catch(Exception e) {
				
			} finally {
				map.remove(name);
				sendToAll(name+"퇴장");
				sendToAll("접속자 수:"+map.size());
			}
		}
		
		public void fiLeReceive() {//유저파일받
			try {
				
				fileName =dis.readUTF();
				System.out.println("유저에게받은파일명:"+fileName);
				
				byte [] buf = new byte[1024];
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
				
				System.out.println("서버측에서파일:"+fileName+"_수신완료");//여까지 완
				 
				fiLeGo(); //파일송출실행
				 
				 
				//socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
		
		
		public void fiLeGo() throws IOException {//받은 파일 모든 유저에게전송
			System.out.println("모든유저에게파일전송시작");
			byte[] buf = new byte[1024];
			
//			System.out.println("------");
			while(true) {  

				FileInputStream fis = new FileInputStream("dst/"+fileName);
				for (DataOutputStream dd : map.values()) {
//					dd.writeUTF(fileName);//유저에게 파일이름전송
					fis = new FileInputStream("dst/"+fileName);
					

					while(fis.available()>0) {   //@여기부터 소켓이닫히면서진입을못합니다...@ 
				
					 int cnt = fis.read(buf);
//					 System.out.println(fis.available());//41332
//					 System.out.println(cnt+"ggggg");
					dd.write(buf,0,cnt);
					System.out.println("@@@@@@@@@@@@");  
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}//와끝
			}//포끝
			  
				fis.close();
				dos.close();
				  System.out.println("서버파일송신완료");//미완
				  return;
}
		}
			
		
		void nameGo() throws Exception {
			
			while(true) {
				String nn = dis.readUTF();
				
				if(map.containsKey(nn)) {
					dos.writeBoolean(false);
					continue;
				}
				dos.writeBoolean(true);
				name = nn;
				break;
			}
			
			sendToAll(name+"입장");
			map.put(name,dos);
			sendToAll("접속자 수:"+map.size());
		}
	}
	
	
	void sendToAll(String msg) {
		for (DataOutputStream dd : map.values()) {
			try {
				dd.writeUTF(msg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		new MultiServerMain();
	}

}