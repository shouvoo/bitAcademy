package io_p;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileOutputStream fos = new FileOutputStream("fff/bbb.txt");
			String str ="ㅇㄴ러ㅏㅣㅈㄷ래ㅑㄷㄹ댖로대쟈뢔도대롲대로댖";
			
			byte [] arr = str.getBytes();
			
			fos.write(arr);
			
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
