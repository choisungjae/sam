package S1211;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteOutputMain성재풀이 {

	public static void main(String[] args) {
//		FileInputStream fis = new FileInputStream("fff/exam2.txt");
//		for (String str : new String(fis.readAllBytes()).split("\n")) {
//			arr.add(new FileStud(str));
//		} 
		//다읽어오기 fis.readAllbytes()    read 강화ver


	
	int i =0;
	byte []arr3 = new byte[5];
	byte []arr2 = {3,20,127,3,-128,-2,3,10,-1,50,111};
	ByteArrayInputStream biss=new ByteArrayInputStream(arr2);
	while(biss.available()>0) {                //다음꺼있는지 확인 false 될떄까지,
		int datat=biss.read();                 //읽기
//		byte[] ddd=biss.readAllBytes();
//		      for (byte b : ddd) {
//				System.out.println(b);
//			}       
		
		
			if(datat%2==0) {

				arr3[i]+=datat;
//				System.out.println("원소 읽기");
				System.out.println(datat);

				i++;
				}
		}System.out.println();	

		try {
			
			biss.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		
	
	ByteArrayOutputStream bos2 = new ByteArrayOutputStream();
	for (int j = 0; j < arr3.length; j++) {
		bos2.write(arr3[j]);
	}
	
	byte []arr5 =bos2.toByteArray();
	
	
	
     try {
            bos2.close();
				
			} catch (IOException e) {

				e.printStackTrace();
			}
     System.out.println("짝수구성스트림:"+Arrays.toString(arr5));
	    }
	}
