package S1212;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

import javax.imageio.stream.FileImageOutputStream;

public class User {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		try {
			FileOutputStream us = new FileOutputStream("fff/eee.abc");
			DataOutputStream dos = new DataOutputStream(us);
		
			while(true) {
				System.out.println("아이디를 입력하세요");
				String ID = sc.nextLine();
				
			
				
				System.out.println("이름을 입력하세요");
				String name = sc.nextLine();
				dos.writeUTF(name);


				System.out.println("학년을 입력하세요");
				int no = sc.nextInt();
				dos.writeInt(no);
				
				
				System.out.println("키를 입력하세요");
				double no2 = sc.nextDouble();
				dos.writeDouble(no2);
				
				
				System.out.println("군필여부를 입력하세요");
				Boolean bo = sc.nextBoolean();
				dos.writeBoolean(bo);
				
//				
				sc.close();
				dos.close();
				us.close();
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
/*
회원가입 정보를 입력하여 출력하세요

id
이름
학년
키
군필여부

저장위치 : fff/eee.abc
 * */
	