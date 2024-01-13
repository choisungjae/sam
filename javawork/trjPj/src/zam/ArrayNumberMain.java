package zam;

import java.util.ArrayList;

public class ArrayNumberMain {

	public static void main(String[] args) {
	   int[] arr= {23,55,44,33,22,66,44,55,66,55,32,31,24,55,22,33,44,66};
	   
	   ArrayList even =new ArrayList();
	   ArrayList three =new ArrayList();
	   
	   for (int no:arr) {
		//System.out.println(no);
		   if(no%2==0) {
			   even.add(no);
		   }
		   if(no%3==0) {
			   three.add(no);
		   }
	}
	   System.out.println("2의배수:"+even);
	   System.out.println("3의배수:"+three);
	   
	   
	   int[] arr

	}

}
