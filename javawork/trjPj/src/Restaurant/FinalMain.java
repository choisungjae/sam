package Restaurant;


//final 클래스 - 상속불가
final class FinalAAA{
	int a = 10;
	
	void meth_1() {
		System.out.println("FinalAAA.meth_1() 실행");
	}
}
//final static int sb; final static 멤버 변수는 선언시 초기화 필수
/*
class FinalBBB extends FinalAAA{
	
}*/


abstract class FinalPar{
	final int a = 10;  
	final int b; //파이날 메소드 재정의 불가;
	//final int c;  초기화 하지 않은 멤버변수 final 불가
	FinalPar() { 
		b = 20; //생성시 초기화   //초기화과정은 한번만 [파이날경우만 ]
	}
	int d = 40;
	
	void meth_1() {
		
		System.out.println("FinalPar.meth_1() 실행");
	}
	
	final void meth_2() {
		System.out.println("FinalPar.meth_2() 실행");
	}
	final static void meth_4() {
		System.out.println("FinalPar.meth_2() 실행");
	}
	
	abstract void meth_3();
	
	//final abstract void meth_4();  abstract final 불가
}


public class FinalMain {

	public static void main(String[] args) {
		FinalAAA aa = new FinalAAA();
		aa.a = 20;
		aa.meth_1();
		//new FinalAAA() {};  final클래스 - 생성시 재정의 불가
		
		FinalPar pp = new FinalPar() {
			void meth_3() {
				System.out.println("생성시 재정의 meth_3() 실행");
			}
		};
//		pp.a = 11;  final 변수 대입불가
//		pp.b = 22;
		pp.d = 44;
		System.out.println("pp:"+pp.a+","+pp.b+","+pp.d);
		int e = 55;
		final int f = 66;
		e = 5050;
		//f = 6060; final 변수 대입불가
		System.out.println(e+","+f);
		pp.meth_1();
		pp.meth_2();
		pp.meth_3();// 파이날 메소드는 재정의 불가

	}

}