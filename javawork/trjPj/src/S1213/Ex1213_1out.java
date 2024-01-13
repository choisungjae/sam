package S1213;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

class St implements Serializable{
	String name;
	int jum[];
	public St(String name, int jum1, int jum2,int jum3) {
		super();
		this.name = name;
		this.jum= new int[] {jum1,jum2,jum3};
	
	}
	@Override
	public String toString() {
		return  name + ", " + Arrays.toString(jum)+;
	}
}
public class Ex1213_1out {

	public static void main(String[] args) {
		try {
			
			FileOutputStream fos = new FileOutputStream("ffff/stst.cvb");
			DataOutputStream dos = new DataOutputStream(fos);
			
		
			dos.close();
			fos.close();
		
			
			fos = new FileOutputStream("ffff/stst.cvb");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
//			ArrayList stud = new ArrayList();
//            stud.add("현빈,87,89,83");
//            stud.add("현빈2,87,89,83");
//            stud.add("현빈3,87,89,83");
//            stud.add("현빈4,87,89,83");
//            stud.add("현빈5,87,89,83");
            
//            System.out.println(stud);
//            
//            oos.writeObject(stud);
            oos.writeObject(new St("현빈",33,44,55));
            oos.writeObject(new St("현빈",33,94,55));
            oos.writeObject(new St("현빈",93,47,55));
            oos.writeObject(new St("현빈",43,84,55));
            oos.writeObject(new St("현빈",33,24,55));
			
			oos.close();
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}