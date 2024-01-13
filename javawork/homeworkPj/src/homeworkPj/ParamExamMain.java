package homeworkPj;

package oops_p;

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
		for (int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
	}
	
	void ppp() {
		System.out.println(name+"\t"+Arrays.toString(jum)+"\t"+tot+"\t"+avg);
	}
}

public class ParamExamMain {

	public static void main(String[] args) {
		ParamStud st = new ParamStud();
		st.init("장동건", 78, 79, 71);
		st.calc();
		st.ppp();

	}

}