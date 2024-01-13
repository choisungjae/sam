package zam;

import java.util.Scanner;

class Userr extends Exception{
	String msg;
	int num,num2;
	String [] Co = {
			"가 일치하지 않습니다.",
			"다시한번입력해주세요",
			"자리수를 확인해주세요(11자리)",
			"자리수를 확인해주세요.(최소4~최대10).",
			"필수입력사항입니다."
			};
	public Userr(String msg, int num) {
		this.msg = msg;
		this.num = num;
}
	public Userr(String msg, int num,int num2) {
		this.msg = msg;
		this.num2 =num2;
		this.num=num;
	}
	public String getMessage() {
		if(num2>=0) {
			 String g=msg+Co[num]+Co[num2];
				return g;
		}else {
			String c=msg+Co[num];
			return c;
			}}}
public class Userrr {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int cnt=3;
		System.out.println("환영합니다. 가입을 원하시면 입력해주세요");
		while(true) {
			
			try {
				System.out.print("ID:");
				
				
				if(id.length()>=10||id.length()<=4) {
					throw new Userr("ID",3,1);
				}
				if(id.equals("")) {
					throw new Userr("ID",4);
				}break;
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}}
		   String pw=null;
	
           while(true) {
        	    try {		
        			System.out.print("PW:");
        			 pw = sc.nextLine();
				if(pw.length()>=10||pw.length()<=4) {
					throw new Userr("PW",3,1);
				}break;
				} catch (Exception e) {
				System.out.println(e.getMessage());
			}}
         
           while(cnt>0) {
        	    
        	   try {	
        		   System.out.print("한번 더 입력해주세요"+cnt+"번남음 \nPW2:");
        		   String repw = sc.nextLine();
        		   if(!repw.equals(pw)) {
					cnt--;
					throw new Userr("PW",0);
					
				}	break;
				} catch (Exception e) {
				System.out.println(e.getMessage());
				}
    	   }
				
			while(true) {
        	    try {
             System.out.print("이름:");
				String name = sc.nextLine();
				
				if(name.equals("")) {
					throw new Userr("이름",4,1);
				}
				System.out.print("전화번호:");
				String pon = sc.nextLine();
				
				if(pon.equals("")) {
					throw new Userr("전화번호",4);
				}

				if(pon.length()!=11) {
					throw new Userr("전화번호",2,1);
				}
				System.out.println("---선택기입사항입니다---");
				System.out.print("이메일:");
				String email = sc.nextLine();
				System.out.print("취미:");
				String cc = sc.nextLine();
				System.out.print("특기:");
				String gg = sc.nextLine();
				
				System.out.println(name+"님회원가입되었습니다.");
				break;
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}