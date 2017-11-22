package io_p;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileReader fr = new FileReader("fff/fos.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		
		for (int i = 0; (line=br.readLine())!=null; i++) {
			System.out.println(i+":"+line);
		}
		br.close();
		fr.close();
	}

}
