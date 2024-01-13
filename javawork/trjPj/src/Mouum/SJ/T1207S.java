package Mouum.SJ;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JOptionPane;

import S1200.DaemonOp;

import java.util.LinkedHashMap;


class Han extends Thread{
	
	LinkedHashMap<String, String> hanmun;
	Muntime mun;
	int ttt,jum;
	public Han(Muntime mun) {
		this.mun=mun;
		hanmun = new LinkedHashMap();
		hanmun.put("가 다음은", "나");
		hanmun.put("나 다음은", "다");
		hanmun.put("다 다음은", "라");
		hanmun.put("라 다음은", "마");
		
	}
	public void run() {
		int cnt = 0;
		
		
		for (Map.Entry<String, String>qq : hanmun.entrySet()) {
			
			while(true) {
			if(mun.endChk) {
				break;
			}
			
			String answer = JOptionPane.showInputDialog(qq.getKey());
             
			if(mun.endChk) {
				break;
			}
			
			if(answer.equals("p")) {
		    System.out.println("패스요");
		    break;
			}
			
			else if(answer.equals(qq.getValue())) {
			System.out.println(qq.getKey()+" => "+answer);
		    cnt++;
		    break;
			}
			else if(!answer.equals(qq.getValue())) {
				System.out.println(answer+"땡 - 정답은:"+qq.getValue());
				
			}
		    
			}
		}
		
		int hanjum =cnt*25;
		mun.endChk=true;
		System.out.println("전체:"+hanmun.size()+"  맞은갯수:"+ cnt+"틀린갯수:"+(hanmun.size()-cnt)+"\n"+cnt*25+"/100");
		
		jum+=hanjum;
}
}
class Su extends Thread{
		
		LinkedHashMap<String, String> sumun;
		Muntime mun;
		
		public Su(Muntime mun) {
			this.mun=mun;
			sumun = new LinkedHashMap();
			sumun.put("1+1", "2");
			sumun.put("2+2", "4");
			sumun.put("5-2", "3");
			sumun.put("3+2", "5");
			
		}
		public void run() {
			
			int cnt = 0;
			
			
			for (Map.Entry<String, String>qq : sumun.entrySet()) {
				
				while(true) {
				if(mun.endChk) {
					break;
				}
				
				String answer = JOptionPane.showInputDialog(qq.getKey());
	             
				if(mun.endChk) {
					break;
				}
				
				if(answer.equals("p")) {
			    System.out.println("패스~용");
			    break;
				}
				
				else if(answer.equals(qq.getValue())) {
				System.out.println(qq.getKey()+" => "+answer);
			    cnt++;
			    break;
				}
				else if(!answer.equals(qq.getValue())) {
					System.out.println(answer+"땡 - 정답은:"+qq.getValue());
					
				}
			    
				}
			}
			
			int sujum =cnt*25;
			mun.endChk=true;
			System.out.println("전체:"+sumun.size()+"  맞은갯수:"+ cnt+"틀린갯수:"+(sumun.size()-cnt)+"\n"+cnt*25+"/100");
			
			
	}
	
}
class En extends Thread{
	
	LinkedHashMap<String, String> enmun;
	Muntime mun;
	
	public En(Muntime mun) {
		this.mun=mun;
		enmun = new LinkedHashMap();
		enmun.put("1+1", "2");
		enmun.put("2+2", "4");
		enmun.put("5-2", "3");
		enmun.put("3+2", "5");
		
	}
	public void run() {
		int cnt = 0;
		
		
		for (Map.Entry<String, String>qq : enmun.entrySet()) {
			
			while(true) {
			if(mun.endChk) {
				break;
			}
			
			String answer = JOptionPane.showInputDialog(qq.getKey());
             
			if(mun.endChk) {
				break;
			}
			
			if(answer.equals("p")) {
		    System.out.println("패스~용");
		    break;
			}
			
			else if(answer.equals(qq.getValue())) {
			System.out.println(qq.getKey()+" => "+answer);
		    cnt++;
		    break;
			}
			else if(!answer.equals(qq.getValue())) {
				System.out.println(answer+"땡 - 정답은:"+qq.getValue());
				
			}
		    
			}
		}
		
		int enjum =cnt*25;
		mun.endChk=true;
		System.out.println("전체:"+enmun.size()+"  맞은갯수:"+ cnt+"틀린갯수:"+(enmun.size()-cnt)+"\n"+cnt*25+"/100");
		
		
}

}
class Muntime extends Thread{
boolean endChk =false;
	int cntt=0;
	int tot,avg;
	@Override
	public void run() {
		for (int i =20; i >= 0; i--) {
			if(endChk) {
				cntt++;
				break;
			}
			
			
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("국영수 시험끝");
		Su sujum;
//		if(cntt==3) {
//		ppp();}
		
	}}
//	void ppp() {
//		tot=hanjum+enjum+sujum;
//		avg=hanjum+enjum+sujum;/total.size;
//	  System.out.println("-----");
//	}

//}
	
	

public class T1207S {

	public static void main(String[] args) throws InterruptedException {
		Muntime timer = new Muntime();
		Muntime timer2 = new Muntime();
		Muntime timer3 = new Muntime();
		Han han = new Han(timer);
		Su su = new Su(timer2);
		En en = new En(timer3);

			timer.start();

			timer2.start();
			su.start();
			timer3.start();
			en.start();

	}

}
