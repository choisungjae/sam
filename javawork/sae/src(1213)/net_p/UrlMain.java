package net_p;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlMain {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://comic.naver.com/webtoon/detail?titleId=814543&no=8&week=fri");
			System.out.println(url.getAuthority());
			System.out.println(url.getContent());
			System.out.println(url.getDefaultPort());
			System.out.println(url.getPort());
			System.out.println(url.getFile());
			System.out.println(url.getHost());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
			System.out.println(url.getProtocol());
			System.out.println(url.toURI());
			
			System.out.println("-------------------");
			
			InputStreamReader isr = new InputStreamReader(url.openStream());
			BufferedReader br = new BufferedReader(isr);
			
			String line = "";
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			
			br.close();
			isr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			/*
network 용어 조사
1. network
2. 인터넷
3. 프로토콜
4. IP , Port,  TCP , UDP, MAC address
5. 방화벽
6. LAN/MAN/WAN
7. OSI 7 계층
8. ip공유기, NAT , 지역네트워크
9. 게이트웨이, 라우터
10. 유니캐스트, 브로드캐스트,멀티캐스트
			 * */
		}

	}

}
