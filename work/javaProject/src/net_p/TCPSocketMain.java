package net_p;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

public class TCPSocketMain 
{
	
	static String getTime()
	{
		return new SimpleDateFormat("[hh:m:ss]").format(new Date());
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String ip = "127.0.0.1";
		//String ip = "192.168.0.178";
		//String ip = "192.168.0.29";
		//String ip = "192.168.0.146";
		//String ip = "192.168.0.147";
		
		try 
		{
			Socket soc = new Socket(ip, 7777);
			System.out.println(getTime() + ip + "연결 성공");
			
			InputStream is = soc.getInputStream();
			//DataInputStream dis = new DataInputStream(is);
			ObjectInputStream dis = new ObjectInputStream(is);
			
			//System.out.println(getTime() + dis.readUTF());

			

			byte [] buf = new byte[1024];
			long size = 0;
			long oriSize = dis.readLong();
			
			FileOutputStream fos = new FileOutputStream("fff/" + dis.readUTF() + ".jpg");
			//FileOutputStream fos = new FileOutputStream("fff/sssss.jpg");
			
			while(size < oriSize)
			{
				int len = dis.read(buf);
				
				fos.write(buf, 0, len);
				size += len;
				
				System.out.println(size + " : " + oriSize);
			}
			
			System.out.println(getTime() + ip + "연결종료");
			
			fos.close();
			dis.close();
			is.close();
			soc.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
