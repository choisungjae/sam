package Restaurant;
import java.util.HashMap;
import java.util.Map;
public class GGG {

	public static void main(String[] args) {
		
		HashMap away=new HashMap();
		HashMap home=new HashMap();
		String arr[]= {"h3","a5","a7","h9","h1","h3","a5","a6","h2","a3","a5","h9","h3","a7","h9"};

		int acnt =0;
		int hcnt =0;
		
		for (String i : arr) {
		
//			System.out.println("i:"+i);
//			System.out.println("acnt:"+acnt);
//			System.out.println("hcnt:"+hcnt);
			if(away.containsKey(i)) {
				acnt++;
			}  
			else {
				hcnt++;}
			if(i.contains("h")) {
				System.out.println("i:"+i);
				away.put(i, acnt);}
				else if(i.contains("a")){
					home.put(i, hcnt);
				}
				
				
			}
			
			
			
		 System.out.println("어웨이:"+acnt+"\n홈:"+hcnt);
		 for (Object oo :away.entrySet()) {
				Map.Entry me=(Map.Entry)oo;
				System.out.println(me);
			}
		 for (Object ooo :home.entrySet()) {
				Map.Entry mee=(Map.Entry)ooo;
				System.out.println(mee);
			}
	}

}
