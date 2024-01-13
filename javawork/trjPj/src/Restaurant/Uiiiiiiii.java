package Restaurant;

import java.util.Calendar;

public class Uiiiiiiii {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		now.set(Calendar.DATE, 1);
	
		int first = now.get(Calendar.DAY_OF_WEEK);
		//System.out.println(first);
//		System.out.println(first);
		for (int i = 1; i <first; i++) {
			System.out.print("   ");
		}
		int last = now.getActualMaximum(Calendar.DATE);
		//System.out.println(last);
		for (int i = 1; i <=last; i++) {
			now.set(Calendar.DATE, i);
			if(i<10) {
				System.out.print(" ");
			}
			System.out.print(i+" ");
			//System.out.println(now.get(Calendar.DAY_OF_WEEK));
			if(now.get(Calendar.DAY_OF_WEEK)==7) {
				System.out.println();
			}
		}
	}

}