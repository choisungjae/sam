package S1212;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataNumInMain {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("fff/even.zzz");
			DataInputStream dis = new DataInputStream(fis);
			int cnt =0;
			while(dis.available()>0) {
				System.out.println(cnt+":"+dis.readInt());
				
				cnt++;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
