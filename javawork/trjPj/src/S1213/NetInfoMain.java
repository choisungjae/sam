package S1213;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetInfoMain {

	public static void main(String[] args) {
		try {
			InetAddress ip =InetAddress.getByName("www.naver.com");
			
			System.out.println(ip);    
			System.out.println(ip.getHostName());   //www.naver.com  나옴 주소 
			System.out.println(ip.getHostAddress()); // 아이피 나옴 ;
//			System.out.println(ip.getHostName());
			
			InetAddress[] arr =InetAddress.getAllByName("www.naver.com");   //모든 주소 겟 ! 
			
			for (InetAddress ia : arr) {
				System.out.println(ia);
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
