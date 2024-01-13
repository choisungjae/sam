package Restaurant;

import java.util.Arrays;

class OvStud{
	String kind, name;
	int [] jum;
	int avg;
	
	OvStud() {
	}
	
	OvStud(String name, int kor, int eng, int mat) {
		kind = "일반";
		this.name = name;
		this.jum = new int[] {kor, eng, mat};
	}

	int getTot() {
		int tot = 0;
		for (int i : jum) {
			tot += i;
		}
		return tot;
	}
	
	void calc() {
		avg = getTot()/jum.length;
	}
	
	void ppp() {
		
		calc();
		String ttt = kind+"\t"+name+"\t"+Arrays.toString(jum)
						 +"\t"+getTot()+"\t"+avg;
		System.out.println(ttt);
	}
}

class OvSpec extends OvStud{
	OvSpec(String name, int kor, int eng, int mat, int art) {
		kind = "예체능";
		this.name = name;
		this.jum = new int[] {kor, eng, mat, art};
	}
	
	void calc() {  //overriding
		double buf = 0;
		double [] rate = {0.2,0.15,0.05,0.6};
		for (int i = 0; i < rate.length; i++) {
			buf+=rate[i]*jum[i];
		}
		avg = (int)buf;
	}
}


public class OverridingExamMain {

	public static void main(String[] args) {
		OvStud os = new OvStud("장동건", 37, 68, 92);
		OvSpec as = new OvSpec("장서건", 37, 58, 72,94);
		os.ppp();
		as.ppp();
	}

}