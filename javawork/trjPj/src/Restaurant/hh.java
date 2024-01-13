package Restaurant;

import java.util.Arrays;

class ParStud{
	String kind, name;
	int [] jum;
	int avg;
	
	int getTot() {
		int tot = 0;
		for (int i : jum) {
			tot += i;
		}
		return tot;
	}
	
	void ppp() {
		String ttt = kind+"\t"+name+"\t"+Arrays.toString(jum)
						 +"\t"+getTot()+"\t"+avg;
		System.out.println(ttt);
	}
}

class GenStud extends ParStud{
	
	public GenStud(String name, int kor, int eng, int mat) {
		kind = "일반";
		this.name = name;
		jum = new int [] {kor, eng, mat};
		
		calc();
	}
	
	void calc() {
		avg = getTot()/jum.length;
	}
}

class ArtStud extends ParStud{
	
	public ArtStud(String name, int kor, int eng, int mat, int art) {
		kind = "예체능";
		this.name = name;
		jum = new int [] {kor, eng, mat, art};
		
		calc();
	}
	
	void calc() {
		double buf = 0;
		double [] rate = {0.2,0.15,0.05,0.6};
		for (int i = 0; i < rate.length; i++) {
			buf+=rate[i]*jum[i];
		}
		avg = (int)buf;
	}
}

public class hh{

	public static void main(String[] args) {
		GenStud gs = new GenStud("장동건", 37, 68, 92);
		ArtStud as = new ArtStud("장서건", 37, 58, 72,94);
		gs.ppp();
		as.ppp();

	}

}