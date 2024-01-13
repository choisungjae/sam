class Fo{

	String name,kind;
	int []jum;
	int area,dul;
	int pi=3;
	
	
	Fo(String name,int ban){
		this(name,"원",ban);
	}
    Fo(String name,int ga,int se){
	    this(name,"사각",ga,se);
	}
    Fo(String name,int ga,int se,int bit){
	this(name,"삼각",ga,se,bit);
	
}
    Fo(String name,String kind,int ban){
		this.name=name;
		this.kind=kind;
		dul=2*ban*pi;
		area=ban*ban*pi;
		ppp();
	}
	Fo(String name,String kind,int ga, int se){
		this.name=name;
		this.kind=kind;
		dul=2*(ga+se);
		area=ga*se;
		ppp();
	}
    Fo(String name,String kind,int ga, int se, int bit){
    	this.name=name;
		this.kind=kind;
    	  dul=ga+se+bit;
  	    area=(ga*se)/2;
  	  ppp();
	}
    void ppp() {
    	System.out.println(name+","+kind+","+area+","+dul);
    }
	
}
public class Do {

	public static void main(String[] args) {
		new Fo("도형",12);
		new Fo("도형",33,44,66);
		new Fo("도형",33,44);
		new Fo("도형",33,44,22);
		}

}
