package text_p;

class Joint extends Thread{
    
	
	public Joint(String name) {
		
		super(name);
	}
    
    public void run() {
		for (int i =0;i<100; i++) {
			System.out.print(getName());
		try {
			sleep(10);
		} catch (InterruptedException e) {
//			e.printStackTrace();
			System.out.println(getName()+"인터럽트요청");
		
		}
			
		}
	}
}

public class JoinInterruptMain {  // 대기상태 : sleep( ), join( ), wait( )


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Joint j1 =new Joint("@");
		Joint j2 =new Joint("#");
		Joint j3 =new Joint("$");

		j1.start();
		j1.join();    //자신의 쓰레드만 실행하고 다른 쓰레는실행못하게함
		Thread.sleep(1000);
		j1.interrupt();
		j2.start();
		j2.join(2000); //2초 동안만 홀딩
		
		j3.start();
		System.out.println("\n 메인 sleep 시작");
		Thread.sleep(1000);
		System.out.println("\n 메인 sleep 끝");
		j3.interrupt();
		
//		j1.join(); start 이후에는 의미없음
		
		
	}
	
	

}
