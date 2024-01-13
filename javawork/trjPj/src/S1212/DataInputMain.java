package S1212;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputMain {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("fff/qwe.rty");
			DataInputStream dis = new DataInputStream(fis);
			
			
			//System.out.println(dis.read());  받아야 하는 크기를 알 수 없음
			System.out.println(dis.readChar());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readByte());
			System.out.println(dis.readShort());
			System.out.println(dis.readInt());
			System.out.println(dis.readLong());
			System.out.println(dis.readFloat());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
			//한줄을 UTF로 받아 
			
			dis.close();
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}