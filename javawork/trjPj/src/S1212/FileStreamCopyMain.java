package S1212;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileStreamCopyMain {

	public static void main(String[] args) {
	     String fname ="tt333.jpg";
		
	     
	     try {
			FileInputStream fis =new FileInputStream("dst/"+fname);
			FileOutputStream fos= new FileOutputStream("fff/"+fname);
			
			int data;
			
			while((data=fis.read())!=-1) {
				fos.write(data);
			}
			
			fis.close();
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
