package homeworkPj;

public class d1030_2 {

	public static void main(String[] args) {
		for (int line = 0; line < 5; line++) {
			
			for (int star = line; star <5; star++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
      for (int line = 0; line < 5; line++) {
			
			for (int star = line; star <5; star++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
        	
      
      
      
      for (int line = 0; line < 5; line++) {
		
		for (int r = line; r <5; r++) {
			System.out.print(" ");
		}
		for (int star = 0; star <= line; star++) {
			System.out.print("*");
		}
		System.out.println();
	}
      
      for (int line = 0; line < 5; line++) {
    	  for (int h = line; h < 5; h++) {
    		  System.out.print(" ");
			
		}
    	  for (int i = 0; i <=line; i++) {
			System.out.print("*");
		}System.out.println();
    	  
    	  
		
	}
      
      
      
      int cnt =5;
      for (int line = 0; line < cnt; line++) {
    	  
			for (int star = 0; star < line; star++) {
				System.out.print(" ");
			}
			for (int star = line; star <cnt; star++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
      
      for (int i = 0; i <5; i++) {
    	  for (int j = 0; j < args.length; j++) {
			
		}
		
	}
		
      
     
//      5번
//
//      *
//     ***
//    *****
//   *******
//  *********
		for (int line = 0; line < cnt; line++) {
			
			for (int star = line+1; star <cnt; star++) {
				System.out.print(" ");
			}
			for (int star = 0; star <= line*2; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	

	

	}

}
