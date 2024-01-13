package homeworkPj;

import java.util.Iterator;
import java.util.jar.Attributes.Name;

public class JoJo {

	public static void main(String[] args) {
		/*	
	///////  반, 성별 , 이름, 점수를 넣고 출력하세요
	 * 구분
	/// 2과목 : 재직자, 3과목 : 일반, 4과목 : 예체능
////		평점 :
		재직자 : (총점 + 10) / 2
		일반 : 평균
		예체능 : 국: 0.2, 영: 0.15, 수:0.05, 특:0.6
		
	////출력 내용
	 * 구분, 반, 이름, 성별, 점수, 총점, 평점, 등급, 등수

	1. 입력순서 대로 
	*/
		String []name15= {"한국인","네덜란드인","폴란드인","중국인","미국인","일본인","태국인",
				"러시아인","북한인","캄보디아인","이집트인","인도인","브라질인","뉴질랜드인","그리스인"};//15
		
		int[][]score15= {
				{99,88,99,95},
				{59,65,75},
				{59,45},
				{69,38,49,95},
				{77,75,79},
				{89,77,35},
				{85,73,39,45},
				{65,89,95},
				{88,58},
				{75,55,72},
				{61,77,92,88},
				{72,83},
				{66,71,49,55},
				{43,76,49,75},
				{95,58,76}
		};
		String[] category3= {"재직자","일반","예체능"};
		String[] catego2 = new String[name15.length];
		int []total15=new int [name15.length];
		int []avg15=new int[name15.length];
		int [][]res15=new int[score15.length][2];
		int [] rank1=new int[name15.length];
		int[] rank2=new int[name15.length];
		String[] gender= new String[name15.length];
		for (int i = 0; i < score15.length; i++) {
			
		    if (score15[i].length == 2) {
		        catego2[i] = category3[0];
		       
		    } else if (score15[i].length == 3) {
		        catego2[i] = category3[1];
		    } else if (score15[i].length == 4) {
		        catego2[i] = category3[2];
		    }		
		 
		}   
		for (int i = 0; i < res15.length; i++) {
			if(catego2[i]=="재직자") {
				res15[i][0]=score15[i][0]+score15[i][1];
				res15[i][1]=(score15[i][0]+score15[i][1]+10)/2;
			}else if(catego2[i]=="일반") {
				res15[i][0]=score15[i][0]+score15[i][1];
				res15[i][1]=score15[i][0]+score15[i][1]/3;
			}else if(catego2[i]=="예체능") {
				res15[i][0]=score15[i][0]+score15[i][1];
				res15[i][1]=(int)((score15[i][0]*0.2)+(score15[i][1]*0.15)+
						(score15[i][2]*0.05)+(score15[i][0]*0.6));
			
		}
			}
		for (int me = 0; me < res15.length; me++) {
		    rank1[me] = 1;
		    rank2[me]=1;

		    for (int you = 0; you < res15.length; you++) {
		        if (res15[me][1] < res15[you][1]) {
		            rank1[me]++;
		        }
		        if (res15[me][1] < res15[you][1]&&catego2[me]==catego2[you]) {
		    rank2[me]++;}
		}}
		
		for (int i = 0; i < res15.length; i++) {
			gender[i] = "";
			if(res15[i][1]%2==0) {
			gender[i]+="남자";
			}else {gender[i]+="여자";}
		}
		
		System.out.println("구분\t이름\t성별\t국어\t수학\t영어\t특기\t총점\t평점\t등수\t구분등수\n-----------"
				+ "------------------------------------------------------------------------");
		for (int i = 0; i < name15.length; i++) {
		    String gogo=catego2[i]+"\t"+name15[i]+"\t"+gender[i]+"\t";
		   
		  
		    	
		        if(catego2[i]=="재직자") {
		            gogo+=score15[i][0]+"\t"+score15[i][1]+"\t"+"\t"+"\t";
		            }
		        else if(catego2[i]=="일반") {
			        gogo+=score15[i][0]+"\t"+score15[i][1]+"\t"+score15[i][2]+"\t"+"\t";}
		        else if(catego2[i]=="예체능") {
			        gogo+=score15[i][0]+"\t"+score15[i][1]+"\t"+score15[i][2]+"\t"+score15[i][3]+"\t";}
		        else {}
		        for (int muji : res15[i]) {
					gogo+=muji+"\t";
				}
		        gogo+=rank1[i]+"\t  ";
		        gogo+=rank2[i]+"\t";
		        
		        
		        
		        System.out.println(gogo);
		}
	

	}
}
