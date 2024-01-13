package zam;

import java.util.ArrayList;
import java.util.Collections;
public class Arr2 {

	public static void main(String[] args) {
		int[] arr= {23,55,44,33,22,95,44,99,66,75,32,31,84,55,82,73,44,76};
		   
		   ArrayList su  =new ArrayList();
		   ArrayList u  =new ArrayList();
		   ArrayList mi  =new ArrayList();
		   ArrayList y  =new ArrayList();
		   ArrayList ga  =new ArrayList();
		   
		   for (int jum:arr) {
				//System.out.println(arr);
				   if(jum>=90) {
					   su.add(jum);
				   }else if(jum>80&&jum<90) {
					   u.add(jum);
				   }else if(jum>70&&jum<80) {
					   mi.add(jum);
				   }else if(jum>60&&jum<70) {
					   y.add(jum);
				   }else if(jum<60) {
					   ga.add(jum);
				   }
		   }

		   Collections.sort(su);
		   Collections.reverse(su);
		   Collections.sort(u);
		   Collections.reverse(u);
		   Collections.sort(mi);
		   Collections.reverse(mi);
		   Collections.sort(y);
		   Collections.reverse(y);
		   Collections.sort(ga);
		   Collections.reverse(ga);
		   
		   System.out.println("수:"+su);
		   System.out.println("우:"+u);
		   System.out.println("미:"+mi);
		   System.out.println("양:"+y);
		   System.out.println("가:"+ga);
	}
	}
				   
				
	 


