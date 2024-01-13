package Restaurant;
public class StringMain {

	public static void main(String[] args) {

		String s1 = "나는무너";
		String s2 = "나는무너";
		String s3 = s1;
		String s4 = new String("나는무너");
		String s5 = "나는상어";
		String s6 = new String(new char[] {'나','는','무','너'});
//		
//		System.out.println(s1+","+s1.toString()+","+s1.hashCode());
//		System.out.println(s2+","+s2.toString()+","+s2.hashCode());
//		System.out.println(s3+","+s3.toString()+","+s3.hashCode());
//		System.out.println(s4+","+s4.toString()+","+s4.hashCode());
//		System.out.println(s5+","+s5.toString()+","+s5.hashCode());
//		System.out.println(s6+","+s6.toString()+","+s6.hashCode());
//		
//		System.out.println("== >>>>>>>>>>>>>>>>");
//		System.out.println("s1==s2 : "+(s1==s2));
//		System.out.println("s1==s3 : "+(s1==s3));
//		System.out.println("s1==s4 : "+(s1==s4));
//		System.out.println("s1==s5 : "+(s1==s5));
//		System.out.println("s1==s6 : "+(s1==s6));
//		System.out.println("equals( ) >>>>>>>>>>>>>>>>");
//		System.out.println("s1.equals(s2) : "+s1.equals(s2));
//		System.out.println("s1.equals(s3) : "+s1.equals(s3));
//		System.out.println("s1.equals(s4) : "+s1.equals(s4));
//		System.out.println("s1.equals(s5) : "+s1.equals(s5));
//		System.out.println("s1.equals(s6) : "+s1.equals(s6));
		
		String a = "선생님은 귀여워요 aBcD eF Java 만세 12a3a4";
		//          0 123 45 67 8901234567890123 45678901
		System.out.println(a);
		System.out.println(a.length());
		char ch = a.charAt(13);
		System.out.println(ch+","+(int)ch);
		String b = "87321";
		int nos = 0;
		for (int i = 0; i < b.length(); i++) {
			char cc = b.charAt(i);
			int no = cc-'0';
			nos*=10;
			nos+=no;
			System.out.println(i+":"+cc+" , "+(int)cc+" , "+no+" , "+nos);
			
		}
		String c=a.substring(11);         //11번째부터 출력 
		System.out.println("a.substring:"+c);
		System.out.println("a.substring:"+a.substring(11,16));//11부터 15까지 나옴;
		
		int pos =a.indexOf("c");            //너 몇번쨰야 
		System.out.println("a.indexof:"+pos);// 너몇번째야 출력해봐 12번
		System.out.println("a.indexof:"+a.indexOf("아기상어"));// 너몇번째야 못찾으면 -1 
		System.out.println("a.indexof:"+a.indexOf("a",11));// a가 여러개면 11번부터찾아봐  
		System.out.println("a.indexof:"+a.indexOf("a",20));// a가 여러개면 20번부터찾아봐  
		System.out.println("a.indexof:"+a.indexOf("a",31));// a가 여러개면 30번부터찾아봐//없으니 -1  
		System.out.println("a.Lastindexof:"+a.lastIndexOf("a",27));//last 끝에서부터 찾아봐
		
		String fname="aaaa.bbbb.ccccccc.dd.eee.txt";
//		System.out.println(fname.lastIndexOf("txt"));
		System.out.println(fname.lastIndexOf("."));
		System.out.println("--------------------------------------");
		int tt=fname.lastIndexOf(".");//위치찾기

		System.out.println(fname.substring(25));//25부터 출력 
		
		System.out.println(fname.substring(tt+1));
		
		char gg=b.charAt(3);
		System.out.println(gg);
		
		
	
	
	
	
	}

}