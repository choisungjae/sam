package text_p;

class SRS extends Thread{
	public SRS (String name) {
		super(name);
	}
	
	
	public void run() {
		for (int i =0;i<500; i++) {
			System.out.println(getName());
		try {
			sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		
		}
			
		}
	}
}


public class SRSMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SRS s1= new SRS("*");
		SRS s2= new SRS("**");
		SRS s3= new SRS("***");
		
		System.out.println("start 전 : "+ Thread.activeCount());
		s1.start();
		s2.start();
		s3.start();
		System.out.println("start 후 : "+ Thread.activeCount());
		
		Thread.sleep(2000);
		s1.suspend();   //일시정지
		System.out.println("s1.suspend():"+Thread.activeCount());
		s1.resume();     //일시정지 해제
		s1.stop();       //정지
		
	    //동영상 플레이어를 구현하세요 
		//뒤로재생,재생(정지취소),일시정지,정지
		//재생중 -자막 출력 
		
	}

}
