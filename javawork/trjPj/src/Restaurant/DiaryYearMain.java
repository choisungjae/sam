package Restaurant;

import java.util.Calendar;


class DiaryYear{
	
	String [] weeks = {"","","","","",""};//6주
	String [] spec = {"","","","","",""};//6주
	SpecDay [] sDays;
	int month;
	public DiaryYear(int year, int month, SpecDay [] sDays) {
		this.sDays = sDays;
		this.month = month;
		Calendar now = Calendar.getInstance();
		int nowDD = now.get(Calendar.DATE);
		int nowMM = now.get(Calendar.MONTH);
		int nowYY = now.get(Calendar.YEAR);
		
		now.set(year, month, 1);
		int first = now.get(Calendar.DAY_OF_WEEK);
		
		for (int i = 1; i <first; i++) {
			weeks[0]+="     ";
			spec[0]+="     ";
		}
		int last = now.getActualMaximum(Calendar.DATE);
		//System.out.println(last);
		int weekNo = 0;
		for (int i = 1; i <=last; i++) {
			now.set(Calendar.DATE, i);
			weekNo = now.get(Calendar.WEEK_OF_MONTH)-1;
			
			String pre = "", sur=" ";
			if(i<10) {
				pre+=" ";
			}
			if(nowDD==i && nowMM==month && nowYY==year) {
				pre+="[";
				sur="]";
			}else {
				pre+=" ";	
			}
			sur+=" ";
			weeks[weekNo]+=pre+i+sur;
			
			spec[weekNo]+=specSch(i);
			//System.out.print(pre+i+sur);
			
			//System.out.println(now.get(Calendar.DAY_OF_WEEK));
//			if(now.get(Calendar.DAY_OF_WEEK)==7) {
//				System.out.println();
//			}
			
		}
		for (int i = now.get(Calendar.DAY_OF_WEEK); i <7; i++) {
			weeks[weekNo]+="     ";
			
			spec[weekNo]+="     ";
		}
		
		for (int i = weekNo+1; i < weeks.length; i++) {
			weeks[i]="     ".repeat(7);
			spec[i]+="     ".repeat(7);
		}
		
		
		//ppp();
	}
	
	String specSch(int i) {
		String res = "     ";
		for (SpecDay sd : sDays) {
			if( ((month+1)+"_"+i).equals(sd.day)) {
				res = sd.title;
				break;
			}
		}
		
		int padding = 5-res.length();
		int pre = padding/2;
		int sur = padding - pre;
		res=" ".repeat(pre)+res+" ".repeat(sur);
		return res;
	}
	
	void ppp() {
		for (String wk : weeks) {
			System.out.println(wk);
		}
	}
}

class SpecDay{
	String day, title;
     
	public SpecDay(String str) {
//		int tt=str.lastIndexOf(":");
//		
//		if(day.equals("생")) {
//			this.title=str.substring(tt+1);
//		}
		

//		System.out.println(title);
		//숫자로 전환하고  카렌다로 요일 파악하고 
		// 요일 만큼 뺴줘야함 
		String[] gg;
		int su;
		int ww;
//		
		int tt =str.lastIndexOf(":");
		System.out.println(tt);
		this.title=str.substring(tt+1);
		System.out.println(title);
		
		
	

		if(title.equals("생")) {
			Calendar ddd= Calendar.getInstance();
			gg= str.split("_");
//			System.out.println(gg[1]);
			su = Integer.parseInt(gg[1]);
			ww = Integer.parseInt(gg[0]);
//			System.out.println(su);
	        title =gg[2];
	        ddd.set(Calendar.MONTH, ww);
	        ddd.set(Calendar.DATE, su);
	        if(ddd.get(Calendar.DAY_OF_WEEK) == 1) {
				su-=2;
			}
			else if(ddd.get(Calendar.DAY_OF_WEEK) == 7) {
				su-=1;
			}
	        ddd.set(Calendar.MONTH, ww);
	        ddd.set(Calendar.DATE, su);
	       day=ddd.get(Calendar.MONTH)+1+"_"+ddd.get(Calendar.DATE);
	        
		}else {
			int pos = str.lastIndexOf("_");
//			System.out.println(pos);
			this.day = str.substring(0,pos);
//			System.out.println(day);
			this.title = str.substring(pos+1);
			}
		
		
		
		
//			if(now.get(Calendar.DAY_OF_WEEK) == 1) {
//				su-=2;
//			}
//			else if(.get(Calendar.DAY_OF_WEEK) == 7) {
//				su-=1;
//			}
			
		
			
			 
	
		
//			else if() {
//			
//			}
		}
		

		
		
	

	@Override
	public String toString() {
		return "SpecDay [day=" + day + ", title=" + title + "]";
	}

}

public class DiaryYearMain {

	public static void main(String[] args) {
		
		
		String [] specStr = {
				"1_1_신",
				"1_3_놀",
				"1_4_고싶다",
				"3_1_삼일절",
				"5_5_어린이날",
				"9_29_-",
				"9_30_석",
				"10_9_한글날",
				"5_8_어버이날",
				"8_15_광복절",
				"9_28_추",
				"12_25_성탄절",
				"9_10_정운만:생",
				"9_23_유용준:생",
				"9_14_전병우:생"
		};
		int year=2023;
		
		SpecDay [] sDays = new SpecDay[specStr.length];
		for (int i = 0; i < sDays.length; i++) {
//			if (sDays.get(Calendar.DAY_OF_WEEK) == 1)
			
//			title="aa";
			
//			int tt =title.lastIndexOf(":");
//			this.title = str.substring(tt+1);
//			if(title.equals("생")) {
//				if(nowdd.(Calendar.DAY_OF_WEEK)==1) 
//				{-=2;}
//				else if((Calendar.DAY_OF_WEEK)==7) {
//					d-=1;
//				}
//			}
			
			
			sDays[i] = new SpecDay(specStr[i]);
			
		}
		
		for (SpecDay sd : sDays) {
			System.out.println(sd);
		}
		
		
		DiaryYear [] dy = new DiaryYear[12];
		for (int i = 0; i < dy.length; i++) {
			dy[i] = new DiaryYear(year, i, sDays);
		}
		
		for (int big = 0; big < dy.length; big+=3) {
			
			
			for (int ww = 0; ww < 6; ww++) {
				//일자 주
				for (int mm = big; mm < big+3; mm++) {
					System.out.print(dy[mm].weeks[ww]+"\t");
				}
				System.out.println();
				//spec 주
				for (int mm = big; mm < big+3; mm++) {
					System.out.print(dy[mm].spec[ww]+"\t");
				}
				System.out.println();
			}
			System.out.println("\n");
		}
		
		
	}
}
