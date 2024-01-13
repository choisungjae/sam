package Restaurant;

public class TryCatchMain {

	public static void main(String[] args) {
		
		
		try {
			System.out.println("메인 시작----------------");
		
		int a =100/1;
		System.out.println("정상실행: "+a);
			int[]arr= {10,20,30,40};
			System.out.println("정상실행2: "+arr[1]);;
			
			String tt= "awsQwE";
			System.out.println("정상실행3:"+tt.toLowerCase());//소문자로 만들어 ㄹ ㅏ !
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 예외 처리 --------");
		}//상속 관계라면 부모가 밑에 있어야함 !!@
		catch(Exception e) {
			System.out.println("일반 예외 처리 --------"+e.getMessage());
		//e.printStackTrace();//오류 난곳을 추적해
			return;
		}finally {
			System.out.println("메인 끝----------------");
		}//이후에는 ㅋ ㅐ치가 몬들어옴 
		//try 는 단독으로 쓰일 수없음 .
		//파이날로 끝나면 밑에꺼 실행 안댐
		System.out.println("----------------------------------------");
		try {
			
		}catch(Exception e) {
			
		}System.out.println("---------------------");
         try {
			
		}finally {
			
		}System.out.println("---------------------");
		
	
	}

}
