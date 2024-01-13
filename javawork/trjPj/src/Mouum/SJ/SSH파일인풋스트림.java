package s1129;


import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;


class ScanStud{
   String name;
   int [] jum;
   int tot, avg;
   public ScanStud(String str) {
      String [] arr = str.split(",");
      name = arr[0];
      jum = new int[arr.length-1];
      for (int i = 0; i < jum.length; i++) {
         jum[i] = Integer.parseInt(arr[i+1]);
      }
//      System.out.println(name);
//      System.out.println(jum[0]);
      calc();
   }
   
   private void calc() {
	   
      tot = 0;
      for (int i : jum) {
         tot += i;
      }
      avg = tot/jum.length;
   }

   @Override
   public String toString() {
      return name + "\t" + Arrays.toString(jum) + "\t" + tot + "\t" + avg;
   }
   
   
}

public class SSH파일인풋스트림 {

   public static void main(String[] args) throws Exception {
      FileInputStream fis = new FileInputStream("fff/exam.csv");
      Scanner sc = new Scanner(fis);
      while(sc.hasNext()) {
         
         System.out.println(new ScanStud( sc.nextLine()));
         
//         System.out.println(str);
      }
//      new ScanStud( sc.nextLine());
      sc.close();
      fis.close();
   }

}