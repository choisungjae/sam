package Mouum.SJ;

import java.io.File;

public class S1212파일보내기과제 {

	public static void main(String[] args) {

		File[] arr = new File("File").listFiles();

		for (File file : arr) {
			String ttt = file.getName().substring(file.getName().indexOf(".") + 1);
			// 폴더 안 폴더
			if (file.isDirectory()) {
//				
				File[] arr2 = new File("File/" + ttt + "/").listFiles();

				for (File file2 : arr2) {
					String ttt2 = file2.getName().substring(file2.getName().indexOf(".") + 1);
					if (file2.isFile()) {//파일
                                   
						// 이미지
						if (ttt2.equals("bmp") || (ttt2.equals("jpg")
								|| (ttt2.equals("gif") || (ttt2.equals("Png") || (ttt2.equals("png")))))) {

							File image = new File("File2/image");
							if (!image.exists()) { // 이미지폴더가없다면
								new File("File2/image").mkdir();// 이미지폴더를생성
							}
							new File("File/" + ttt + "/" + file2.getName())
									.renameTo(new File("File2/image/" + file2.getName()));
						
						}
						// 뮤직
						else if (ttt2.equals("mp3") || (ttt2.equals("wma") || (ttt2.equals("wav")))) {

							File music = new File("File2/music");
							if (!music.exists()) {
								new File("File2/music").mkdir();
							}
							new File("File/" + ttt + "/" + file2.getName())
									.renameTo(new File("File2/music/" + file2.getName()));
						}
//						//문서 
						else if (ttt2.equals("doc") || (ttt2.equals("hwp") || (ttt2.equals("ppt")
								|| (ttt2.equals("xls") || (ttt2.equals("pptx") || (ttt2.equals("xlsx"))))))) {

							File document = new File("File2/music");
							if (!document.exists()) {
								new File("File2/document").mkdir();
							}
							new File("File/" + ttt + "/" + file2.getName())
									.renameTo(new File("File2/document/" + file2.getName()));
						}
						else{
							new File("File/" +ttt+"/"+ file2.getName()).renameTo(new File("File2/ta/" + file2.getName()));
						}
					}
				}

			}
			if (file.isFile()) {
				// 폴더안파일
				if (ttt.equals("bmp")
						|| (ttt.equals("jpg") || (ttt.equals("gif") || (ttt.equals("Png") || (ttt.equals("png")))))) {

					File image = new File("File2/image");
					if (!image.exists()) {
						new File("File2/image").mkdir();
					}
					new File("File/" + file.getName()).renameTo(new File("File2/image/" + file.getName()));

				}
				// 뮤직
				else if (ttt.equals("mp3") || (ttt.equals("wma") || (ttt.equals("wav")))) {

					File music = new File("File2/music");
					if (!music.exists()) {
						new File("File2/music").mkdir();
					}
					new File("File/" + file.getName()).renameTo(new File("File2/music/" + file.getName()));
				}
//				//문서 
				else if (ttt.equals("doc") || (ttt.equals("hwp") || (ttt.equals("ppt")
						|| (ttt.equals("xls") || (ttt.equals("pptx") || (ttt.equals("xlsx"))))))) {

					File document = new File("File2/music");
					if (!document.exists()) {
						new File("File2/document").mkdir();
					}
					new File("File/" + file.getName()).renameTo(new File("File2/document/" + file.getName()));
				}//기타
				else{
					new File("File/" + file.getName()).renameTo(new File("File2/ta/" + file.getName()));
				}
			}

		}

	}
}

