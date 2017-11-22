package net_p;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class TCPMulHomeWorkServer {

	HashMap<String, ObjectOutputStream>list = new HashMap<>();
	public TCPMulHomeWorkServer() {
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
		
		ObjectInputStream dis;
		ObjectOutputStream dos;
		String name;
		public TCPMulReceiver(Socket socket) {
			// TODO Auto-generated constructor stub
			
			try {
				dis = new ObjectInputStream(socket.getInputStream());
				dos = new ObjectOutputStream(socket.getOutputStream());
				name = "["+socket.getInetAddress()+"]";
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			TCPData data= new TCPData();
			try {
				
				data.name="[시스템]";
				data.kind="c";
				data.msg="입장";
				sendAll(data);
				data.msg="접속자수:"+list.size();
				sendAll(data);
				list.put(name, dos);
				
				while(dis!=null)
				{
					TCPData msg =(TCPData)dis.readObject();
					
					msg.name = name;
					sendAll(msg);
					//System.out.println(name+msg);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}finally {
				list.remove(name);
				
				data.msg="퇴장";
				sendAll(data);
				data.msg="접속자수:"+list.size();
				sendAll(data);
				
				
			}
		}
		
		
	}
	
	
	void sendAll(Object msg)
	{
		
		Iterator<String>it = list.keySet().iterator();
		//for (ObjectOutputStream dd : list) {
		while(it.hasNext()) {
			try {
				ObjectOutputStream oos = list.get(it.next());
				oos.writeObject(msg);
				oos.flush();
				oos.reset();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TCPMulHomeWorkServer();
	}

}
