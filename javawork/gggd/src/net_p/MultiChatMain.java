package net_p;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;



public class MultiChatMain {
	String addr = "230.0.0.1";
	int port = 7777;
	public MultiChatMain() {
		new MultiChatSender().start();
		new MultiReceiver().start();
	}
	
	class MultiChatSender extends Thread{
	
		@Override
		public void run() {
			MulticastSocket ms = null;
			Scanner sc = new Scanner(System.in);
			try {
				ms = new MulticastSocket();
				
				while(true) {
					String msg = sc.nextLine();
					InetAddress ia = InetAddress.getByName(addr);
					DatagramPacket data = new DatagramPacket(
							msg.getBytes(),
							msg.getBytes().length, 
							ia, 
							port);
					
					ms.send(data);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				ms.close();
			}
		}
	}

	class MultiReceiver extends Thread{
	
		
		@Override
		public void run() {
			MulticastSocket ms = null;
			InetAddress ia = null;
			try {
				ms = new MulticastSocket(port);
				ia = InetAddress.getByName(addr);
				ms.joinGroup(ia);
				
				while(true) {
					byte [] arr = new byte[1024];
					DatagramPacket data = new DatagramPacket(arr, arr.length);
					ms.receive(data);
					
					System.out.println(data.getAddress() +" : "+ new String(arr));
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					ms.leaveGroup(ia);
					ms.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}

	public static void main(String[] args) {
		new MultiChatMain();
		
	}
	/*

	다중채팅과 파일전송을 구현하세요

	 */

}
