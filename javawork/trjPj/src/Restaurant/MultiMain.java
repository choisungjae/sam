package Restaurant;


class Single{
	
	String name;
	
	public Single(String name) {
		this.name = name;
	}


	public void run() {
		for (int i = 0; i <50; i++) {
			System.out.print(name);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class FirstTh extends Thread{
	public FirstTh(String nn) {
		super(nn);  //getName()
	}
	
	@Override
	public void run() {
		for (int i = 0; i <100; i++) {
			System.out.print(getName());
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MultiMain {

	public static void main(String[] args) {
		Single ss1 = new Single("!");
		Single ss2 = new Single("@");
		Single ss3 = new Single("#");
		
		ss1.run();
		ss2.run();
		ss3.run();
		
		System.out.println("\n-------------------");
		FirstTh f1 = new FirstTh("$");
		FirstTh f2 = new FirstTh("^");
		FirstTh f3 = new FirstTh("%");
		
//		f1.run();
//		f2.run();
//		f3.run();
		f1.start();
		f2.start();
		f3.start();
		
		System.out.println("\n activeCount():"+Thread.activeCount());//몇개실행중이야
		System.out.println("\n cureentThread():"+Thread.currentThread());
       //[main,5,main] 쓰레드 이름, 우선순위 ,쓰레드그룹
		
		try {
			Thread.sleep(12000);       //12000 후 실행 (12초)
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}System.out.println("\n activeCount():"+Thread.activeCount());
	}//시간이흐르고 시간동안 문제를 풀게하고   시간이 끝나면 문제가 몇개를 맞았는지

}