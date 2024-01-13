package Mouum.SJ;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Userser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("유효성검사를 시작합니다.");

		while (true) {
			try {
				System.out.println("ID를입력하세요");
				String id = sc.nextLine();
				if (!Pattern.matches("[A-Za-z0-9]{4,}", id)) {
					throw new Exception ("[부적합]ID는 영문 숫자 조합(4자이상) 이어야합니다.");
				}
				if (!Pattern.matches(".*[0-9].*", id)) {
					throw new Exception ("[부적합]숫자가 1개이상 포함되어야 합니다.");
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				}
		
			try {
				System.out.println("비밀번호를입력하세요"); //합쳐서 쓰려니까 잘 안됩니다
				                                                                                                                    String pw = sc.nextLine();
				if (!Pattern.matches(".*[a-z].*", pw)) {
					throw new Exception("[부적합]소문자가 포함되어야합니다.(5자이상,영어대소문자 특수문자를 조합)");}
				if(!Pattern.matches(".*[A-Z].*", pw)) {
					throw new Exception("[부적합]대문자를 포함되어야합니다.(5자이상,영어대소문자 특수문자를 조합)");}
			    if(!Pattern.matches(".*[@!#$5^&*()].*", pw)) {
			    	throw new Exception("[부적합]특수문자를 포함되어야합니다.(5자이상,영어대소문자 특수문자를 조합)");}
			    if(!Pattern.matches(".{5,}", pw)) {
			    	throw new Exception("[부적합]5자리 이상입니다.");}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				}

			try {
				System.out.println("이메일을입력하세요");
				String email = sc.nextLine();
				if (!Pattern.matches("[0-9a-zA-Z_]{3,}@[0-9a-zA-Z]{1,}.com", email)) {
					throw new Exception("[부적합]email의 형식은 아이디:영문,숫자(3글자이상) @ 도메인 : 영문 점입니다");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				}
			
			try {
				System.out.println("전화번호를입력하세요");
				String phone = sc.nextLine();//?
				if (!Pattern.matches("[0-9]{3}-[0-9]{4}-[0-9]{4}", phone)) {
					throw new Exception("[부적합]phone 자리수는 ###-####-####, ##(#)-###-####입니다");
				}
				if (!Pattern.matches("[0-9]{2,3}-[0-9]{3}-[0-9]{4}", phone)) {
					throw new Exception("[부적합]phone 자리수는 ###-####-####, ##(#)-###-####입니다");
				}break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				}
			
			try {
				System.out.println("이름을입력하세요");
				String name = sc.nextLine();
				if (!Pattern.matches("[가-힣]{2,5}", name)) {
					throw new Exception("[부적합]이름은 2~5글자입니다.");
				}break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				}
			
			try {
				System.out.println("주민번호를입력하세요");
				String num = sc.nextLine();
				if (!Pattern.matches("[0-9]{6}-[0-9]{7}", num)) {
					throw new Exception("[부적합]주민번호는 6자리-7자리 입니다.");
				}break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				}
			}
//			try {
//			System.out.println("주민번호를입력하세요");
//				String n = sc.nextLine();
//			if (!Pattern.matches("[0-9]{6}-[0-9]{7}", n)) {
//				throw new Exception("[부적합]주민번호는 6자리-7자리 입니다.");
//			}
//			} catch (Exception e) {
//			System.out.println(e.getMessage());
//			
//			}
	}
 }


/*
 * ////회원 가입 유효성 검사를 실시하세요 1. 아이디 : 영문 숫자 조합(4자이상) //예외처리로 2. 비번 , 비번확인(5자이상,
 * 대소문자,특수문자조합 ) 3. 이메일 - 아이디:영문,숫자(3글자이상) @ 도메인 : 영문 점 4. 전화번호 - 숫자 :
 * ###-####-####, ##(#)-###-#### 5. 이름 (한글만 가능) 2~5자 6. 주민번호 7. 사진
 * 첨부-->영문,숫자(3글자 이상).이미지 확장자 이미지(jpg, jpeg, bmp, png, gif) -- 대소문자 구분없음 8. 우편번호
 * 검색 - 구단위 (초성검색) 예외처리로 처리할 것
 */
