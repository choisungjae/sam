package net_p;

import java.net.InetAddress;

public class NetInfoMain {

	public static void main(String[] args) {

		try {
			InetAddress ip = InetAddress.getByName("www.naver.com");
			System.out.println(ip);
			System.out.println(ip.getHostName());
			System.out.println(ip.getHostAddress());
			
			System.out.println("----------------------");
			InetAddress [] arr = InetAddress.getAllByName("www.naver.com");
			for (InetAddress ia : arr) {
				System.out.println(ia);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
