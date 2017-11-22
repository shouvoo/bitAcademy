package test_20170921;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class TCPSIngleSender extends Thread{
	
	String name;
	ObjectOutputStream dos;
	ObjectChk chk;
	public TCPSIngleSender(Socket client) {
		// TODO Auto-generated constructor stub
		try {
			dos = new ObjectOutputStream(client.getOutputStream());
			name = "["+client.getLocalAddress()+"]";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public TCPSIngleSender(ObjectOutputStream dos,Socket client, ObjectChk chk) {
		// TODO Auto-generated constructor stub
		try {
			this.chk = chk;
			this.dos = dos;
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
		
		while(dos!=null)
		{
			try {
				System.out.println("gogo?");
				dos.writeUTF(name+sc.nextLine());
				dos.flush();
				dos.reset();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("샌더 종료");
	
	}
}

class TCPSIngleReciever extends Thread{
	
	ObjectInputStream dis;
	ObjectChk chk;
	

	public TCPSIngleReciever(ObjectInputStream dis,ObjectChk chk) {
		// TODO Auto-generated constructor stub
		
		try {
			this.chk = chk;
			this.dis = dis;
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
			System.out.println("dhsi");
			try {
				System.out.println(dis.readUTF());
				System.out.println(chk);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("리시버 종료");
	}
}

class ObjectChk implements Serializable{
	int cnt=0;
	String name;
	public ObjectChk(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "ObjectChk [name=" + name + ", cnt=" + cnt + "]";
	}
	
	
}

public class TCPSingleServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			
			ServerSocket server = new ServerSocket(7777);
			System.out.println("서버준비 완료 server");
			
			ObjectChk chk = new ObjectChk("채팅");
			
			Socket client = server.accept();
			
			
			
			ObjectOutputStream  dos = new ObjectOutputStream(client.getOutputStream());
			ObjectInputStream dis = new ObjectInputStream(client.getInputStream());
			//dos.writeObject( chk);
			//dos.flush();
			//dos.reset();
			
			
			
			new TCPSIngleSender(dos,client, chk).start();
			new TCPSIngleReciever(dis, chk).start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
