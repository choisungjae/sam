package Mouum.SJ;

import java.util.ArrayList;
import java.util.HashSet;

public class Bingo {

	public static void main(String[] args) {

		HashSet bing = new HashSet();

		while (true) {
			int no = (int) (Math.random() * 100 + 1);

			bing.add(no);

			if (bing.size() == 25) {
				break;
			}
		}

		int i = 0;

		for (Object ob : bing) {
			
			i++;
			System.out.print(ob+"\t");
			if (i % 5 == 0) {
				System.out.println();
			}

		}
	}
}
