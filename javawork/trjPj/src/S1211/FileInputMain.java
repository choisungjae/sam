package S1211;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputMain { //파일 읽어 오기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fis = new FileInputStream("fff/bbb.txt");
		
		while(fis.available()>0){
			byte [] buf=new byte[500];
			
			
//			int data=fis.read();
//			System.out.print((char)data);
			
			int len =fis.read(buf);
//			System.out.println(len);
			System.out.println(new String (buf,0,len));
			
		}
		
		
		
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
