package io_p;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamMain
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
			FileOutputStream fos = new FileOutputStream("fff/bbb.txt");
			String str = "æ»≥Á«œººø‰ æ»≥Á«œººø‰ æ»≥Á«œººø‰ æ»≥Á«œººø‰ æ»≥Á«œººø‰ æ»≥Á«œººø‰ ";
			byte [] arr = str.getBytes();
			fos.write(arr);
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
