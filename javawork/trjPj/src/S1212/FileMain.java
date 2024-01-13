package S1212;

//지정한 폴더의 파일을 각각 종류별로 지정 폴더에 저장하시오
/// 하위 폴더까지 검색하세요
/// 같은 파일명인 경우 중복 처리 하세요

//이미지 : bmp, jpg, gif, png , jpeg
//음악 : mp3, wma, wav
//문서 :doc, hwp, ppt, xls, pptx, xlsx. docx
//기타 : 위의 분류 이외
//확장자의 대소문자 구분하지 않음

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;

public class FileMain {

	public static void main(String[] args) throws IOException {
		File ff= new File("ffff/qqq/bbb.txt");
//		File ff= new File("C:\\CSJ\\study\\javawork\\trjPj\\ffff\\qqq\\bbb.txt"); //절대주소

		System.out.println(ff);
		System.out.println(ff.exists());   //존재하면 트루
		System.out.println(ff.isFile());   //너 파일이냐?
		System.out.println(ff.isDirectory());//너 디렉토리냐? [폴더]
		System.out.println(ff.isAbsolute());   //절대주소냐?
		System.out.println(ff.getParent());  //어디에있냐?
		System.out.println(ff.getName());    //너 이름이 모니 
		System.out.println(ff.getAbsolutePath());   //너 절대주소 보여줘
		System.out.println(ff.getPath());          //너 주소가 어디야
		System.out.println(ff.isHidden());           //너 숨김모드냐?
		System.out.println(ff.canWrite());        //너 쓸수있는파일이냐? [읽기전용인지물어보는것]
		System.out.println(ff.length());            //너 크기몇이냐  byte;
		System.out.println(new Date(ff.lastModified()));       //마지막 수정일이 언제냐 ?
		
		ff = new File("ffff/zzz.xcv");
		ff.createNewFile();             //파일 생성
		
		new File("ffff/ttt").mkdir();    //폴더 생성
//		new File("ffff/ooo/ppp").mkdir();    안댐
		new File("ffff/ooo/ppp").mkdirs();    //한방에 폴더,파일 생성
		
		ff.delete();                        //삭제
		
		new File("fff/eee.txt").renameTo(new File("dst/aaa.txt)"));  //내용 이동시키는법 fff를 > dst로
		
		Files.copy(
				new File("dst/33344.jpg").toPath(),
				 new FileOutputStream("tttt/sstttt.jpg"));       //파일 복사
		
		File[] arr =new File("ffff").listFiles();                  //파일배열생성
		
		for(File file:arr) {
			System.out.println(file.getName()+":"+file.isDirectory());  //이름+ 너 디렉토리냐?   
		}
		
		
	}

}

