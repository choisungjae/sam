package S1212;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          try {
        	  
        	  String [] arr= {
        			  "여긴 참나무 숲 장수풍뎅이와",
        			  "9798979871",
        			  ")(@#$%@#@#@#",
        			  "jdofjosdfk ds ofkdsofk "
        	  };
			FileWriter fw = new FileWriter("ffff/eee.txt");
			 BufferedWriter bw =new  BufferedWriter(fw);
			 
			 for (String str : arr) {
				bw.write(str+"\n");
			}
			 
			 
			 bw.close();
			 fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
	}

}
