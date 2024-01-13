package S1200;

import java.util.ArrayList;

import javax.swing.JOptionPane;

class Exam {
	
	String name;
	Timer timer;
	boolean endChk = false;  //시험 종료를 파악할 변수
	
	ArrayList<Question> qqs;
	
	public Exam(String ...arr) {
		
		qqs = new ArrayList();
		
		for (String str : arr) {
			qqs.add(new Question(str));
		}
		timer = new Timer();
		timer.start();
		rrrr();
		
	}
	
	
	void rrrr() {
		
		for (Question quiz : qqs) {
			quiz.gogo();
			if(endChk) {//timer가 끝났다면
				break;
			}
		}
		ppp();
		
	}
	
	void ppp() {
		endChk = true;//문제를 다풀었다--> 시험종료
		int cnt = 0;
		for (Question quiz : qqs) {
			if(quiz.chk) {
				cnt++;
			}
			System.out.println(quiz);
		}
		System.out.println("전체 : "+qqs.size()+", 맞은갯수 : "+cnt+", 틀린갯수 : "+(qqs.size()-cnt));
		System.out.println("합계 : "+100*cnt/qqs.size()+"/100");
	}
	
	
	class Question{
		String qq, ans, wrong;
		boolean chk = false;
		public Question(String str) {
			
			String [] arr = str.split("_");
			this.qq = arr[0];
			this.ans = arr[1];
		}
		
		void gogo() {
			while(true) {
				if(endChk) {//timer가 끝났다면
					break;
				}
				
				String buf = JOptionPane.showInputDialog(qq);
				
				if(endChk) {//timer가 끝났다면
					break;
				}
				System.out.println(qq+" => "+buf);
				if(buf.equals(ans)) {
					chk = true;
					break;
				}
				if(buf.equals("p")) {
					break;
				}
				wrong = buf;
			}
		}

		@Override
		public String toString() {
			/*
			 3+3 => 6
			 10-2 => 8 오답(dde)
			 8/2 => 4
			 3+4*5 => 23 오답(35)
			 
			 * */
			
			String ttt = qq+" => "+ans;
			if(!chk) {
				ttt += " 오답("+wrong +")";
			}
			
			return ttt;
		}
		
		
		
	}
	
	class Timer extends Thread{
			
		@Override
		public void run() {
			//for (int i =30; i >= 0; i--) {
			int i = 30;
			while(i>0) {
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
				i--;
			}
			endChk = true;
			System.out.println("시험종료");
		}
	}
}

public class dasd {

	public static void main(String[] args) {
		new Exam("살어리 살어리랏다_청산별곡"
		,"하늘을 우러러 한 점 부끄럼 없기를_윤동주"
		,"빼앗긴 들에도 봄은 오는가_이상화"
		,"연탄재 함부로 발로 차지 마라_안도현"
		,"먼 훗날 당신이 찾으시면 그 때에 내 말이 '잊었노라'_김소월");

	}

}