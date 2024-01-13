package zam;

import java.util.Arrays;

abstract class Bu{
	String name,kind;
	int[] two;
	
	
	public Bu(String name,String kind,int...two) {
		this.name =name;
		this.kind=kind;
		this.two=two;
}
	abstract void swim();
}

class Ao extends Bu{
	public Ao(String name,int two) {
	       super(name,"자유형",two);
	       }
	
	void swim() {
		String tt=name+"\t"+kind+"\t"+two[0]+"M";
		System.out.println(tt);
		}

}
class Bo extends Bu{
	public Bo(String name,int two) {
	       super(name,"접영",two);}
	void swim() {
		String tt=name+"\t"+kind+"\t"+two[0]+"초";
		System.out.println(tt);
	}
}

class Co extends Bu{
	public Co(String name,int ...two) {
	       super(name,"평영",two);}
	void swim() {
		
		String tt=name+"\t"+kind+"\t잠영:"+two[0]+"M+평영:"+two[1]+"M";
		System.out.println(tt);
	}
}

class DDo extends Bu{
	public DDo(String name,int two) {
	       super(name,"배영",two);}
	void swim() {
		String tt=name+"\t"+kind+"\t"+two[0]+"M 오리발";
		System.out.println(tt);
	}
}
public class Moong {

	public static void main(String[] args) {
		
		Bu[] scc = {new Ao("히어로",30),
				new Bo("아무개",20),
				new Co("유퀴즈",30,20),
				new DDo("수영왕",20)	};
		
	   for(Bu tt: scc) {
		   tt.swim();
	   }
	}

}