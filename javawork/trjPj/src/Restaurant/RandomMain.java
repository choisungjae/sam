package Restaurant;

import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		Random rd = new Random();
		
		System.out.println(rd.nextBoolean());
//		System.out.println(rd.nextint());
		System.out.println(rd.nextLong());
		System.out.println(rd.nextFloat());
		System.out.println(rd.nextDouble());
		System.out.println(rd.nextGaussian());
		System.out.println("---------------------------");
		System.out.println(rd.nextInt(5));//0~5 사이 랜덤
		System.out.println(rd.nextInt(5,8));// 5~8 랜덤
		System.out.println(rd.nextLong(5));
		System.out.println(rd.nextLong(5,9));
		System.out.println(rd.nextFloat(5));
		System.out.println(rd.nextFloat(5,7));
		System.out.println(rd.nextDouble(5));
		System.out.println(rd.nextDouble(5,7));
		System.out.println("--------------------");
		
		Random r1 =new Random();
		Random r2 =new Random(23);
		Random r3 =new Random(23);
		Random r4 =new Random(16);
		
		System.out.println("r1>>>");
		for (int i = 0; i < 5; i++) {
			System.out.println(r1.nextInt());
		}System.out.println("r2>>>");
		for (int i = 0; i < 5; i++) {
			System.out.println(r2.nextInt());
		}System.out.println("r3>>>");
		for (int i = 0; i < 5; i++) {
			System.out.println(r3.nextInt());
		}System.out.println("r4>>>");
		for (int i = 0; i < 5; i++) {
			System.out.println(r4.nextInt());
		}
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		System.out.println(Math.random());
		
	}

}
