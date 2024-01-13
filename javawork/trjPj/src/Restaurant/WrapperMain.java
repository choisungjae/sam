package Restaurant;

public class WrapperMain {

	public static void main(String[] args) {
		int i =new Integer(123);    //다음 i 에 new+ 문자열가능 
        System.out.println(i);
		
		Integer i2=456;    //인터 쓰면 null 대입가능 , 
		System.out.println(i2);
		
		//i= null;
		i2= null;
		
		System.out.println(i2);
	
		
		i=new Integer("789");   
		System.out.println(i);
		
		
		i = Integer.parseInt("1234");       //i= Integer.parseInt("1234") <"안에숫자만가능
		//i = Integer.parseInt("백심삼오");
		System.out.println(i);
		
		
		byte bb = Byte.parseByte("120");
		System.out.println(bb);
		
		short sh= Short.parseShort("246");
		System.out.println(sh);
		
		long lo=Long.parseLong("123123");
		System.out.println(lo);
		
		float ff= Float.parseFloat("123.456");
		System.out.println(ff);
		
		double dd =Double.parseDouble("987.654");
		System.out.println(dd);
		
		boolean bo =Boolean.parseBoolean("trug");
		System.out.println(bo);
		
		i= Integer.parseInt("11",16);
		System.out.println(i);
		i= Integer.parseInt("11",8);
		System.out.println(i);
		i= Integer.parseInt("11",2);
		System.out.println(i);
		i= Integer.parseInt("11",5);
		System.out.println(i);
		
		System.out.println(Integer.toBinaryString(11));//11을 2진수로
		System.out.println(Integer.toOctalString(11));//11을 8진수로
		System.out.println(Integer.toHexString(11));//11을 16진수로
		System.out.println(Integer.toString(11));//11을 10진수로
		System.out.println(Integer.toString(11,5));//11을 5진수로
		
		
		//사진파일을 확인하세요 // 영업_홍길동_20110823.jpg
		//부서명,이름출력,입사일
//		
//		String fName = "영업_홍길동_20110823.jpg";
//		
////		System.out.println(fName.substring(0,fName.lastIndexOf("."))); //뒤에 확장자명 짜르고
//		
//		String [] arr = fName.substring(0,fName.lastIndexOf(".")).split("_");//_ 기준으로 배열화시킴> arr에넣음
////		for (String str : arr) {
////			System.out.println(str);
////		}
//		System.out.println("부서명:"+arr[0]);
//		System.out.println("부서명:"+arr[1]);
//		
//		int year=Integer.arr[2].substring(0,4);
//		int year=Integer.arr[2].substring(0,4);
		
        String fName = "영업_홍길동_20110823.jpg";
		
		//System.out.println(fName.substring(0,fName.lastIndexOf(".")));
		String [] arr = fName.substring(0,fName.lastIndexOf(".")).split("_");
		/*for (String str : arr) {
			System.out.println(str);
		}*/
		System.out.println("부서명:"+arr[0]);
		System.out.println("이름:"+arr[1]);
		int year = Integer.parseInt(arr[2].substring(0,4));
		int month = Integer.parseInt(arr[2].substring(4,6));
		int date = Integer.parseInt(arr[2].substring(6));
		System.out.println("연도:"+year);
		System.out.println("월:"+month);
		System.out.println("일:"+date);
		//사진 파일을 확인하세요 ex) 영업_홍길동_20110823.jpg
				//이미지파일만 가능토록 - jpg,bmp,gif (대소문자 구분안함)
				//파일명이 부서명, 회원 이름, 입사일이 될 것
				//부서명은 영업, 총무, 인사, 기획, 생산 만 가능함
				//입사년도는 숫자만 입력토록 함(8자리만 가능)
				//호봉수를 계산할 것 (년도단위에서 절삭)
				//성명은 2-4자만 기록 가능 
		
		String name ="영업_홍길동_20110823.jpg";
		System.out.println(name.substring(0,fName.lastIndexOf(".")));
		
	
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
