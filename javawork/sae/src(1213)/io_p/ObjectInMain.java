package io_p;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjectInMain {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("fff/ddd.cvb");
			DataInputStream dis = new DataInputStream(fis);
			
			int i = dis.readInt();
			String str = dis.readUTF();
			
			dis.close();
			fis.close();
			
			System.out.println("data:"+i+","+str);
			
			////////////////////
			
			fis = new FileInputStream("fff/ooo.cvb");
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println(ois.available());
			i = ois.readInt();
			System.out.println(ois.available());
			str = ois.readUTF();
			System.out.println(fis.available());
			int [] arr = (int [])ois.readObject();
			System.out.println(fis.available());
			ArrayList arr2 = (ArrayList)ois.readObject();
			System.out.println(fis.available());
			BBB bb = (BBB)ois.readObject();
			System.out.println(fis.available());
			ois.close();
			fis.close();
			System.out.println("obj:"+i+","+str+","+Arrays.toString(arr));
			System.out.println("obj:"+arr2);
			System.out.println("obj:"+bb);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
