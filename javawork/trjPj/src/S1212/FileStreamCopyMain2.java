package S1212;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileStreamCopyMain2 {

	public static void main(String[] args) {
	     String fname ="aaa.txt";
	     fname ="33344.jpg";
	     
	     
		try {
			FileInputStream fr =new FileInputStream("ffff/"+fname);   //파일이있는 폴더
			FileOutputStream fw = new FileOutputStream("dst/"+fname);  //옮겨져갈 폴더
			
			int data;
			
			while((data=fr.read())!=-1) {
				fw.write(data);
			}
			
			fw.close();
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
