package homeworkPj;

public class oooooooo {

	public static void main(String[] args) {
		int cnt = 5;
		for(int line=0; line<cnt; line++) {
			for(int star=line; star<cnt; star++) {
				System.out.print("*");
			}
			for(int star=0; star<=line*2; star++) {
			System.out.print(" ");
			}
			for(int star=line; star<cnt; star++) {
			System.out.print("*");
			}
			System.out.println();	
		}

	}

}
