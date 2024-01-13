package zam;

import java.util.Calendar;

public class Gun {

   public static void main(String[] args) {
      Calendar now = Calendar.getInstance();
      now.set(Calendar.MONTH, 0);
      now.set(Calendar.DATE, 1);
      int first = now.get(Calendar.DAY_OF_WEEK); 
      int month = 0;
//      System.out.println("Calendar.DAY_OF_WEEK =" + now.get(Calendar.DAY_OF_WEEK));

      int[] arr = new int[12];
      int cnt = 0;
      int ii=0;
//      int cntt = 0;
      // System.out.println(last);
      for (int i = 1; i <= 3; i++) {
         System.out.print("\t\t");
         System.out.print(i + "월\t");
         
      }System.out.println();
      System.out.println();
      for (int i = 0; i < 3; i++) {
		System.out.print(" 일   월   화   수   목   금  토  ");
	}System.out.println();

      for (int j = 0; j < 3; j++) {
         now.set(Calendar.MONTH, j);
         now.set(Calendar.DATE, 1);
         if (now.get(Calendar.DAY_OF_WEEK) == 1) {            
        	 month = 7;
         } else if (now.get(Calendar.DAY_OF_WEEK) == 2) {//월
        	 month = 6;
         } else if (now.get(Calendar.DAY_OF_WEEK) == 3) {//화
        	 month = 5;
         } else if (now.get(Calendar.DAY_OF_WEEK) == 4) {//수
        	 month = 4;
         } else if (now.get(Calendar.DAY_OF_WEEK) == 5) {//목
        	 month = 3;
         } else if (now.get(Calendar.DAY_OF_WEEK) == 6) {//금?
        	 month = 2;
         } else {
        	 month = 1;
         }   arr[j] = month;
    
         if (cnt<5) {
            for (int i = 1; i <= month; i++) {
          
               System.out.print(" "+i+"  ");
               
               if (i == month) {
//            	   if(i<10) {i=i+" ";}
                  if (month >= 3) {
                     System.out.print("             ");
                  } 
                  else if(month ==2){
                     System.out.print("     ");}
                   else {System.out.println("  ");}
                  }
            }
            } 
         }   
          
         System.out.println();          
          for (int o = 0; o <=3 ; o++) {
			
		
            for (int j = 0; j < 3; j++) {
            	
              now.set(Calendar.MONTH, j);
              now.set(Calendar.DATE, 1);
              int last = now.getActualMaximum(Calendar.DATE);
              for (int i = 1; i <= 7; i++) {
            		String pre = "", sur = " ";
         		  	if (i+arr[j] < 10) {
         				pre = " ";
         			}
//           	  int last2 = now.getActualMaximum(Calendar.DATE);
                System.out.print(" " + (arr[j]+i) + " "+pre);
//                System.out.println(last2);
//                System.out.println(last);
//                if(arr[i]==last) {
                if(arr[j]+i == last) {
                	if(j==0) {System.out.print("\t\t    ");}
                	else{System.out.print("\t\t");}
                  break;
               }       
                if (i == 7) {
                    arr[j] += i;}
                }
              }
                 System.out.println();}
          ////4.6
          int arr2[]=new int[12];
          for (int i = 4; i <= 6; i++) {
              System.out.print("\t\t");
              System.out.print(i + "월\t");
              
           }System.out.println();
           System.out.println();
           for (int i = 1; i < 4; i++) {
     		System.out.print(" 일   월   화   수   목   금  토  ");
     	}System.out.println();
     	System.out.print("\t\t\t ");
     	 for (int j = 3; j < 6; j++) {
             now.set(Calendar.MONTH, j);
             now.set(Calendar.DATE, 1);
             if (now.get(Calendar.DAY_OF_WEEK) == 1) {            
            	 month = 7;
             } else if (now.get(Calendar.DAY_OF_WEEK) == 2) {//월
            	 month = 6;
             } else if (now.get(Calendar.DAY_OF_WEEK) == 3) {//화
            	 month = 5;
             } else if (now.get(Calendar.DAY_OF_WEEK) == 4) {//수
            	 month = 4;
             } else if (now.get(Calendar.DAY_OF_WEEK) == 5) {//목
            	 month = 3;
             } else if (now.get(Calendar.DAY_OF_WEEK) == 6) {//금
            	 month = 2;
             } else {
            	 month = 1;
             }   arr2[j] = month;
   
            
             if (cnt<5) {
                for (int i = 1; i <= month; i++) {
                	
                   System.out.print(" "+i+"  ");
                   if (i == month) {
                      if (month == 1) {
                         System.out.print("    ");
                      } 
                      else if(month ==6){
                         System.out.print("\t\t  ");
                      }else {System.out.print("  ");}
                      } 
                   }  
                } 
              }System.out.println(); 
          
          for (int o = 0; o <=3 ; o++) {
  			
      		for (int j = 3; j < 6; j++) {
                now.set(Calendar.MONTH, j);
                now.set(Calendar.DATE, 1);
                int last = now.getActualMaximum(Calendar.DATE);
                for (int i = 1; i <= 7; i++) {
                	String pre = "";
         		  	if (i+arr2[j] < 10) {
         				pre = " ";
         			}
                  System.out.print(" " + (arr2[j]+i) + " "+pre);
                  if(arr2[j]+i == last) {
                	  if(j==3) {System.out.print("\t\t\t");}
                	  else {
                    System.out.print("\t\t");}
                    break;
                 }      
                  if (i == 7) {
                      arr2[j] += i;}}}
                      System.out.println();}
          //7 9
          
          int arr3[]=new int[12];
          for (int i = 7; i <= 9; i++) {
              System.out.print("\t\t");
              System.out.print(i + "월\t");
              
           }System.out.println();
           System.out.println();
           for (int i = 1; i < 4; i++) {
     		System.out.print(" 일   월   화   수   목   금  토  ");
     	}System.out.println();
     	System.out.print("\t\t\t ");
     	 for (int j = 6; j < 9; j++) {
             now.set(Calendar.MONTH, j);
             now.set(Calendar.DATE, 1);
             if (now.get(Calendar.DAY_OF_WEEK) == 1) {            
            	 month = 7;
             } else if (now.get(Calendar.DAY_OF_WEEK) == 2) {//월
            	 month = 6;
             } else if (now.get(Calendar.DAY_OF_WEEK) == 3) {//화
            	 month = 5;
             } else if (now.get(Calendar.DAY_OF_WEEK) == 4) {//수
            	 month = 4;
             } else if (now.get(Calendar.DAY_OF_WEEK) == 5) {//목
            	 month = 3;
             } else if (now.get(Calendar.DAY_OF_WEEK) == 6) {//금
            	 month = 2;
             } else {
            	 month = 1;
             }   arr3[j] = month;
   
            
             if (cnt<5) {
                for (int i = 1; i <= month; i++) {
                	
                   System.out.print(" "+i+"  ");
                   if (i == month) {
                      if (month == 7) {
                         System.out.print("    ");
                      } 
                      else if(month ==1){
                         System.out.print("\t     ");
                      }else {System.out.print("\t\t      ");}
                      } 
                   }  
                } 
              }System.out.println(); 
          
          for (int o = 0; o <=3 ; o++) {
  			
      		for (int j = 6; j < 9; j++) {
                now.set(Calendar.MONTH, j);
                now.set(Calendar.DATE, 1);
                int last = now.getActualMaximum(Calendar.DATE);
                for (int i = 1; i <= 7; i++) {
                	String pre = "";
         		  	if (i+arr3[j] < 10) {
         				pre = " ";
         			}
                  System.out.print(" " + (arr3[j]+i) + " "+pre);
                  if(arr2[j]+i == last) {
                	  if(j==3) {System.out.print("\t\t\t");}
                	  else {
                    System.out.print("\t\t");}
                    break;
                 }      
                  if (i == 7) {
                      arr3[j] += i;}}}
                      System.out.println();}

   }
}