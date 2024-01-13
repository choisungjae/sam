//package Mouum.SJ;
//import java.util.ArrayList;
//import java.util.LinkedHashMap;
//import java.util.Map;
//import javax.swing.JOptionPane;
//import java.util.LinkedHashMap;
//
////국사 시험문제를 구현하세요
//		//답이 틀리면 다시 풀게 하세요
//		//p를쓰면 오답처리하고 다음문제로 진행시키세요
//
///*
//		 3+3 => 6
//		 10-2 => 8 오답(dde)
//		 8/2 => 4
//		 3+4*5 => 23 오답(35)
//		 전체 : 4, 맞은갯수 : 2, 틀린갯수 : 2
//		 합계 : 25/100 
//		 * */
//
//class gug extends Thread{
//	
//	LinkedHashMap<String, String> gugmun;
//	gugtime mun;
//	int cntt=4;
//	public gug(gugtime mun) {
//		this.mun=mun;
//		gugmun = new LinkedHashMap();
//		gugmun.put("아름다운 이땅에금수강산에 터잡으신분", "1");
//		gugmun.put("알에서나온분", "1");
//		gugmun.put("만주벌판달린분", "1");
//		gugmun.put("신라장군", "1");
//		
//	}
//	public void run() {
//		int cnt = 0;
//		
//		
//		for (Map.Entry<String, String>qq : gugmun.entrySet()) {
//			
//			while(true) {
//			if(mun.endChk) {
//				break;
//			}
//			
//			String answer = JOptionPane.showInputDialog(qq.getKey());
//             
//			if(mun.endChk) {
//				break;
//			}
//			
//			if(answer.equals("p")) {
//		    System.out.println("패스입니다");
//		    break;
//			}
//			
//			else if(answer.equals(qq.getValue())) {
//			System.out.println(qq.getKey()+" => "+answer);
//		    cnt++;
//		    break;
//			}
//			else if(!answer.equals(qq.getValue())) {
//				System.out.println(answer+"?ㅋㅋ틀렸어요 정답은:"+qq.getValue());
//				
//			}
//		    
//			}//와일
//		}//포
//		
//	   
//		mun.endChk=true;
//		System.out.println("전체:"+cntt+"  맞은갯수:"+ cnt+"틀린갯수:"+(cntt-cnt)+"\n"+cnt*25+"/100");
//		
//}
//}
//class gug2 extends Thread{
//		
//		LinkedHashMap<String, String> gugmun;
//		gugtime mun;
//		int cntt=4;
//		public gug2(gugtime mun) {
//			this.mun=mun;
//			gugmun = new LinkedHashMap();
//			gugmun.put("아름다운 이땅에금수강산에 터잡으신분", "1");
//			gugmun.put("알에서나온분", "1");
//			gugmun.put("만주벌판달린분", "1");
//			gugmun.put("신라장군", "1");
//			
//		}
//		public void run() {
//			int cnt = 0;
//			
//			
//			for (Map.Entry<String, String>qq : gugmun.entrySet()) {
//				
//				while(true) {
//				if(mun.endChk) {
//					break;
//				}
//				
//				String answer = JOptionPane.showInputDialog(qq.getKey());
//	             
//				if(mun.endChk) {
//					break;
//				}
//				
//				if(answer.equals("p")) {
//			    System.out.println("패스입니다");
//			    break;
//				}
//				
//				else if(answer.equals(qq.getValue())) {
//				System.out.println(qq.getKey()+" => "+answer);
//			    cnt++;
//			    break;
//				}
//				else if(!answer.equals(qq.getValue())) {
//					System.out.println(answer+"?ㅋㅋ틀렸어요 정답은:"+qq.getValue());
//					
//				}
//			    
//				}//와일
//			}//포
//			
//		   
//			mun.endChk=true;
//			System.out.println("전체:"+cntt+"  맞은갯수:"+ cnt+"틀린갯수:"+(cntt-cnt)+"\n"+cnt*25+"/100");
//			
//	}
//	
//}
//class gugtime extends Thread{
//boolean endChk =false;
//	@Override
//	public void run() {
//		for (int i =10; i >= 0; i--) {
//			if(endChk) {
//				break;
//			}
//			
//			
//			System.out.println(i);
//			try {
//				sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		endChk=true;
//		System.out.println("시험끝");
//		
//	}
//}
//	
//
//public class T1207맵으로국어문제내기2 {
//
//	public static void main(String[] args) throws InterruptedException {
//		gugtime timer = new gugtime();
//		gugtime timer2 = new gugtime();
//		gug exam = new gug(timer);
//		gug2 gug2 = new gug2(timer2);
//			timer.start();
//			exam.start();
//			timer.join();
//			exam.join();
//			timer2.start();
//			gug2.start();
//
//	}
//
//}
