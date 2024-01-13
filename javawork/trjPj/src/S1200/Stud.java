
package S1200;

//Outer - 반 
//반을 만들고 그 반에서 학생들을 가지고있음
// 그반마다 일반,특기생있음
//Inner - 학생시험
//구분,이름,국,영,수,총점,평균
class Studone{
	String name;
	int en,ma,gug;
	public Studone(int ...jum) {

        
		this.en = jum[0];
		this.ma = jum[1];
		this.gug = jum[2];
	}
	public String toString() {
		
		return name+","+en+","+ma+","+gug;
	}
}
class Studtwo{
		String name;
		Studone [] jum ;
		int avg,tot;
		public Studtwo(String name,int...jum) {
			System.out.println(name);
			System.out.println(jum);
			this.name=name;
			this.jum=new Studone[jum.length];
			System.out.println(jum);
			
			for (int i = 0; i < jum.length; i++) {
				this.jum[i] =new Studone(jum[i]);
			}
		}
		
		class kind{
			String name,kind;
			
			public kind(String name) {
				this.name=name;
			}
			
			void calc(int ...jum) {
				tot = 0;
				for (int i : jum) {
					tot += i;
				}
				avg=tot/jum.length;
				
				if(jum.length==3) {
					kind="일반학생";
				}else if(jum.length==4) {
					kind="특기생";
				}
			}
		}
	}





public class Stud {
	
	public static void main(String[] args) {
		Studtwo oneban = new Studtwo(
				"조용히좀해새끼야",30,40,90);
//		studtwo twoban = new studtwo(
//				"김학구",50,70,40);
//		studtwo oneban = new studtwo(
//				"김입구",30,50,40);
//		studtwo twoban = new studtwo(
//				"김머구",50,70,40);	
	}
	
}


	
				
				
			
	