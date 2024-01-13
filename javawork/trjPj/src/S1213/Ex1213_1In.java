package S1213;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex1213_1In {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("ffff/stst.cvb");
			DataInputStream dis = new DataInputStream(fis);
			
			int i = dis.readInt();
			String str = dis.readUTF();
			
			dis.close();
			fis.close();
			
//			System.out.println("data:"+i+","+str);
			
			
			
		
			ObjectInputStream ois = new ObjectInputStream(fis);
//			
			i = ois.readInt();
			str = ois.readUTF();
			St st=(St)ois.readObject();
//			int [] arr = (int [])ois.readObject();
//			ArrayList arr2 = (ArrayList)ois.readObject();
////			BBB bb=(BBB)ois.readObject();
//			
			ois.close();
			fis.close();
			System.out.println(st);
//			System.out.println(arr2);
////			System.out.println("obj:"+i+","+str+","+Arrays.toString(arr));
//			System.out.println("obj:"+arr2);
////			System.out.println("obj:"+bb);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}