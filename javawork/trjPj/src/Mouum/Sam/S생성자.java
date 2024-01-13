package zam;


import java.util.Arrays;




class ConstStud{
	String kind, name;
	int [] jum;
	int tot, avg;

	
	
	ConstStud(String name, int kor, int eng, int mat){
		kind = "일반";
		this.name = name;
		jum = new int[] {kor, eng, mat};
		genCalc();
	}
	
	ConstStud(String name, int kor, int eng, int mat, int art){
		kind = "예체능";
		this.name = name;
		jum = new int[] {kor, eng, mat, art};
		genCalc();
		artCalc();
	}
	
	void genCalc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
	}
	
	void artCalc() {
		double avg2 = 0;
		double [] rate = {0.2, 0.15,0.05,0.6};
		for (int i = 0; i < rate.length; i++) {
			avg2 += rate[i] * jum[i];
		}
		
		avg = (int)avg2;
	}
	
	
	void ppp() {
		System.out.println(kind+"\t"+name+"\t"+Arrays.toString(jum)+"\t"+tot+"\t"+avg);
	}
	
	
	void tot(ConstStud st){
		if(st.kind.equals(kind)) {
			for (int i = 0; i < jum.length; i++) {
				jum[i]+=st.jum[i];
			}
		}
	}
}

public class ConstExamMain {

	public static void main(String[] args) {
		ConstStud [] studs = {
			new ConstStud("현빈", 71, 78, 77),
			new ConstStud("원빈", 51, 78, 97,31),
			new ConstStud("투빈", 51, 78, 37,91),
			new ConstStud("김우빈", 61, 78, 87),
			new ConstStud("장희빈", 81, 78, 67),
			new ConstStud("젤리빈", 91, 38, 47,65),
			new ConstStud("미스터빈", 31, 98, 47,65),
			new ConstStud("텅빈", 91, 98, 97),
			new ConstStud("커피빈", 91, 98, 97,93),
			new ConstStud("골빈", 51, 58, 57)
		};
		
		String [] kind = {"일반","예체능"};
		
		ConstStud [] tot = {
				new ConstStud("합계", 0, 0, 0),
				new ConstStud("합계", 0, 0, 0,0)
		};
		
		//통계 처리
		for (ConstStud st : studs) {
			for (ConstStud tt : tot) {
				tt.tot(st);
			}
		}
		
		
		///출력
		for (String title : kind) {
			System.out.println(title+" >>>");
			
			for (ConstStud st : studs) {
				
				if(title.equals(st.kind)) {
					st.ppp();
				}
			}
			
		}
		
		for (ConstStud tt : tot) {
			tt.ppp();
		}

	}
	//주말 주문 통계데이터를 구현하세요 . 조 로
	
}
