////d에 c를 5번 넣어줘
//		
//		
//		//껴넣기
////		arr= new String[] {"차은우","자전거은우","오토바이은우","유으운"};
////	    c=String.join("<==>", arr);   //배열의 원소 사이에 (1,배열)  1을 투입
////		차은우<==>자전거은우<==>오토바이은우<==>유으운
////		
//		//배열화
//		c= "아메리카노,아시아노,유럽노-아프리카노,오세아니아노,카노";
//		String []arr= c.split(",");              c에있는애들을 ,기준으로 배열화 시켜줘 
//		for (String tt : arr) {
//			System.out.println(tt);
//		}
//		
//		//한글자씩표현
//package Mouum;
//
//*      변수.indexOf(11)                  11가 몇번째에있냐?
//	   변수.substring(11)                문자열 [11번] 부터 출력해
//	   변수.substring(11,16)             문자열 [11번] 부터 [16번]까지 출력해
//	   변수.lastIndexOf(11)              11을 뒤에서부터찾아줘   [자리수출력됨]
//	   변수.contains(11)                 문자열에 11가있냐?
//	   변수.startsWith(11)               11부터시작이냐?
//	   변수.endsWith(11)                 11로 끝나냐?
//	   String []arr= c.split(",");      배열화시켜줘
//	   c =a.replaceAll("a", "에이");      c배열에있는걸  a를 에이로 바꿔줘
//	   a.toUpperCase()                  a안에있는애들  대문자로 바꿔줘
//	   a.toLowerCase()                  a안에있는애들  소문자로 바꿔줘
//	   c.trim()                         c문자열에 앞뒤 공백을 채워줘 
//	   
//	   jum = Integer.parseInt("11");     >  11숫자문자열을 숫자로 변환 
//		c="zxcv";
//		d=c.repeat(5);   
//		c= "여긴 참123숲 %^&수";                    c 에있는애들을 한글자씩표현해줘
//		
//		char[] charr= c.toCharArray();
//		for (char e : charr) {
//			System.out.println(e);
//		}
//
//
//		
//		
//		
//		
//		
//		
//		String data = "aBcd Efg HIJk lMn opQR".toLowerCase();
//	      String [] convert = data.split(" ");
//	      String convertData="";
//	      String firstCon;
//	      for (int i = 0; i < convert.length; i++) {
//	         convert[i] = convert[i].trim();
//	         firstCon = convert[i].substring(0, 1);
//	         convert[i] = firstCon.toUpperCase()+convert[i].substring(1);
//	         convertData += convert[i]+" ";
//	      }
//	      convertData = convertData.trim();
//	      System.out.println(convertData);
//	      
//
//		