package S1212;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Pattern;

public class O1212 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("ffff/member.txt");
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter("ffff/filterPerson.txt");
			 BufferedWriter bw =new  BufferedWriter(fw);
			String line;
			
//			line = br.readLine();
			
			while((line = br.readLine())!=null) {
				
			
//				
			if(Pattern.matches(".*32.*", line.substring(9))||Pattern.matches(".*3-2.*", line.substring(9))) {
//				System.out.println(line);
				bw.write(line+"\n");
			}		
					
				
			}
			
			 bw.close();
			 fw.close();
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	}


