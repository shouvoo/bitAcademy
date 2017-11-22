package net_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UnicastReciever {

	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket(7777);
			byte[] arr = new byte[1024];
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
