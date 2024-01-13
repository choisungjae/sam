package Restaurant;

import java.util.Comparator;
import java.util.TreeSet;

enum SawonCC{
	부장, 과장, 대리, 사원
}
//이너 만들고 비교셋 만들고// @@@@매우 잘해야됨 @@@@@@@@ 이거 개중요함
class TrSawon{
	SawonCC sc;
	String name;
	int jum;
	
	public TrSawon(String sc, String name, int jum) {
		this.sc = SawonCC.valueOf(sc);
		this.name = name;
		this.jum = jum;
	}

	@Override
	public String toString() {
		return sc + "\t" + name + "\t" + jum;
	}
}

class SaCom implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
	    
		
		TrSawon me =(TrSawon)o1;
	    TrSawon you =(TrSawon)o2;
	    
	   
	    int res =me.sc.compareTo(you.sc);
		
		//타입이 같다면 평균비교
		if(res==0) {
			res=you.jum-me.jum;
		}
		//점수가 같다면 이름 비교
		if(res==0) {
      		res=me.name.compareTo(you.name);
				}
	    return res;
	}
	//맵
}//등수 계산은 add할떄 못한다잉? 
 //에드가 끝나고나서 등수 계산 

public class TreeSawonMain {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new SaCom());
		ts.add(new TrSawon("과장", "현빈", 72));
		ts.add(new TrSawon("부장", "원빈", 62));
		ts.add(new TrSawon("대리", "김우빈", 82));
		ts.add(new TrSawon("과장", "투빈", 92));
		ts.add(new TrSawon("사원", "골빈", 42));
		ts.add(new TrSawon("대리", "커피빈", 72));
		ts.add(new TrSawon("부장", "젤리빈", 62));
		ts.add(new TrSawon("사원", "장희빈", 2));
		ts.add(new TrSawon("과장", "미스터빈", 52));
		ts.add(new TrSawon("대리", "하얼빈", 82));
		ts.add(new TrSawon("사원", "텅빈", 62));
		ts.add(new TrSawon("사원", "자바빈", 32));
		
		for (Object ob : ts) {
			System.out.println(ob);
		}
	}

}