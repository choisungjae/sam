package S1212;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BataOutMain {

	public static void main(String[] args) {
	      try {
	    	  FileOutputStream fos = new FileOutputStream("ttt/tww.rty");
	    	  DataOutputStream dos = new DataOutputStream(fos);
	    	  
	    	  dos.write(new byte[] {11,22,33,44});
	    	  dos.write('a');
	    	  dos.writeBoolean(true);
	    	  dos.writeByte(55);
	    	  dos.writeShort(456);
	    	  dos.writeInt(123);
	    	  dos.writeLong(12345678912L);
	    	  dos.writeFloat(123.79f);
	    	  dos.writeDouble(964.21);
	    	  dos.writeUTF("나는무너");
	    	  
	    	  
	    	  
	    	  dos.close();
	    	  fos.close();
	    	  
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
