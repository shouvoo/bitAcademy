package net_p;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

class TCPData implements Serializable{
	
	String kind, msg, name;
	
	int len;
	boolean finish, star;
	byte [] ff = new byte[1024];
	
	
}

public class TCPMulClient {
	
	ObjectOutputStream dos;
	ObjectInputStream dis;
	
	public TCPMulClient() {
		// TODO Auto-generated constructor stub
		
		try {
			Socket socket = new Socket("192.168.0.29", 7777);
			System.out.println("서버 연결 성공");
			
			
			
			dos = new ObjectOutputStream(socket.getOutputStream());
			dis = new ObjectInputStream(socket.getInputStream());
			
			new TCPMulSender().start();
			new TCPMulReciever().start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	class TCPMulSender extends Thread{
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> kindMap = new HashMap<>();
		
		@Override
		public void run() {
			
			kindMap.put("c", "대화:");
			kindMap.put("f", "파일명:");
			// TODO Auto-generated method stub
			while(dos!=null) {
				try {
					
					TCPData data = new TCPData();
					System.out.print("종류:");
					data.kind = sc.nextLine();
					System.out.print(kindMap.get(data.kind));
					data.msg = sc.nextLine();
					
					dos.writeObject(data);
					dos.flush();
					dos.reset();
					if(data.kind.equals("f"))
						fileGO(data);
					
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		void fileGO(TCPData data)
		{
			try {
				FileInputStream fis = new FileInputStream("fff/"+data.msg);
				File fff = new File("fff/"+data.msg);
				long size = fff.length();
				
				int currsize=0;
				int lastStar=0;
				
				data.finish=false;
				while(fis.available()>0)
				{
					data.star=false;
					data.len=fis.read(data.ff);
					currsize+=data.len;
					int currStar=(int)((double)currsize/size*10);
					
					if(lastStar<currStar)
					{
						data.star=true;
						lastStar=currStar;
					}

					dos.writeObject(data);
					dos.flush();
					dos.reset();
					
				}
				data.finish=true;
				dos.writeObject(data);
				dos.flush();
				dos.reset();
				
				
				fis.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	class TCPMulReciever extends Thread{
	
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(dis!=null) {
				try {
					
					TCPData data =(TCPData)dis.readObject();
					
					if(data.kind.equals("c"))
						System.out.println(data.name+data.msg);
					else
						fileArrive(data);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		void fileArrive(TCPData ffdata) throws Exception
		{
			
			FileOutputStream fos = new FileOutputStream("rec/"+ffdata.msg);
			System.out.print("다운로드:");
			while(true)
			{
				TCPData data =(TCPData)dis.readObject();
				
				if(data.finish)
					break;
				
				fos.write(data.ff,0,data.len);
				
				if(data.star)
					System.out.print("*");
				
			}
			System.out.println();
			fos.close();
		}
	}
	public static void main(String[] args) {
		new TCPMulClient();
	}
}
