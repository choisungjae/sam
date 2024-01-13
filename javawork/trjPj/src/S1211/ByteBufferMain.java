package S1211;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteBufferMain {

	public static void main(String[] args) {
		
		
		try {
			byte [] arr1 = {23,45,55,66,77,88,12,98,76,54,32,25,57,68,23,12,66,54,43};

			ByteArrayInputStream bis = new ByteArrayInputStream(arr1);
			
			ByteArrayOutputStream bos= new ByteArrayOutputStream();
//			
			int data = bis.read();
			System.out.println(data);
			
			byte [] buf = new byte[7];
//			
			//bis.read(buf);
			bis.read(buf,2,3); 	//buf, 1부터, 가져올갯수  2번부터 3개를가져와라
			System.out.println(Arrays.toString(buf));
			bis.read(buf); 	
			System.out.println(Arrays.toString(buf));
//			bis.read(buf,4,6);    //자릿수 초과하면 에러 	
//			System.out.println(Arrays.toString(buf));
//
			int cnt = bis.read(buf); //cnt read 읽어온갯수 
			System.out.println(cnt+","+Arrays.toString(buf));
			cnt = bis.read(buf); //cnt read 읽어온갯수 
			System.out.println(cnt+","+Arrays.toString(buf));
			
			byte [] buf = new byte[5]; //1024 기본으로 씀
			
			while(bis.available()>0) {
				int len = bis.read(buf); //자리수 확인
				bos.write(buf,0,len);     //0부터 자리수까지넣어라.
				System.out.println(Arrays.toString(buf));
			}
			
			byte[] arr2= bos.toByteArray();
			
			
			bis.close();
			bos.close();
			System.out.println("arr1:   "+Arrays.toString(arr1));
			System.out.println("arr2:   "+Arrays.toString(arr2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}