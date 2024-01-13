package Mouum.Sam;

import java.util.HashMap;
import java.util.Map;

public class dd {

	public static void main(String[] args) {
		// 1,2,3,4,5,6,7,8,9
		// 2,3,5,8,1,2,5,7,2,3,7,9,2,7,9,2
		/*
		 1 - 1
		 2 - 5
		 3 - 2
		 5 - 2.....
		 7 - 2
		 8 - 1
		 9 - 2
		 
		 * */
		int [] arr = {2,3,5,8,1,2,5,7,2,3,7,9,2,7,9,2};
		HashMap mm = new HashMap();
		for (int i : arr) {
			
			//System.out.println(i+" : "+mm+mm.containsKey(i));
			int cnt = 1;
			if(mm.containsKey(i)) {
				cnt += (int)mm.get(i);
			}
			mm.put(i, cnt);
			
		}
		
		for (Object oo : mm.entrySet()) {
			Map.Entry me = (Map.Entry)oo;
			System.out.println(me);
		}
//		 h : home,   a:away
		// h3 : home 팀의 3번타자
//	    h3,a5,a7,h9,h1,h3,a5,a6,h2,a3,a5,h9,h3,a7,h9
		System.out.println("------------------------------");
		String [] data = "h3,a5,a7,h9,h1,h3,a5,a6,h2,a3,a5,h9,h3,a7,h9".split(",");
		HashMap hh = new HashMap();
		HashMap aa = new HashMap();
		HashMap tot = new HashMap();
		tot.put('h',hh);
		tot.put('a',aa);
		for (String str : data) {
			char [] chars = str.toCharArray();
			System.out.println(chars[0]+":"+chars[1]);
			if(chars[0]=='h') {
				int i = 1;
				if(hh.containsKey(str)) {
					i+= (int)hh.get(str);
				}
				hh.put(str, i);
			}else {
				int i = 1;
				if(aa.containsKey(str)) {
					i+= (int)aa.get(str);
				}
				aa.put(str, i);
			}
		}
		System.out.println("home >>>>");
		for (Object oo : hh.entrySet()) {
			Map.Entry me = (Map.Entry)oo;
			System.out.println(me);
		}
		System.out.println("away >>>>");
		for (Object oo : aa.entrySet()) {
			Map.Entry me = (Map.Entry)oo;
			System.out.println(me);
		}
		
	}

}