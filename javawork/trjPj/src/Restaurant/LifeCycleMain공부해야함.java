package Restaurant;
class LifePar{
	int pa = setPA();
	int pf = setFF();
	
	int setPA() {
		System.out.println("부모 인스턴스 setPA() 실행");
		return 10;
	}
	int setFF() {
		System.out.println("부모 인스턴스 setFF() 실행");
		return 70;
	}
	
	static int psa = setPSA();
	static int psc = LifeChild.setCSC();
	static int ppp = meth_p();
	
	static int setPSA() {
		System.out.println("부모 스태틱 setPSA() 실행");
		return 1000;
	}
	
	static int meth_p() {
		System.out.println("부모 스태틱 meth_p() 실행");
		return 4000;
	}
	
	
	LifePar(String pname) {
		System.out.println("부모 생성자 : "+pname);
	}
}


class LifeChild extends LifePar{
	int cb = setCB();
	
	int setCB() {
		System.out.println("자식 인스턴스 setCB() 실행");
		return 20;
	}//부모의 이름으로 자식을 부름
	
	
	static int csb = setCSB();
	static int ccc = 3000;
	static int setCSB() {
		System.out.println("자식 스태틱 setCSB() 실행");
		return 2000;
	}
	static int setCSC() {
		System.out.println("자식 스태틱 setCSC() 실행");
		return ccc;
	}
	
	static int meth_p() { //static 오버라이딩
		System.out.println("자식 스태틱 meth_p() 실행");
		return 4567;
	}
	int setFF() {  //인스턴스 오버라이딩
		System.out.println("부모 인스턴스 setFF() 실행");
		return 987;
	}
	
	LifeChild() {
		super("아기상어");
		System.out.println("자식 생성자");
	}
}


public class LifeCycleMain공부해야함 {

	public static void main(String[] args) {
		//LifePar pp = new LifePar("엄마상어");
		System.out.println("---------------------");
		
		LifeChild cc = new LifeChild();
		
		System.out.println("---------------------");
		System.out.println("cc스태틱:"+cc.psa+","+cc.psc+","+cc.csb+","+cc.ccc+","+cc.ppp);
		System.out.println("cc인스턴스:"+cc.pa+","+cc.cb+","+cc.pf);//자식오버라이딩 됨
		cc.meth_p();
	}

}