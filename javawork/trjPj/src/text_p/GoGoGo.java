package text_p;

import java.util.Scanner;

class Music extends Thread{
	String mu="Anti ti ti ti fragile fragile, Anti ti ti ti fragile,Anti ti ti ti fragile, fragileAntifragile antifragile,	가시밭길 위로 riding you made me boost,거짓으로 가득 찬 party 가렵지도 않아,내 뒤에 말들이 많아 나도 첨 듣는 내 rival,모두 기도해 내 falling 그 손 위로 Imma jump in,Yes gimme that,걸어봐 위엄 like a lion 눈빛엔 거대한 desire,더 부어 gasoline on fire 불길 속에 다시 날아 rising,더 부어 gasoline on fire 불길 속에 다시 날아 rising,잊지 마 내가 두고 온 toe shoes 무슨 말이 더 필요해,무시 마 내가 걸어온 커리어,I go to ride till I die die,더 높이 가줄게 내가 바랐던 세계 젤 위에,Anti ti ti ti fragile fragile, Anti ti ti ti fragile,Anti ti ti ti fragile, fragileAntifragile antifragile,	가시밭길 위로 riding you made me boost,거짓으로 가득 찬 party 가렵지도 않아,내 뒤에 말들이 많아 나도 첨 듣는 내 rival,모두 기도해 내 falling 그 손 위로 Imma jump in,Yes gimme that,걸어봐 위엄 like a lion 눈빛엔 거대한 desire,더 부어 gasoline on fire 불길 속에 다시 날아 rising,더 부어 gasoline on fire 불길 속에 다시 날아 rising,잊지 마 내가 두고 온 toe shoes 무슨 말이 더 필요해,무시 마 내가 걸어온 커리어,I go to ride till I die die,더 높이 가줄게 내가 바랐던 세계 젤 위에";
			
			//
			//내 뒤에 말들이 많아 나도 첨 듣는 내 rival "";
    String []arr =mu.split(",");
    
    
    
  
	public Music (String name) {
		super(name);
	}
	
	
	public void run() {
	
		  
		for (int i =0;i<10000; i++) {
			System.out.println(arr[i]);
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		
		}
			
		}
	}
}

public class GoGoGo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Music s1= new Music("");

		while(true) {
		System.out.println("1.재생  2.일시정지,3.다시재생4.스톱");
		String id = sc.nextLine();
		if(id.equals("1")) {
			System.out.println("재생==>");
		s1.start();
		}else if(id.equals("2")) {
			System.out.println("일시정지==>");
			s1.suspend(); 
		}else if(id.equals("3")) {
			System.out.println("다시재생==>");
			s1.resume(); 
		}else if(id.equals("4")) {
			System.out.println("다시재생==>");
			s1.stop();
		
		

	}}}}


//동영상 플레이어를 구현하세요 
//뒤로재생,재생(정지취소),일시정지,정지
//재생중 -자막 출력 
//
//Anti ti ti ti fragile fragile
//
//Anti ti ti ti fragile
//
//Anti ti ti ti fragile fragile
//
//Antifragile antifragile
//
//가시밭길 위로 riding you made me boost up
//
//거짓으로 가득 찬 party 가렵지도 않아
//
//내 뒤에 말들이 많아 나도 첨 듣는 내 rival
//
//모두 기도해 내 falling 그 손 위로 I'mma jump in
//
//Yes gimme that,걸어봐 위엄 like a lion 눈빛엔 거대한 desire,더 부어 gasoline on fire 불길 속에 다시 날아 rising,더 부어 gasoline on fire 불길 속에 다시 날아 rising,잊지 마 내가 두고 온 toe shoes 무슨 말이 더 필요해,무시 마 내가 걸어온 커리어,I go to ride till I die die,더 높이 가줄게 내가 바랐던 세계 젤 위에
//
//
//
//
//
//
//
//
//
//
//
//
//
//떨어져도 돼 I'm antifragile antifragile
//
//난 지금 on my way 갖다버려 줘 너의 fairy tale
//
//Now you know my name
//
//I'm antifragile antifragile
//
//Anti ti ti ti fragile fragile
//
//Anti ti ti ti fragile
//
//Anti ti ti ti fragile fragile
//
//Antifragile antifragile
//
//“Lovey lovey lovey dovey dovey dovey”
//
//멋대로 정하네 나란 애에 대해
//
//I don't know what to say I can't feel it
//
//뜨거운 관심은 환영 귀여운 질투는 go ahead
//
//줄 달린 인형은 no thanks 내 미랠 쓸 나의 노래
//
//Yes gimme that
//
//걸어봐 위엄 like a lion 눈빛엔 거대한 desire
//
//더 부어 gasoline on fire 불길 속에 다시 날아 rising
//
//잊지 마 내가 두고 온 toe shoes 무슨 말이 더 필요해
//
//무시 마 내가 걸어온 커리어
//
//I go to ride till I die die
//
//더 높이 가줄게 내가 바랐던 세계 젤 위에
//
//떨어져도 돼 I'm antifragile antifragile
//
//난 지금 on my way 갖다버려 줘 너의 fairy tale
//
//Now you know my name
//
//I'm antifragile antifragile
//
//Anti ti ti ti fragile fragile
//
//Anti ti ti ti fragile
//
//Anti ti ti ti fragile fragile
//
//Antifragile antifragile
//
//We can break it baby
//
//Rock it twist it lock it baby
//
//All I know is you can't chain me
//
//'Cause I'm gonna break out gonna gonna break out out
//
//We can break it baby
//
//Rock it twist it lock it baby
//
//All I know is you can't chain me
//
//'Cause I'm gonna break out gonna gonna break out out
//
//더 높이 가줄게 내가 바랐던 세계 젤 위에
//
//떨어져도 돼 I'm antifragile antifragile
//
//난 지금 on my way 갖다버려 줘 너의 fairy tale
//
//Now you know my name
//
//I'm antifragile antifragile
//
//Anti ti ti ti fragile fragile
//
//Anti ti ti ti fragile
//
//Anti ti ti ti fragile fragile
//
//Antifragile antifragile