package Restaurant;

import java.util.Calendar;

/*
 * Calendar
 * 날짜와 관련된 클래스
 * Calendar.getInstance(); --오늘날짜를 받음
 * get(날짜필드)--필드 값을 int로 받아옴
  * Calendar.YEAR,..... - 날짜필드 (년도, 월, 일.....)
  * 
 //날짜
  System.out.println("년도"+today.get(Calendar.YEAR));
  System.out.println("월"+today.get(Calendar.MONTH));
       //Calendar.MONTH
   //* 실제 월 1 2 3 4 5 6 7 8  9 10 11 12
   //* 표기 월  0 1 2 3 4 5 6 7 8  9 10 11
  
  System.out.println("일"+today.get(Calendar.DATE));
  System.out.println("요일"+today.get(Calendar.DAY_OF_WEEK));
  //이번주 들어 몇번째 날
  //Calendar.DAY_OF_WEEK
   //*   일 월 화 수 목 금 토
   //*   1  2  3  4  5  6  7
  System.out.println("올해 현재 일수"+today.get(Calendar.DAY_OF_YEAR));
  
  //시간
  System.out.println("12시간"+today.get(Calendar.HOUR));//12시간
  System.out.println("24시간"+today.get(Calendar.HOUR_OF_DAY));//24시간
  System.out.println("분"+today.get(Calendar.MINUTE));
  System.out.println("초"+today.get(Calendar.SECOND));
  System.out.println("1/1000초"+today.get(Calendar.MILLISECOND));
  System.out.println("am/pm"+today.get(Calendar.AM_PM));
           //오전-0, 오후-1
  * 
 set(년, 월, 일)

 set(년, 월, 일, 시, 분)

 set(년, 월, 일, 시, 분, 초)
 set(날짜필드, int) -날짜 값을 지정함 (달의 자료형에 유의)
 
 getTimeInMillis() -날짜에 해당하는 long return
 setTimeInMillis(long); -long 을 인수로 날짜형태로 계산
           -값은 1/1000 초 :   하루 1000*60*60*24
           -1970-1-1을 기준으로 날짜시작




public class CalendarMain {

	public static void main(String[] args) {
		
		//Calendar today = new Calendar() ;
		Calendar today = Calendar.getInstance() ;
		
		System.out.println(today);
		System.out.println(today.get(0));
		System.out.println(today.get(1));
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MONTH)+1);
		System.out.println(today.get(Calendar.DATE));
		System.out.println(today.get(Calendar.DAY_OF_WEEK));
		System.out.println(today.get(Calendar.DAY_OF_YEAR));
		System.out.println("일월화수목금토".charAt(today.get(Calendar.DAY_OF_WEEK)-1));
		//Calendar.DAY_OF_WEEK
		   //*   일 월 화 수 목 금 토
		   //*   1  2 3  4 5  6 7
		System.out.println(today.get(Calendar.WEEK_OF_YEAR));
		System.out.println(today.get(Calendar.WEEK_OF_MONTH));
		System.out.println(today.get(Calendar.ZONE_OFFSET )/1000/60/60);
		
		System.out.println(today.get(Calendar.AM_PM));
		System.out.println(today.get(Calendar.HOUR));//12시간
		System.out.println(today.get(Calendar.HOUR_OF_DAY));
		System.out.println(today.get(Calendar.MINUTE));
		System.out.println(today.get(Calendar.SECOND));
		System.out.println(today.get(Calendar.MILLISECOND));
		
		//출력 방식 1984 년 3 월 20일 (水) 13:34:56.789
		cdrToStr(today);
		today.set(1997, 3-1, 20, 13, 27, 35);
		cdrToStr(today);
		today.set(1997, 26-1, -42, 1234, 5467, -123);
		cdrToStr(today);
		today.set(1997, 0,0);
		cdrToStr(today);
		today.set(Calendar.YEAR,2002);
		cdrToStr(today);
		today.set(Calendar.HOUR_OF_DAY,8);
		cdrToStr(today);
		today.set(Calendar.MONTH,20);
		cdrToStr(today);
		today.add(Calendar.MONTH,5);
		cdrToStr(today);
		today.add(Calendar.MINUTE,-40);
		cdrToStr(today);
		long time = today.getTimeInMillis();
		System.out.println(time/1000/60/60/24/365+1970);// time/1000/60/60/24/365 +1970 년도
		today.setTimeInMillis(0);
		cdrToStr(today);
		Calendar now = Calendar.getInstance();
		cdrToStr(now);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
		
		
	
		
		System.out.println(now.after(today)); //now가 투데이를 지났냐?
		System.out.println(now.before(today));
		
		
	}
	
	static void cdrToStr(Calendar cdr) {
		String ttt = cdr.get(Calendar.YEAR)+" 년 "+
		(cdr.get(Calendar.MONTH)+1)+" 월 "+
		cdr.get(Calendar.DATE)+" 일 ("+
		"日月火水木金土".charAt(cdr.get(Calendar.DAY_OF_WEEK)-1)+") " + 
		cdr.get(Calendar.HOUR_OF_DAY)+":" +
		cdr.get(Calendar.MINUTE)+":" +
		cdr.get(Calendar.SECOND)+"." +
		cdr.get(Calendar.MILLISECOND);
		//생일파티평일 주말이면 평일로땡김 생일파티를기준으로
		
		System.out.println(ttt);
	}

}