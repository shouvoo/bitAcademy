package io_p;

import java.io.FileInputStream;
import java.io.FileReader;

public class FileWriterMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		FileInputStream fos = new FileInputStream("fff/fos.txt");
		
		int data;
		
		while((data=fos.read())!=-1)
		{
			System.out.print((char)data);
		}
		
		/*byte [] buf = new byte[1024];
		
		while(fos.available()>0)
		{
			int len = fos.read(buf);
			System.out.print(new String(buf,0,len));
		}*/
		
		
		fos.close();
		
		System.out.println("\n-----------------------------------");
		
		
		FileReader fr = new FileReader("fff/fos.txt");
		
		while((data=fr.read())!=-1)
		{
			System.out.print((char)data);
		}
		fr.close();
		
	}

}
