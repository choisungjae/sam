package Mouum.Sam;

class ClassStudRank{
	String kind,name, grade, gender;
	int [] jum;
	int ban,tot, avg;
	int [] rank = new int[6]; //전체, 구분, 반 , 성별 , 반성별, 구분반성별
	int [] sort = new int[6];
	int ppNo = 0;
	int [] sortCnt;
	
	void init(int ban,String gender,String name,int [][][] cnt ,int ...jum) {
		String [] kind = {"직장인","일반","예체능"};
		this.ban = ban;
		this.gender = gender;
		this.name = name;
		this.jum = jum;
		
		sortCnt = new int[] {jum.length-2, ban, 0};
		if(gender.equals("여")) {
			sortCnt[2] = 1;
		}
		
		this.kind = kind[sortCnt[0]];
		cnt[sortCnt[0]][ban][sortCnt[2]]++;
		
		calc();
	}
	
	void calc() {
		
		String [] grade = {"가","가","가","가","가","가","양","미","우","수","수"};
		double [] rate = {0.2,0.15,0.05,0.6};
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		switch(kind) {
		case "직장인":
			avg = (tot+10)/jum.length;
			break;
		case "일반":
			avg = tot/jum.length;
			break;
		case "예체능":
			avg = 0;
			for (int i = 0; i < jum.length; i++) {
				avg += rate[i] * jum[i];
			}
			break;
		
		}
		
		this.grade = grade[avg/10];
	}
	
	void rankCalc(ClassStudRank [] studs ) {
		for (int i = 0; i < rank.length; i++) {
			rank[i] = 1;
		}
		for (ClassStudRank you : studs) {
			
			if(avg < you.avg) {
				
				rank[0]++;
				//구분
				if(kind.equals(you.kind)) {
					rank[1]++;
				}
				//반
				if(ban == you.ban) {
					rank[2]++;
				}
				//성별
				if(gender.equals(you.gender)) {
					rank[3]++;
				}
				//반성별
				if(gender.equals(you.gender) 
						&& ban == you.ban) {
					rank[4]++;
				}
				//구분반성별
				if(kind.equals(you.kind) 
					&& gender.equals(you.gender) 
						&& ban == you.ban) {
					rank[5]++;
				}
			}
			
			
		}
	}
	
	
	void posCalc(int [][][] cnt) {
		for (int k = 0; k < cnt.length; k++) {
			//System.out.println(k+"------");
			for (int b = 0; b < cnt[k].length; b++) {
				//System.out.println("  "+b+"------");
				for (int g = 0; g < cnt[k][b].length; g++) {
					
					int kbg = cnt[k][b][g];
					
					//구분
					if(k<sortCnt[0]) {
						sort[1]+=kbg;
						sort[5]+=kbg;
					}
					//출력2번:반
					if(b<sortCnt[1]) {
						sort[2]+=kbg;
						sort[4]+=kbg;
						if(k==sortCnt[0]) {
							sort[5]+=kbg;
						}
					}
					//성별
					if(g<sortCnt[2]) {
						sort[3]+=kbg;
						if(b==sortCnt[1]) {
							sort[4]+=kbg;
							if(k==sortCnt[0]) {
								sort[5]+=kbg;
							}
						}
					}
					//System.out.println(cnt[k][b][g]);
				}
			}
		}
		
		
		
		//System.out.println(me.ban+me.name+"=====================");
		
		for (int i = 0; i < rank.length; i++) {
			sort[i]+=rank[i];
		}
	}
	
	void ppp() {
		String ttt = kind+"\t"+ban+"\t"+gender+"\t"+name+"\t";
		for (int i : jum) {
			ttt+=i+"\t";
		}
		for (int i = jum.length; i < 4; i++) {
			ttt+="\t";
		}
		ttt+=tot+"\t"+avg+"\t"+grade+"\t\t";
		for (int i : rank) {
			ttt+=i+"\t";
		}
		System.out.println(ttt);
	}
	
	
	
	void ppp2() {
		String ttt = kind+"\t"+ban+"\t"+gender+"\t"+name+"\t";
		for (int i : jum) {
			ttt+=i+"\t";
		}
		for (int i = jum.length; i < 4; i++) {
			ttt+="\t";
		}
		ttt+=tot+"\t"+avg+"\t"+grade+"\t\t"+rank[ppNo];
//		for (int i : rank) {
//			ttt+=i+"\t";
//		}
		
		System.out.println(ttt);
	}
}

public class d일반예체능직장인랭크 {

	public static void main(String[] args) {
		// 원시데이터
		String [] [] info = {
				// 표본 36명 : 남 27명 / 여 9명
				
				//이름
				{
					"유비", "관우", "장비", "두씨",
					"동탁", "여포", "헌제", "초선",
					"조운", "위연", "황충", "손상향",
					"손권", "손견", "주유", "소교",
					"제갈량", "강유", "마속", "황월영",
					"조조", "하후돈", "하후연", "변씨",
					"이각", "곽사", "진궁", "여령기",
					"여몽", "손책", "육손", "대교",
					"조비", "사마의", "순욱", "견희",
					
				},	
				/////
				//성별
				{
					"남", "남" ,"남", "여",
					"남", "남" ,"남", "여",
					"남", "남" ,"남", "여",
					"남", "남" ,"남", "여",
					"남", "남" ,"남", "여",
					"남", "남" ,"남", "여",
					"남", "남" ,"남", "여",
					"남", "남" ,"남", "여",
					"남", "남" ,"남", "여",
					
				}
		};
		
		int [] ban = {
			1,2,2,3,3,1,1,3,2,1,
			2,2,3,3,3,1,1,2,3,1,
			3,3,2,3,1,1,2,3,1,3,
			2,2,3,1,1,2
		};
		
		int [][] score = {
				{82,92,76,99},{98,85,92},{99,68,52},{85,78},
				{85,26,85,72},{99,82,64},{15,63,42},{85,78,42},
				{94,86,72},{83,85,78},{85,98},{55,96,76,82},
				{69,78,82,68},{78,62,66},{85,99,82},{75,98},
				{82,97,99},{78,85,62},{85,56,52},{78,67},
				{98,52,99,99},{62,85,72},{75,58,82},{55,78,66,96},
				{54,71,66},{58,65,42},{75,68,82},{54,76},
				{85,78,62},{78,85,72},{64,83},{85,75,55},
				{78,22,62},{78,62,98},{72,78,82},{82,75,95},
				
		};
		
		////////////////-------> 여기까지 고정
		
		//////---> 여기부터 수정
		//입력부
		//String [] kind = {"직장인","일반","예체능"};
		//String [] grade = {"가","가","가","가","가","가","양","미","우","수","수"};
		//double [] rate = {0.2,0.15,0.05,0.6};
		ClassStudRank [] studs = new ClassStudRank[score.length];
		
		                      //구분반성별
		int [][][] cnt = new int[3][4][2];
		
		for (int i = 0; i < studs.length; i++) {
			
			studs[i] = new ClassStudRank();
			studs[i].init(ban[i],info[1][i],info[0][i],cnt ,score[i]);
			
			/*
			me.gender = info[1][i];
			me.ban = ban[i];
			
			me.sortCnt[0] = score[i].length-2;
			me.sortCnt[1] = me.ban;
			me.sortCnt[2] = 0;
			if(me.gender.equals("여")) {
				me.sortCnt[2] = 1;
			}
			
			me.kind = kind[me.sortCnt[0]];
			//me.name = info[0][i];
			
			
			me.jum = score[i];
			*/
			
			
			//cnt[me.sortCnt[0]][me.ban][me.sortCnt[2]]++;
			
			
			 
		}
		/*	
		for (int[][] is : cnt) {
			System.out.println("==================");
			for (int[] is2 : is) {
				for (int i : is2) {
					System.out.println(i);
				}
				System.out.println("---------------");
			}
		}
		
		
직장인==================
0반
남0
여0
---------------
1반
남0
여2
---------------
2반
남2
여0
---------------
3반
남0
여2
---------------
일반==================
0반
0   
0
1반---------------
남 9
여 0
2반 ---------------
남 6
2
---------------
6
1
---------------
==================
0
0
---------------
1
0
---------------
0
1
---------------
3
1
--------------- 
		 * */
		
		
		/*
		//연산부
		for (ClassStudRank st : studs) {
			//st.kind = kind[st.jum.length-2];
			st.tot = 0;
			for (int i : st.jum) {
				st.tot += i;
			}
			switch(st.kind) {
			case "직장인":
				st.avg = (st.tot+10)/st.jum.length;
				break;
			case "일반":
				st.avg = st.tot/st.jum.length;
				break;
			case "예체능":
				st.avg = 0;
				for (int i = 0; i < st.jum.length; i++) {
					st.avg += rate[i] * st.jum[i];
				}
				break;
			
			}
			
			st.grade = grade[st.avg/10];
		}*/
		
		//등수
		for (ClassStudRank me : studs) {
			me.rankCalc(studs );
		
		}
	/////---> 여기까지 수정
		
		//위치
		for (ClassStudRank me : studs) {
			
			me.posCalc(cnt);
			//전체, 구분, 반 , 성별 , 반성별, 구분반성별
			
                                     //구분반성별
			//int [][][] cnt = new int[3][4][2];
			/*
			///1번 구분
			for (int i = 0; i < me.sortCnt[0]; i++) {
				for (int[] js : cnt[i]) {
					for (int jjs : js) {
						//System.out.println(jjs);
						me.sort[1]+=jjs;
						me.sort[5]+=jjs;
					}
				}
			}
			
			///2번 반
			for (int[][] js : cnt) {
				//System.out.println(me.sortCnt[1]);
				for (int b = 0; b < me.sortCnt[1]; b++) {
					for (int jjs : js[b]) {
						//System.out.println(jjs);
						me.sort[2]+=jjs;
						me.sort[4]+=jjs;
					}
				}
			}
			
			
			///3번 성별
			for (int[][] js : cnt) {
				
				for (int[] jjs : js) {
					for (int g = 0; g < me.sortCnt[2]; g++) {
						//System.out.println(jjs);
						me.sort[3]+=jjs[g];
					}
				}
			}
			
			//4번 반성별
			for (int[][] js : cnt) {
				for (int g = 0; g < me.sortCnt[2]; g++) {
					//System.out.println(jjs);
					me.sort[4]+=js[me.sortCnt[1]][g];
				}
			}
			//5번 구분반성별
			for (int b = 0; b < me.sortCnt[1]; b++) {
				for (int is : cnt[me.sortCnt[0]][b]) {
					me.sort[5]+=is;
				}
			}
			for (int g = 0; g < me.sortCnt[2]; g++) {
				//System.out.println(jjs);
				me.sort[5]+=cnt[me.sortCnt[0]][me.sortCnt[1]][g];
			}
			*/
			//전체, 구분, 반 , 성별 , 반성별, 구분반성별
			
            							//구분반성별
			//int [][][] cnt = new int[3][4][2];
			
//			for (int k = 0; k < cnt.length; k++) {
//				//System.out.println(k+"------");
//				for (int b = 0; b < cnt[k].length; b++) {
//					//System.out.println("  "+b+"------");
//					for (int g = 0; g < cnt[k][b].length; g++) {
//						
//						int kbg = cnt[k][b][g];
//						
//						//구분
//						if(k<me.sortCnt[0]) {
//							me.sort[1]+=kbg;
//							me.sort[5]+=kbg;
//						}
//						//출력2번:반
//						if(b<me.sortCnt[1]) {
//							me.sort[2]+=kbg;
//							me.sort[4]+=kbg;
//							if(k==me.sortCnt[0]) {
//								me.sort[5]+=kbg;
//							}
//						}
//						//성별
//						if(g<me.sortCnt[2]) {
//							me.sort[3]+=kbg;
//							if(b==me.sortCnt[1]) {
//								me.sort[4]+=kbg;
//								if(k==me.sortCnt[0]) {
//									me.sort[5]+=kbg;
//								}
//							}
//						}
//						//System.out.println(cnt[k][b][g]);
//					}
//				}
//			}
//			
//			
//			
//			//System.out.println(me.ban+me.name+"=====================");
//			
//			for (int i = 0; i < me.rank.length; i++) {
//				me.sort[i]+=me.rank[i];
//			}
		}
			
		
		int ppNo = 5;
		//출력부
		for (int r = 1; r <= studs.length; r++) {
			for (ClassStudRank st : studs) {
				if(r==st.sort[ppNo]) {
					st.ppNo = ppNo;
					st.ppp2();
				}
			}
		}
		
		
		/*
		System.out.println("입력순서 ---------------------");
		for (ClassStudRank st : studs) {
			st.ppp();
		}
		
		//전체, 구분, 반 , 성별 , 반성별, 구분반성별
		System.out.println("전체 ---------------------");
		for (int r = 1; r <= studs.length; r++) {
			for (ClassStudRank st : studs) {
				if(r==st.rank[0]) {
					st.ppp();
				}
			}
		}
		System.out.println("구분 ---------------------");
		for (String kk:kind) {
			System.out.println(kk+">>>");
			for (int r = 1; r <= studs.length; r++) {
				for (ClassStudRank st : studs) {
					if(r==st.rank[1] && st.kind.equals(kk)) {
						st.ppp();
					}
				}
			}
		}
		
		System.out.println("반 ---------------------");
		for (int b = 1; b <= 3; b++) {
			
		
			System.out.println(b+">>>");
			for (int r = 1; r <= studs.length; r++) {
				for (ClassStudRank st : studs) {
					if(r==st.rank[2] && b == st.ban) {
						st.ppp();
					}
				}
			}
		}
		
		System.out.println("성별 ---------------------");
		for (String kk:new String[] {"남","여"}) {
			System.out.println(kk+">>>");
			for (int r = 1; r <= studs.length; r++) {
				for (ClassStudRank st : studs) {
					if(r==st.rank[3] && st.gender.equals(kk)) {
						st.ppp();
					}
				}
			}
		}
		
		System.out.println("반성별 ---------------------");
		for (int b = 1; b <= 3; b++) {
			
		
			System.out.println(b+">>>");
			for (String kk:new String[] {"남","여"}) {
				System.out.println("   "+kk+">>>");
				for (int r = 1; r <= studs.length; r++) {
					for (ClassStudRank st : studs) {
						if(r==st.rank[4] && st.gender.equals(kk) && b == st.ban) {
							st.ppp();
						}
					}
				}
			}
		}
		
		System.out.println("구분반성별 ---------------------");
		for (String kk:kind) {
			System.out.println(kk+">>>");
			for (int b = 1; b <= 3; b++) {
				
				
				System.out.println("   "+b+">>>");
				
				for (String gg:new String[] {"남","여"}) {
					System.out.println("       "+gg+">>>");
					for (int r = 1; r <= studs.length; r++) {
						for (ClassStudRank st : studs) {
							if(r==st.rank[5] && 
									st.gender.equals(gg) && 
									b == st.ban && 
									  st.kind.equals(kk)) {
								st.ppp();
							}
						}
					}
				}
			}
		}
		*/
	}

}