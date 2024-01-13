package Restaurant;
import java.util.Scanner;

public class jjdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aa="";
		String bb,cc;
		
		System.out.print("0:가위, 1:바위 2:보 입력:");
		
		while(true) {
		int user = sc.nextInt();
		
		int boo = (int)(Math.random()*3);
		
		if(user==5) {
			break;
		}
		
		String ttt;    //0,  1, 2
		String [] arr = "가위,바위,보".split(",");
		String [][] SU = {
				{"비겼다","이김","졌다"},		
				{"비겼다","이김","졌다"},		
				{"비겼다","이김","졌다"},		
		};
		
		for (int i = 0; i < arr.length; i++) {
			if(user==i&&boo==i) {
			aa="비겼다";
			}else if(user==i&&boo!=i) {
				
			}
		}	


		

		//		}	
//		if(user==0&&(boo==0) ) {
//				aa="비김";}
//		}else if(user==0&&boo==1){
//		        aa="졌다";
//			
//		}else if(boo==2) {
//			aa="이겼다";
//		}
//			}
//		
//		if(user==1) {
//			if(boo==0) {
//				aa="이김";
//		}else if(boo==1){
//			aa="비김";
//		}else if(boo==2) {
//			aa="졌다";
//		}}
//		if(user==2) {
//			if(boo==0) {
//				aa="졌다";
//		}else if(boo==1){
//			aa="졌다";
//		}else if(boo==2) {
//			aa="이김";
//		}}
		System.out.println("게이머:"+arr[user]);
		System.out.println("컴퓨터:"+arr[boo]);
		System.out.println("결과:"+aa);
		}
		
		
		
		
		
		
	}

}
