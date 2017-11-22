package io_p;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWriteMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*try  //txt 파일 복사 예제
		{
			FileInputStream fis = new FileInputStream("fff/cat.jpg");
			FileOutputStream fos = new FileOutputStream("fff/cat2.jpg");
			byte [] buf = new byte[4];
			String str = "";
			
			while(fis.available() > 0)
			{
				int len = fis.read(buf);
				str += new String(buf, 0, len);
			}
			

			byte [] writeArr = str.getBytes();
			fos.write(writeArr);
			
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		try  //이미지 파일 복사 예제
		{
			FileInputStream fis = new FileInputStream("fff/cat.jpg");
			FileOutputStream fos = new FileOutputStream("fff/cat2.jpg");
			
			byte [] buf = new byte[10];
			
			while(fis.available() > 0)
			{
				int len = fis.read(buf);
				fos.write(buf, 0, len);
			}
			
			
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
