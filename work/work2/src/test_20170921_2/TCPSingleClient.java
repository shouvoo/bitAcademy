package test_20170921_2;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class TCPSingleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ip = "127.0.0.1";
		
		try {
			
			Socket client = new Socket(ip, 7777);
	
			TotalChk tot = new TotalChk();
			
			ObjectOutputStream  dos = new ObjectOutputStream(client.getOutputStream());
			ObjectInputStream dis = new ObjectInputStream(client.getInputStream());
			tot.chk = (ObjectChk)dis.readObject();
			System.out.println(tot.chk);

			System.out.println("서버연결 성공");
			
			new TCPSIngleSender(dos,client,tot).start();
			new TCPSIngleReciever(dis,tot).start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
