package io_p;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectExamResInMain {

	public static void main(String[] args) {
		try {
			
			FileInputStream fis = new FileInputStream("fff/examObjRes.yui");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			while(fis.available()>0) {
				System.out.println(ois.readObject());
			}
			
			ois.close();
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
