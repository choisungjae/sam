package text_p;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//'89年  nov 28일 (화) 05:07:30  형태로 출력해 주세요
//주민번호 -> 생년월일, 한국나이, 만나이, 올해생일, 다가올생일, 생일파티, DDay

public class gggg {

	public static void main(String[] args) throws Exception {
		System.out.println("데이트 출력 ------------------------------------");
		Date today = new Date();
		String [][] arr = {
				{"yy年","ko"},
				{"MMM","en"},
				{"dd일","ko"},
				{"(E)","ko"},
				{"HH:mm:ss","ko"}
			};
		for (int i = 0; i < arr.length; i++) {
			Locale loc = new Locale(arr[i][1]);
			SimpleDateFormat sdf = new SimpleDateFormat(arr[i][0],loc);
			System.out.print(sdf.format(today)+" ");
		}
		
		System.out.println();
		System.out.println("주민번호 -----------------------------------");
		
		String jumin = "921216-1471211";

		String [] birth = {
			jumin.substring(0,2),
			jumin.substring(2,4),
			jumin.substring(4,6),
		};

		String [] form = {"yyyy년","MMM","dd일"};
		SimpleDateFormat df = new SimpleDateFormat("yyMMdd");
		SimpleDateFormat d = new SimpleDateFormat("yyyy년 MM월 dd일");
		Date birthD = df.parse(jumin.substring(0,6));
		
		System.out.print("생년월일 : ");
		for (String str : form) {
			SimpleDateFormat dd = new SimpleDateFormat(str);
			System.out.print(dd.format(birthD)+" ");
		}
		System.out.println();
		
		df = new SimpleDateFormat("yyyy");
		int age = Integer.parseInt(df.format(today))-Integer.parseInt(df.format(birthD));
		System.out.println("한국나이 : " + age+"세");
		
		df = new SimpleDateFormat("yyyy");
		int thisY = Integer.parseInt(df.format(today));
		birthD.setYear(thisY-1900);
		System.out.println("올해 생일 : "+d.format(birthD));
		
		
		df = new SimpleDateFormat("MMdd");
		int ageChk = Integer.parseInt(df.format(today))-Integer.parseInt(df.format(birthD));
		if(ageChk<0){
			age--;
		}else {
			birthD.setYear(thisY-1900+1);
		}
		System.out.println("만나이 : " + age+"세");
		System.out.println("다가올 생일 : " + d.format(birthD));
		
		df = new SimpleDateFormat("E");
		Date birP = new Date();
		if(df.format(birthD).equals("토")) {
			int pDay = birthD.getDate()-1;
			birP.setDate(pDay);
		}else if(df.format(birthD).equals("일")) {
			int pDay = birthD.getDate()-2;
			birP.setDate(pDay);
		}
		System.out.println("다가올 생일 파티일 : " + d.format(birP));
		
		long dDay = ((birP.getTime() - today.getTime())/1000/60/60/24)+1;
		System.out.println("생일파티 D-Day : "+dDay+"일");
		
	}

}