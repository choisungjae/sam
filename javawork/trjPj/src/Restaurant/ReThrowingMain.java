package Restaurant;

class ReThrow{
	
	void meth_1() throws Exception {
		System.out.println("meth_1 시작");
		try {
			meth_2();
		} catch (Exception e) {
			System.out.println(">>>m1예외처리:"+e.getMessage());
			throw e;
		}
		System.out.println("meth_1끝");
	}
	void meth_2() throws Exception {
		System.out.println("\tmeth_2 시작");
		try {
			meth_3();
		} catch (Exception e) {
			System.out.println(">>>m2예외처리:"+e.getMessage());
			throw e;
		}
		System.out.println("\tmeth_2 끝");
	}
	void meth_3() throws Exception{
		System.out.println("\t\tmeth_3 시작");
		try {
			throw new Exception("m3 에러발생");
		}catch(Exception e){
			System.out.println(">>>m3예외처리:"+e.getMessage());
			throw e; //rethrowing 리 뛰로잉~ > 에러 다시 던졋
		}
		//System.out.println("\t\tmeth_3  끝");
	}
}

public class ReThrowingMain {

	public static void main(String[] args) throws Exception {
		System.out.println("main 시작");
		ReThrow rt= new ReThrow();
		try {
			rt.meth_1();
		} catch (Exception e) {
			System.out.println(">>>main예외처리:"+e.getMessage());
			throw e;
		}
	}

}
