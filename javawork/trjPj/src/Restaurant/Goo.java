package Restaurant;

import java.util.Arrays;

abstract class Jo {
	String kind, name;
	int[] jum;
	int dul, area;
	int pi = 3;
	
    public Jo(String kind, String name, int... jum) {
		this.kind = kind;
		this.name = name;
		this.jum = jum;
    }

	abstract void calc();

	void ppp() {
		calc();
		String ttt = kind+"\t"+dul+"\t"+area;
	
		System.out.println(ttt);
	}

}

class JoJo extends Jo {
	public JoJo(String name, int ban) {
		super("원", name, ban);
	}

	void calc() {
		dul = 2 * jum[0] * pi;
		area = jum[0] * jum[0] * pi;
	}
}
class JoJoJo extends Jo {
	public JoJoJo(String name, int ga, int se) {
		super("사각", name, ga, se);
	}

	void calc() {
		dul = 2 * (jum[0] + jum[1]);
		area = jum[0] * jum[1];
	}
}

class Mo extends Jo {
	public Mo(String name, int ga, int se, int bit) {
		super("삼각", name, ga, se, bit);}
		
	void calc() {
		dul = jum[0] + jum[1] + jum[2];
		area = (jum[0] * jum[1]) / 2;
	}
}

public class Goo {

	public static void main(String[] args) {

		Jo[] score = { new JoJo("원입니다", 2), 
				new JoJoJo("사각형입니다", 7, 6),
				new Mo("삼각형이다", 4, 7, 6),
				new JoJo("원입니다", 7)};
		for (Jo tt : score) {
			tt.ppp();
		}

	}

}
