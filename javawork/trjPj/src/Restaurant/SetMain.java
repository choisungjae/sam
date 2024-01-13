package Restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
//import javax.swing.text.html.HTMLDocument.Iterator;

public class SetMain {

	public static void main(String[] args) {
		
		Object [] data= {33,11,'a',55,97,22,33,55,11,33,"그린","11","그린"};
		
		ArrayList arr1 =new ArrayList(); //순서 O , 중복 O
		
		HashSet s1 =new HashSet();   //HashSet 중복 데이타는 빠짐 //자료형다르면 나옴
		                             //순서도 일정치 않음
       
		
		for (Object obj : data) {
			arr1.add(obj);
			s1.add(obj);
			
		}
		
		System.out.println(Arrays.toString(data));
		System.out.println(arr1);
		System.out.println(s1);
		
		Set s2 =new HashSet(); 
//		Set s3 =new HashSet(data); 
		Set s4 =new HashSet(arr1); 
		Set s5 =new HashSet(s1); 
		Set s6 =new HashSet();
		s6.addAll(arr1);                          //addAll로 넣어도 '새주소'
		Set s7=(Set)s1.clone()	;                //클론도 '새주소'
		Set s8=s1;                                 //뉴안쓰고 대입했을때 '주소같음'
		System.out.println("s2:"+ s2);
		System.out.println("s4:"+ s4);
		System.out.println("s5:"+ s5);
		System.out.println("s6:"+ s6);
		System.out.println("s7:"+ s7);
		System.out.println("s8:"+ s8);
		
		System.out.println("s1==s4:"+(s1==s4));      //주소 비교 
		System.out.println("s1==s5:"+(s1==s5));
		System.out.println("s1==s6:"+(s1==s6));
		System.out.println("s1==s7:"+(s1==s7));
		System.out.println("s1==s8:"+(s1==s8));
		
		System.out.println("s1.equals(s4):"+s1.equals(s4));
		System.out.println("s1.equals(s5):"+s1.equals(s5));
		System.out.println("s1.equals(s6):"+s1.equals(s6));
		System.out.println("s1.equals(s7):"+s1.equals(s7));
		System.out.println("s1.equals(s8):"+s1.equals(s8));
	
		System.out.println("s1:"+s1);
		System.out.println("s1.size:"+s1.size());
		System.out.println("contains(22):"+s1.contains(22));
		System.out.println("contains(100):"+s1.contains(100));  // 가지고있냐?
		
		Set s9= new HashSet();
		Object[] data2= {33,'a',97,22};
		for (Object dd : data2) {
			s9.add(dd);
		}
		System.out.println("containsAll(s9):"+s1.containsAll(s9));
		
		s9.add(100);
		System.out.println("containsAll(s9):"+s1.containsAll(s9)); //다가지고있냐?
		
		System.out.println("s4:"+s4);
		System.out.println("s4.isEmpty();:"+s4.isEmpty());
		s4.clear();
		System.out.println("s4.isEmpty();:"+s4.isEmpty());
		
		s1.add(1234);
	//	s1.add(5,1234);  //순서가 존재하지않아서 삽입위치 특정 불가 요 
		boolean bb=s1.remove(33);
		System.out.println("remove(33):"+s1);
		System.out.println("bb:"+bb);
		
		
		bb= s1.remove(100);
		System.out.println(s1);
		System.out.println(bb);
		s1.removeAll(s9);
		System.out.println("removeAll(s9):"+s1);
		
	
		Object[] data3= {11,456,789,123,55};
		Set s10= new HashSet();
		for (Object dd : data3) {
			s10.add(dd);
		}
		bb= s1.retainAll(s10);         //겹치는거 빼고 다지워줘 
		System.out.println("s10:"+s10);
		System.out.println("retainAll(s10):"+s1);
		System.out.println("bb:"+bb);
		s1.add(1234);
		
		Object [] data4=s1.toArray();
		System.out.println("s5:"+s1);
		System.out.println("toArray():"+Arrays.toString(data4));
		
		Object [] data5=new Object[5];
		s1.toArray(data5);              //s1 을 data5에 넣어줘 
		System.out.println("toArray():"+Arrays.toString(data5));
		
		Object [] data6=new Object[2];
		s1.toArray(data6);              //s1 을 data6에 넣어줘 
		System.out.println("toArray():"+Arrays.toString(data6));
		
		System.out.println("-------forEach--------------");
	
		for (Object ob : s1) {
		  System.out.println(ob);	
		}
		System.out.println("-------for--------------");
		for (int i = 0; i < data6.length; i++) {
		//	System.out.println(s1.get(i));         순서가 존재하지않기에 포문불가
		}
		System.out.println("-------iterator--------------");
		Iterator it= s1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
	
		
		
		
		
	}

}
