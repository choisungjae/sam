package zam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
	
	static void add_1(String name, List list) { //순차는 어레이가 개빠름
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 2000; i++) {
			list.add(1234);
		}
		
		
		
		System.out.println(name+"순차추가:"+(System.currentTimeMillis()-start));
	}

	static void add_2(String name, List list) { //비순차는 링크가 개빠름 
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 2000; i++) {
			list.add(100,1234);
		}
		
		
		
		System.out.println(name+"비순차추가:"+(System.currentTimeMillis()-start));
	}
	static void remove_2(String name, List list) { //비순차는 링크가 개 빠름 
		long start = System.currentTimeMillis();
		
		for (int i = list.size()-1; i >= 0; i--){
//			
			list.remove(i);
			
		}
		
		System.out.println(name+"비순차삭제:"+(System.currentTimeMillis()-start));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr=new ArrayList();
		LinkedList link=new LinkedList();
	
		add_1("arr",arr);
		add_1("link",link);
		add_2("arr",arr);
		add_2("link",link);
//		arr.removeAll(arr);
//		link.removeAll(link);
		remove_2("arr",arr);
		remove_2("link",link);
		
		
		System.out.println("arr:"+arr);
		System.out.println("link:"+link);
		
		//비순차 추가는 느리다 -
		
		
		

	}

}
