package io_p;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.TreeSet;

class ObjectExam implements Comparable<ObjectExam>, Serializable{
	
	String name;
	char res;
	int [] jum;
	int tot, avg, rank;
	public ObjectExam(String ttt) {
		String [] arr1 = ttt.split("_");
		this.name = arr1[0];
		String [] arr2 = arr1[1].split(",");
		this.jum = new int [arr2.length];
		
		for (int i = 0; i < arr2.length; i++) {
			jum[i] = Integer.parseInt(arr2[i]);
		}
		
		calc();
	}
	
	void calc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
		res = "가가가가가가양미우수수".charAt(avg/10);
	}
	
	void rankCalc(TreeSet<ObjectExam> set) {
		rank = 1;
		for (ObjectExam you : set) {
			if(avg<you.avg) {
				rank++;
			}
		}
	}

	@Override
	public int compareTo(ObjectExam you) {
		
		return you.avg - avg;
	}

	@Override
	public String toString() {
		return name + "\t" + Arrays.toString(jum) + "\t" + tot + "\t" + avg + "\t"
				+ res +"\t"+ rank;
	}
	
	
}

public class ObjectExamInMain {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("fff/examObj.txt");
			BufferedReader br = new BufferedReader(fr);
			
			TreeSet<ObjectExam> set = new TreeSet<ObjectExam>();
			String line = null;
			while((line=br.readLine())!=null) {
				set.add(new ObjectExam(line));
			}
			
			br.close();
			fr.close();
			
			for (ObjectExam obj : set) {
				obj.rankCalc(set);
				
			}
			FileOutputStream fos = new FileOutputStream("fff/examObjRes.yui");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			for (ObjectExam obj : set) {
				//System.out.println(obj.name);
				oos.writeObject(obj);
			}
			oos.close();
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
