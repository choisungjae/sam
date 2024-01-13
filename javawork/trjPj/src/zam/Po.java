package zam;

class Jo{
	String name,kind,spec,gg;
	
//    Jo(){
//    	
//    }
//	
//	Jo(String name,String spec){
//    	this.name=name;
//    	this.spec=spec;
//    	
//    }
	void ddd(String spec){
		spec="흔들림X";
		gg ="노이즈캔슬링";
		kind= "아이폰";
		
       }

	
	void ppp(String name){
		this.name = name;
		ddd(spec);
	
		System.out.println(name+":"+kind+","+spec+","+gg);
		
	}}

class JoJo extends Jo{
//	JoJo(){}
//	JoJo(String name,String spec){
//    	this.name=name;
//    	this.spec=spec;
//    }
	void ddd(String name){
		spec="100배줌";
		  gg ="일반통화음질";
		kind= "갤럭시";
	
       }
	

public class Po {

	public static void main(String[] args) {
		Jo ee =new Jo();
		JoJo dd =new JoJo();

		ee.ppp("휴대폰");
		dd.ppp("휴대폰");
}

}
