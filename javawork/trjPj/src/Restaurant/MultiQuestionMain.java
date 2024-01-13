package Restaurant;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.JOptionPane;

class MQExam extends Thread{
	MQTimer mt;
	
	LinkedHashMap<String, String> qqs;
	
	public MQExam(MQTimer mt) {
		this.mt=mt;
		qqs = new LinkedHashMap();
		
		qqs.put("3+3","6");
		qqs.put("10-2","8");
		qqs.put("8/2","4");
		qqs.put("3+4*5","23");
	}
	
	@Override
	public void run() {
		int cnt = 0;
		for (Map.Entry<String, String>qq : qqs.entrySet()) {
			
			if(mt.endChk) {//타이머가 끝났다면
				break;
				
			}
			String answer = JOptionPane.showInputDialog(qq.getKey());
			if(mt.endChk) {//타이머가 끝났다면
				break;
				
			}
			System.out.println(qq.getKey()+" => "+answer);
			if(answer.equals(qq.getValue())) {
				cnt++;
			}
		}
		mt.endChk=true;//문제를 다풀었다 ==>시험종료
		System.out.println("결과 : "+cnt);
	}
}

class MQTimer extends Thread{
	boolean endChk =false;
	
	@Override
	public void run() {
		for (int i =30; i >= 0; i--) {
			if(endChk) {
				break;
			}
			
			
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}endChk=true;
		System.out.println("시험종료");
	}
}

public class MultiQuestionMain {

	public static void main(String[] args) {
		
		//답이틀리면 다시풀게하세요 
		//p를 쓰면 오답처리하고 다음문제로 진행시키세요
		//결과 = 3+3=>6  이런식
		MQTimer timer = new MQTimer();
		MQExam exam = new MQExam(timer);
		exam.start();
		timer.start();

	}

}


