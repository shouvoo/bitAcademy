package homeWork_20170921;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

class Unicast
{
	public Unicast() 
	{
		new Sender().start();
		new Reciever().start();
	}
	
	class Sender extends Thread
	{
		public void run() 
		{
			try
			{
				InetAddress addr = InetAddress.getByName("127.0.0.1");
				Scanner sc = new Scanner(System.in);
				
				while(true)
				{
					String msg = sc.nextLine();
					DatagramPacket data = new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, 7777);
					
					new DatagramSocket().send(data);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	class Reciever extends Thread
	{
		public void run()
		{
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
				e.printStackTrace();
			}
			
		}

	}
}



public class HomeWorkMain 
{
	public static void main(String[] args) 
	{
		new Unicast();
	}
}
