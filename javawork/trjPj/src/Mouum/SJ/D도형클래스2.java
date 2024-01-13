package zam;

class Do{
	
	String name;
	int area,dul;//넓,둘
	int pi=3;
	int[] jum;


	void vo1(String name,int ...jum) {
		 this.name =name;
		 this.jum=jum;
		 
				if(jum.length==1) {
				 one(jum[0]);
				}else if(jum.length==2) {
					two(jum[0],jum[1]);
				}else if(jum.length==3) {
					three(jum[0],jum[1],jum[2]);
				}
			}
		 

	void one(int ban) {
		dul=2*ban*pi;
		area=ban*ban*pi;
	}
	void two(int ga,int se) {
		dul=2*(ga+se);
		area=ga*se;
	}
	void three(int ga,int se,int bit) {
	    dul=ga+se+bit;
	    area=(ga*se)/2;
	}
	void go() {
		System.out.println(name+"\t"+dul+"\t"+area);
	}
}
class fo{
	
	Do domake(String name,int...jum) {
		Do st = new Do();
		st.vo1(name,jum );
		return st;
	}
}
public class D도형클래스2 {

	public static void main(String[] args) {
		
		fo jjo= new fo();
		
		Do[] jum= {
		jjo.domake("원",21),
		jjo.domake("사각형", 43,44),
		jjo.domake("삼각형", 44,33,55)
		};
		
		for (Do st : jum) {
			st.go();
		}

	}

}
//메뉴 :
//햄버거:불고기버거,치즈버거,새우버거
//음료:콜라,사이다
//사이드:감자튀김,치즈스틱
//
//정보:가격 칼로리
//
//order(불고기버거,감자튀김,콜라)
//order(불고기버거,감자튀김,사이다)
//order(새우버거,감자튀김,콜라)
//order(새우버거,치즈스틱,콜라)
//order(치즈버거,감자튀김,사이다)


	
	
	
	
	
	