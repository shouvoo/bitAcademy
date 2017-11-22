package net_p;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		InetAddress ip = InetAddress.getByName("www.naver.com");
		
		System.out.println(ip.getHostName());
		System.out.println(ip.getHostAddress());
		System.out.println(ip);
		
		System.out.println("-----------------------------");
		InetAddress [] arr = InetAddress.getAllByName("cafe.naver.com");
		
		for (InetAddress inetAddress : arr) {
			System.out.println(inetAddress);
		}
	}

}
