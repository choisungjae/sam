package homeworkPj;

public class wwwwwwwwwww {

	public static void main(String[] args) {
		
		String id ="duru";
	
		String inputId=	args[0];
		String pass="1211";
		String pass2="2222";
		String inputPass = args[1];
		boolean isRightPass= (inputPass.equals(pass)||inputPass.equals(pass2));
		
		
		
		if(inputId.equals(id)&&(isRightPass))
		{System.out.println("hi master"	);}
		else {
			System.out.println("who are you?");
		}
		}
	

}
