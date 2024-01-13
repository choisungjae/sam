package Restaurant;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.Spliterators;

public class ScannerExamMain {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("fff/exam.csv");
		Scanner sc = new Scanner(fis);
		
		
//		while(sc.hasNext()) {
//		for (int i = 0; i < 1; i++) {
		int tot[]=new int[5];
		int tt1[];
		int tt2[];
		int tt3[];
		int tt4[];
		int tt5[];
		   int avg[]=new int[5];
			String str = sc.nextLine();
			String str2 = sc.nextLine();
			String str3= sc.nextLine();
			String str4 = sc.nextLine();
			String str5 = sc.nextLine();

			String []a =str.split(",");
			String aa=a[0];
			String []b =str2.split(",");
			String bb=b[0];
			String []c =str3.split(",");
			String cc=c[0];
			String []d =str4.split(",");
			String dd=d[0];
			String []e =str5.split(",");
			String ee=e[0];
		
			int a1 = Integer.parseInt(a[1]);
			int a2 = Integer.parseInt(a[2]);
			int a3 = Integer.parseInt(a[3]);
			int b1 = Integer.parseInt(b[1]);
			int b2 = Integer.parseInt(b[2]);
			int b3 = Integer.parseInt(b[3]);
			int c1 = Integer.parseInt(c[1]);
			int c2 = Integer.parseInt(c[2]);
			int c3 = Integer.parseInt(c[3]);
			int d1 = Integer.parseInt(d[1]);
			int d2 = Integer.parseInt(d[2]);
			int d3 = Integer.parseInt(d[3]);
			int e1 = Integer.parseInt(e[1]);
			int e2 = Integer.parseInt(e[2]);
			int e3 = Integer.parseInt(e[3]);
			tt1 = new int[] {a1, a2, a3};
			tt2 = new int[] {b1, b2, b3};
			tt3 = new int[] {c1, c2, c3};
			tt4 = new int[] {d1, d2, d3};
			tt5 = new int[] {e1, e2, e3};
			String tttt[]=new String[] {aa,bb,cc,dd,ee};
//		System.out.println(a[0]);
//		System.out.println(b);
//		System.out.println(a[0]);
//		System.out.println(a[0]);
//		System.out.println(a[0]);
			int ttt[][]=new int[][] {
				{tt1[0],tt1[1],tt1[2]},
				{tt2[0],tt2[1],tt2[2]},
				{tt3[0],tt3[1],tt3[2]},
				{tt4[0],tt4[1],tt4[2]},
				{tt5[0],tt5[1],tt5[2]},
			};

				
//				System.out.println(ttt);
	
	for (int i = 0; i < 5; i++) {
        
           tot[i]=0;
			
			for (int j = 0; j < tt1.length; j++) {
//				System.out.println(i);
//			System.out.println(tot);
//				System.out.println(tt2);
				tot[i] += ttt[i][j];
			}
			avg[i] = tot[i]/(tt1.length);
			System.out.println("이름:"+tttt[i]+"         총합:"+tot[i]+"   평균:"+avg[i]);
	}
			
        sc.close();
		fis.close();
	}

}