package text_p;

import java.text.DecimalFormat;
import java.util.Iterator;


public class DecimalFormatMain {

	public static void main(String[] args) throws Exception {
		DecimalFormat df = new DecimalFormat();    
		
		double dd = (double)df.parse("12,345.678");  //parse. 문자열안에 콤마 사라짐
		
//		System.out.println(dd);
		String str =df.format(9876.54);      //format , 생성함
//		System.out.println(str);
		
		df = new DecimalFormat("#,##0");    //이거해줘서 
		
		dd= (double)df.parse("12,345.678");
//		System.out.println(dd);
		
		str=df.format(9876.54);   //.뒤로 삭제 
//		System.out.println(str);
		
		double [] ddArr= {
			123456,-123456,
			123.45678,-123.45678,
			.9876,-.9876,
			.4321,-.4321,0
		};
	
		//"0" 은 반올림 인듯
		//# 은 빈칸 채워주는 개념   
		// 항상 # 다음 0 와야함     -0다음 샾오면 에러 
		String [] ppArr= {
				"0","#","0000000","#######","####0000",
				".##",//  << . 샾갯수만큼 몇번째자리까지 표현  + 반올림
				".00", //   << . 0갯수만큼  표현  없으면 0 채움 
				"#.##",
				"0.00",
				"#,##0.00",  // < 많이쓰는 표현 
				"#,##",      //2번째짜리마다 ,
				"#?##",      // ,자리에 다른거가능 마지막에 붙음 
				"#,##0원",
				"-#,##0",     // - 는 표기임  마이너스가 아니다
				
				"#,##0.00%",   //  % 는 곱하기 100됨  백분율
				
				"양수#,##0.00;음수00000000",
				// 양수일때;음수일때--> 숫자패턴은 음수는 무시하고 양수의 것으로 처리 
				//               숫자패턴 앞의 내용이 양수 음수에 맞게 표시 
			   
				
				
		};
		for (String pp : ppArr) {
			System.out.println(pp+">>>>");
			df =new DecimalFormat(pp);
			
			for (double d : ddArr) {
				System.out.println("   "+ d+": "+df.format(d));
			}
		}
		
//		
//		int [] jum = {67,78,89,98,76,54,78,77,90,56};
//		String [] Go = {
////				"▲0;00▼"
//				"0","#","0000000","#######","####0000",
//				".##",//  << . 샾갯수만큼 몇번째자리까지 표현  + 반올림
//				".00", //   << . 0갯수만큼  표현  없으면 0 채움 
//				"#.##",
//				"0.00",
//				"#,##0.00",  // < 많이쓰는 표현 
//				"#,##",      //2번째짜리마다 ,
//				"#?##",      // ,자리에 다른거가능 마지막에 붙음 
//				"#,##0원",
//				"-#,##0",     // - 는 표기임  마이너스가 아니다
//				
//				"#,##0.00%",   //  % 는 곱하기 100됨  백분율
//				
//				"▲#,##0;▼00000000",
//				
//		};
		// 0 과 #을 이용해서 기준 70을ㄹ 어떻게 잡을거냐
//		for (String ggg : Go) {
//			
//			df=new DecimalFormat(ggg);
//			
//			for (double g : jum) {
//				System.out.println(" "+ g+": "+df.format(g));
//			}
//			
//			
//		}
		
int [] jum2 = {67,78,89,98,76,54,78,77,90,56};
		
		df = new DecimalFormat("▲0;▼");
		
		for (int i : jum2) {
			int jj = i-70;
			System.out.println(i+":"+df.format(jj).charAt(0)+i);
		}

	}

	////점수가 70점 이상이면 ▲, 미만이면 ▼ 로 표시해 주세요
		

	///if, switch, 3항연산자등 조건문 사용하지 말것
		
		
		
		
	

}
