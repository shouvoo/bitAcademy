package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class TCPMulHomeWorkClient {
	
	DataOutputStream dos;
	DataInputStream dis;
	
	public TCPMulHomeWorkClient() {
		// TODO Auto-generated constructor stub
		
		try {
			Socket socket = new Socket("192.168.0.29", 7777);
			System.out.println("서버 연결 성공");
			
			dos = new DataOutputStream(socket.getOutputStream());
			dis = new DataInputStream(socket.getInputStream());
			
			new TCPMulSender().start();
			new TCPMulReciever().start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	class TCPMulSender extends Thread{
		Scanner sc = new Scanner(System.in);
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(dos!=null) {
				try {
					dos.writeUTF(sc.nextLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	class TCPMulReciever extends Thread{
	
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(dis!=null) {
				try {
					System.out.println(dis.readUTF());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		new TCPMulHomeWorkClient();
	}
}
