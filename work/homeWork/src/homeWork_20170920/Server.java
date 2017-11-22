package homeWork_20170920;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.TreeMap;


class CalEnergy
{
	Fight fight;
	Fight oldFight = null;
	
	public CalEnergy(Fight fight) 
	{
		System.out.println(fight.name);
		
		
		if(oldFight != null)
		{
			System.out.println(oldFight.name);
		}
		
		oldFight = fight;
	}
}

class TCPSingleSender extends Thread
{
	String senderName = "";
	DataOutputStream dos;
	Fight fight;
	
	public TCPSingleSender(Socket socket, Fight fight) 
	{
		this.fight = fight;
		
		
		try 
		{
			dos = new DataOutputStream(socket.getOutputStream());
			senderName = "[" + socket.getLocalAddress() + "]";
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public void run() 
	{
		Scanner sc = new Scanner(System.in);
		
		while(dos != null)
		{
			try 
			{
				String str = sc.nextLine();
				dos.writeUTF(senderName + str);
				dos.flush();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}


class TCPSingleReciver extends Thread
{
	DataInputStream dis;
	String reciverName = "";
	Fight fight;
	
	public TCPSingleReciver(Socket socket, Fight fight) 
	{
		this.fight = fight;
		try 
		{
			dis = new DataInputStream(socket.getInputStream());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public void run() 
	{
		while(dis != null)
		{
			try 
			{
				String str = dis.readUTF();
				System.out.println(reciverName + " : " + str);

				//this.fight.control(Integer.parseInt(str));
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}


class Fight
{
	String name = "";
	int energy = 100;
	int []	punch = new int []{10, 15, 20};
	int []	Kick = new int []{20, 25, 30};
	int [] defense = new int []{5, 7, 12};
	
	public Fight(String name) 
	{
		this.name = name;
	}
	
	public void control(int n)
	{
		int value = 0;
		int ranNum = (int)((Math.random() * 2));
		String str = "";
		
		switch(n)
		{
			case 1 :
				print("===== 펀치 공격 =====");
				value = punch[ranNum];
				str = name + " - 펀치 공격력 : ";
				
				rPrint(str, value);
				break;
				
			case 2 :
				print("===== 발차기 공격 =====");
				value = Kick[ranNum];
				str = name + " - 발차기 공격력 : ";
				rPrint(str, value);
				break;
				
			case 3 :
				print("===== 방어 =====");
				value = defense[ranNum];
				
				str = name + " - 방어력 : ";
				
				rPrint(str, -value);
				break;
				
			default :
				break;
		}
	}
	
	public void rPrint(String str, int value)
	{
		
		energy -= value;
		print("***** : " + str + value +" *****");
		
		str = name + " - 남은 체력은 : ";
		print("***** : " + str + energy +" *****");
	}
	
	public void print(String str)
	{
		System.out.println(str);
	}
	
}


public class Server 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
			ServerSocket serverSocket = new ServerSocket(7777);
			System.out.println("1P 준비 완료");
			
			Socket socket = serverSocket.accept();
			
			Fight fight = new Fight("test1");
			
			new TCPSingleSender(socket, fight).start();
			new TCPSingleReciver(socket, fight).start();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
