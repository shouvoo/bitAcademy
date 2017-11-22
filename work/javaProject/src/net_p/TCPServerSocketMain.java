package net_p;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TCPServerSocketMain
{

	static String getTime()
	{
		return new SimpleDateFormat("[hh:m:ss]").format(new Date());
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
			ServerSocket server = new ServerSocket(7777);
			System.out.println(getTime() + "서버준비 완료");
			
			while(true)
			{
				System.out.println(getTime() + "연결 대기");
				Socket client = server.accept();
				System.out.println(getTime() + client.getInetAddress() + " 연결");
				
				OutputStream os = client.getOutputStream();
				//DataOutputStream dos = new DataOutputStream(os); // 데이터 스트림으로 대체할수있다
				ObjectOutputStream dos = new ObjectOutputStream(os); // 오브젝트 스트림으로 대체할수있다
				
				FileInputStream fis = new FileInputStream("fff/hdImage.jpg");
				
				byte [] buf = new byte[1024];
				
				/*dos.writeInt(350);
				dos.writeUTF("고양이");*/

				dos.writeLong(new File("fff/hdImage.jpg").length());
				dos.writeUTF("hd");
				while(fis.available() > 0)
				{
					int len = fis.read(buf);
					dos.write(buf, 0, len);
				}
				
				
				fis.close();
				dos.close();
				os.close();
				client.close();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
