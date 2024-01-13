package Mouum.SJ;

class Mub{
	private String id;
	private String name;
	private int time,se;
	private int pon;
	
	public Mub() {
		this("최성재","zkdlwjsxm",86647593,7,15);
		
	}
	private Mub(String name,String id,int pon,int time,int se) {
		this.id=id;
		this.name=name;
		this.pon=pon;
		this.time=time;
		this.se=se;
}
	public String getName() {
		return name;
	}
	
	public int getPon() {
		return pon;
	}
	public String getId() {
		return id;
	}

	public int getTime() {
		return time;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public int setPon(int pon) {
	    return this.pon=pon;
	}
	public void ooo() {
		System.out.println("아이디:"+id+"\t이름:"+name+"\t\t폰번:"+pon+"\t예약시간:"+time+"시\t좌석:"+se+"번자리");
	}
}
public class SjSetGet {

	public static void main(String[] args) {
		Mub mo =new Mub();
		System.out.println("변경전---------변경가능:이름,폰번");
		mo.ooo();
		mo.setName("김성재");
		mo.setPon(77948854);
		//mo.id="3"; 못바꿈 프라이빗 작동 
		System.out.println("변경후----------------------");
		mo.ooo();
		}
}
