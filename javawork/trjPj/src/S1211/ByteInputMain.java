package S1211;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteInputMain {

	public static void main(String[] args) {
	   
//		byte []arr = {3,20,127,3,-128,-2,3,10,-1,50,111};
//		System.out.println(Arrays.toString(arr));
//		
//		ByteArrayInputStream bis=new ByteArrayInputStream(arr);
////1스트림 생성
//		
//		System.out.println("bis 생성");
//////2. 스트림 읽기
////		System.out.println(bis.available()); //읽을꺼 있냐? 남은갯수 표기 [10]
////		System.out.println(bis.read());      //차례대로 1개씩 읽어오기
////		System.out.println(bis.read());
////		System.out.println(bis.read());
////		System.out.println(bis.read());
////		System.out.println(bis.read());
////		System.out.println(bis.read());
////		System.out.println(bis.read());
////		System.out.println(bis.read());
////		System.out.println(bis.read());
////		System.out.println(bis.read()); 
////		//-1넣으면 255출력 ,음수일경우 int로 변환된 양수로 리턴 
////		System.out.println(bis.read());         //읽을게없으면 인트 -1로 들어옴
////		
//		while(bis.available()>0) {
//			int data=bis.read();
//			
//			System.out.println(data+":"+(byte)data);
//		}
//		
//		
//		
//		
//		try {
////3 . 스트림 닫기 
//			bis.close();
//			System.out.println("bis 닫기");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		/*
		 * {3,20,127,3,-128,-2,3,10,-1,50,111};
		 * stream을 이용하여 원소를 읽으세요
		 * 짝수로 구성된 배열을 만드세요
		 * 
		 * 
		 * */
		int i =0;
		byte []arr3 = new byte[6];
		byte []arr2 = {3,20,127,3,-128,-2,3,10,-1,50,111};
		ByteArrayInputStream biss=new ByteArrayInputStream(arr2);
		while(biss.available()>0) {                //다음꺼있는지 확인 false 될떄까지,
			int datat=biss.read();                 //읽기
//			System.out.println(datat);
			
				if(datat%2==0) {
//					for (int i = 0; i < arr2.length; i++) {
//						arr3[i]+=datat;
//					}
					arr3[i]+=datat;
					System.out.println(datat);
//				arr3[i]+=datat;
					i++;
				
//				System.out.println(datat+",");
					}
				
//			System.out.println(Arrays.toString(arr3));
				
			}System.out.println();	
		System.out.println(Arrays.toString(arr3));
			
//		while(biss.available()>0) {
//			int datat=biss.read();
//			System.out.println(datat);
//			
//			if(datat%2==0) {
//			System.out.print(datat+",");}
//			
		
//		
//		
//	}

}}
