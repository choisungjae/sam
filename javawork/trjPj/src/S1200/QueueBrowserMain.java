package S1200;

import java.util.Stack;

class  QueueBrowser{
	
	Stack back=new Stack();
	Stack next=new Stack();
	String now = null;
	
	
	void goUrL(String url) {
		System.out.println("goUrl("+url+")-------------");
		next.clear();
		if(now!=null) {
		back.push(now);}
		now=url;
		
		ppp();
	}
	void goBack() {
		System.out.println("goBack()-------------");
		if(back.empty()) {
			System.out.println("뒤로갈곳없어");
			return;
		}
		next.push(now);
		now=(String)back.pop();
		ppp();
	}
	void gonext() {
		System.out.println("gonext()-------------");
		if(next.empty()) {
			System.out.println("앞로갈곳없어");
			return;
		}
		back.push(now);
		now=(String)next.pop();
		ppp();
	}
	void ppp() {
		System.out.println("현재:"+now);
		System.out.println("이전:"+back);
		System.out.println("다음:"+next);
	}
	
	
	
}

public class QueueBrowserMain {

	public static void main(String[] args) {
		
		QueueBrowser sb= new QueueBrowser();
		sb.goUrL("네이버");
		sb.goUrL("네이트");
		sb.goUrL("다음");
		sb.goUrL("구글");
		sb.goBack();
		sb.goBack();
		sb.gonext();
		sb.gonext();
		
		
	}

}
