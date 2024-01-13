package Restaurant;

import java.util.HashMap;
import java.util.Map;

public class MapBaseBallMain {

	public static void main(String[] args) {
		
		
		int[]arr = {2,3,5,8,1,2,5,7,2,3,7,9,2,7,9,2};
		HashMap mm=new HashMap();
		
        for (int i : arr) {
//        	System.out.println(i+","+mm+mm.containsKey(i));
        	int cnt=1;
        	if(mm.containsKey(i)) {
        		cnt+=(int)mm.get(i);
        	}
		mm.put(i, cnt);	
		
		}
        
        for (Object oo :mm.entrySet()) {
			Map.Entry me=(Map.Entry)oo;
			System.out.println(me);
		}
        
		

		
		
		
		

	}

}
