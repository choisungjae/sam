package T1215exam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sjmultiser {

//	Map<String, DataOutputStream> list = new HashMap<>();
	Map list2 = new HashMap();

	
	
	public Sjmultiser() {
		
		Collections.synchronizedMap(list2);
		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("서버시작----------");
			
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
		
		public MulReceiver(Socket client) { //
			try {	
				
				name = "[" + client.getInetAddress() + "]";
				if(list2.containsKey(name)) {
				dos = new DataOutputStream(client.getOutputStream());//
				dis = new DataInputStream(client.getInputStream());//
				list2.put(name, dos);
				}
				else {
					sendTo(name,"님 중복");
//					return;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
				
	
		
		@Override
		public void run() {
			try {
				
				sendToAll(name+"입장");
			
				sendToAll("접속자 수:"+list2.size());
				while(dis!=null) {
					DataInputStream tt=dis;
//					if(tt.contins("*")) {
					
//					sendTo(name,dis.readUTF());}
//					else {
					sendToAll(name+dis.readUTF());
//				}
				}
			}catch(Exception e) {
				
			} finally {
				list2.remove(name);
				sendToAll(name+"퇴장");
				sendToAll("접속자 수:"+list2.size());
			}
		}
	}
	//중복,귓
	void sendTo(String name, String msg) {
		
		try {
			((DataOutputStream) list2.get(name)).writeUTF(msg);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
	}
	
	
	
	
	//모든 접속자에게 메세지 보내기
	void sendToAll(String msg) {
		Set ss = list2.entrySet();
		for (Object obj : ss) {
			Map.Entry me = (Map.Entry)obj;
			try {
				((DataOutputStream) me.getKey()).writeUTF(msg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
//		for (DataOutputStream dd : list2.get(name)) {
//			try {
//				dd.writeUTF(msg);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

	    }
public static void main(String[] args) {
		new Sjmultiser();
	}

}
