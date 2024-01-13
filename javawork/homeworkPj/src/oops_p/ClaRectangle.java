package oops_p;

class zigsa{
	int n;//넓이
	int s;//세로
	int g;//가로
	int d;//둘레
	String j;

	void i () {
		System.out.println(j+":"+"가로:"+g+" 세로:"+s+" ------->"+" 넓이:"+n+" 둘레:"+d);
	
		
	}
}




public class ClaRectangle {

	public static void main(String[] args) {
		
		
		zigsa pp = new zigsa();
		pp.j = "정우성";
		pp.g = 5;
		pp.s = 6;
		pp.n = pp.g * pp.s;
		pp.d = (pp.g + pp.s)*2;

		
		pp.i();
		
		
		
		
		/*
		 /// 직사각형 클래스를 정의하고 직사각형 넓이와 둘레를 출력하세요
			넓이 : 가로 * 세로
			둘레 : (가로 + 세로) * 2
			ClaRectangle
			
			출력내용 : 가로,세로,넓이,둘레
			5, 6  -->  30, 22
			10,7 -->  70,  34 
		 * */
		
		
		
		
		
		
		
	}

}
