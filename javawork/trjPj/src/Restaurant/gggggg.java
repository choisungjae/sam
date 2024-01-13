package Restaurant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class gggggg {

	public static void main(String[] args) {
		
		
		ArrayList ar= new ArrayList();
//		int [] nums = {34,56,12,43,90,89,654,43,21234,675,45};
		for (int i : new int []{34,56,12,43,90,89,654,43,21234,675,45}) {
			ar.add(i);
		}
		System.out.println(ar);
//		ar.add(34);
//		ar.add(56);
//		ar.add(12);
//		ar.add(43);
//		ar.add(90);
//		ar.add(89);
//		ar.add(654);
//		ar.add(43);
//		ar.add(21234);
//		ar.add(675);
//		ar.add(45);
		
		System.out.println("원본:"+ar);
		
		Iterator it = ar.iterator();
		
		while(it.hasNext()) {
			 Object obj = it.next();
		        int i = (int)obj;
			if(i%2==0||i%3==0) {
				it.remove();
			}
		        
		}System.out.println("2,3배수삭제후:"+ar);
		
		
	}

}
