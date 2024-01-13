package oops_p;

//클래스 정의
class aaa{
	int a = 10;
	String b ="아기상어";
	
	
	class AAA{
		
		//멤버변수
		int a = 10;
		String b = "아기상어";
		boolean c = true;
		
		//메소드
		void meth_1() {
			System.out.println("AAA meth_1() 입니다.");
		}
		
		void meth_2() {
			System.out.println("AAA meth_2() 입니다.");
		}
	
	}


	public class ClassMain {

		public static void main(String[] args) {

			AAA a1;	//인스턴스 변수 선언 ---- 2
			
			//System.out.println(a1);
			
			a1 = new AAA();	//인스턴스 생성 및 대입 ---3
			AAA a2 = new AAA();
			
			
			System.out.println(a1);
			System.out.println(a1.a); //인스턴스 멤버요소 호출 --- 4
			a1.meth_1();
			
			System.out.println(a1.a+","+a1.b+","+a1.c);
			
			System.out.println("a1 : "+a1.a+","+a1.b+","+a1.c);
			System.out.println("a2 : "+a2.a+","+a2.b+","+a2.c);
			
			
			
			
			
		
	}
	}
	}
		

	
	


