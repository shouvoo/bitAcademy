package net_p;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class TotalChk{
	ObjectChk chk = new ObjectChk("채팅");
	Socket client;

	public TotalChk(Socket client) {
		super();
		this.client = client;

		new TCPSIngleSender().start();
		new TCPSIngleReciever().start();
	}

	class TCPSIngleSender extends Thread{
		
		String name;
		ObjectOutputStream dos;

		public TCPSIngleSender() {
			// TODO Auto-generated constructor stub
			try {
				
				dos = new ObjectOutputStream(client.getOutputStream());
				name = "["+client.getLocalAddress()+"]";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

		@Override
		public void run() {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			try {
				dos.writeObject(chk);
				dos.flush();
				dos.reset();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			while(dos!=null)
			{
				try {
					
					String msg = name+sc.nextLine();
					chk.cnt++;
					chk.msg = msg;
					dos.writeObject(chk);
					//System.out.println(tot.chk);
					dos.flush();
					dos.reset();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	class TCPSIngleReciever extends Thread{
		
		ObjectInputStream dis;

		public TCPSIngleReciever() {
			// TODO Auto-generated constructor stub
			
			try {
				
				dis = new ObjectInputStream(client.getInputStream());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		@Override
		public void run() {
			// TODO Auto-generated method stub

			while(dis!=null)
			{
				
				try {
					chk = (ObjectChk)dis.readObject();
					System.out.println(chk);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	
		}
	}
	
}

class ObjectChk implements Serializable{
	int cnt=0;
	String name;
	String msg;
	public ObjectChk(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "ObjectChk [cnt=" + cnt + ", name=" + name + ", msg=" + msg + "]";
	}	
}

public class TCPSingleServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			ServerSocket server = new ServerSocket(7777);
			System.out.println("서버준비 완료");

			new TotalChk(server.accept());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}