package text_p;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ex1206two {

	public static void main(String[] args)throws Exception {
		Date today =new Date(); 	
		String [] arr = {
		"yy年","MMM","d일","(E)","HH:","mm:","ss"};
		
		for (String pp : arr) {	
			Locale loc = new Locale("en");
			if(pp.equals("MMM")) {
				loc = new Locale("en");
			}else {loc = new Locale("ko");}
			SimpleDateFormat sss = new SimpleDateFormat(pp,loc);
			System.out.print(sss.format(today)+" ");
		}
		System.out.println();
		
		System.out.println("--------------2----------------");
		
		
		String jumin="991222-1234123";
		String res;
		int birthday=0,birthday2=0,mage=0;
		int age;

		
		 today = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		Date oday = sdf.parse(jumin.substring(0,6));
//		
//        System.out.println(sdf.format(today));
		String year = jumin.substring(0,2);
//		int yeari = Integer.parseInt(19+year);
		SimpleDateFormat yy = new SimpleDateFormat(19+year);
//		System.out.println(yy.format(birthD));
//		System.out.println(Yeari);
		String month =jumin.substring(2,4);
		SimpleDateFormat MM = new SimpleDateFormat(month);
//		int monthi = Integer.parseInt(month);
//		System.out.println(Integer.parseInt(MM.format(birthD)));
		
		String day =jumin.substring(4,6);
		SimpleDateFormat dd = new SimpleDateFormat(day);
//		int dayi = Integer.parseInt(day);
//		System.out.println(dayi);
		

		res=yy.format(oday)+"년"+Integer.parseInt(MM.format(oday))+"월"+Integer.parseInt(dd.format(oday))+"일";
		
//		sdf = new SimpleDateFormat("yyyy");
		SimpleDateFormat ag = new SimpleDateFormat("yyyy");
//		System.out.println(Integer.parseInt(ag.format(today)));
		//나이
		age =Integer.parseInt(ag.format(today))-Integer.parseInt(ag.format(oday));
	    //만나이
		SimpleDateFormat mag = new SimpleDateFormat("MM");
		SimpleDateFormat dayday = new SimpleDateFormat("dd");
//		System.out.println(Integer.parseInt(mag.format(today)));
//		System.out.println(Integer.parseInt(mag.format(oday))); 
//		System.out.println(Integer.parseInt(dayday.format(oday))); 
		int qq=Integer.parseInt(mag.format(today)),//12
			ww=	Integer.parseInt(mag.format(oday)),//4
		    ee=(Integer.parseInt(dayday.format(today))),
	        rr=(Integer.parseInt(dayday.format(oday)));
		if(ww<qq||ww==qq&&ee<rr) {
		 mage=age-1;
		}
		else if(ww>qq||ww==qq&&ee>rr) {
			mage=age-2;
		};

		SimpleDateFormat day3 = new SimpleDateFormat("MMdd");
		int my  =Integer.parseInt(day3.format(oday));//1222
		int now = Integer.parseInt(day3.format(today));//1207
		if(my>now) {
			 birthday=my;
		}
//		if(my<now) {
//			birthday2=Integer.parseInt(ag.format(today))+1+now;
//		}
		
//		SimpleDateFormat dday = new SimpleDateFormat("yyMMdd");
		
		
		System.out.println("생년월일:"+res);
		System.out.println("나이:"+age);
		System.out.println("만나이:"+mage);
		System.out.println("올해생일:"+ birthday);
		System.out.println("다음생일:"+birthday2);
		System.out.println("DD데이:");
	
	}

}

	
		
		
		
	
		



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

