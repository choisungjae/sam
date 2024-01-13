package homeworkPj;

import java.util.Arrays;

class oi{
	String name;
	int[]jum;
	int avg,tot;
	
	void ddd(String name, int gan,int en, int mat) {
		this.name=name;
	   jum=new int[] {gan,en,mat};
		
	}
	void avg() {
		tot=0;
		for (int i = 0; i < jum.length; i++) {
			tot+=jum[i];
		}avg=tot/3;
	}
	
	void eee() {
		System.out.println(name+"\t"+(Arrays.toString(jum)+"\t"+avg+"\t"+tot));
	}
	
	
	
	
}

public class uuy {

	public static void main(String[] args) {
	   
	   
	   String [] aa = {"dd","Aa"};
	   String[] name = new String []{"최성재","정운만","이정현","박건우"};
	
	   int[][] score= {{33,44,55},
			   {33,74,55},
			   {33,44,55},
			   {73,44,55}};
	   oi[] zm=new oi[name.length];
	   
	     for (int i = 0; i < zm.length; i++) {
			zm[i]=new oi();
			zm[i].ddd(name[i],score[i][0],score[i][1],score[i][2]);
			zm[i].avg();
			zm[i].eee();
			
		}
	   
	   
	   


}}