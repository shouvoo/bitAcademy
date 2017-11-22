package net_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UnicastReciever
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			DatagramSocket ds = new DatagramSocket(7777);
			byte [] arr = new byte[1024];
			DatagramPacket data = new DatagramPacket(arr, arr.length);
			
			ds.receive(data);
			
			System.out.println(data.getAddress());
			System.out.println(new String(arr).trim());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
