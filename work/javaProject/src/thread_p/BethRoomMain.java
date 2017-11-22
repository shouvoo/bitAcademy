package thread_p;

class BethRoom
{
	boolean chk = false;
	int sleepTime = 500;
	
	synchronized void bethRoom(String thing)
	{
		if(thing.equals("소변")) sleepTime = 500;
		else sleepTime = 3000;
		
		try {
			Thread.sleep(sleepTime);
			if(thing == "대변" && thing == "소변")
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
		this.thing = "소대".charAt(thing - 1) + "변";
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
				System.out.println("대기중..........");
				
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
		
		Person ps1 = new Person(br, "브래드", 2);
		Person ps2 = new Person(br, "졸리", 1);
		Person ps3 = new Person(br, "앙탄", 1);
		Person ps4 = new Person(br, "캐러반", 2);
		Person ps5 = new Person(br, "구디", 2);
		
		ps1.start();
		ps2.start();
		ps3.start();
		ps4.start();
		ps5.start();
		
	}

}
