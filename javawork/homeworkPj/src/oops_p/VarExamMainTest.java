package oops_p;

import java.util.Arrays;

class VarStudTest{


	String kind,name;
	int [] jum;
	int tot,area,border,aa;
	double avg;

	
	
	void init( int ...jum) {
		this.jum = jum;
		kind = new String[] {"원","직사각","직삼각"}[jum.length-1];
	
		switch (jum.length) {
		case 1 : 
			
		break;
		case 2 : 
			this.area = jum[0]*jum[1];
			this.border = (jum[0]+jum[1])*2;
			break;
		case 3 : 
			this.aa = jum[0]*jum[1]/2;
			
			break;
		}
		
		
	}
	
	
	
	
	
}


public class VarExamMainTest {

	public static void main(String[] args) {

		VarStudTest arr = new VarStudTest();
		
		
		
//		arr.init(13);
		arr.init(10,20);
		arr.init(10,20,33);

		System.out.println(arr.jum);
		System.out.println(Arrays.toString(arr.jum));
		

		
	}
	
	
	
	//도형 클래스를 완성하세요
		// 멤버변수 : 도형 이름, 넓이, 둘레
		/// 사각형메소드, 원메소드, 직각삼각형메소드, 
		///  출력메소드 - 도형 이름, 넓이, 둘레
}
