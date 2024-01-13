package zam;

import java.util.Scanner;
//사진 파일을 확인하세요 ex) 영업_홍길동_20110823.jpg
//이미지파일만 가능토록 - jpg,bmp,gif (대소문자 구분안함)
//파일명이 부서명, 회원 이름, 입사일이 될 것
//부서명은 영업, 총무, 인사, 기획, 생산 만 가능함
//입사년도는 숫자만 입력토록 함(8자리만 가능)
//호봉수를 계산할 것 (년도단위에서 절삭)
//성명은 2-4자만 기록 가능 
class Ao{
	Sanner sc = new Sanner (System.in);
	String c;
//	"영업_홍길동_20110823.jpg";
//	String [] arr = Name.substring(0,Name.lastIndexOf(".")).split("_");
    String aaa,bbb,ccc,ddd;
    String ttt="";
    
    public Ao() {
    	
    }
    
	
   
	System.out.println("사진파일을입력하세요");
	String gogo = sc.nextLine();
	if(gogo.equals("영업")) {
		aaa=gogo;
		ttt+=aaa;
	}System.out.println(ttt);
//	else {return;}
	
	System.out.println("이름을입력하세요");
	String GoGo2 = sc.nextLine();
	if(GoGo2.length()>1&&GoGo2.length()<5) {
		ttt+=GoGo2;
	}System.out.println(ttt);
//	else {return;}
	System.out.println("입사년도를입력하세요 8자리입력하세요");
	String GoGo3 = sc.nextLine();
	if(GoGo3.length()==8) {
		ttt+=GoGo3;
	}System.out.println(ttt);
//	else {return;}
	System.out.println("파일종류를입력하세요");
	String GoGo4 = sc.nextLine();
	if(GoGo4.equals("jpg")||GoGo4.equals("bmp")||GoGo4.equals("gif")) {
		ttt+=GoGo4;
	
//	else {return;}
	System.out.println(ttt);
	}

	

		
		
		
	
	
	
	
	
}


public class Gong {

	public static void main(String[] args) {
		
		new Ao();
	

		
	}

}
