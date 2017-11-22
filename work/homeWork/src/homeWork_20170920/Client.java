package homeWork_20170920;

import java.net.Socket;

public class Client 
{
	public static void main(String[] args) 
	{
		//String ip = "192.168.146";
		String ip = "127.0.0.1";
		
		try 
		{
			Socket socket = new Socket(ip, 7777);
			System.out.println("2P 연결 성공");
			
			Fight fight = new Fight("test2");
			
			new TCPSingleSender(socket, fight).start();
			new TCPSingleReciver(socket, fight).start();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
}
