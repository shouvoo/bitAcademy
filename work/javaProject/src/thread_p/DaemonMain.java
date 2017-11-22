package thread_p;

class DaemonTH extends Thread
{
	public DaemonTH(String name) 
	{
		super(name);
	}
	
	public void run() 
	{
		// TODO Auto-generated method stub
		while(true)
		{
			try 
			{
				sleep(1000);
				System.out.println(this.getName() + " : 저장");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class DaemonMain
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		DaemonTH th = new DaemonTH("th");
		DaemonTH ee = new DaemonTH("ee");
		th.setDaemon(true);
		th.start();
		ee.start();
		
		System.out.println(th.isDaemon());
		System.out.println(th.isAlive());
		
		for (int i = 0; i < 3; i++) 
		{
			try {
				Thread.sleep(3000);
				System.out.println("자동저장" + i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("**----메인 종료----**");
	}

}
