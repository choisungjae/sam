package text_p;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatMain {

	public static void main(String[] args) {
		
		Date today =new Date();   //오늘 날짜 받아오기
		
		System.out.println(today);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		
		System.out.println(sdf.format(today));
		
		String []ppArr = { 
				"y","yy","yyyy",
				"M","MM","MMM",
				"dd","d","ddd",
				"HH","H",
				"F",
				
		};
		
		
		Locale loc = new Locale("en");
		loc = new Locale("ko");
		for (String pp : ppArr) {
			sdf = new SimpleDateFormat(pp,loc);
			System.out.println(pp + " : "+sdf.format(today));
		}
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birth = sdf.parse("1997-03-20");
		System.out.println(birth);
		birth = sdf.parse("1997-23-96");
		System.out.println(birth);
		

	}

}
