package S1200;

class PriorityTh extends Thread{
	
	PriorityTh(String name){
		super(name);
	} 
	
		public void run() {
			for (int i = 0; i < 50; i++) {
				System.out.print(getName());
			}
		}




}

public class PriorityMain {

	public static void main(String[] args) {
		
		PriorityTh p1 =new PriorityTh("@");
		PriorityTh p2 =new PriorityTh("$");
		PriorityTh p3 =new PriorityTh("#");
		System.out.println(p1.getPriority());
		p1.setPriority(1);
		p1.setPriority(5);
		p1.setPriority(10);
		
		p1.start();
		p2.start();
		p3.start();
		
	}

}