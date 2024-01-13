package text_p;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class dddd1206 {

	public static void main(String[] args) throws Exception {
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		
		System.out.println(sdf.format(today));
		
		String [] ppArr = {
				"y","yy","yyyy",
				"M","MM","MMM","MMMM",
				"d","dd","D","DD","DDD",
				"w","ww","W","WW",
				"E","EE","EEE","EEEE",
				"F","z","Z",
				
				"a","H","HH","h","hh",
				"m","mm",
				"s","ss","S","SSS"
				
		};
		
		//y년도,m월,d데이,w는 올해들어몇번째주,W 이번달의몇번째주,H는시간,
		//E는 요일//F 달에 몇번째 금요일이냐,
		//z 타임존ex한국,
		//a는 pm,h시간 12시씩,
		//m 분, s 초 , S 1000분의1초 ,
		Locale loc = new Locale("en");
		loc = new Locale("ko");
		for (String pp : ppArr) {
			sdf = new SimpleDateFormat(pp,loc);
			System.out.println(pp + " : "+sdf.format(today));
		}
		
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birth = sdf.parse("1997-03-20");  //입력
		System.out.println();
		
		
		System.out.println(birth+"-----------------");
		birth = sdf.parse("1997-23-96");
		System.out.println(birth);
		birth = sdf.parse("1997-3-9");
		System.out.println(birth);
		birth = sdf.parse("1997-3-1239");
		System.out.println(birth);
//		birth = sdf.parse("1997-0312");
		System.out.println(birth); //월에 -1 안함
		/// '89年  nov 28일 (화) 05:07:30  형태로 출력해 주세요
	///주민번호 -> 생년월일, 한국나이, 만나이, 올해생일, 다가올생일, 생일파티, DDay
		
		
		
	}

}