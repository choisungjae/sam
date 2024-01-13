package S1200;


//이놈 정의
//이놈 [이름
enum AAA{
	aa,bb,cc,dd //열거 상수
	}
//BBB[]bbb = {JUNG,KIM,YUN,PARK}
enum bbb{
	
	JUNG("정운만",29,"여"),KIM("김명주",27,"남"),YUN("윤용준",27,"남"),PARK("박건우",33,"남");         //열거상수 변경 불가 , 멤버요소가 있을경우 ; 필수 
	
	//각 열거 데이터의 멤버요소;
	String name;
	int age;
	final String gender ;
	
	
	bbb(String name, int age,String gender) {
		this.name = name;
		this.age = age;
		this.gender=gender;
	}
	
	void meth() {
		System.out.println(name+"meth 실행()");
	}
	
	public String toString() {
		
		return name+","+age+","+gender;
	}
	
	
	
	
}

public class EnumMain {

	public static void main(String[] args) {
		
//		System.out.println(AAA);
		System.out.println(AAA.aa); //static 처럼 호출
		System.out.println(AAA.bb);
		System.out.println(AAA.cc);
		System.out.println(AAA.dd);
		
		AAA a1;// 이놈 변수 선언
//		AAA a2= new AAA();  동작 할당 하지않는다  // 클래스개념이 아니다//
		
//		System.out.println(a1);
	    a1 =AAA.aa;
	    
	    
//	    System.out.println(a1);             
//	    System.out.println(a1.name());       //이름이 머냐?
//	    System.out.println(a1.ordinal());  //몇번째냐?
	    
	    
	    a1=AAA.valueOf("bb");          //문자열로 열거값 호출
	    System.out.println(a1);
	    System.out.println("---------------------------------");
	    
	    
	    AAA []arr=AAA.values();  //AAA에 값들을 arr 에 담아  
	    for (AAA a : arr) {
			System.out.println(a);
		}
	    System.out.println("---------------------------------");
	    
	   
	    
//	    //compareTo 열거값의 위치비교
//	    System.out.println(AAA.bb.compareTo(AAA.aa));  // AAA.bb(자리수)-AAA.aa(자리수)
//	    System.out.println(AAA.bb.compareTo(AAA.bb));  // AAA.bb(자리수)-AAA.bb(자리수)
//	    System.out.println(AAA.bb.compareTo(AAA.cc));  // AAA.bb(자리수)-AAA.cc(자리수)
//	    System.out.println(AAA.bb.compareTo(AAA.dd));  // AAA.bb(자리수)-AAA.dd(자리수)
	    
	    
	    
	    System.out.println("bbb>>>>>");
	    System.out.println(bbb.JUNG);
	    System.out.println(bbb.KIM);
	    System.out.println(bbb.YUN);
	    System.out.println(bbb.PARK);
	    
//	    System.out.println("bbb.JUNG:"+bbb.JUNG.name+",");
	    bbb.JUNG.name = "정대세";
		bbb.JUNG.age = 37;
		//BBB.JUNG.gender = "남"; final
		System.out.println("BBB.JUNG : "+bbb.JUNG.name+","+bbb.JUNG.age+","+bbb.JUNG.gender);
		bbb.JUNG.meth();
		System.out.println(bbb.JUNG.name());
		System.out.println(bbb.JUNG.ordinal());//순서

		bbb b1 = bbb.valueOf("KIM");	//문자열로 열거값 호출
		System.out.println(b1+"aaaaaaaaaaaaaaaaa");
		System.out.println("-----------------");
		bbb [] bArr = bbb.values();
		for (bbb b: bArr) {
			System.out.println(b);
		}
		System.out.println("-----------------");
	    
	    
		
		
		
	}

}
