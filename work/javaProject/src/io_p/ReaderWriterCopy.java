package io_p;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class ReaderWriterCopy
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
			FileReader fis = new FileReader("fff/cat.jpg");
			FileWriter fos = new FileWriter("fff/cat3.jpg");
			
			int data;
			
			while((data = fis.read()) != -1)
			{
				fos.write(data);
			}
			
			
			fos.close();
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
