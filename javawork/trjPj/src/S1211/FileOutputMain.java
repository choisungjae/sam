package S1211;
import java.io.FileOutputStream;

public class FileOutputMain {

	public static void main(String[] args) {
		try {
			
			String []lyrics = {"아름다운 이강산을 지키는 우리 ",
					"아름다운 이강산을 지키는 우리 ",
					"아름다운 일강산을 지키는 우리 ",
					"아름다운 삼강산을 지키는 우리 ",
					"아름다운 10강산을 지키는 우리 ",
					"아름다운 1강산을 지키는 우리 ",
					"아름다운 2강산을 지키는 우리 ",
					"아름다운 4강산을 지키는 우리 ",
					"아름다운 5강산을 지키는 우리 ",
					"아름다운 3강산을 지키는 우리 ",
			};
			
			
			byte [] arr;
			FileOutputStream fos = new FileOutputStream("fff/bbb.txt");
			
			for (String ttt : lyrics) {
				fos.write((ttt+"\n").getBytes());
				
			}
			
			
			arr = "엄마가 섬그늘에".getBytes();
			fos.write(arr);
			
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}