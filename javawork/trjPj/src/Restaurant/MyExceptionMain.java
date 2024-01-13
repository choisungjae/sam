package Restaurant;

class MyExcep extends Exception{
	
	String [] arr= {"나는무너","나는무너22","나는무너33"};
	int no=1;
	
	public MyExcep(int no) {
		this.no=no;
	}
	
	public String getMessage() {
		return arr[no];
	}
}

public class MyExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("try 실행");
			throw new MyExcep(0);
			//throw new Exception("던진 에러메시지");
			
		}catch(Exception e) {
			System.out.println("예외처리:"+e.getMessage());
		}
		System.out.println("main 종료 ---------");

	}

}
