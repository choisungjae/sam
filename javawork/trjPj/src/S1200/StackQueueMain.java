package S1200;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueMain {

	public static void main(String[] args) {
		Stack st =new Stack();
		Queue qq = new LinkedList();
		
		st.push(1);  //스택 추가시  add 대신 push
		st.push(2);
		st.push(3);
		
		qq.offer(1);    //Que 추가시 add 대신 offer
		qq.offer(2);    //Que 추가시 add 대신 offer
		qq.offer(3);    //Que 추가시 add 대신 offer
		
	
		
		
		
		
		System.out.println("st:"+st);
		System.out.println("qq:"+qq);
 
		for (int i = 0; i < st.size(); i++) {
			System.out.println(st.get(i));
//			System.out.println(st.get(i)+","+qq.get(i));   queue 는 안됨 왜 인지는 모름 ㅡ.ㅡ;;
		}
		System.out.println("------------");
//		
//		Object rr=st.pop();                //스택   //마지막꺼를 꺼내서 rr에 넣음 @  ~~.pop();
		                                   //Object 변수 =st.pop(); 만들고해야함  스택은 마지막부터 꺼냄
//		System.out.println("rr:"+rr);
//		System.out.println("st:"+st);
//		rr=st.pop();
//		System.out.println("rr:"+rr);
//		System.out.println("st:"+st);
//		rr=st.pop();
//		System.out.println("rr:"+rr);
//		System.out.println("st:"+st+st.empty());   //.empty()  비어있는지 확인
		
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
//		Object rr=qq.poll();                       //스택 -- 앞에서부터 꺼냄
//	    System.out.println("rr:"+rr);
//	    System.out.println("qq:"+qq+qq.isEmpty());
//	    rr=qq.poll();
//	    System.out.println("rr:"+rr);
//	    System.out.println("qq:"+qq+qq.isEmpty());
//	    rr=qq.poll();
//	    System.out.println("rr:"+rr);
//	    System.out.println("qq:"+qq+qq.isEmpty());
		
		System.out.println("------------------------queue");
		while(!qq.isEmpty()) {
			System.out.println(qq.poll());
		}
		
		
	    
		
		

	}

}
