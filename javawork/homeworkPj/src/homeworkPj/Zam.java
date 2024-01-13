package homeworkPj;

import java.util.Arrays;
import java.util.Iterator;

public class Zam {

	public static void main(String[] args) {

		int jum[] = { 87, 65, 73, 82, 46, 98, 88, 64, 72, 34, 91, 79, 45, 67 };
		int jj[] = new int[jum.length]; 
		int cnt = 0;
		 
		for (int i = 0; i < jum.length; i++) {
			
			if (jum[i] >= 70 && jum[i] <= 90) {
				jj[i] = jum[i];}
			else if(jj[i] == 0) {
				cnt++;}
			}//System.out.print(Arrays.toString(jj));
      
		for (int t = 0; t < jj.length; t++) {
			for (int i = t + 1; i < jj.length; i++) {
				if (jj[t] < jj[i]) {
					int tt = 0;
					tt = jj[i];
					jj[i] = jj[t];
					jj[t] = tt;}}}
		int su = jj.length - cnt;  //System.out.println(cnt);
		int six[] = new int[su];
		for (int i = 0; i < six.length; i++) {
			six[i] = jj[i];}

		System.out.println(Arrays.toString(six));}}
