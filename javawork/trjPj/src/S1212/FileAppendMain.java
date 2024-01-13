package S1212;

import java.io.FileOutputStream;

public class FileAppendMain {

	public static void main(String[] args) {
		try {
			 //쓰기 --> 기존 파일 내용 삭제 후 새로운 내용 기재
			FileOutputStream fw =new FileOutputStream("fff/fw.txt");
			fw.write("아기상어\n".getBytes());
			fw.write("엄마상어\n".getBytes());
			fw.write("아빠상어\n".getBytes());
			fw.close();
			
			//추가 --> 기존 파일 내용 다음에 새로운 내용 기재
			FileOutputStream fa =new FileOutputStream("fff/fa.txt", true);
			fa.write("아기상어\n".getBytes());
			fa.write("엄마상어\n".getBytes());
			fa.write("아빠상어\n".getBytes());
			fa.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}