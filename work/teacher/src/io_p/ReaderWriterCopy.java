package io_p;

import java.io.FileReader;
import java.io.FileWriter;

public class ReaderWriterCopy {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileReader fis = new FileReader("fff/son.jpg");
		FileWriter fos = new FileWriter("fff/one.jpg");
		
		int data;
		
		while((data=fis.read())!=-1)
		{
			fos.write(data);
		}
		
		fos.close();
		fis.close();
		
	}

}
