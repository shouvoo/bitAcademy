package homeWork_20170921;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Sender extends Thread
{
	String name;
	DataOutputStream dos;
	Socket client;
	
	public Sender(Socket client) 
	{
		try 
		{
			this.client = client;
			dos = new DataOutputStream(client.getOutputStream());
			name = "[" + client.getLocalAddress() + "]";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void run() 
	{
		Scanner sc = new Scanner(System.in);
		
		while(dos != null)
		{
			try {
				String scStr = sc.nextLine();
				dos.writeUTF(name + scStr);	
				
				if(scStr.equals("파일전송"))
				{
					imageSender();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void imageSender()
	{
		
		try 
		{
			while(true)
			{
				FileInputStream fis = new FileInputStream("media/original/wolf.bmp");
				
				byte [] buf = new byte[1024];
	
				dos.writeLong(new File("media/original/wolf.bmp").length());
				dos.writeUTF("wolf");
				while(fis.available() > 0)
				{
					int len = fis.read(buf);
					dos.write(buf, 0, len);
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

class Reciever extends Thread
{
	DataInputStream dis;
	Socket client;
	
	public Reciever(Socket client) 
	{
		// TODO Auto-generated constructor stub
		this.client = client;
		try 
		{
			dis = new DataInputStream(client.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() 
	{
		while(dis != null)
		{
			try
			{
				String disStr = dis.readUTF();
				System.out.println(disStr);
				
				if(disStr.equals("파일전송"))
				{
					imageReader();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void imageReader()
	{
		try 
		{			
			InputStream is = client.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);

			byte [] buf = new byte[1024];
			long size = 0;
			long oriSize = ois.readLong();
			
			FileOutputStream fos = new FileOutputStream("media/" + ois.readUTF() + ".bmp");
			
			while(size < oriSize)
			{
				int len = ois.read(buf);
				
				fos.write(buf, 0, len);
				size += len;
				
				System.out.println(size + " : " + oriSize);
			}
			
			fos.close();
			ois.close();
			is.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Server 
{

	public static void main(String[] args)
	{
		try 
		{
			ServerSocket server = new ServerSocket(7777);
			System.out.println("서버 준비 완료");
			
			Socket client = server.accept();
			new Sender(client).start();
			new Reciever(client).start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
