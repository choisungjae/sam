package S1200;

class ClaOduter{
	int a;
	String b;
	static String sc = "바깥sc";
	
	
	
	public ClaOuter(int a, String b) {
		System.out.println("Outer 생성자:"+a+","+b);
		this.a = a;
		this.b = b;
	}
	void meth_1() {
		System.out.println("바깥 meth_1() 실행");
	}
	static void meth_s2() {
		System.out.println("static 바깥 meth_s2() 실행");
	}
	
	//기본 이너클래스 정의
	class Inner_1{
		
		int in1a = 100;
		String in1b = "기본_b";
		static String in1sc = "기본_sc";
		
		
		
		public Inner_1(int in1a, String in1b) {
			System.out.println("기본 Inner_1 생성자");
			this.in1a = in1a;
			this.in1b = in1b;
		}
		
		void in1_meth_1() {
			System.out.println("기본 meth_1() 실행:"+a+","+b+","+sc+","+in1a+","+in1b+","+in1sc);
			meth_1();
			meth_s2();
			System.out.println("기본 meth_1() 끝-----------------------------------");
		}
		static void  in1_meth_s2() {
			
			//System.out.println("static 기본 meth_s2() 실행:"+a+","+b+","+sc+","+in1a+","+in1b+","+in1sc);
			System.out.println("static 기본 meth_s2() 실행:"+","+sc+","+","+in1sc);
			//meth_1();
			meth_s2();
			System.out.println("static 기본 meth_s2() 끝-----------------------------------");
			
			
			
		}
	}
	
	//멤버변수
	Inner_1 inn1_1 = new Inner_1(111,"아기상어");
	Inner_1 inn1_2 = new Inner_1(222,"엄마상어");
	
}

public class InnerMain {

	public static void main(String[] args) {
		ClaOuter oo1 = new ClaOuter(10,"oo1_b");           //1.기본클래스랑 연결
		System.out.println("---------------------");
		ClaOuter oo2 = new ClaOuter(20,"oo2_b");
		System.out.println("---------------------");
		System.out.println("oo1:"+oo1.a+","+oo1.b);
		System.out.println("oo1.inn1_1:"+oo1.inn1_1.in1a+","+oo1.inn1_1.in1b);
		System.out.println("oo1.inn1_2:"+oo1.inn1_2.in1a+","+oo1.inn1_2.in1b);
		oo1.meth_1();
		oo1.meth_s2();
		oo1.inn1_1.in1_meth_1();
		oo1.inn1_1.in1_meth_s2();
		oo1.inn1_2.in1_meth_1();
		oo1.inn1_2.in1_meth_s2();
		System.out.println("oo2:"+oo2.a+","+oo2.b);
		System.out.println("oo2.inn1_1:"+oo2.inn1_1.in1a+","+oo2.inn1_1.in1b);
		oo2.meth_1();
		oo2.meth_s2();
		oo2.inn1_1.in1_meth_1();
		oo2.inn1_1.in1_meth_s2();
		
		System.out.println(">>");
		
//		ClaOuter.Inner_1 oi1 = new ClaOuter.Inner_1(300,"메b");
//		ClaOuter.Inner_1 oi1 = new Inner_1(300,"메b");
		ClaOuter.Inner_1 oi1 = oo1.new Inner_1(300,"메b");   //2. 이너클래스연결 //메소드사용은 이너꺼만
		ClaOuter.Inner_1 oi2 = oo1.new Inner_1(200,"메bbb");   //2. 이너클래스연결 //메소드사용은 이너꺼만
		
		
//		ClaOuter ooo= new ClaOuter(300,"d");
		
//		ClaOuter.Inner_1 ooo= oo1.new Inner_1(300,"d");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}