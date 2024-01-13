package S1212;

import java.io.FileInputStream;
import java.io.FileReader;

public class FileReaderMain {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("ffff/bbb.txt");
			
			while(fis.available()>0) {
				System.out.print((char)fis.read());
			}
			
			
			fis.close();
			
			
			System.out.println("\n------------------------");
			
			FileReader fr = new FileReader("ffff/bbb.txt");
			
			int data;
			while((data=fr.read())!=-1) {
				System.out.print((char)data);
			}
			
			
			fr.close();
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
