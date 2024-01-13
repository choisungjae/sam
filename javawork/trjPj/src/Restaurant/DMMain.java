package Restaurant;
//같은부모인 스튜던트로묶어
//배열의원소는 다 다른자식들인데 배열은 부모로
class DMPar {

	String a = "부모a", b = "부모b";

	void meth_1() {
		System.out.println("부모 meth_1 실행");
	}

	void meth_2() {
		System.out.println("부모 meth_2 실행");
	}
}
class Uncle {

	String a = "부모a", b = "부모b";

	void meth_1() {
		System.out.println("부모 meth_1 실행");
	}

	void meth_2() {
		System.out.println("부모 meth_2 실행");
	}
}
class DMChild extends DMPar {
	String c = "자식c", b = "자식b";

	void meth_3() {
		System.out.println("자식 meth_3 실행");
	}

	void meth_2() {
		System.out.println("재정의 meth_2 실행");
}
}

public class DMMain {

	public static void main(String[] args) {
		
		DMPar pp= new DMPar();
		DMPar pc= new DMChild(); 
		//DMChild cc= new DMPar();
		DMChild cc= new DMChild();
		
		System.out.println("pp:"+pp.a+","+pp.b+"-----------------");
		
		pp.meth_1();
		pp.meth_2();
	//	pp.meth_3();
	    System.out.println("pc:"+pc.a+","+pc.b+"-----------------");
		
		pc.meth_1();//매게 변수먼저, 지역변수먼저 , 
		pc.meth_2(); //부모를 자식에 연결했는데  메소드 겹치면 자식꺼를 씀 //자식에만있으면 못씀 
		//pc.meth_3();
	    cc.c="아들씨";
		System.out.println("cc:"+cc.a+","+cc.b+","+cc.c+"-----------------");
		
		cc.meth_1();
		cc.meth_2();
		cc.meth_3();
		
		DMPar pcc =cc; //업캐스팅;   //부모의 입장에서 봄 //변수는 부모꺼 메소는겹치면 자식꺼
		
		System.out.println("pcc:"+pcc.a+","+pcc.b+"-----------------");
		
		pcc.meth_1();
		pcc.meth_2();
		//pcc.meth_3();
		
	    DMChild cpcc =(DMChild)pcc; //// 강제 형 변환  //업캐스팅!
	    System.out.println("cpcc:"+cpcc.a+","+cpcc.b+","+cpcc.c+"+-----------------");
	    cpcc.meth_1();
		cpcc.meth_2();
		cpcc.meth_3();
		
		
		System.out.println(" pp- "+pp+":"+pp.getClass());
		System.out.println(" pc- "+pc+":"+pp.getClass());
		System.out.println(" cc- "+cc+":"+pp.getClass());
		System.out.println(" pcc- "+pcc+":"+pp.getClass());
		System.out.println(" cpcc- "+cpcc+":"+pp.getClass());
		
		//DMChild cpp=(DMChild)pp;
		//Uncle uu=(Uncle)pp; 상속관계만 형변환 가능
		//본질,객체가  누구냐에 따라서  // 자기 자신까지만 내려올수 있음
		System.out.println(pp instanceof DMChild);
		System.out.println(pc instanceof DMChild);
		System.out.println(cc instanceof DMChild);
		System.out.println(pp instanceof DMPar);
		System.out.println(pc instanceof DMPar);
		System.out.println(cc instanceof DMPar);
//System.out.println(pp instanceof Uncle);//안됨, 인스턴스오브가 작동하기위해서는 상속관계만 가능
		}

}
