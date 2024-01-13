package Restaurant;

class FinalArtStud{
	
	String name;
	final int [] jum;
	final int tot,avg;
	
	FinalArtStud(String name,int kor,int eng,int mat,int art){
		super();
		this.name=name;
		this.jum=new int [] {kor,eng,mat,art};
		double[] rate= {0.2,0.15,0.05,0.6};
		
		
	}
	
	
}



public class FinalExamMain {

	public static void main(String[] args) {
		FinalArtStud st= new FinalArtStud("정우성",77,66,55,66);
		System.out.println();

	}

}
