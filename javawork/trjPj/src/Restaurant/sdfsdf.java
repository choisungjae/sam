package Restaurant;

import java.util.Arrays;
import java.util.Iterator;

public class sdfsdf {

	public static void main(String[] args) {

//"aBcd Efg 
// 123456789
//		HIJk lMn opQR" 
//	1011121314151617181920 -> Abcd Efg Hijk Lmn Opqr  로 변경해 주세요
//
// 변수.indexOf(11)                  11가 몇번째에있냐?
//		   변수.substring(11)                문자열 [11번] 부터 출력해
//		   변수.substring(11,16)             문자열 [11번] 부터 [16번]까지 출력해
//		   변수.lastIndexOf(11)              11을 뒤에서부터찾아줘   [자리수출력됨]
//		   변수.contains(11)                 문자열에 11가있냐?
//		   변수.startsWith(11)               11부터시작이냐?
//		   변수.endsWith(11)                 11로 끝나냐?
//		   String []arr= c.split(",");      배열화시켜줘
//		   c =a.replaceAll("a", "에이");      c배열에있는걸  a를 에이로 바꿔줘
//		   a.toUpperCase()                  a안에있는애들  대문자로 바꿔줘
//		   a.toLowerCase()                  a안에있는애들  소문자로 바꿔줘
//		   c.trim()                         c문자열에 앞뒤 공백을 채워줘 
//		   
//			c="zxcv";
//			d=c.repeat(5);   //d에 c를 5번 넣어줘
//		
//		a.toLowerCase();
	      
		
//		
//		System.out.println(a.toUpperCase());
//
//		
//		char[] charr= a.toCharArray();
//		for (char e : charr) {
//			
//			System.out.print(e);
//		}c =a.replaceAll("a", "에이");      c배열에있는걸  a를 에이로 바꿔줘

		String a="aBcd Efg HIJk lMn opQR";
		 a=a.toLowerCase(); 
		String tt;
		String  yy="";
		String []arr=a.split(" ");
		
		
		System.out.println(a);
		System.out.println(Arrays.toString(arr));


		    String ppp;
		    
		    for (int i = 0; i < arr.length; i++) {
			 tt=arr[i].substring(0,1);

			arr[i]=tt.toUpperCase()+arr[i].substring(1);

			ppp=arr[i]+" ";
			System.out.print(ppp);
			}	

	

	}

}
