package net_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UnicastSender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			InetAddress addr = InetAddress.getByName("192.168.0.29");
			
			String msg ="¾È³ç ¼ºÈñ¾ß";
			DatagramPacket data = new DatagramPacket(
					msg.getBytes(),
					msg.getBytes().length,
					addr,
					7777
					);
			
			new DatagramSocket().send(data);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
