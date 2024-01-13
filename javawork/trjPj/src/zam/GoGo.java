package zam;



class GoGoone {

	String  name,kind;
	int[] giri;
	int area, dul;
	int pi=3;

//	GoGoone(){
//		
//	}
	GoGoone(String name, int ban) {
		this.name=name;
		kind = "원";
		dul=2*ban*pi;
		area=ban*ban*pi;
		pp();
	}

	GoGoone(String name, int ga, int se) {
		kind = "직사각형";
		this.name=name;
		dul=2*(ga+se);
		area=ga*se;
		pp();
	}
    GoGoone(String name,int ga,int se,int bit){
		kind = "직삼각형";
		this.name=name;
		giri=new int[] {ga,se,bit};
	    dul=ga+se+bit;
	    area=(ga*se)/2;
	pp();
		}
	void pp() {
		System.out.println(name+"---"+kind+"----"+dul+"-----"+area);
	}

}

public class GoGo {

	public static void main(String[] args) {
		
		GoGoone one = new GoGoone("원일까",4);
		GoGoone two = new GoGoone("직사각형일까",15,4);
		GoGoone three = new GoGoone("직삼각형일까",15,6,7);
		
	

		
	
		

	}

}
