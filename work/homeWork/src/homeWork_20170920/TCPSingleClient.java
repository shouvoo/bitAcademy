package homeWork_20170920;

import java.net.Socket;

public class TCPSingleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ip = "192.168.0.146";
		
		try {
			Socket client = new Socket(ip, 7777);
			
			System.out.println("���� ���� ����");
			
			TCPSender ts = new TCPSender(client, "��Ŭ��");
			ts.start();
			TCPSingleReciever tr = new TCPSingleReciever(client);
			tr.start();

			
			new Cal(ts, tr).start();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
