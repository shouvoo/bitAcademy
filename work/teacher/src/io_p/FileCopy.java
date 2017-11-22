package io_p;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("fff/son.jpg");
			FileOutputStream fos = new FileOutputStream("fff/sec.jpg");
			byte [] buf = new byte[10];
			
			//String str="";
			while(fis.available()>0)
			{
				int len = fis.read(buf);
				//str+= new String(buf, 0, len);
				
				fos.write(buf, 0, len);
			}
			
			
			
			//byte [] arr = str.getBytes();
			
			
			
			fos.close();
			fis.close();
			
			//System.out.println(str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
