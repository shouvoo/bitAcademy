package net_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class MulticastSender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner sc = new Scanner(System.in);
			MulticastSocket ms = new MulticastSocket();
			InetAddress addr = InetAddress.getByName("230.0.0.1");
			while(true)
			{
				String msg =sc.nextLine();
				DatagramPacket data = new DatagramPacket(
						msg.getBytes(),
						msg.getBytes().length,
						addr,
						7777
						);
				
				ms.send(data);
		//	ms.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
