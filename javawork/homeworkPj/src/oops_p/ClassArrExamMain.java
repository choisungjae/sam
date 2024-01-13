package oops_p;

import java.util.Arrays;

/*
학생정보 클래스
필드(멤버변수) - 이름, 점수, 총점, 평균, 등급
메소드 - 출력
*/

// 클래스 정의
class ClaStud{
	String name;	//이름
	int [] jum;		//점수
	int tot, avg;	//총점,평균
	char grade;
	
	void ppp() {
		System.out.println(name+"\t"+Arrays.toString(jum)+"\t"+tot+"\t"+avg+"\t"+grade);
	}
}

public class ClassArrExamMain {

	public static void main(String[] args) {
		
		//인스턴스변수 선언 = 인스턴스 생성
		ClaStud st1 = new ClaStud();
		
		st1.name = "정우성";
		st1.jum = new int[] {78,79,91};
		st1.tot = 0;
		for (int i: st1.jum) {
			st1.tot += i;
		}
		st1.avg = st1.tot/st1.jum.length;
		
		char [] title = {'가','가','가','가','가','가','양','미','우','수','수'};
		st1.grade = title[st1.avg/10];
		//인스턴스 메소드 호출
		st1.ppp();

		/*
		 /// 직사각형 클래스를 정의하고 직사각형 넓이와 둘레를 출력하세요
			넓이 : 가로 * 세로
			둘레 : (가로 + 세로) * 2
			ClaRectangle
			
			출력내용 : 가로,세로,넓이,둘레
			5, 6  -->  30, 22
			10,7 -->  70,  34 
		 * */
		
		
		
	}

}
