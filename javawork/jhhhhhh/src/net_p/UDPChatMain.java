package net_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

class UDPSender extends Thread{
	
	InetAddress addr;
	int port;
	public UDPSender(String addr, int port) {
		try {
			this.addr = InetAddress.getByName(addr);
			this.port = port;
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		try {
		while(true) {
			String msg = sc.nextLine();
			DatagramPacket data = new DatagramPacket(
					msg.getBytes(), 
					msg.getBytes().length,
					addr, 
					7777);
			
			DatagramSocket socket = new DatagramSocket();
			
			socket.send(data);
			socket.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class UDPReceiver extends Thread{
	int port;

	public UDPReceiver(int port) {
		super();
		this.port = port;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
			byte [] arr = new byte[1024];
			DatagramPacket data = new DatagramPacket(arr, arr.length);
			DatagramSocket socket = new DatagramSocket(7777);
			socket.receive(data);
			socket.close();
			
			System.out.println();
			System.out.println("["+data.getAddress()+"]"+new String(arr));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


public class UDPChatMain {

	public static void main(String[] args) {
		new UDPSender("192.168.200.255",7777).start();   //255단체채팅
		new UDPReceiver(7777).start();

	}

}
