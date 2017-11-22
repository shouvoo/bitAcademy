package io_p;

import java.io.ObjectInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TCPSocketMain {

	static String getTime()
	{
		return new SimpleDateFormat("[hh:mm:ss]").format(new Date());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ip = "192.168.0.29";
		
		try {
			Socket soc = new Socket(ip, 7777);
			System.out.println(getTime()+ip+" 연결 성공");
			
			
			
			//System.out.println(getTime()+dis.readUTF());
			read(soc);
			System.out.println(getTime()+ip+" 연결종료");
			
			soc.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void read(Socket soc)
	{
		
		
		try {
			
			InputStream is = soc.getInputStream();
			ObjectInputStream dis = new ObjectInputStream(is);
			
			long size = dis.readLong();
			System.out.println(size);
			String fileName =dis.readUTF();
			
			System.out.println(fileName);
						
			
			FileOutputStream fos = new FileOutputStream("fff/"+fileName);
			
			int i =0;
			while(true)
			{
				i++;
				byte [] buf = (byte [])dis.readObject();
				
				int len = buf.length;

				if(len>size)
					len= (int)size;
				
				fos.write(buf,0, len);
				
				System.out.println(i+":"+len+":"+size);
				size-=len;
				if(size<=0)
					break;
			}
			
			fos.close();
			dis.close();
			is.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
