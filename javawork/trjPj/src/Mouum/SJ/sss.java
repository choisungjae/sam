package Mouum.SJ;

class Shape{
	String name;
	int area, border;
	
	public Shape(int w,int h){
		this.name = "직사각형";
		this.area = w*h;
		this.border = (w+h)*2;
	}
	public Shape(int w,int h, int s){
		this.name = "직각삼각형";
		this.area = w*h/2;
		this.border = w+h+s;
	}
	
	@Override
	public String toString() {
		return name+"===>\n"+"넒이 :"+area+"\n"+"둘레 : "+border ;
	}
	
}

class SingleShape{
	Shape [] sh = {
			new Shape(2,3),
			new Shape(5,1,2),
			new Shape(4,2),
			new Shape(6,7),
			new Shape(4,2,90),
	};
	
	static private SingleShape me = null;
	
	
	private SingleShape() {}
	
	public static SingleShape giveMe() {
		if(me ==null) {
			me = new SingleShape();
		}
		return me;
	}
	
	@Override
	public String toString() {
		String res = "";
		
		for (Shape shape : sh) {
			res+= shape+"\n\n";
		}
		return res;
	}
}


class CompareShape{
	SingleShape ss = SingleShape.giveMe();
	String areaBiggerName,borderBiggerName;
	int area,border;
	
	public CompareShape() { // 전체 도형 다 비교
		
		for (Shape sh : ss.sh) {
			if(this.area < sh.area) {
				this.area = sh.area;
				this.areaBiggerName = sh.name;
			}
			if(this.border < sh.border) {
				this.border = sh.border;
				this.borderBiggerName = sh.name;
			}
		}

	}
	
	public CompareShape(String name) { //이름이 같은 도형들만 비교
		for (Shape sh : ss.sh) {
			if(this.area < sh.area && name.equals(sh.name)) {
				this.area = sh.area;
				this.areaBiggerName = sh.name;
			}
			if(this.border < sh.border && name.equals(sh.name)) {
				this.border = sh.border;
				this.borderBiggerName = sh.name;
			}
		}
	}
	
	@Override
	public String toString() {
		return "넓이가 더 큰 도형 : "+areaBiggerName +"\t 넓이 : "+area+"\n둘레가 더 큰 도형 : "+borderBiggerName+"\t 둘레 : "+ border;
	}
	
}

public class sss {
	
	public static void main(String[] args) {
		System.out.println(SingleShape.giveMe());
		
		CompareShape cs = new CompareShape();
		CompareShape cs2 = new CompareShape("직사각형");
		
//		System.out.println(cs);
//		System.out.println();
//		System.out.println(cs2);
	}
}