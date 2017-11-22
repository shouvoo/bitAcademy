package net_p;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TCPServerSocketMain {

	static String getTime()
	{
		return new SimpleDateFormat("[hh:mm:ss]").format(new Date());
	}
	
	
	static void write(Socket client, String file)
	{
		
		
		try {
			OutputStream os = client.getOutputStream();
			ObjectOutputStream dos = new ObjectOutputStream(os);
			FileInputStream fis = new FileInputStream(file);

			File ff = new File(file);
			dos.writeLong(ff.length());
			dos.writeUTF(file.substring(file.lastIndexOf("/")+1));
			
			byte [] buf = new byte[1024];
			
			
			int i =0;
			while(fis.available()>0)
			{
				i++;
				
				try {
					//Thread.sleep(10);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				fis.read(buf);
				dos.writeObject(buf);
				dos.flush();
				dos.reset();
				System.out.println(i+":"+buf.length);
			}
			
			fis.close();
			dos.close();
			os.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println(getTime()+"서버준비 완료");
			
			while(true)
			{
				System.out.println(getTime()+"연결 대기");
				Socket client = server.accept();
				System.out.println(getTime()+client.getInetAddress()+" 연결");
				
				
				
				write(client,"ff/aaa.jpg");
				//dos.writeUTF("배고파");
				System.out.println(getTime()+client.getInetAddress()+" 데이터 전송");
				
				client.close();
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
