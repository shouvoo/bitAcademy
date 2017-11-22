package homeWork_20170920;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Cal extends Thread {
	TCPSender ts;
	TCPSingleReciever tr;
	
	public Cal(TCPSender ts, TCPSingleReciever tr) {
		super();
		this.ts = ts;
		this.tr = tr;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int a = 10;
		
		while(a != 0) {
			if(ts.chk)
				break;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(a+"�� ���� �Է��ϼ���.");
			a--;
		}
		
		
		if(ts.chk && tr.chk) {
			String [][] ggg = {
		            {"���","��","��"},   
		            {"��","���","��"},
		            {"��","��","���"}
			};
			
		System.out.println(ts.name+":"+ggg[ts.res][tr.res]);
		}
	}
}

class TCPSender extends Thread {
	String name;
	DataOutputStream dos;
	int res;
	boolean chk;
	
	public TCPSender(Socket client, String name) {
		// TODO Auto-generated constructor stub
		try {
			dos = new DataOutputStream(client.getOutputStream());
			this.name = name;
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
	}
	
	public void run() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(dos != null) {
			try {
				System.out.println("0.���� 1.���� 2.��:");
				
				res = Integer.parseInt(sc.nextLine());
				chk = true;
				dos.writeUTF(name);
				dos.writeInt(res);	
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
			}
		}
	}
}

class TCPSingleReciever extends Thread {	
	DataInputStream dis;
	String name;
	int res;
	boolean chk;
	
	public TCPSingleReciever(Socket client) {
		// TODO Auto-generated constructor stub
		try {
			
			dis = new DataInputStream(client.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
	}
	
	public void run() {
		// TODO Auto-generated method stub
		while(dis != null) {
			try {
				name = dis.readUTF();
				res = dis.readInt();
				chk = true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
			}
		}
	}
}

public class TCPSingleServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("���� �غ� �Ϸ�");
			
			Socket client = server.accept();
			
			TCPSender ts = new TCPSender(client, "�輭��");
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
