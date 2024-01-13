package Restaurant;

import java.util.ArrayList;                //슈퍼  자기랑 부모까지
import java.util.Iterator;                // 익스텐즈 자기랑 자식까지 
                                           //나머지  자기 자신만 
class TV{}

class Phone{}

class HandPhone extends Phone{}//주인공

class SmartPhone extends HandPhone{}

public class GenericListMain {

	public static void main(String[] args) {
      System.out.println("이상훈쉬볼로밍");
		ArrayList ooArr = new ArrayList();
		ArrayList<Phone> phoneArr = new ArrayList();	//generic 명시한 클래스의 자식까지 가능
		ArrayList<HandPhone> handArr = new ArrayList();	//generic 명시한 클래스의 자식까지 가능	
		ArrayList<SmartPhone> smartArr = new ArrayList();	//generic 명시한 클래스의 자식까지 가능
		ArrayList<? super HandPhone> handSuperArr = new ArrayList();//handArr 와 같음 - generic 명시한 클래스의 자식까지 가능
		ArrayList<? extends HandPhone> handExtendsArr = new ArrayList();//의미없음 -> 불가
		ArrayList<TV> tvArr = new ArrayList();
		
		ooArr.add(new TV());
		ooArr.add(new Phone());
		ooArr.add(new HandPhone());
		ooArr.add(new SmartPhone());
		
		//phoneArr.add(new TV());  
		phoneArr.add(new Phone());//자신 클래스 가능
		phoneArr.add(new HandPhone());//자손 클래스 가능
		phoneArr.add(new SmartPhone());//자손 클래스 가능

		//handArr.add(new TV());
		//handArr.add(new Phone()); //부모불가
		handArr.add(new HandPhone());//자신 클래스 가능
		handArr.add(new SmartPhone());//자손 클래스 가능
		
//		smartArr.add(new TV());
//		smartArr.add(new Phone());
//		smartArr.add(new HandPhone());
		smartArr.add(new SmartPhone());//자신 클래스 가능
		
		//handSuperArr.add(new TV());
		//handSuperArr.add(new Phone());
		handSuperArr.add(new HandPhone());//자신 클래스 가능
		handSuperArr.add(new SmartPhone());//자손 클래스 가능
		
		//handExtendsArr.add(new TV());
		//handExtendsArr.add(new Phone());
		//handExtendsArr.add(new HandPhone());
		//handExtendsArr.add(new SmartPhone());
		
		tvArr.add(new TV());
//		tvArr.add(new Phone());
//		tvArr.add(new HandPhone());
//		tvArr.add(new SmartPhone());
		
		methObj(ooArr);
		methObj(phoneArr);
		methObj(handArr);
		methObj(smartArr);
		methObj(handSuperArr);
		methObj(handExtendsArr);
		methObj(tvArr);
		
//		methPhone(ooArr);  컴파일시 정상으로 보이나 실행시 에러발생
		methPhone(phoneArr);	//자신 클래스만 가능
//		methPhone(smartArr);
//		methPhone(handArr);
//		methPhone(handSuperArr);
//		methPhone(handExtendsArr);
//		methPhone(tvArr);
		
//		methHand(ooArr);
//		methHand(phoneArr);
		methHand(handArr);	//자신 클래스만 가능
//		methHand(smartArr);
//		methHand(handSuperArr);
//		methHand(handExtendsArr);
//		methHand(tvArr);
		
//		methHandEx(ooArr);
		//methHandEx(phoneArr);	//부모 불가
		methHandEx(handArr);	//자신 클래스 가능
		methHandEx(smartArr);	//자손 클래스 가능
//		methHandEx(handSuperArr);
		methHandEx(handExtendsArr);	//자손 클래스 가능
		//methHandEx(tvArr);
		
//		methHandSuper(ooArr);
		methHandSuper(phoneArr);	//부모 가능
		methHandSuper(handArr);		//자신 가능
//		methHandSuper(smartArr);	//자식 불가
		methHandSuper(handSuperArr);//super 가능
//		methHandSuper(handExtendsArr);
//		methHandSuper(tvArr);
		
		Iterator itObj;
		itObj = ooArr.iterator();
		itObj = phoneArr.iterator();
		itObj = handArr.iterator();
		itObj = smartArr.iterator();
		itObj = handSuperArr.iterator();
		itObj = handExtendsArr.iterator();
		itObj = tvArr.iterator();
		
		Iterator<Phone> phone;   //<>안에값만 가능  자신만 되는거임 
//		itObj = ooArr.iterator();
		phone = phoneArr.iterator();
//		itObj = handArr.iterator();
//		itObj = smartArr.iterator();
//		itObj = handSuperArr.iterator();
//		itObj = handExtendsArr.iterator();
//		itObj = tvArr.iterator();
		
		Iterator<HandPhone> itphone;
//		itObj = ooArr.iterator();
//		itObj = phoneArr.iterator();
		itphone = handArr.iterator();// 얘도 자신만 가능
//		itObj = smartArr.iterator();
//		itObj = handSuperArr.iterator();
//		itObj = handExtendsArr.iterator();
//		itObj = tvArr.iterator();
		
		Iterator<SmartPhone> itsmar;
//		itObj = ooArr.iterator();
//		itObj = phoneArr.iterator();
//		itObj = handArr.iterator();
		itsmar = smartArr.iterator();
//		itObj = handSuperArr.iterator();
//		itObj = handExtendsArr.iterator();
//		itObj = tvArr.iterator();
		
	}
	
	static void methObj(ArrayList arr) {	}
	static void methPhone(ArrayList<Phone> arr) {//자신만 가능
		for (Phone phone : arr) {
			
		}
	}
	static void methHand(ArrayList<HandPhone> arr) {//자신만 가능
		for (HandPhone phone : arr) {
			
		}
	}
	
	static void methHandEx(ArrayList<? extends HandPhone> arr) {//자신 + 자손 가능
		for (HandPhone phone : arr) {
			
		}
	}
	
	static void methHandSuper(ArrayList<? super HandPhone> arr) {//부모 + 자신 가능
		//for (HandPhone phone : arr) {}
		for (Object oo : arr) {} //부모가 가능하기에 Object까지 올라가야 함
	}


}