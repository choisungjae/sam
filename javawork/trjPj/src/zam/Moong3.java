package zam;

class Ai{
	String name,gender;  //죄송합니다 잠들었습니다....
	String a,b,c,d,n;
	String gug;
	int age,mage;
	String ttt;
	public Ai(String n) {
		this.n=n;
		}
	
	public void aa() {
		a=n.substring(0,2);
		b=n.substring(2,4);
		c=n.substring(4,6);
		d=n.substring(6,7);
		
		gen(ttt);
		 ttt="성별:"+gender+"\n국적:"+gug+"\n생년월일:"+a+b+c+"\n한국나이:"+age+"\n만나이:"+mage;
		
		System.out.println(ttt);
		
	}
	public void gen(String oo) {
		
        if(n.substring(6, 7).equals(1)){
        	gender = "남성";gug="내국인";}
        else if(n.substring(6, 7).equals(2)) {
        	gender = "여성";gug="내국인";
        }else if(n.substring(6, 7).equals(3)) {
        	gender = "남성";gug="내국인";
        }else if(n.substring(6, 7).equals(4)) {
        	gender = "여성";gug="내국인";
        }else if(n.substring(6, 7).equals(5)) {
        	gender = "남성";gug="외국인";
        }else if(n.substring(6, 7).equals(6)) {
        	gender = "여성";gug="외국인";
        }else if(n.substring(6, 7).equals(7)) {
        	gender = "남성";gug="외국인";
        }else if(n.substring(6, 7).equals(8)) {
        	gender = "여성";gug="외국인";
        }
       
    }	
	public void nun() {
		char cc =a.charAt(0);
		char cd =a.charAt(1);
//	    System.out.println((int)cc);
//	    System.out.println(cc);
		age=123-((cc*10)+cd);
		mage=123-((cc*10)+cd)+1;
		System.out.println(age+","+mage);
//		System.out.println(age);
		
		
	}
	 
	
}



public class Moong3 {

	public static void main(String[] args) {
		
		Ai go=new Ai("9104061219436");
		go.aa();
		go.nun();
		

	}

}
//
//950320-1234567
//
//주민번호를 이용하여
//성별, 국적(내국인/외국인), 생년월일, 한국나이, 만나이, 올해생일, 다가올 생일, 생일파티 DDay를
//출력하세요
//
//1. 1900 년대 내국인 남성
//2. 1900 년대 내국인 여성
//
//########################
//
//3. 2000 년대 내국인 남성
//4. 2000 년대 내국인 여성
//
//########################
//
//-----------------------------------------------------
//
//5. 1900 년대 외국인 남성
//6. 1900 년대 외국인 여성
//
//########################
//
//7. 2000 년대 외국인 남성
//8. 2000 년대 외국인 여성
