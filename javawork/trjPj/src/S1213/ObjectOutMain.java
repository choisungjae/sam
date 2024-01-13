 package S1213;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

class BBB implements Serializable{
	String name;
	int jum[];
	int tot,avg;
	public BBB(String name, int jum1,int jum2, int jum3) {
		super();
		this.name = name;
		this.jum= new int[] {jum1,jum2,jum3};
		tot=jum1+jum2+jum3;
		avg=tot/jum.length;
	}

	public String toString() {
		return "이름:"+name + "   점수: " + Arrays.toString(jum)+"   총합:"+tot+"   평균:"+avg;
	}
}
	
public class ObjectOutMain {

	public static void main(String[] args) {
		try {
			
			
			FileOutputStream fos = new FileOutputStream("ffff/stst.cvb");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		
			oos.writeObject(new BBB("현빈",53,94,33));
			oos.writeObject(new BBB("중빈",53,54,83));
			oos.writeObject(new BBB("골빈",53,74,63));
			oos.writeObject(new BBB("김이빈",58,44,43));
			oos.writeObject(new BBB("우이빈",63,94,33));
			oos.close();
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
			
	
			
		

			
	
		