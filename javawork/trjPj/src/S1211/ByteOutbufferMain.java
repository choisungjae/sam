package S1211;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteOutbufferMain {

	public static void main(String[] args) {
		
		
		            //아웃풋이 쓰는거임
		try {ByteArrayOutputStream bos= new ByteArrayOutputStream();
			
		
			bos.write(50);
			bos.write(51);
			bos.write(52);
			
			byte [] arr = bos.toByteArray();
			System.out.println(Arrays.toString(arr));
		
		
		byte [] buf1 = {11,22,33,44,55,66,77,88};
		
		bos.write(buf1,2,3);  //버프1에 2번부터 3개를 넣음 
		
		arr= bos.toByteArray();
		
		System.out.println(Arrays.toString(arr));
		bos.write(buf1);
		
		System.out.println();
		
		
		
		bos.close();
		
		
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
