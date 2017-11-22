package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class TCPSingleSender extends Thread
{
	String name;
	DataOutputStream dos;
	
	public TCPSingleSender(Socket client) 
	{
		try 
		{
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
				dos.writeUTF(name + sc.nextLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class TCPSingleReciever extends Thread
{
	DataInputStream dis;
	
	public TCPSingleReciever(Socket client) 
	{
		// TODO Auto-generated constructor stub
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
				System.out.println(dis.readUTF());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class TCPSingleServer 
{

	public static void main(String[] args)
	{
		try 
		{
			ServerSocket server = new ServerSocket(7777);
			System.out.println("서버 준비 완료");
			
			Socket client = server.accept();
			new TCPSingleSender(client).start();
			new TCPSingleReciever(client).start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
