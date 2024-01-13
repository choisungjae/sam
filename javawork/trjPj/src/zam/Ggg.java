package zam;

import java.util.Arrays;

class Oi{
	String name,kind;
	int area,dul;
	int pi=3;
	int []jum;
	
	public Oi(String name,int ga, int se,int bit) {
		super();
		
		this.name = name;
		this.jum = new int [] {bit, ga, se};
		cc();}

	void cc() {
		kind="삼각형";
		dul=jum[0]+jum[1]+jum[2];
	    area=(jum[1]*jum[2])/2;
	}
	public Oi(String name,int ga, int se) {
		super();
		
		this.name = name;
		this.jum = new int [] {ga, se};
		dd();}

	void dd() {
		kind="사각형";
		dul=(jum[0]+jum[1])*2;
	    area=(jum[0]*jum[1])/2;
	}
	public Oi(String name,int ban) {
		super();
		
		this.name = name;
		this.jum = new int [] {ban};
		ttt();}

	void ttt() {
		kind="원";
		dul=(jum[0])*2;
		
	    area=(jum[0]*jum[0])*2;
	}
	public String toString() {
		String tt =
					
	name+"\t\t"+Arrays.toString(jum)+"\t"+
			area+"\t"+dul;
		return tt;
}
	}
class twotwo{
	String name,kind;
	int area,dul;
	int pi=3;
	int []jum;

	public twotwo(String name) {
		
		this.name = name;
		jum = new int[1];
	}
public twotwo(String name,int gg) {
		
		this.name = name;
//		this.gg=gg;
		jum = new int[2];
	}
public twotwo(String name,int gg,int dd) {
	
	this.name = name;
	jum = new int[3];
}
	public boolean equals(Object obj) {
		Oi st = (Oi)obj;// -----------------------------------------------------
		boolean res = name == st.name;
		if(res) {
			for (int i = 0; i < jum.length; i++) {
				jum[i]+=st.jum[i];
			}
			area+=st.area;
			dul+=st.dul;
		}
		return res;
	}
	public String toString() {
		String ttt ="-------------------------------------------------\n"+
					name+"\t"+
					"합계"+"\t"+
					Arrays.toString(jum)+"\t"+
					area+"\t"+
					dul+"\n";
		return ttt;
	}	}

public class Ggg {

	public static void main(String[] args) {
		Oi [] GG= {
				new Oi("원",8),
				new Oi("삼각형",12,15,6),
				new Oi("사각형",3,3),
				new Oi("사각형",3,2),
				new Oi("원",15),
				new Oi("사각형",15,33),
				new Oi("삼각형",12,10,5)
		};
		twotwo [] orArr= {
				new twotwo("원"),
				new twotwo("삼각형",2,3),
				new twotwo("사각형",1)
				};
		for (twotwo or : orArr) {
			for (Oi st : GG) {
				if(or.equals(st)) {
					System.out.println(st);
				}
			}
			System.out.println(or);
		}
	}
}


