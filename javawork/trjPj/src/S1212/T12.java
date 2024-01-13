package S1212;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class T12 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("fff/eee.abc");
			DataInputStream dis = new DataInputStream(fis);

			System.out.println("아이디:"+dis.readUTF());
			System.out.println("이름:"+dis.readUTF());
			System.out.println("학년:"+dis.readInt());
			System.out.println("키:"+dis.readDouble());
			System.out.println("군필여부:"+dis.readBoolean());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
