package io_p;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

public class FileWriterMain 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try 
		{
			FileInputStream fis = new FileInputStream("fff/fos.txt");
			
			int data;
			
			while((data = fis.read()) != -1)
			{
				System.out.print((char)data);
			}
			
			/*byte [] buf = new byte[1024];
			
			while(fis.available() > 0)
			{
				int len = fis.read(buf);
				System.out.println(new String(buf, 0, len));
			}*/
			
			System.out.println();
			System.out.println("\n---------------------------------------\n");
			
			
			//잘 사용하지 않음!!
			//문자 용도로만 사용
			FileReader fr = new FileReader("fff/fos.txt");
			
			while((data = fr.read()) != -1)
			{
				System.out.print((char)data);
			}
			
			fr.close();
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
