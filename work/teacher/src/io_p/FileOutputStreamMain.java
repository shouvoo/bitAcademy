package io_p;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileOutputStream fos = new FileOutputStream("fff/bbb.txt");
			String str ="仄中楝凶太元之楚切之予�熒帤蹀��O紫渠�豱賰���";
			
			byte [] arr = str.getBytes();
			
			fos.write(arr);
			
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
