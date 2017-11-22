package net_p;

import java.net.Socket;

public class TCPSingleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			new TotalChk(new Socket("127.0.0.1", 7777));

			System.out.println("서버연결 성공");
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
