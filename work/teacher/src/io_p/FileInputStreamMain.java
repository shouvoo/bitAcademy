package io_p;

import java.io.FileInputStream;

public class FileInputStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("fff/bbb.txt");
			
			byte [] buf = new byte[10];
			
			String str="";
			while(fis.available()>0)
			{
				int len = fis.read(buf);
				str+= new String(buf, 0, len);
			}
			
			fis.close();
			
			System.out.println(str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
