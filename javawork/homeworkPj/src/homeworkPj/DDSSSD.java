package homeworkPj;

import java.util.Arrays;

class Param_Stud{
//   String aa;
   int [] jum;
   int tot, avg;

   void void_1(String aaa, int a, int b) {
//      this.aa = aa;
      
      int area = a * b ;
      int border = a + b ;
      
      
      System.out.println(aaa+" 넓이 :"+area+" 둘레:"+border);

      
     }
   
   void circle(String aa, int r, int t) {
      double PI = 3.141592;
      double area = r * r * PI;
      double border = r * PI * 2;
      
//      System.out.println(aa +" 넓이 :"+area+" 둘레:"+border);
   }
   

   void triAngle(String aaa, int c, int d, int e) {
      int area = c * d / 2;
      int border = c + d + e;
      
//      System.out.println(aaa+" 넓이 :"+area + ", "+ border);
   }
   
   
   
//   void calc() {
//      tot = 0;
//      for (int i : jum) {
//         tot += i;
//      }
//      avg = tot/jum.length;
      
//}
//      System.out.println("직각삼각형 : "+area + ", "+ border);
   
      
   void ppp() {
//      System.out.println("\t"+Arrays.toString(jum)+"\t"+tot+"\t"+avg);
   }
   
}


public class DDSSSD {

   public static void main(String[] args) {
      
      Param_Stud st = new Param_Stud();
//      st.void_1("",0 , 0);
//      st.circle();
//      st.triAngle();

      st.ppp();
      


      String [] names = {
            "삼각형","원","직삼각형"      
      
      
   };

      int [][] arr = {
            {40,20},   
            {30,10},
            {50,15},
            
      };
      
      Param_Stud [] name_2 = new Param_Stud[names.length];
      for (int i = 0; i < name_2.length; i++) {

         name_2[i] = new Param_Stud();
         
         name_2[i].void_1(names[i], arr[i][0], arr[i][1]);
         name_2[i].circle(names[i], arr[i][0], arr[i][1]);
//         name_2[i].triAngle(names[i], arr[i][0], arr[i][1]);

         name_2[i].ppp();
         
         
      }
      
}
}






