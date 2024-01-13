package Mouum.SJ;



class Ipon implements All3{
	String name;
	int time=0,timee;
	int time2=0,timee2;
	int cnt=0,cntt;
	double batarry=100;
	
	double oneshott=batarry*0.01;
	double multtishot=oneshott*cntt;
	double listenba=batarry*0.02;
	double videba=batarry*0.04;
	
	
    public Ipon(String name) {
		this.name=name;
		
	}
	public void oneshot() {
		cnt++;
		//System.out.println(cnt+","+cntt);
		System.out.println(name+"이가 사진을1번 찍었습니다.\t\t베터리소모("+(int)oneshott+"%)");
		alarm();//베터리20%이하부터경고음
		}
	public void multishot(int cntt) {
		cnt+=cntt;
		//System.out.println(cnt+","+cntt);
		System.out.println(name+"이가 사진을"+cntt+"번 찍었습니다.\t\t베터리소모("+(int)(oneshott*cntt)+"%)");
		alarm();
	}
	public void listen(int timee) {
		double liba=timee*listenba;
		System.out.println(name+"이가 노래를 "+timee+"분동안 들었습니다.\t베터리소모("+(int)liba+"%)");
		time+=timee;
		alarm();
		
		
	}
	public void listen(int timee,String call) {
		double liba=timee*listenba;
		System.out.println(name+"이가 통화를 "+timee+"분동안 했습니다.\t베터리소모("+(int)liba+"%)");
		time+=timee;
		alarm();
	}
	public void stop(int timee) {
		double liba=timee*listenba;
		System.out.println(name+"이가 "+timee+"분만큼노래를 듣고 껐습니다.\t베터리소모("+(int)(liba)+"%)");
		time+=timee;
		alarm();
	}
	public void videocall(int timee2) {
		double veba=timee2*videba;
		System.out.println(name+"이가 "+timee2+"분동안 영상통화를 사용했습니다.\t베터리소모("+(int)(veba)+"%)");
		time2+=timee2;
		alarm();
	}
	void alarm() {
		int cabataryy= cnt*1;
		double liba=time*2,veba=time2*4;
		int ba=(int)(cabataryy+liba+veba);
		double jan=batarry-ba;
		if(jan<=20) {
			System.out.println("  [알람]"+name+"님 베터리가20%이하입니다\t잔량:"+(int)jan+"%");
		}
		
		
		
	}
	void pp() {
		//System.out.println(time+","+cnt+","+liba);
		
		int cabataryy= cnt*1;
		double liba=time*2,veba=time2*4;
		int ba=(int)(cabataryy+liba+veba);
		double jan=batarry-ba;
		System.out.println("------------------------------------------");
		System.out.println(name+"님 배터리를 총 "+ba+"%만큼 사용했습니다.");
		if(jan<=50) {
			System.out.println(name+"님 휴대폰베터리잔량 "+(int)jan+"%로 충전해야 합니다.");
		}else {
			System.out.println(name+"님 휴대폰베터리잔량 "+(int)jan+ "%로 충분함으로 사용가능합니다.");
		}
	}
	
}

interface Camera{
	void oneshot();
	void multishot(int cutt);
}

interface Mp3{
	void listen(int timee);
	void stop(int timee);
};
interface Call{
	void listen(int timee,String call);
	void videocall(int timee2);
}
interface All3 extends Camera, Mp3, Call{	
}
public class Pon {

	public static void main(String[] args) {
		System.out.println("배터리 소모량 -사진촬영한장당 1%,영상통화 분당4%\n\t   노래분당 2%,일반통화 분당 2%");
		Ipon [] Go= {
				new Ipon("김정남"),
				new Ipon("이상수"),
				};
		Camera cam =Go[0];
		Mp3 mp= Go[0];
		Call ca= Go[0];
		Call ca2= Go[1];
		
		cam.oneshot();
		mp.listen(5);
		cam=Go[1];
		cam.multishot(8);
		ca2.videocall(10);
		mp.stop(10);
		ca.listen(3,"call");
		ca=Go[1];
		ca.listen(2,"call");
		mp.listen(2);
		for (Ipon ipon : Go) {
			ipon.pp();
		}
		}
	}
