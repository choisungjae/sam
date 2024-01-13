package util_p;



class Chef1 {
	
	int totalfood = 30;
	String menu = "";
	int gue1 =0;
	int gue2 =0;
	int gue3 =0;
	int gue4 =0;
	int gue5 =0;
	int cnttt=0;
	
	synchronized boolean cook(int gg) {
		String aa [] = {"","스테이크","파스타","피자"};
		int cntt = (int)(Math.random()*3)+1;
		

		
		
		boolean res = false;
		menu = aa[cntt];
		System.out.println("쉐프가 "+menu+"조리시작했습니다.");

		if(res = totalfood >=gg ) {
//			System.out.println(res);
			cnttt++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		if(cnttt==10){
			res = false;
			ppp();
			return res;
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
		return res;
		
		
	}
	public void ppp() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("-------영업끝-------");
		System.out.println("손님1="+gue1+"원\n손님2="+gue2+"원\n손님3="+gue3+"원\n손님4="+gue4+"원\n손님5="+gue5+"원");
	}
}


class Guestt extends Thread{
	Chef1 ch;

	public Guestt(Chef1 ch, String name) {
		super(name);
		this.ch = ch;
	}
	
	@Override
	public void run() {
		int stake = 11000;
		int pasta = 7000;
		int pizza = 8000;
        int ct =0;
		while(ch.totalfood > 0) {
			int gu = (int)(Math.random()*5)+1;
//			int gg=3;
			if(ct<4) {ct++;
			
			if(ch.cook(gu)) {
			
				ch.totalfood -= 3;
				if(gu == 1) {
					if(ch.menu.equals("피자")) {
						ch.gue1 += pizza;
					}else if(ch.menu.equals("파스타")) {
						ch.gue1 += pasta;
					}else {
						ch.gue1 += stake;
					}
				}
				if(gu == 2) {
					if(ch.menu.equals("피자")) {
						ch.gue2 += pizza;
					}else if(ch.menu.equals("파스타")) {
						ch.gue2 += pasta;
					}else {
						ch.gue2 += stake;
					}
				}
				if(gu == 3) {
					if(ch.menu.equals("피자")) {
						ch.gue3 += pizza;
					}else if(ch.menu.equals("파스타")) {
						ch.gue3 += pasta;
					}else {
						ch.gue3 += stake;
					}
				}
				if(gu == 4) {
					if(ch.menu.equals("피자")) {
						ch.gue4 += pizza;
					}else if(ch.menu.equals("파스타")) {
						ch.gue4 += pasta;
					}else {
						ch.gue4 += stake;
					}
				}
				if(gu == 5) {
					if(ch.menu.equals("피자")) {
						ch.gue5 += pizza;
					}else if(ch.menu.equals("파스타")) {
						ch.gue5 += pasta;
					}else {
						ch.gue5 += stake;
					}
				}
				System.out.println(getName()+"번이 ("+ch.menu+") 가져갔습니다.");
			}
			
			
			try {
				sleep(10000+(int)Math.random()*20);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				ct--;
			}System.out.println(getName()+"번이 ("+ch.menu+")다 먹었습니다.");
		}
		
	}
	
}}


public class gggg {

	public static void main(String[] args) throws InterruptedException {
		Chef1 ch = new Chef1();
		Guestt gu1 = new Guestt(ch, "손님1");
		Guestt gu2 = new Guestt(ch, "손님2");
		Guestt gu3= new Guestt(ch, "손님3");
		Guestt gu4 = new Guestt(ch, "손님4");
		Guestt gu5 = new Guestt(ch, "손님5");
		
		
		gu1.start();
		gu2.start();
		gu3.start();
		gu4.start();
		gu5.start();
	
	
	}
}