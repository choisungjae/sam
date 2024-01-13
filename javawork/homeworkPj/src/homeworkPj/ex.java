package homeworkPj;

public class ex {

	public static void main(String[] args) {
		
		
		int [][] score = {
				{86, 82, 74},
				{76, 92, 64},
				{72, 79, 54, 98},
				{76, 92, 64, 82},
				{96, 82, 78},
				{77, 85, 91},
				{76, 62},
				{82, 74},
				{62, 89, 34, 88},
				{72, 62, 44, 76},
				{92, 82, 89},
				{96, 62},
				{72, 74},
				{82, 88},
				{91, 82, 78},
				{88, 78, 69},
				{67, 72, 52, 99},
				{82, 67},
				{99, 88},
				{92, 89, 82, 88}
		};
		String [] name = {
				"김일반", "이일반", "김체능", "이체능", 
				"박일반", "최일반", "김재직", "이재직", 
				"박체능", "최체능", "정일반", "박재직", 
				"최재직", "정재직", "강일반", "주일반",
				"강체능", "강재직", "주재직", "주체능"
				};
		String [] sort = {"", "", "재직자", "일반", "예체능"};
		String [] type = new String [name.length];
		int [] rankTot = new int [name.length];
		int [] rankAvg = new int [name.length];
		int [] rankTyp = new int [name.length];
		
		int [][] res = new int[score.length][2];

		
		for (int i = 0; i < score.length; i++) {
			//유형 매칭
			type[i] = sort[score[i].length];

            //총점, 평점 
			switch(score[i].length) {
			case 3 :
				//일반 
				res[i][0] = score[i][0] + score[i][1] + score[i][2];
				res[i][1] = res[i][0]/score[i].length;
				break;
			case 4 :
				//예체능
				res[i][0] = score[i][0] + score[i][1] + score[i][2] + score[i][3];
				res[i][1] = (int)(score[i][0] * .2) + (int)(score[i][1] * .15) + (int)(score[i][2] * .05) + (int)(score[i][3] * .6);
				break;
			case 2 :
				//재직자
				res[i][0] = score[i][0] + score[i][1];
				res[i][1] = (res[i][0]+10)/score[i].length;
				break;			
			}
		}
		
		// 등수 
		for (int me = 0; me < res.length; me++) {
			rankTot[me] = 1;
			rankAvg[me] = 1;
			rankTyp[me] = 1;
			
			for (int you = 0; you < res.length; you++) {
				if(res[me][0]<res[you][0]) {
					//총점등수
					rankTot[me]++;
				}		
				if(res[me][1]<res[you][1]) {
					//평점등수
					rankAvg[me]++;
				}	
				if(res[me][1]<res[you][1] && type[me]==type[you]) {
					// 유형별 평점등수 
					rankTyp[me]++;
				}	
			}
		}
		
		System.out.println("유형\t"+"이름\t"+"국어\t"+"영어\t"+"수학\t"+"특기\t"+"총점\t"+"평점\t"+"총점등수\t"+"평점등수\t"+"유형별등수");
		System.out.println("----------------------------------------------------------------------------------------");

		for (int i = 0; i < res.length; i++) {
			String ttt = type[i]+"\t" + name[i]+"\t";
			switch(score[i].length) {
			case 3: 
				ttt += score[i][0]+"\t"+ score[i][1]+"\t"+ score[i][2]+"\t"+ ""+"\t";
				break;
			case 4: 
				ttt += score[i][0]+"\t"+ score[i][1]+"\t"+ score[i][2]+"\t"+ score[i][3]+"\t";
				break;
			case 2: 
				ttt += score[i][0]+"\t"+ score[i][1]+"\t"+ ""+"\t"+ ""+"\t";
				break;
			}


			for (int js : res[i]) {
				ttt += js+"\t";
			}
			ttt += rankTot[i]+"\t"+ rankAvg[i]+"\t"+ rankTyp[i]+"/"+type[i];
			
			
			System.out.println(ttt);
		}
	}


	}


