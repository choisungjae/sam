package zam;

import java.util.Arrays;

class ParamStud{
	String name;
	int [] jum;
	int tot, avg;
	
	void init(String name, int kor, int eng, int mat) {
		this.name = name;
		jum = new int[] {kor, eng, mat};
	}
	
	void calc() {
		tot = 0;
		for (int j = 0; j < jum.length; j++) {
			
		
			tot += jum[j];
		}
		avg = tot/jum.length;
	} 
	
	void ppp() {
		System.out.println(name+"\t"+Arrays.toString(jum)+"\t"+tot+"\t"+avg);
	}
}

public class S평균점수이중배 {

	public static void main(String[] args) {
		
	
		
		String [] names = {
				"현빈","원빈","장희빈","커피빈","미스터빈"
		};
		int [][] arr = {
				{79,71,74},	
				{69,61,64},
				{89,81,84},
				{99,91,94},
				{59,51,54}
		};
		
		ParamStud [] studs = new ParamStud[names.length];
		for (int i = 0; i < studs.length; i++) {
			
			studs[i] = new ParamStud();
			studs[i].init(names[i], arr[i][0], arr[i][1], arr[i][2]);
			studs[i].calc();
			studs[i].ppp();
		}
		
		

	}

}
