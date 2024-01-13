package T1215;

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

public class MultiServerMain {

	

//	ArrayList<DataOutputStream> list = new ArrayList<DataOutputStream>();
	//어레이 리스트 생성 - 제너릭 데이타아웃풋만,  이걸 맵으로 바꿔야 편함,
	HashMap list2 = new HashMap();
	
	
	public MultiServerMain() {
		//쓰레드 충돌을 차단
		Collections.synchronizedMap(list2);
		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("서버시작");
			
			while(true) {
				Socket client = server.accept(); //손님받기 대기0
				new MulReceiver(client).start();//손님받으면 멀티리시버 1회실행
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
				dos = new DataOutputStream(client.getOutputStream());//
				dis = new DataInputStream(client.getInputStream());//
				list2.put(dos, dis);
				name = "["+dos+"]";
			
				
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
					sendToAll(name+list2.get(dos));
				}
			}catch(Exception e) {
				
			} finally {
				list2.remove(dos);
				sendToAll(name+"퇴장");
				sendToAll("접속자 수:"+list2.size());//맵 겟 키
			}
		}
	}
	
	//모든 접속자에게 메세지 보내기
	void sendToAll(String msg) {
		Set ss = list2.entrySet();
		for (Object obj : ss) {
			Map.Entry me = (Map.Entry)obj;
			try {
				((DataOutputStream) me).writeUTF(msg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
//		for (DataOutputStream dd : list) {
//			try {
//				dd.writeUTF(msg);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
	
	
	
	public static void main(String[] args) {
		new MultiServerMain();
	}

}
