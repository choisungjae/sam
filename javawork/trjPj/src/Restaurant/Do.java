package Restaurant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
class DoDo implements Comparable{ 

	String name;
	int[] jum;
	Integer dul,area;
	int pi=3;
	 public int compareTo(Object o) {
			
			DoDo you =(DoDo)o;
			
			int res=you.name.compareTo(name);
			
		
			if(res==0) {
				res=area.compareTo(you.area);
			}

			if(res==0) {
				res=dul.compareTo(you.dul);
//				
			}
			if(name==you.name&&area==you.area&&dul==you.dul) {
				return 0;
			}
			return res;
			}
	
	public DoDo(String name, int ban) {
		super();
		this.name = name;
        
		dul=2*ban*pi;
		area=ban*ban*pi;
		
		
	}
	public DoDo(String name, int ga,int se) {
		super();
		this.name = name;
		dul=2*(ga+se);
		area=ga*se;
		
	}
	public DoDo(String name, int ga,int se,int bit) {
		super();
		this.name = name;
	
	
		dul=ga+se+bit;
		area=(ga*se)/2;
	}
	@Override
	public String toString() {
		return name+"\t둘레:"+dul+"\t넓이"+area;
	}
   
}
public class Do {

	public static void main(String[] args) {
//		TreeSet tt = new TreeSet();
		ArrayList tt =new ArrayList();
		tt.add(new DoDo("원",33));
		tt.add(new DoDo("원",33));
		tt.add(new DoDo("원",33));
		tt.add(new DoDo("원",33));
		tt.add(new DoDo("원",34));
		tt.add(new DoDo("삼각형",44,33,44));
		tt.add(new DoDo("사각형",33,88));
		tt.add(new DoDo("원",22));
		tt.add(new DoDo("사각형",13,12));
		tt.add(new DoDo("사각형",33,10));
		tt.add(new DoDo("삼각형",11,22,33));
		tt.add(new DoDo("직각사각형",33,10));
		tt.add(new DoDo("직각사각형",31 ,10));
		tt.add(new DoDo("성재사각형",32,10));
		tt.add(new DoDo("성재사각형",33,10));
		
	
		TreeMap tr= new TreeMap();
		//입력부
		for (Object object : tt) {
			DoDo one= (DoDo)object;
			TreeSet kind =null;
			
			if(tr.containsKey(one.name)) {
				kind=(TreeSet)tr.get(one.name);
			}else {
				kind= new TreeSet();
				tr.put(one.name, kind);
			}
			
			kind.add(one);
		}
		//출력부
		for(Object object : tr.entrySet()) {
			Map.Entry medo =(Map.Entry)object;
			System.out.println(medo.getKey()+">>>");
			for(Object one:(TreeSet)medo.getValue()) {
				System.out.println(one);
			}
		}
		
		
//		for (Object ob : tt) {
//			System.out.println(ob);
//		}

	}

}
