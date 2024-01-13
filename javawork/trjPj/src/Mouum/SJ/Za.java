package zam;

import java.util.Arrays;

class Poo{
	String kind, name;
	int [] jum;
	int area,dul;
	int ddd;
	
	
	void ppp() {
		ddd=area+dul;
		System.out.println(name+"\t"+kind+"\t"+Arrays.toString(jum)+"\t넓이:"+area+"\t둘레:"+dul+"\t넓이+둘레:"+ddd);
	}
	
}

class One extends Poo{
	public One(String name,int ban) {
		int pi=3;
		kind="원\t";
		this.name=name;
		jum= new int[] {ban};
		dul=2*ban*pi;
		area=ban*ban*pi;
	}
} 
class Two extends Poo{
	public Two(String name, int ga,int se) {
		kind="사각형";
		this.name=name;
		jum= new int[] {ga,se};
	
		dul=2*(ga+se);
		area=ga*se;
}}
class Three extends Poo{
	public Three(String name, int ga,int se,int bit) {
		kind="삼각형";
		this.name=name;
		jum= new int[] {ga,se,bit};
	
		dul=ga+se+bit;
	    area=(ga*se)/2;
	}
}	

public class Za {

	public static void main(String[] args) {
		
		One oo= new One("원일까",3);
		Two cc= new Two("사각형일까",33,55);
		Three ee= new Three("삼각형일까",44,55,44); //바로입력할때 퍼블릭?
		
		oo.ppp();
		cc.ppp();
		ee.ppp();
		}

}
