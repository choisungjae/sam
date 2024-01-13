package Restaurant;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int no =sc.nextInt();
		System.out.println(no*50);
		
		String str = sc.next();
		System.out.println("문자열:"+str);
		sc.nextLine();      //이거로 한번 상쇄해줘야함 
		str=sc.nextLine();  //위의 엔터가 남아 입력처리됨 윗줄   //넥스트라서 ,  넥스트라인은 괜찮음;
		System.out.println("문자열2:"+str);
		
		str=sc.nextLine();  //위의 엔터가 남아 입력처리됨 윗줄 
		System.out.println("문자열3:"+str);
		
		double dd =sc.nextDouble();
		System.out.println("더블:"+dd);
		
		float ff= sc.nextFloat();
		System.out.println("플뤗!:"+ff);
		
		byte bb=sc.nextByte();
		System.out.println("바잇트:"+bb);
		
		short sh =sc.nextShort();
		System.out.println("숏츠:"+sh);
		
		long ll =sc.nextLong();
		System.out.println("롱:"+ll);
		
		boolean bo =sc.nextBoolean();   //true false 입력하여야 함 
		System.out.println("불린:"+bo);
		
		
		
		
		
		
		
		
		
		
		sc.close();//다 쓰고 닫아줘야함// Stream 기반은 종료가 필요하다 //마지막에 닫은게 저장이된다
		
		

	}

}
