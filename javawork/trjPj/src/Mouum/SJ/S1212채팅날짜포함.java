package Mouum.SJ;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * 스캐너를 이용하여 작성된 대화 내용을 저장하세요
 * x 입력시 종료
 * 저장 형식
 * [2023/12/12 14:25:32] 유용준이 돌아왔구나
 * 
 * */
public class S1212채팅날짜포함 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		String ttt = new SimpleDateFormat("yyyy/  MM/ dd/ hh:mm:ss").format(today);
//		ttt += new SimpleDateFormat(" hh:mm:ss").format(today);
//		System.out.println(ttt);

		while (true) {
			try {
//				
				FileOutputStream ch =new FileOutputStream("ttt/qwe.txt", true);
				
				System.out.println("채팅내용입력하세요");
				String chat = sc.nextLine();
//				ch.write(today.getBytes());
				ch.write(ttt.getBytes());
				ch.write(":   ".getBytes());
				
				ch.write(chat.getBytes());
				ch.write("\n".getBytes());
//				System.out.println(caht);
				ch.close();
				
				if(chat.equals("x")) {
					System.out.println("채팅끝");
					break;
				}
//				throw new Exception(chat); 
			
			
			
			}catch (Exception e) {
				System.out.println(e.getMessage());}
				

	}

}
	}
