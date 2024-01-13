package S1200;

enum JJimenu{
	김치찌개("김치찌개",8000),참치찌개("참치찌개",7000),두부찌개("두부찌개",9000);
	
    
	
	private JJimenu(String name, int price) {
		this.name = name;
		this.price = price;
	
	}
    final String name;
	final int price;
	private  int cnt=0;
	
	void add(int su) {
		cnt+=su;
	}
	
	public String toString() {
		
		
		return "총:"+name()+price+"  갯수"+cnt+"  총가격"+price*cnt;
	}
}

public class JJi {
	static void order(String menu,int su) {
		JJimenu cc =JJimenu.valueOf(menu);
		cc.add(su);
		System.out.println(cc.name+" "+su+"개 주문 "+(cc.price*su));
		}
	
	
	
	  
	public static void main(String[] args) {
		
		
		order("김치찌개",2);
		order("참치찌개",3);
		order("김치찌개",10);
		order("두부찌개",5);
		order("김치찌개",2);
		order("두부찌개",5);
		

        JJimenu [] Jarr=JJimenu.values();
		
		for (JJimenu ddd : Jarr) {
		  System.out.println(ddd);
		}
	}

}
