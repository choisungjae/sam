package Restaurant;

import java.util.TreeSet;

class TrSawon2 implements Comparable{     
	String name;
	int jum;
	public TrSawon2(String name, int jum) {
		super();
		this.name = name;
		this.jum = jum;
	}
	@Override
	public String toString() {
		return name+"\t"+jum;
	}
	public int compareTo(Object o) {
		TrSawon2 you =(TrSawon2)o;
		System.out.println(this+":"+you);
		
		int res=you.jum -jum;
		
		if(res==0) {
			res=name.compareTo(you.name);
		}
		return res;
	}
	
}

public class ComparableMain {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new TrSawon2("현빈", 42));
		System.out.println("---------------");
		ts.add(new TrSawon2("원빈", 92));
		System.out.println("---------------");
		ts.add(new TrSawon2("김우빈", 82));
		System.out.println("---------------");
		ts.add(new TrSawon2("투빈", 92));
		System.out.println("---------------");
		ts.add(new TrSawon2("골빈", 42));
		System.out.println("---------------");
		ts.add(new TrSawon2("커피빈", 72));
		System.out.println("---------------");
		ts.add(new TrSawon2("젤리빈", 62));
		System.out.println("---------------");
		ts.add(new TrSawon2("장희빈", 2));
		System.out.println("---------------");
		ts.add(new TrSawon2("미스터빈", 52));
		System.out.println("---------------");
		ts.add(new TrSawon2("하얼빈", 82));
		System.out.println("---------------");
		ts.add(new TrSawon2("텅빈", 62));
		System.out.println("---------------");
		ts.add(new TrSawon2("자바빈", 32));
		System.out.println("---------------");
		
		for (Object ob : ts) {
			System.out.println(ob);
		}

	}

}