package test_20170921;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class TCPSingleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ip = "127.0.0.1";
		
		try {
			ObjectChk chk = new ObjectChk("채팅");
			Socket client = new Socket(ip, 7777);
			System.out.println("서버연결 성공 client");
			
			
			ObjectOutputStream  dos = new ObjectOutputStream(client.getOutputStream());
			ObjectInputStream dis = new ObjectInputStream(client.getInputStream());
			chk = (ObjectChk)dis.readObject();
			System.out.println(chk);

			
			
			new TCPSIngleSender(dos,client,chk).start();
			new TCPSIngleReciever(dis,chk).start();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
