package zam;


import java.util.Scanner;
class Ao{
	Scanner sc;
	String aaa,bbb,ccc,ddd;
    String name;
    int yearnew,month,date;
     
    public Ao(String name) {

    	String [] arr = name.substring(0).split("[_.]");
    	if(arr[0].equals("영업")||arr[0].equals("총무")||arr[0].equals("인사")||
    			arr[0].equals("기획")||arr[0].equals("생산")) {
    			aaa=arr[0];
    		
    		}else {return;}
    	if(arr[1].length()>1&&arr[1].length()<5) {
    			bbb=arr[1];
    			}else {return;}
    	
         if(arr[2].length()==8) {
        	 calc(arr[2]);
        	 ccc=arr[2];	
	
        	}else {return;}
         if(arr[3].equals("jpg")||arr[3].equals("bmp")||arr[3].equals("gif")) {
    			ddd=arr[3];}else {return;}
         System.out.println("부서명:"+aaa);
         System.out.println("이름:"+bbb);
         System.out.println("입사년도:"+ccc);
         System.out.println("호봉수:"+yearnew);
         System.out.println("파일유형:"+ddd);
         
    }
     
    public void calc(String un) {//20110823
    	
    	int year =Integer.parseInt(un.substring(0,4));
//    	int
    	yearnew=2023-year;
    	return;
    	}
  }
public class No {

	public static void main(String[] args) {
		
		new Ao("영업_홍길동_20110823.jpg");}

}
