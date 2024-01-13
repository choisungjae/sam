package text_p;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class sss {

	public static void main(String[] args) throws Exception{
		
		//89年  nov 28일 (화) 05:07:30  형태로 출력해 주세요
		Date today = new Date();
		//Locale loc = new Locale("en");	//표기법
		SimpleDateFormat sdf = new SimpleDateFormat("yy年 MMM dd일 ",new Locale("en"));
		//loc = new Locale("ko");	
		SimpleDateFormat sdf2 =  new SimpleDateFormat("(E) HH:mm:ss",new Locale("ko"));
		//System.out.println(sdf.format(today)+ sdf2.format(today));
		
		
		//주민번호 -> 생년월일, 한국나이, 만나이, 올해생일, 다가올생일, 생일파티, DDay 
		String securityId = "841012-2000100";
		
		//생년월일
		int seven = securityId.charAt(7)-'0';
		String year = ""+((seven-1)%4/2 +19);
		//System.out.println(year);
		String yy = securityId.substring(0,2);
		year = year+yy;
		//System.out.println(year);
		int py = Integer.parseInt(year);
		int pmm = Integer.parseInt(securityId.substring(2,4));
		int pdd = Integer.parseInt(securityId.substring(4,6));
				
		Calendar cd = Calendar.getInstance();
		Calendar tDay = Calendar.getInstance();
		cd.set(py, pmm-1, pdd);
		Date birth = cd.getTime();
		
		// 나이
		int kAge = tDay.get(Calendar.YEAR) - cd.get(Calendar.YEAR)+1;
		int AAge = kAge;
		AAge--;
		if(cd.get(Calendar.MONTH) > tDay.get(Calendar.MONTH) 
				|| (cd.get(Calendar.MONTH) == tDay.get(Calendar.MONTH) 
				&& cd.get(Calendar.DAY_OF_MONTH) > tDay.get(Calendar.DAY_OF_MONTH))
		) {
			AAge--;
	        }
		
		// 올해생일
		cd.set(tDay.get(Calendar.YEAR), pmm-1, pdd);
		Date nowBirth = cd.getTime();
		
		//다가올생일
		Date nextBirth = cd.getTime();
		if(cd.getTimeInMillis() > tDay.getTimeInMillis()) {
			nextBirth = cd.getTime();
		}else {
			cd.add(Calendar.YEAR, 1);
			nextBirth = cd.getTime();
		}
		
		//생일파티 - 토요일이면 금요일로
		SimpleDateFormat sdf3 =  new SimpleDateFormat("E");
		if(sdf3.format(nextBirth).equals("토")) {
			cd.add(Calendar.DATE, -1);
		}
		Date party = cd.getTime();
		
		//dday
		long dDay = ((party.getTime() - today.getTime())/1000/60/60/24)+1;


		
		System.out.println("==================================");
		System.out.println("주민번호 : "+securityId);
		System.out.println("생년월일 : "+sdf.format(birth)+sdf2.format(birth));
		System.out.println("한국나이 : "+kAge+"세");
		System.out.println("만나이 : "+AAge+"세");
		System.out.println("올해생일 : "+sdf.format(nowBirth)+sdf2.format(nowBirth));
		System.out.println("다가올생일 : "+sdf.format(nextBirth)+sdf2.format(nextBirth));
		System.out.println("생일파티 : "+sdf.format(party)+sdf2.format(party));
		System.out.println("DDAY : "+dDay+"일");
		System.out.println("==================================");
	
		
	}

}