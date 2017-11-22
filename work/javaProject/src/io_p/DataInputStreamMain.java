package io_p;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataInputStreamMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
			FileInputStream fis = new FileInputStream("fff/ddd.txt");
			DataInputStream dis = new DataInputStream(fis);
			
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readLong());
			System.out.println(dis.readUTF());
			
			dis.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
