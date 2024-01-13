package homeworkPj;

import java.util.Arrays;

class ff {

	void void_1(String aaa, int a) {
  // void 
		int pi = 3;
		int area = a * pi;
		int gg = a * a * pi;

		System.out.println(aaa + " 넓이 :" + area + " 둘레:" + gg);
	}

	void circle(String aa, int r, int t) {

		int pi = 3;
		int bb = r * t * pi;

		int abc = r * pi * 2;
		System.out.println(aa + " 넓이 :" + bb + " 둘레:" + abc);

	}

	void triAngle(String aaa, int c, int d, int e) {
		int top = c * d / 2;
		int top2 = c + d / 3;
		System.out.println(aaa + " 넓이 :" + top + " 둘레:" + top2);
	}
//   void ppp() {
//		System.out.println(aaa+" 넓이 :"+area+" 둘레:"+border+aa+" 넓이 :"+bb+" 둘레:"+abc);
//	}

}

public class SSDWDWDWDW {

	public static void main(String[] args) {

		ff st = new ff(); //연결

		String[] names = { "원", "사각형", "삼각형" };

		int[][] arr = { 
				{ 3 }, 
				{ 10, 2 }, 
				{ 20, 1, 34 },

		};

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length == 1) {
				st.void_1(names[i], arr[i][0]);
			} else if (arr[i].length == 2) {
				st.circle(names[i], arr[i][0], arr[i][1]);
			} else if (arr[i].length == 3) {
				st.triAngle(names[i], arr[i][0], arr[i][1], arr[i][2]);
			}
		}

//		ff[] name_2 = new ff[names.length];
//		for (int i = 0; i < name_2.length; i++) {
//
//			name_2[i] = new ff();
//
//			name_2[i].void_1(names[i], arr[i][0]);
//			name_2[i].circle(names[i], arr[i][0], arr[i][1]);
//			name_2[i].triAngle(names[i], arr[i][0], arr[i][1], arr[i][2]);
//
//		}

	}
}
