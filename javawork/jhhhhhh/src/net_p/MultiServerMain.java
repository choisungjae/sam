package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;

public class MultiServerMain {

	HashMap<String,DataOutputStream> map = new HashMap<String,DataOutputStream>();
	public MultiServerMain() {
		//쓰레드 충돌을 차단
		Collections.synchronizedMap(map);
		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("서버시작");
			
			while(true) {
				Socket client = server.accept();
				new MulReceiver(client).start();
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	class MulReceiver extends Thread{
		String name;
		DataOutputStream dos;
		DataInputStream dis;
		
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
					if(msg.startsWith("_")) {
						sendToOne(name,msg);
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
	
	
	
	
	void sendToOne(String sender, String msg) {
		try {
			String [] arr = msg.split("_");
			if(arr.length!=3) {
				map.get(sender).writeUTF("입력방식에러");
				return;
			}
			String you = arr[1];
			if(!map.containsKey(you)) {
				map.get(sender).writeUTF("대화상대가 없습니다.");
				return;
			}
			DataOutputStream dd = map.get(you);

			dd.writeUTF("["+sender+"]=>["+you+"]"+arr[2]);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//모든 접속자에게 메세지 보내기
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
