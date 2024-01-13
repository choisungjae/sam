package homeworkPj;

public class d1030 {

	public static void main(String[] args) {

		
//		3.6.9게임구현 
//		1부터 20 까지만
//		다하면 1~100까지
		System.out.println("1풀---------1~20-------------");
		//3 6 9 13 16 19 23 26 29 30 31 32 [33] 34 35 [36] ....................................
		
		for(int a=1;a<=20;a++) {
			if(a==3) {
			System.out.println("짝");
			}else if(a==6) {
			System.out.println("짝");	
			}else if(a==9) {
			System.out.println("짝");	
		    }else if(a==13) {
			System.out.println("짝");	
		    }else if(a==16) {
			System.out.println("짝");	
		    }else if(a==19) {
			System.out.println("짝");	
			}else {System.out.println(a);}
		}
		
		
		System.out.println("2풀---------1~100-------------");
		//3 6 9 13 16 19 23 26 29 30 31 32 [33] 34 35 [36] ....................................
		String g = "짝";
		for (int i =1; i <=100; i++) {
			
			int ten =i/10; //ex34 나누면 3 떨어짐 10의 자리 구해놓은ㄱ바   소수점 한칸 이동시킨거임 ,
			int own =i%10; // ex35 나머지구하면 5  일자리구한값
			//System.out.println(ten);
			//System.out.println(own);
			if(i <10) {
				if(i==3||i==6||i==9) {
					System.out.println(g);
					}
				    else {System.out.println(i);}}
			else if(i>=10) {
				if(ten==3) {
	               System.out.println(g);
	               if(ten==3 &&(own==3||own==6||own==9)) {
	            	   System.out.println(g+g);}
	               else {System.out.println(i);}}
	               else if(ten==6) {System.out.println(g);
	            	   if(ten==6&&(own==3||own==6||own==9)) {
	            		   System.out.println(g+g);}
	            	   else{System.out.println(i);}}
	             else if(ten==9) {System.out.println(g);
         	   if(ten==9&&(own==3||own==6||own==9)) {
         		   System.out.println(g+g);}
         	   else{System.out.println(i);}
	             }
	             else if((ten!=3)&&(ten!=6)&&(ten!=9)) {
	            	 if((own==3)||(own==6)||(own==9)) {  
	            		 System.out.println(g);
	            	 }else {System.out.println(i);}
	             }
	             else{System.out.println(i);}}}}}
       

			
	
		
		
		
		
		


