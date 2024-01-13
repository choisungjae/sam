package homeworkPj;

class ClaParam {

	int bb = 222; // 멤버변수 :메소드의 공유
	String cc = "정우성";

	void meth_1(String a, int b) { // 멤버변수는 끌어다가 사용가능
		int c = 30;
		System.out.println("math_1:" + a + "," + b + "," + c + "," + bb + "," + cc);
		bb += 10;
	}

	void meth_2(String d) {
		// System.out.println(a+","+b); //다른메소드의 매개,지역변수 접근불가
		// int d=456; //매개변수와 지역변수 중첩불가; 멤버변수는 끌어다가 사용가능

		System.out.println(d + "," + bb); // 멤버변수 변수값바꾼거 그대로 내려와서 사용;
		bb += 200;
	}

	void meth_3(int aa, String bb) { // 멤버변수는 끌어다가 사용가능
		//멤버변수,매개변수 중첩가능    -자료형을 맞추지않아도됨
		//멤버변수,지역변수 중첩가능    -자료형을 맞추지않아도됨
		boolean cc=true;              //*this 쓰면 여기클래스꺼 변수사용*  멤버요소 접근자,클래스 정의부에서만 사용가능  
		System.out.println("math_3:"+aa + "," + bb+","+cc+","+this.bb+","+this.cc);
	}

}//math_3:9988,엄마상어,true,432,정우성
//math_3:9988,엄마상어,true,엄마상어,정우성

public class ParamMain {

	public static void main(String[] args) {
		int aa = 123;
		ClaParam cp = new ClaParam(); // cp.~~ ~~는 변수명으로 위에 클래스 꺼 끌어다가 사용가능.
		cp.meth_1("아기상어", 10);
		cp.meth_2("엄마상어");

		System.out.println(cp.bb); // 위에 클래스꺼 사용
		
		cp.meth_3(9988,"엄마상어");

	}

}
