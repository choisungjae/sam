package S1200;

import java.util.Arrays;
import java.util.Iterator;

class Ina{
	String name,ban;
	int pass,nopass;
	public Ina(String ban) {
		this.ban=ban;
		
	}
	void ppp() {
		System.out.println(ban+","+"합"+pass+"불합"+nopass);
	}
	
	class Ina2{
		String name,kind;
		int avg,tot;
		int []jum;
		
		public Ina2(String name,int ...jum) {
			this.name=name;
			this.jum=jum;
			
		    for (int i = 0; i < jum.length; i++) {
				tot+=jum[i];
			}avg=tot/jum.length;
			
			if(jum.length==3&&avg>=80) {
				kind="일반생";pass++;
			}else if(jum.length==3&&avg<=80) {
				kind="일반생";nopass++;
			}
			if(jum.length==4&&avg>=80) {
				kind="특기생";pass++;
			}else if(jum.length==4&&avg<=80) {
				kind="특기생";nopass++;
			}
			ppp();
			}
		void ppp() {
			System.out.println(name+","+kind+","+Arrays.toString(jum)+","+tot+","+avg);
		}	
		
		
		
	}
}

public class Qqq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Ina[] ban= {
        		new Ina("1반"),
        		new Ina("2반"),
        		new Ina("3반"),
        		new Ina("4반")
        };
         Ina.Ina2[] hh= {
        		 ban[0].Ina2("최성재",22,33,55)
//        		 ban[1].Ina2("최성재",22,33,55,44),
//        		 ban[2].Ina2("최성재",22,33,55),
//        		 ban[3].Ina2("최성재",22,33,55,55)
//        		 ban[0].Ina2("최성재",22,33,55),
//        		 ban[0].Ina2("최성재",22,33,55,33),
//        		 ban[0].Ina2("최성재",22,33,55),
//        		 ban[0].Ina2("최성재",22,33,55,88)
         };
		
	}

}
	    	
			
			
			
			
			
			
			
