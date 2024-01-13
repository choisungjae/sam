package homeworkPj;

import java.util.Arrays;

public class dddddddddd {

	public static void main(String[] args) {
		
		// 점수:87.65.73.82.46.98.88.64.72.34.91.79.45.67
		// String [] ss={ "87", "65", "73", "82", "46", "98", "88", "64", "72", "34",
		// "91", "79", "45", "67" };
		int ww[] = { 87, 65, 73, 82, 46, 98, 88, 64, 72, 34, 91, 79, 45, 67 };

		for (int i = 0; i < ww.length; i++) {

			

				for (int ee = 0; ee < ww.length; ee++) {

					for (int rr = ee + 1; rr < ww.length; rr++) {

						if (ww[ee] < ww[rr]) {
							int tt = 0;
							tt = ww[rr];
							ww[rr] = ww[ee];
							ww[ee] = tt;

						}

					}
				
				
		
		}
	}System.out.println(Arrays.toString(ww));

}}
