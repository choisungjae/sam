package Restaurant;

import java.util.Arrays;

class Go{
	String name;
	int dul, area;
	int maxdul;
	int maxarea;
	
	int ttt[]=new int [6];
	
	public Go(String name, int ga, int se) {
		this.name = name;
		
		dul=ga*se;
		area=(ga+se)*2;
		calc(dul,area);

		}
	public Go(String name, int ga,int se,int bit) {
		this.name = name;
		 dul=ga+se+bit;
		 area=(ga*se)/2;
		 calc2(dul,area);
	}
	
	public void calc(int dul,int area) { 
		 if (dul > maxdul) {
	            maxdul = dul;
	        }
		if(area>maxarea) {
			maxarea=area;
		}
	
		}
	public void calc2(int dul,int area) {
		 if (dul > maxdul) {
	            maxdul = dul;
	        }
		if(area>maxarea) {
			maxarea=area;
		}
	
		}

	public String toString() {
		return name  + " 둘레: " + dul+"  넓이:"+area+"  "+name+
				"최대둘:"+maxdul+"  "+name+"최대넓:"+maxarea;
	}
}
class GoGo{
	Go [] score = {
			new Go("사각형",30,20),
			new Go("삼각형",10,11,15),
			new Go("사각형",23,23),
			new Go("삼각형",30,21,23),
			new Go("사각형",34,33),
			new Go("삼각형",35,31,23)
			
	};	

	private GoGo() {	}
	
	static private GoGo me = null;
	
	static GoGo getInstance() {
		if(me==null) {
			me = new GoGo();
		}
		
		return me;
	}
	public String toString() {
		String no="";
		for (int i = 0; i < score.length; i++) {
			no+=score[i]+"\n";
		}
		return no;
	}
}
       

public class S1128 {

	public static void main(String[] args) {
	   
		  System.out.println(GoGo.getInstance());
		
		
     }

}


