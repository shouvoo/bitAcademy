package thread_p;

class BethRoom
{
	boolean chk = false;
	int sleepTime = 500;
	
	synchronized void bethRoom(String thing)
	{
		if(thing.equals("�Һ�")) sleepTime = 500;
		else sleepTime = 3000;
		
		try {
			Thread.sleep(sleepTime);
			if(thing == "�뺯" && thing == "�Һ�")
			{
				chk = true;
				wait();
			} else 
			{
				chk = false;
				notifyAll();
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Person extends Thread
{
	
	String thing = "";
	String name = "";
	BethRoom br;
	
	
	
	public Person(BethRoom br, String name, int thing) 
	{
		super();
		this.br = br;
		this.thing = "�Ҵ�".charAt(thing - 1) + "��";
		this.name = name;
	}
	
	public void run() 
	{
		while(true)
		{
			//if(br.bethRoom(this.thing))
			//{
				br.bethRoom(this.thing);					
				System.out.println(name + " : " + thing);
				System.out.println("�����..........");
				
			//}
		}
	}
}

public class BethRoomMain 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		BethRoom br = new BethRoom();
		
		Person ps1 = new Person(br, "�귡��", 2);
		Person ps2 = new Person(br, "����", 1);
		Person ps3 = new Person(br, "��ź", 1);
		Person ps4 = new Person(br, "ĳ����", 2);
		Person ps5 = new Person(br, "����", 2);
		
		ps1.start();
		ps2.start();
		ps3.start();
		ps4.start();
		ps5.start();
		
	}

}
