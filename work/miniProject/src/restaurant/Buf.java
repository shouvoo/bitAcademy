package restaurant;

import java.net.InetAddress;

public class Buf {
	public static void main(String[] args) throws Exception {
		InetAddress inet = InetAddress.getByName("192.168.56.1");
		System.out.println(inet.getHostAddress());
		System.out.println(InetAddress.getLocalHost().getHostAddress());
	}
}
