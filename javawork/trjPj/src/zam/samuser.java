package zam;

import java.util.Scanner;

class RetMember{
	String id,pw,name;
	void init(String [] arr) {
		this.id = arr[0];
		this.pw = arr[1];
		this.name =arr[2];
	}
	
	void ppp() {
		System.out.println(this+":"+id+","+pw+","+name);
	}
}


class ReturnJoin{
	Scanner sc = new Scanner(System.in);
	String old_id = "aaa";
	String new_id;
	
	RetMember [] mems; // ????????
	
	void memsInit() {
		String [][] oriData = {
				{"aaa","1111","정우성"},
				{"bbb","2222","정좌성"},
				{"ccc","3333","정중성"},
				{"ddd","4444","정남성"}
		};  
		
		
		mems = new RetMember[oriData.length];
		
		for (int i = 0; i < oriData.length; i++) {
			mems[i] = new RetMember();
			mems[i].init(oriData[i]);
		}
		
		for (RetMember mem: mems) {
			mem.ppp();
		}
	}
	
	void joinGo() {
		System.out.print("ID:");
		new_id = sc.nextLine();
		if(new_id.equals(old_id)) {
			System.out.println("중복된 ID 입니다.");
			return;
		}
		ppp();
	}
	
	void logIn() {
		System.out.print("ID:");
		String id = sc.nextLine();
		if(!id.equals("aaa")) {
			System.out.println("잘못된 ID 입니다.");
			return;
		}
		System.out.print("PW:");
		String pw = sc.nextLine();
		if(!pw.equals("1234")) {
			System.out.println("잘못된 암호 입니다.");
			return;
		}
		
		System.out.println("장동건 님 안녕하세요");
	}

	
	
	void logIn2() {
		System.out.print("ID:");
		String id = sc.nextLine();
		RetMember currMem = null;
		for (RetMember mem : mems) {
			if(id.equals(mem.id)) {
				currMem = mem;
				break;
			}
		}
		
		if(currMem == null) {
			System.out.println("잘못된 ID 입니다.");
			return;
		}
		currMem.ppp();
		System.out.print("PW:");
		String pw = sc.nextLine();
		if(!pw.equals(currMem.pw)) {
			System.out.println("잘못된 암호 입니다.");
			return;
		}
		
		System.out.println(currMem.name +" 님 안녕하세요");
	}
	
	void ppp() {
		System.out.println("가입정보 : "+new_id);
	}
}

public class samuser {

	public static void main(String[] args) {
		ReturnJoin rj = new ReturnJoin();
		
		
		rj.memsInit();
		rj.logIn2();
	

	}

}