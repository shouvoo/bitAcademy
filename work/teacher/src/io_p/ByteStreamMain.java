package io_p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte [] inArr = {5,4,12,7,9,126,127,-128,-127,-2,-1,0,56,78};
		ByteArrayInputStream bis = new ByteArrayInputStream(inArr);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		/*int data;
		
		while((data = bis.read())!=-1)
		{
			//System.out.println(data);
			bos.write(data);
		}
		
		*/
		
		byte [] buf = new byte[4];//{0,0,0,0}
		
		for(int i=0;bis.available()>0; i++)
		{
			try {
				int cnt = bis.read(buf);
				bos.write(buf,0,cnt);
				System.out.println(i+Arrays.toString(buf) );
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		byte [] outArr = bos.toByteArray();
		
		System.out.println(Arrays.toString(outArr));
		
		
		/*try {
			System.out.println(bis.available());
			int cnt = bis.read(buf,1,2);
			System.out.println(Arrays.toString(buf));
			System.out.println(cnt);
			System.out.println(bis.available());
			
			bos.write(buf,2,2);
			byte [] outArr = bos.toByteArray();
			
			System.out.println(Arrays.toString(outArr));
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		/*byte [] outArr = bos.toByteArray();
		System.out.println(Arrays.toString(outArr));*/
		
	}

}
