package S1200;


class ThWork extends Thread{
	@Override
	public void run() {
		
		int in = (int)(Math.random()*3);
		int com = (int)(Math.random()*5);
		int jj = (int)(Math.random()*20);
		String arr2= "우량우";
		String arr[]= {"벤치머신","런닝머신","댄스머신","천국의계단","힐링머신"};
//		for (int k = 0; k < arr.length; k++) {
			
		
		for (int i = 1; i <=jj; i++) {
			
			System.out.println(arr2+"가"+arr[com]+"을 "+i+"개째 아챠챠");
			
			
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
//			}
		}}System.out.println("김치우 오운완");
	}
}
class ThWork2 extends Thread{
	@Override
	public void run() {
		
		int in = (int)(Math.random()*3);
		int com = (int)(Math.random()*5);
		int jj = (int)(Math.random()*20);
		String arr2[]= {"김치워"};
		String arr[]= {"벤치머신","런닝머신","댄스머신","천국의계단","힐링머신"};
//		for (int k = 0; k < arr.length; k++) {
			
		
		for (int i = 1; i <=jj; i++) {
			System.out.println(arr2[0]+"가"+arr[com]+"을 "+i+"개째 아챠챠");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
//			}
		}}System.out.println("김치워 오운완");
	}
}
class ThWork3 extends Thread{
	@Override
	public void run() {
		
		int in = (int)(Math.random()*3);
		int com = (int)(Math.random()*5);
		int jj = (int)(Math.random()*20);
		String arr2[]= {"김지우"};
		String arr[]= {"벤치머신","런닝머신","댄스머신","천국의계단","힐링머신"};
//		for (int k = 0; k < arr.length; k++) {
			
		
		for (int i = 1; i <=jj; i++) {
			System.out.println(arr2[0]+"가"+arr[com]+"을 "+i+"개째 아챠챠");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
//			}
		}}System.out.println("김지우 운동끝");
	}
}

class DaemonOp extends Thread{
	@Override
	int jum;
	public void run() {
		
	}
}

public class DaemonMain {

	public static void main(String[] args) {
		DaemonOp dop = new DaemonOp();
		ThWork th = new ThWork();
		ThWork2 tj = new ThWork2();
		ThWork3 tk = new ThWork3();
		dop.setDaemon(true);
		th.start();
		tj.start();
		tk.start();
		dop.start();
		
		//dop.setDaemon(true);  start() 이후에 설정불가

	}

}

