package Restaurant;

class Grand{
	
String g1="할아버자", g2="할아버자2";
void meth_g1() {
	System.out.println("할아버자 meth_1() 실행");
}
void meth_g2() {
	System.out.println("할아버자 meth_2() 실행");
}

}
class OvPar extends Grand{
	String a = "부모a";
	String b = "부모b";
	String g2="부모g2";
	void meth_1() {
		System.out.println("부모 meth_1() 실행");
	}
	void meth_2() {
		System.out.println("부모 meth_2() 실행");
	}
	void meth_g2() {
		System.out.println("부모재정의 meth_g2() 실행");
	}
}
// 오버라이딩 윗윗 세대랑 단절- - -
class OvChild extends OvPar{
	String c = "자식c";
	String b="자식b";//hiding - 상속관계에서 부모클래스의 멤버변수와 같은이름으로 멤버변수를 정의
	
	void meth_2() {// 부모꺼랑 메소드같음  // 오버라이딩 // 자식꺼를 가져다씀
		System.out.println("자식 meth_2() 실행");
	}
	void meth_3() {
		System.out.println("자식 meth_3() 실행"+a+","+b+","+c);
		System.out.println("자식 meth_3() 실행"+super.a+","+super.b+","+c);// super 쓰면 부모꺼 가져옴 메소드에도 사용가능
		meth_1();
		meth_2();
		System.out.println("자식 meth_3() 끝");
	}
}
public class OverridingMain {

	public static void main(String[] args) {
		OvPar pp = new OvPar();
		OvChild cc =new OvChild();
		System.out.println("pp:"+pp.a+","+pp.b);
		pp.meth_1();
		pp.meth_2();
		
		System.out.println("cc:"+cc.a+","+cc.b+","+cc.c);//자식꺼를 가져옴 //오버라이딩
		cc.meth_1();
		cc.meth_2();
		cc.meth_3();
		System.out.println(cc.g1+","+cc.g2);
		cc.meth_g1();
		cc.meth_g2();
	}

}

