package Restaurant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorMain {

	public static void main(String[] args) {
		ArrayList arr= new ArrayList();
		
		arr.add(11);
		arr.add(22);
		arr.add(33);
		arr.add(44);
		arr.add(55);
		arr.add(66);
		arr.add(77);
		
		System.out.println(arr+"1111111111111");
		
		
		for (Object obj : arr) {
			int i = (int)obj;
			if(i==33) {
//			arr.remove(obj);
			}
			System.out.println(obj);
		}
		System.out.println(arr+"2222222222222");
		
		
		// iterator   와일문 내에서 삭제 가능
		Iterator it = arr.iterator();
		System.out.println(it.hasNext());  // 다음꺼 있냐 ? / 트루 풜스로 나옴 
		System.out.println(it.next()+"3333333333");     // 꺼내옴
    
		
		while(it.hasNext()) {
	        Object obj = it.next();
	        int i = (int)obj;
			if(i==33) {
//			arr.remove(obj);    //안됨 삭제 
				it.remove();    //it 써야 와일에서 삭제가능
			}
	        
	        System.out.println(obj);       //넥스트 인덱스 없음
		}
		System.out.println(arr+"dddddddddddddddd");
		
		ListIterator lit =arr.listIterator();
		
		while(lit.hasNext()) {
			
			System.out.println(lit.next()+","+lit.nextIndex());
		}
		System.out.println("---------");
		while(lit.hasPrevious()) {           //hasPrevious  후진 쌉가능  *전진이 없으면 빠꾸도없다
			
			System.out.println(lit.previous()+","+lit.previousIndex());
		}
		
		
		
		
		
		
		
	}

}
