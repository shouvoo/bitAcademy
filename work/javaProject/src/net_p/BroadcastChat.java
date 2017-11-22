package net_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class BroadcastChat
{
	
	public BroadcastChat() 
	{
		// TODO Auto-generated constructor stub
		new UnicastSender().start();
		new UnicastReciever().start();
	}
	
	class UnicastSender extends Thread
	{
		public void run() 
		{
			try
			{
				InetAddress addr = InetAddress.getByName("192.168.0.255");
				Scanner sc = new Scanner(System.in);
				
				while(true)
				{
					String msg = sc.nextLine();
					DatagramPacket data = new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, 7777);
					
					new DatagramSocket().send(data);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	class UnicastReciever extends Thread
	{

		public void run()
		{
			// TODO Auto-generated method stub
			try
			{
				DatagramSocket ds = new DatagramSocket(7777);
				
				
				while(true)
				{
					byte [] arr = new byte[1024];
					DatagramPacket data = new DatagramPacket(arr, arr.length);
					
					ds.receive(data);
					
					System.out.println(data.getAddress());
					System.out.println(new String(arr).trim());
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new BroadcastChat();
	}

}
