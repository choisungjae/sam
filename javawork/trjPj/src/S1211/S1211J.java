package S1211;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

class Stud{
	
    String name;  
	int jum[];
	int tot,avg;
	public Stud(String name,int en,int ma, int han) {
		super();
		this.name=name;
		this.jum=new int [] {en,ma,han};
		
		calc();
	}
	
	
	void calc() {
		tot = 0;
		
		for (int j = 0; j < jum.length; j++) {
			tot += jum[j];
		}
		avg = tot/jum.length;
		
	}
	public String toString() {
		return  name+"  "+Arrays.toString(jum)+"총점:"+tot+"평균"+avg;
	}
	
	
	
}



public class S1211J {

	public static void main(String[] args) {
		
		
		
		String tt="";
		try {//파일꺼내는
			FileInputStream fintput = new FileInputStream("fff/exam.csv");
			byte[] buf=new byte[1000];
			int len =fintput.read(buf);
			tt=new String (buf,0,len);
			
			
			fintput.close();
			} catch (IOException e) {
		
			e.printStackTrace();
		}

		
		String []arr =tt.split("\n");
		Stud [] st =new Stud [arr.length];
		String[]arr2;

		int jum ;
		String name;
		for (int i = 0; i < arr.length; i++) {
			arr2=arr[i].split(",");
			st[i]=new Stud(arr2[0],Integer.parseInt(arr2[1]),Integer.parseInt(arr2[2]),Integer.parseInt(arr2[3]));
		}

			
//			 int jum1 =Integer.parseInt(arr2[1]);
//			 int jum2 =Integer.parseInt(arr2[2]);
//			 int jum3 =Integer.parseInt(arr2[3]);
			
////		ddd[i]=new Stud(name,jum1,jum2,jum3);
//			 System.out.println(ddd[i]);
			
		
//		파일넣는부분
//		tt3이라가정
		try {
		FileOutputStream foutput = new FileOutputStream("fff/exam.csv");
		
		for (String ttt :tt3 ) {
			foutput.write((ttt+"\n").getBytes());
			
		}
		foutput.close();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}
	


