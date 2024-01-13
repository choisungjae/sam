package S1200;

import java.util.ArrayList;
import java.util.List;


public class ArrayListMain {

	public static void main(String[] args) {

		List arr2 =new ArrayList();
		
		System.out.println(arr2);
		
		arr2.add(10);
		arr2.add(20);
		arr2.add(30);
		
         
		System.out.println(arr2); 
		
		arr2.add("건우야");
		arr2.add(true);
		//다형성 스트링팁
		arr2.add(new int[] {11,22,33});
		arr2.add(123.456);
		System.out.println(arr2);
		arr2.add(123.456);
		arr2.add(123);
		arr2.add("건우야");
		System.out.println(arr2);
		arr2.add(new int[] {11,22,33});
		System.out.println(arr2);
		
		System.out.println(arr2.size());           //size = 랭뜨       
		
		//String str=arr2.get(3);
//		Object obj=arr2.get(3);
		String str;                            //" " 문자열 가져오기 강제형변환   @get
		str= (String)arr2.get(3);              
		System.out.println(str);
		
		arr2.set(4, 984.343);                  //안에 4번 원소를 984로 바꿔주기  @set()  교체
		System.out.println(arr2);
		
		arr2.add(8,987.654);                    //add(번쨰 ,이거를넣어라 ) 삽입개념   @add() 삽입
		System.out.println(arr2);
		arr2.add(4,123.456);                    //add(번쨰 ,이거를넣어라 ) 삽입개념   @add() 삽입
		System.out.println(arr2);
		
		
		
		arr2.remove(5);                        //삭제  5번쨰자리       @remove(5)삭제
		System.out.println(arr2);
		
		arr2.remove("건우야");                    //"건우야"  삭제
		System.out.println(arr2);
		
		arr2.remove((Object)20);                //숫자 20을 삭제   숫자 할떄는 오브젝트 형변환해줘야함
		System.out.println(arr2);
		
		arr2.remove((Object)123.456);                //중복된요소는 앞에서부터 1개씩 삭제
		System.out.println(arr2);
		arr2.set(4,10);
		
		//검색 
		System.out.println(arr2.indexOf(123.456));        // 몇번째야                     @indexOf
		System.out.println(arr2.indexOf(9999));        // 몇번째야 indexOf  없으면 -1
		System.out.println(arr2.indexOf(10));
		System.out.println(arr2.contains(9999));       // 이거있는지 확인  @contains
		
		
		ArrayList arr4 = new ArrayList();
		
		arr4.add(987.654);
		arr4.add(123.456);
		System.out.println(arr4);
		System.out.println(arr2.containsAll(arr4));     //arr4의 원소를 arr2가 다가지고있나? @arr2.containsAll(arr4)
		arr4.add(246.135);
		System.out.println(arr4);
		System.out.println(arr2.containsAll(arr4));
		
		ArrayList arr5 = new ArrayList();
		arr5.add(10);
		arr5.add(20);
		arr5.add("아기상어");
		arr5.add("아기상어");
		System.out.println(arr5);
		System.out.println(arr2);
		arr2.removeAll(arr5);                        //arr2에 있는 arr5의 원소를다지워줘 @arr2.removeAll(arr5)
		System.out.println(arr2);
		
		ArrayList arr6 = new ArrayList();
		arr6.add("나는");
		arr6.add("무너");
		arr6.add("8877");
		arr6.add("나는");
		System.out.println(arr6);
		arr2.addAll(1,arr6);                         //arr2에 1번자리에 arr6을 넣어줘    @arr2.addAll(1,arr6)
		System.out.println(arr2);
		
		arr6.add("꿈을꾸는");
		System.out.println(arr6);              //나중에 추가 한건 안늘어남 arr2말이다
		System.out.println(arr2);
	
		ArrayList arr7 = arr2;                //일반 카피   바뀐쪽바꾸면 같이 바뀜 
		ArrayList arr8 = new ArrayList(arr2);   //딮 카피  주소 복사 
		System.out.println(arr2);
		System.out.println(arr7);
		System.out.println(arr8);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
