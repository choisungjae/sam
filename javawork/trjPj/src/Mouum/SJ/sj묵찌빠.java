package Moumm;

import java.util.Scanner;

public class sj묵찌빠 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int cnt =0;
		String [] Bong = "가위,바위,보".split(",");
		String [] Mong = "승리,패배요,무승부요".split(",");
		String gg="";
		String ee="";
		System.out.println("환영합니다 묵찌빠요");
		while(true) {
			System.out.print("---내세요 0:가위 1:바위 2:보---");
			int user = sc.nextInt();
			
			
			if(user==9) {
				break;
			}//종료9
			int com = (int)(Math.random()*3);
			if (user == com) {
	            gg=Mong[2];
	          } else if ( user==0&&com==2) {
	            gg=Mong[0];}
	            else if (user==1&&com==0) {
	            gg=Mong[0];}
	            else if (user==2&&com==1) {
	            gg=Mong[0];
	            } else {
	            gg=Mong[1];}
	        	String gg2="";
	        	
//	        	System.out.println(cnt);
			if (gg.length()==2) {
				gg2=".[공격]입니다";
//				gg=gg+gg2;
				cnt++;
				}
			else if(gg.length()==3) {
				gg2=".[수비]입니다";
				cnt--;}
			else if(gg.length()==4) {
				gg2=".[다시한번]";
				cnt=0;}
			
//			System.out.println(cnt);
		    System.out.println("유저:"+Bong[user]);
			System.out.println("컴퓨터:"+Bong[com]);
			System.out.println("공수:"+gg+gg2);
//			if(cnt==2||cnt==-2){
//			if(cnt==2 ){ee="승리";
//			}else if(cnt==-2) {
//				ee="패배";
//			}break;
			if(cnt==2) {
				ee="승리";break;
			}else if(cnt==-2) {
				ee="패배";break;
			}
		}
		
		System.out.println("----------"+ee+"------------");
	}

}