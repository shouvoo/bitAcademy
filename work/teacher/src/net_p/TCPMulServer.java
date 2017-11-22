package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class TCPMulServer {

	HashMap<String, DataOutputStream>list = new HashMap<>();
	public TCPMulServer() {
		// TODO Auto-generated constructor stub
		
		Collections.synchronizedMap(list);
		
		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("서버시작"); 
			
			while(true)
			{
				new TCPMulReceiver(server.accept()).start();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	class TCPMulReceiver extends Thread{
		
		DataInputStream dis;
		DataOutputStream dos;
		String name;
		public TCPMulReceiver(Socket socket) {
			// TODO Auto-generated constructor stub
			
			try {
				dis = new DataInputStream(socket.getInputStream());
				dos = new DataOutputStream(socket.getOutputStream());
				name = "["+socket.getInetAddress()+"]";
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				sendAll(name+"입장");
				sendAll("접속자수:"+list.size());
				list.put(name, dos);
				
				while(dis!=null)
				{
					String msg =dis.readUTF();
					sendAll(name+msg);
					System.out.println(name+msg);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}finally {
				list.remove(name);
				sendAll(name+"퇴장");
				sendAll("접속자수:"+list.size());
				
			}
		}
		
		
	}
	
	
	void sendAll(String msg)
	{
		
		Iterator<String>it = list.keySet().iterator();
		//for (DataOutputStream dd : list) {
		while(it.hasNext()) {
			try {
				list.get(it.next()).writeUTF(msg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TCPMulServer();
	}

}
