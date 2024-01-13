package S1213;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjectInMain {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("ffff/stst.cvb");
			ObjectInputStream ois = new ObjectInputStream(fis);

		
//			BBB [] aa= new BBB[5];
//		   for (int i = 0; i < 5; i++) {
//			 aa[i]= (BBB) ois.readObject();
//			 
//			 System.out.println(aa[i]);
//		}
		     
		 while(fis.available()>0) {
			 System.out.println((BBB)ois.readObject());
		 }
		 ois.close();
			fis.close();


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
			
		


			
	

			
		