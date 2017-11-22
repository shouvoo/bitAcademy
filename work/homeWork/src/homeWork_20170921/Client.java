package homeWork_20170921;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String ip = "127.0.0.1";
		
		try 
		{
			Socket client = new Socket(ip, 7777);
			
			System.out.println("서버 연결 성공");
			
			new Sender(client).start();
			new Reciever(client).start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
