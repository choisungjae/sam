package text_p;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ex1206 {

	public static void main(String[] args) throws ParseException {
	
		Date today =new Date(); 	
		String [] arr = {
		"yy年","MMM","d일","(E)","HH:","mm:","ss"};
		
		for (String pp : arr) {	
			Locale loc = new Locale("en");
			if(pp.equals("MMM")) {
				loc = new Locale("en");
			}else {loc = new Locale("ko");}
			SimpleDateFormat sdf = new SimpleDateFormat(pp,loc);
			System.out.print(sdf.format(today)+" ");
		}	
	}
}
				

	
	