package Restaurant;

import java.util.Arrays;

class ConstStud{
	String name,kind;
	int []jum;
	int tot,avg;
	
	ConstStud(String name,int kor,int eng,int mat){
		this("일반",name,kor,eng,mat);
		avg = tot/jum.length;
		ppp();
	}

	ConstStud(String name,int kor,int eng,int mat,int art){
		this("예체능",name,kor,eng,mat,art);
        avg = tot/jum.length;
		ppp();
	}
	
	
	
	ConstStud(String kind,String name,int...jum){ //위에 생성자다하고 실행
		this.kind=kind;
		this.name=name;
		this.jum=jum;
		
		tot=0;
		
		for (int i : jum) {
			tot+=i;
		}
		
		
	}
	void ppp() {
		String ttt=kind+"\t"+name+"\t"+Arrays.toString(jum)+"\t"+tot+"\t"+avg;
	System.out.println(ttt);
	}
}

public class ConstExamMain {

	public static void main(String[] args) {
//		ConstStud[] dd = new ConstStud[] {};
//		new ConstStud("원",33,44,55);
		
		new ConstStud("최성재",33,44,55);
		new ConstStud("최재성",33,66,44,55);

	}

}
