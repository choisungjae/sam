package S1200;

enum CoffeeMenu{
	
	아메리카노("아메리카노",2500),아메이이노("아메이이노",2100),아리카노("아리카노",5500);
	
	private CoffeeMenu(String name, int price) {
		this.name = name;
		this.price = price;
	
	}

	final String name;
	final int price;
	private int cnt=0;
	
	void add() {
		cnt++;
	}
	public String toString() {
		
		return name()+","+price+","+cnt+","+price*cnt;
	}
}

public class EnumcoffeeMain {
	
	static void order(String menu) {
		CoffeeMenu cm= CoffeeMenu.valueOf(menu);
		cm.add();
		System.out.println(cm.name);
	}

	public static void main(String[] args) {
 
		order("아메리카노");
		order("아메이이노");
		order("아리카노");
		order("아메리카노");
		order("아메이이노");
	
		
		for (CoffeeMenu cm : CoffeeMenu.values()) {
			System.out.println(cm);
		}
		

	}

}
