package zam;

import java.util.Iterator;

class Gobong{
	String name,name2,name3;
	int [][] price= {{5000,4000,3000},
			         {2000,1500},
			         {1500,2000}};
	int [][] cal=   {{330,400,300},
	                 {200,150},
	                 {150,100}};
	int ptot=0;
	int ctot=0;
	
	void one(String name,String name2,String name3){
		this.name=name;
		this.name2=name2;
		this.name3=name3;
		two();
	}

	void two() {
		String[]names= {name,name2,name3};
			
		    ptot=0;
			ctot=0;
//			for (String sss : names) {
//				
//		이중배열두개 일반한개 포문3개로해보다 실패했습니다.
//		for (int i = 0; i < names.length; i++) {
//			for (int j = 0; j < names.length; j++) {
				
		
			if(name.equals("불고기버거")) {
				ptot+=price[0][0];
				ctot+=cal[0][0];
			}else if(name.equals("새우버거")) {
				ptot+=price[0][1];
				ctot+=cal[0][1];
			}else if(name.equals("치즈버거")) {
				ptot+=price[0][2];
				ctot+=cal[0][2];
			}
			if(name2.equals("감자스틱")) {
				ptot+=price[1][0];
				ctot+=cal[1][0];
			}else if(name2.equals("치즈스틱")) {
				ptot+=price[1][1];
				ctot+=cal[1][1];
			}
			if(name3.equals("콜라")) {
				ptot+=price[2][0];
				ctot+=cal[2][0];
			}else if(name3.equals("사이다")) {
				ptot+=price[2][1];
				ctot+=cal[2][1];
			}	
//	}
			three();}
		
    void three() {
    	System.out.println(name+"\t"+name2+"\t"+name3+"\t"+ptot+"\t"+ctot);
    }
}

class toto{
	Gobong Gg(String name,String name2, String name3) {
		Gobong go=new Gobong();
		go.one(name,name2,name3);
		return go;
		
		
	}
	
}



public class Zam1108 {

	public static void main(String[] args) {
		
         toto order= new toto();
         
         System.out.println("버거\t사이드\t음료\t총가격\t칼로리");
         Gobong[] oder= {
         order.Gg("불고기버거","감자튀김","콜라"),
         order.Gg("불고기버거","감자튀김","사이다"),
         order.Gg("새우버거","감자튀김","콜라"),
         order.Gg("새우버거","치즈스틱","콜라"),
         order.Gg("치즈버거","감자튀김","사이다"),
         };
	}

}
