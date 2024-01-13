package S1213;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlMain {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://comic.naver.com/webtoon/detail?titleId=814543&no=13&week=tue");
			System.out.println(url.getAuthority());  //comic.naver.com 나옴
			System.out.println(url.getContent());   
			System.out.println(url.getDefaultPort());  //좀알아야됨 443 ,  포트번호
			System.out.println(url.getPort());  //없으면 -1
			System.out.println(url.getFile());  //파일이있니? 파일확인
			System.out.println(url.getHost());  //Authority 랑 같음 
			System.out.println(url.getPath());  // 
			System.out.println(url.getQuery());  //쿼리
			System.out.println(url.getProtocol());  //https 나옴 
			System.out.println(url.toURI());  //문자열 URL 출력 
			
			
			System.out.println("--------------------");
			InputStreamReader isr = new InputStreamReader(url.openStream());
			BufferedReader br= new BufferedReader(isr);
			
			String line="";
			while ((line=br.readLine())!=null) {
				System.out.println(line);
			}
			
			
			isr.close()	;
			br.close();
			
			
			
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
