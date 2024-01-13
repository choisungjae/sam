package Restaurant;

class ConPar{
	String name;
	int age;
	boolean marriage;
	ConPar(){
//		name = "정우성";
//		age = 51;
//		marriage = false;
		//ConPar("정우성",51,false);
		this("정우성",51,false); //클래스의 다른 생성자를 호출하여 위임한다.
		System.out.println("부모 기본 생성자:"+mems()+"2");
	}
	
	
	
	ConPar(String name) {
		this.name = name;
		System.out.println("부모 생성자1:"+mems());
	}
	
	



	ConPar(String name, int age, boolean marriage) {
		this.name = name;
		this.age = age;
		this.marriage = marriage;
		System.out.println("부모 생성자2:"+mems()+"1");
	}



	String mems() {
		return name+","+age+","+marriage;
	}
}

public class ConstMain {

	public static void main(String[] args) {
		ConPar pp1 = new ConPar();
		System.out.println("------------------");
		new ConPar("정좌성");
		System.out.println("------------------");
		new ConPar("정남성", 41, true);
		System.out.println("------------------");
	}

}
