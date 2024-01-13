package Restaurant;

import java.util.Arrays;

abstract class DMStud{
	String kind,name;
	int [] jum;
	int tot, avg;

	DMStud(String kind, String name, int... jum) {
		
		this.kind = kind;
		this.name = name;
		this.jum = jum;
		calc();
	}
	//void calc() {}
	abstract void calc();
	void ppp() {
		
		String ttt = kind+"\t"+name+"\t";
		ttt+=Arrays.toString(jum)+"\t";
		ttt+=tot+"\t"+avg;
		System.out.println(ttt);
	}
}
class DMGenStud extends DMStud{
	
	DMGenStud(String name, int kor, int eng, int mat) {
		super("일반",name,kor,eng,mat);
	}
	
	void calc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot / jum.length;
	}
	void ppp() {
		
		String ttt = kind+"\t"+name+"\t";
		ttt+=Arrays.toString(jum)+"\t\t";
		ttt+=tot+"\t"+avg;
		System.out.println(ttt);
	}
}

class DMArtStud extends DMStud{
	
	DMArtStud(String name, int kor, int eng, int mat, int art) {
		super("예능",name,kor,eng,mat,art);
	}
	
	void calc() {
		tot = 0;
		double buf = 0;
		double [] rate = {0.2, 0.15, 0.05, 0.6};
		for (int i = 0; i < rate.length; i++) {
			buf += rate[i] * jum[i];
			tot += jum[i];
		}
		avg = (int)buf;
	}
}

public class DMExamMain {

	public static void main(String[] args) {
		DMStud [] studs = {
			new DMGenStud("차은우", 97, 68, 32),
			new DMArtStud("커피은우", 97, 78, 52, 34),
			new DMGenStud("라떼은우", 37, 68, 92),
			new DMArtStud("스무디은우", 37, 58, 72, 94),
			new DMArtStud("바이크은우", 67, 68, 62, 64),
			new DMGenStud("기차은우", 67, 68,62)
		};

		for (DMStud st : studs) {
			st.ppp();
		}
	}
	/*

	  * 도형 클래스를 추상화하여 구현하세요

	  * 부모
	  * 클래스: 도형 
	  * calc() - 추상메소드

	  * 자식
	  * 클래스 : 
	  * 직사각형(가로, 세로) 
	  * 원(반지름)
	  * 직각삼각형(밑변,높이, 빗변)
	  * calc() 를 이용하여  도형이름, 넓이, 둘레    를 출력하세요


	  * */


}