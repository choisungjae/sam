package S1200;

import java.util.Stack;

class mp3 {

	Stack back = new Stack();
	Stack next = new Stack();
	String now = null;
    String name;
	Stack musiclist = new Stack();

	public void ooo() {

		musiclist.push("1번노래 후후후"); // 스택 추가시 add 대신 push
		musiclist.push("2번노래 호랑이수월가");
		musiclist.push("3번노래 넥스트레벨");
		musiclist.push("4번노래 하히하하하하이");
		musiclist.push("5번노래 아리랑");

		System.out.println("노래리스트:" + musiclist);

	}

	void gonow(int su) {
		su=su-1;
		String str; 
		now = (String) musiclist.get(su);

		System.out.println("현재노래(" + now + ")-------------");
//		next.clear();

		back.push((String) musiclist.get(su - 1));
		next.push((String) musiclist.get(su+1));
		now = (String) musiclist.get(su);
		System.out.println();

		ppp();

	}

	void goBack() {

		System.out.println("뒤로한칸갔음-------------");
//		if(back.empty()) {
//			gonow(4);
//			return;
//		}
//		back.push(now-1);
		next.push(now);
		now=(String)back.pop();
		ppp();
	}

	void gonext() {
		
		System.out.println("앞으로한칸()-------------");
//		if(next.empty()) {
//			gonow(1);
//			return;
//		}
//		System.out.println(cntt);
		
		back.push(now);
		now=(String)next.pop();
//		next.push(now);
		
		
		ppp();
	}

	void ppp() {
		System.out.println("현재:"+now);
		System.out.println("이전:"+back.pop());
		System.out.println("다음:"+next);
//		System.out.println(musiclist);
	}
}

public class S1201 {

	public static void main(String[] args) {
		mp3 list = new mp3();
//		System.out.println(arr2.containsAll(arr4));

		list.ooo();

		list.gonow(2);
//		list.gonow(3);
		list.gonext();
		list.gonext();
		list.gonext();
		list.gonext();
		list.gonext();
		list.gonext();
		list.gonext();
		list.goBack();
		list.goBack();
	
//		list.goBack();
//		list.gonext();
//		list.gonext();
//		list.gonow("김이박");
//		list.gonow("김이박");
//		list.goBack();

	}

}
//mp3 노래 구현하기
//1.노래 정보: 트랙번호,노래제목,가수
//2. 노래 리스트 -->next 에 넣기
//3. 구현내용 -다음곡,이전곡,트랙번호