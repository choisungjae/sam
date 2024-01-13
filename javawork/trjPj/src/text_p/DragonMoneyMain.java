package text_p;

class Mom{
int total = 100;
	
	synchronized boolean showMeTheMoney(int money) {
		
		boolean res = false;
		if(res = total >= money) {
		
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return res;
//		return total >= money;
	}
}
//class Papa{
	
//boolean showMeTheMoney(int money) {
//	
//		boolean res = false;
//		if(true) {
//		
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		return res;
//
//	}
//	
//	
//
//}

class SyChild extends Thread{
	Mom mom;
	Mom pa;
	int myMoney = 0;
	public SyChild(Mom mom, String name) {
		super(name);
		this.mom = mom;
	}
	
	@Override
	public void run() {
		while(mom.total > 0) {
			int money = (int)(Math.random()*40)+1;
			
			
			if(mom.showMeTheMoney(money)) {
				myMoney += money;
				mom.total -= money;
				
				System.out.println(getName()+":"+money+"("+myMoney+")");
				System.out.println("\t잔액 : "+mom.total);
			}
			if(pa.showMeTheMoney(money)) {
				
				mom.total += money;
				
				System.out.println(getName()+":"+money+"("+myMoney+")");
				System.out.println("\t잔액 : "+mom.total);
			}
			
			
			
			try {
				sleep(10);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//주방장 3  손님 5
}//주방장은 요리 끝나고 랜덤으로 요리 또 내놓음 
//각 식사당 시간을 10시~30분 1명이 음식최대4개 =   최대시간 2시간
//주방장들이 음식랜덤만들면   손님들은 줄서서 1인 1음식씩 받아감 , 없으면 못받아감
//배당주는곳에 음식이 스탠바이되어있으면 주방장들은 음식을 못올림
//손님은 각각 결제금액 출력

//주방장은 요리를 뭐뭐 했고 
//매출을 기재

public class DragonMoneyMain {

	public static void main(String[] args) {
		Mom mom = new Mom();
        Mom paa   =new paa();
		SyChild son = new SyChild(mom, "아들");
		SyChild daughter = new SyChild(mom, "딸");
		SyChild pa = new SyChild(mom, "아빠");
		son.start();
		daughter.start();
		pa.start();
	}

}