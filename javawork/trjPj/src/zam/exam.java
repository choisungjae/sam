package zam;

public class exam {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 1000; i++) {
			
			String ttt = "";
			int cnt = 0;
			
			int [] arr = {i%10, i/10,i/100};
			
			for (int j : arr) {
				try {
					int a = 1234/(j%3);	
					//ttt += i;
				} catch (Exception e) {
					
					try {
						int a = 1234/j;
						ttt += "짝";
						cnt++;
					} catch (Exception e2) {
						//ttt += i;
					}
				}
			}
			// 숫자를 입력하고 0->입력숫자의 5의배수의 합과 평균을 구하세요.
			// 조건문 3항 연산자 사용금지
			//try ~catch 사용
			/*
			//int one = i%10;
			try {
				int a = 1234/(arr[0]%3);	
				//ttt += i;
			} catch (Exception e) {
				
				try {
					int a = 1234/arr[0];
					ttt += "짝";
					cnt++;
				} catch (Exception e2) {
					//ttt += i;
				}
			}
			
			//int ten = i/10;
			try {
				int a = 1234/(arr[1]%3);	
				//ttt += i;
			} catch (Exception e) {
				
				try {
					int a = 1234/arr[1];
					ttt += "짝";
					cnt++;
				} catch (Exception e2) {
					//ttt += i;
				}
			}*/
			
			
			///////////////////////////
			
			try {
				int a = 1234/cnt;	
				
			} catch (Exception e) {
				ttt = ""+i;
			}
			
			
			System.out.println(ttt);
		}

	}

}
