package Mouum.Sam;

import java.util.ArrayList;

import javax.swing.JOptionPane;

class Exam {
	T1208쓰레드과목풀 mem;
	String name;
	Timer timer;
	boolean endChk = false;  //시험 종료를 파악할 변수
	
	ArrayList<Question> qqs;
	
	public Exam(T1208쓰레드과목풀 mem,String name, String ...arr) {
		this.mem = mem;
		this.name = name;
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
		
			
			String ttt = qq+" => "+ans;
			if(!chk) {
				ttt += " 오답("+wrong +")";
			}
			
			return ttt;
		}
		
		
		
	}
	
	class Timer extends Thread{
			
	
		public void run() {
		
			int i = 5;
			while(i>0) {
				if(endChk) {
					break;
				}
				System.out.println(name+" "+i);
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i--;
			}
			endChk = true;
			System.out.println(name + "시험종료");
		}
	}
}

public class T1208쓰레드과목풀 {
	Exam now;
	ArrayList<Exam> arr;
	public T1208쓰레드과목풀() {
		arr = new ArrayList<Exam>();
		arr.add(new Exam(this,"국어",
				"살어리 살어리랏다_청산별곡"
				,"하늘을 우러러 한 점 부끄럼 없기를_윤동주"
				,"빼앗긴 들에도 봄은 오는가_이상화"
				,"연탄재 함부로 발로 차지 마라_안도현"
				,"먼 훗날 당신이 찾으시면 그 때에 내 말이 '잊었노라'_김소월"));
		arr.add(new Exam(this,"영어",
				"Apple_사과"
				,"therefore_그러므로",
				"at the price of_을 희생하여"
				,"festivity_축제"
				,"currency_화폐"));
		arr.add(new Exam(this,"수학",
				"8+4/2_6"
				,"8*9+3_75"
				,"9-3*7/5_8.4"
				,"6+9/8*4_7.5"
				,"4/2*7+3_17"));
		
		now = arr.get(0);
		
	}

	public static void main(String[] args) {
		
		new T1208쓰레드과목풀();
	}

}