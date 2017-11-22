package test_20170921_2;

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
	TotalChk tot;
	
	
	public TCPSIngleSender(ObjectOutputStream dos,Socket client, TotalChk tot) {
		// TODO Auto-generated constructor stub
		try {
			this.tot = tot;
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
				tot.chk.cnt++;
				tot.chk.msg = name+sc.nextLine();
				dos.writeObject(tot.chk);
				System.out.println(tot.chk);
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
	TotalChk tot;
	

	public TCPSIngleReciever(ObjectInputStream dis,TotalChk tot) {
		// TODO Auto-generated constructor stub
		
		try {
			this.tot = tot;
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
			//System.out.println("dhsi");
			try {
				tot.chk = (ObjectChk)dis.readObject();
				System.out.println(tot.chk);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("리시버 종료");
	}
}

class TotalChk{
	ObjectChk chk;
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
			
			
			TotalChk tot = new TotalChk();
			
			
			tot.chk = new ObjectChk("채팅");
			
			
			
			Socket client = server.accept();
			
			
			
			ObjectOutputStream  dos = new ObjectOutputStream(client.getOutputStream());
			ObjectInputStream dis = new ObjectInputStream(client.getInputStream());
			dos.writeObject( tot.chk);
			dos.flush();
			dos.reset();
			
			
			
			new TCPSIngleSender(dos,client, tot).start();
			new TCPSIngleReciever(dis, tot).start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
