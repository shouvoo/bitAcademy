package io_p;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedMain
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int data;
	
		try {
			FileReader fr = new FileReader("fff/fos.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			
			for (int i = 0; (line = br.readLine()) != null; i++) 
			{
				System.out.println(i + " : " + line);
			}
			
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
