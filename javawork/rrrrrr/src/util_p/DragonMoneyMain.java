package util_p;




//음식 (조리시간): 
//스테이크(5분) : 11000, 
//파스타(3분)  7000, 
//피자(7분)   9000,
//
//주방장 - 3명
//
//손님 - 5명 : 
//식사 가능 시간 - 2시간
//각 식사시간 10~30분 랜덤
//최대 식사 갯수 : 4개
//식사 후
//손님 각각 결재금액 출력
//*/
class Chef{
	int totalfood = 100;
	String menu = "";
	int test = 0;
	synchronized boolean cook(int gg) {
		String aa [] = {"","스테이크","파스타","피자"};
		int cntt = (int)(Math.random()*3)+1;
		
		boolean res = false;
		menu = aa[cntt];
		System.out.println("1번 쉐프가 "+menu+"조리시작했습니다.");


		if(res = totalfood >= gg) {
			System.out.println(res);
		
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		if(menu.equals("스테이크")) {
			
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		if(menu.equals("파스타")) {
			
			
			try {
				Thread.sleep(1800);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		if(menu.equals("피자")) {
			
			
			try {
				Thread.sleep(4200);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println(menu+"가 완료되었습니다. 가져가세요.");
//		System.out.println(res);
		return res;
		
		
	}
}
//class Chef2{
//	
//}
//class Chef3{
//	
//}

class Guest extends Thread{
	Chef ch;

	public Guest(Chef ch, String name) {
		super(name);
		this.ch = ch;
	}
	
	@Override
	public void run() {
		int sta = 11000;
		int pas = 7000;
		int piz = 9000;
		int gue1 =0;
		int gue2 =0;
		int gue3 =0;
		int gue4 =0;
		int gue5 =0;
		while(ch.totalfood > 0) {
			int gu = (int)(Math.random()*5)+1;
//			int gg=5;
			
			if(ch.cook(gu)) {
			
				ch.totalfood -= gu;
				if(gu == 1) {
					if(ch.menu.equals("피자")) {
						gue1 += piz;
					}else if(ch.menu.equals("파스타")) {
						gue1 += pas;
					}else {
						gue1 += sta;
					}
				}
				if(gu == 2) {
					if(ch.menu.equals("피자")) {
						gue2 += piz;
					}else if(ch.menu.equals("파스타")) {
						gue2 += pas;
					}else {
						gue2 += sta;
					}
				}
				if(gu == 3) {
					if(ch.menu.equals("피자")) {
						gue3 += piz;
					}else if(ch.menu.equals("파스타")) {
						gue3 += pas;
					}else {
						gue3 += sta;
					}
				}
				if(gu == 4) {
					if(ch.menu.equals("피자")) {
						gue4 += piz;
					}else if(ch.menu.equals("파스타")) {
						gue4 += pas;
					}else {
						gue4 += sta;
					}
				}
				if(gu == 5) {
					if(ch.menu.equals("피자")) {
						gue5 += piz;
					}else if(ch.menu.equals("파스타")) {
						gue5 += pas;
					}else {
						gue5 += sta;
					}
				}
				System.out.println(getName()+":"+gu+"("+ch.menu+") 가져갔습니다.");
			}
			
			
			try {
				sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("영업끝");
		System.out.println("손님1="+gue1+"원\n손님2="+gue2+"원\n손님3="+gue3+"원\n손님4="+gue4+"원\n손님5="+gue5+"원");
	}
	
}

public class DragonMoneyMain {

	public static void main(String[] args) throws InterruptedException {
		Chef ch = new Chef();
		Guest gu1 = new Guest(ch, "손님");
//		Guest gu2 = new Guest(ch, "손님2");
//		Guest gu3= new Guest(ch, "손님3");
//		Guest gu4 = new Guest(ch, "손님4");
//		Guest gu5 = new Guest(ch, "손님5");
		
		gu1.start();
//		gu2.start();
//		gu3.start();
//		gu4.start();
//		gu5.start();
	
	
		
		
	
	}
}