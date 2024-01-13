package zam;

import java.util.Arrays;

class mong{
	//도형 이름,둘레,넓이구하기
	//필요한변수 가로 세로 빗변 반지름,파이
	String name;
	double area,dul;//넓,둘
	double pi=3.14;
	
	
	void vo1(String name ) {
		 this.name =name;
		
	}
	void one(double ban	) {
		dul=2*ban*pi;
		area=ban*ban*pi;
	}//원둘2파이r 넓rr파이  
	void two(int ga,int se) {
		dul=2*(ga+se);
		area=ga*se;
	}//직사각둘2*가+세 넓 가*세
	void three(int ga,int se,int bit) {
	    dul=ga+se+bit;
	    area=(ga*se)/2;
}//직삼각둘 가+세+빗 넓 가*세/2
	void go() {
		System.out.println(name+"\t"+dul+"\t"+area);
	}
}
public class Z도형 {

	public static void main(String[] args) {
		
		mong ui= new mong();
		//원시데이터
		String[] name2 = {"원","직사각형","직삼각형",
				};
		
		int[][]score= {
				{42,77},
				{2},
				{24,43,55},
				{11,12,55},
				{24,43},
				{4},
				
		};	
		
		//1원2직사3직삼//출력
		System.out.println("이름\t둘레\t넓이");
		for ( int i = 0; i < score.length; i++) {
			if(score[i].length==1) {
				ui.vo1(name2[0]); 
				ui.one(score[i][0]);
			}else if(score[i].length==2) {
				ui.vo1(name2[1]);
				ui.two(score[i][0],score[i][1]);
			}else if(score[i].length==3) {
				ui.vo1(name2[2]);
				ui.three(score[i][0],score[i][1],score[i][2]); 
			} ///위 클래스 연산부에 올려보기 ,
			
		
			ui.go();	
		}

	}
}