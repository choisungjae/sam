package Mouum.SJ;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;
//키가 반 
//트리맵+트리셋 으로 
//정렬이 빡셈


enum type{
	   일반, 예체능
}
enum ban{
       반1,반2
}
enum gender{
	   남,여
}
class Stud{
	type ty;
	ban ba;
	gender gen;
	String name;
	int jum[];
	int avg,tot;
	int  arr;
	int rank=1;
	int rank2=1;
	public Stud(String ba, String sc,String gen, String name, int ...jum) {
		this.ty = type.valueOf(sc);
		this.ba=ban.valueOf(ba);
		this.gen=gender.valueOf(gen);
		this.name = name;
		this.jum = new int[] {jum[0], jum[1], jum[2]};
		calc();
	}
	void calc() {
		tot = 0;
		
		for (int j = 0; j < jum.length; j++) {
			tot += jum[j];
		}
		avg = tot/jum.length;
		
	}
	

      public String toString() {
		return ba+"\t"+ty + "\t"+gen+"\t" + name + "\t" + Arrays.toString(jum)+"\t"+tot+"\t"+avg+"\t"+rank+"\t"+rank2;
	}
}
		
class Studrank implements Comparator{

	public int compare(Object o1, Object o2) {
		Stud me=(Stud)o1; 
	    Stud you=(Stud)o2;
	    //반-타입-성별-평균순
	    int res =you.avg-me.avg;
	    
	    if(res==0) {//타입
	    	res =me.ty.compareTo(you.ty);
	    }
	    if(res==0) {//성별
	    	res =me.gen.compareTo(you.gen);
	    }
	    
	    if(res==0) {//평
			res=me.ba.compareTo(you.ba);//반
		}
	    if(res==0) {//이름
      		res=me.name.compareTo(you.name);
		}
	    return res;
		
	}
}
class Studban implements Comparator{

	public int compare(Object o1, Object o2) {
		Stud me=(Stud)o1; 
	    Stud you=(Stud)o2;
	    //반-타입-성별-평균순
	    int res =me.ba.compareTo(you.ba);//반
	    
	    if(res==0) {//타입
	    	res =me.ty.compareTo(you.ty);
	    }
	    if(res==0) {//성별
	    	res =me.gen.compareTo(you.gen);
	    }
	    
	    if(res==0) {//평
			res=you.avg-me.avg;
		}
	    if(res==0) {//이름
      		res=me.name.compareTo(you.name);
		}
	    return res;
		
	}
}

 

public class Tr1204 {

	public static void main(String[] args) {
		TreeSet one = new TreeSet(new Studrank());
		TreeSet one2 = new TreeSet(new Studban());
		/*
		 * totMap
		 * (1, TreeSet )
		 *     	TreeMapStud()
		 *     	TreeMapStud()
		 *     	TreeMapStud()
		 *     	TreeMapStud()
		 * (2, TreeSet)
		 * 		TreeMapStud()
		 *     	TreeMapStud()
		 *     	TreeMapStud()
		 *     	TreeMapStud()
		 * (3, TreeSet)
		 * 		TreeMapStud()
		 *     	TreeMapStud()
		 *     	TreeMapStud()
		 *     	TreeMapStud()
		 * */
	
		
		
		
		
		
		
        System.out.println("반\t타입\t성별\t이름\t    점수\t\t총점\t평균\t전체등수\t반등수  //등수정렬");
        System.out.println("---------------------------------------------------------------------------");
		one.add(new Stud("반1","일반","남","송중기",72,64,73));
		one.add(new Stud("반1","예체능","여","송혜교",72,95,88));
		one.add(new Stud("반1","일반","남","남주혁",99,88,83));
		one.add(new Stud("반1","예체능","여","박보영",72,93,53));
		one.add(new Stud("반2","예체능","남","하정우",72,73,23));
		one.add(new Stud("반2","일반","여","수지",52,93,63));
		one.add(new Stud("반1","예체능","남","백현",77,53,85));
		one.add(new Stud("반2","일반","여","아이유",65,53,73));
		one.add(new Stud("반2","일반","남","이정재",55,53,73));
		one.add(new Stud("반1","일반","여","이나영",82,83,73));
		one.add(new Stud("반2","일반","남","원빈",88,53,73));
		one.add(new Stud("반1","일반","여","고소영",92,43,73));
		one.add(new Stud("반2","예체능","남","장동건",72,33,73));
		one.add(new Stud("반1","예체능","여","츄",82,53,73));
		one.add(new Stud("반2","예체능","남","최민식",72,53,73));
		one.add(new Stud("반1","일반","여","김채원",72,14,73));
		one.add(new Stud("반2","일반","남","유아인",62,53,73));
		one.add(new Stud("반1","예체능","여","츄츄",62,82,79));
		one.add(new Stud("반2","일반","남","조승우",92,93,63));
		one.add(new Stud("반2","일반","남","김혜수",92,53,43));
        
		one2.addAll(one);	
		for (Object rank : one) {
			Stud you = (Stud)rank;
			for (Object rank2 : one) {
				Stud me = (Stud)rank2;
				if(me.avg < you.avg) {
			         if(me.ba.equals(you.ba)) {
			            me.rank2++;
			         }
			         me.rank++;
			      }
			}
		} 
		System.out.println(one);


        for (Object ob: one) {
		System.out.println(ob);
	}
        System.out.println();
        System.out.println("반\t타입\t성별\t이름\t    점수\t\t총점\t평균\t전체등수\t반등수 //반정렬");
        System.out.println("---------------------------------------------------------------------------");
        for (Object ob2: one2) {
    		System.out.println(ob2);
    	}
}
}

