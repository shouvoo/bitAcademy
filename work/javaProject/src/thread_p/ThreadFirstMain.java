package thread_p;

class FirstTh extends Thread
{
	//String name = "*";
	
	public FirstTh(String name) 
	{
		super(name);
		//this.name = name;
	}

	public void run()
	{
		for (int i = 0; i < 1000; i++) 
		{
			System.out.print(getName());
			//System.out.print(this.name);
		}
	}
}

class SecTh implements Runnable
{
	
	String name;
	
		public SecTh(String name) 
		{
			this.name = name;
		}
	
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) 
		{
			System.out.print(this.name);
		}
		
	}
}

public class ThreadFirstMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FirstTh f1 = new FirstTh("*");
		FirstTh f2 = new FirstTh("@");
		SecTh f3 = new SecTh("?");
		Thread f4 = new Thread(f3);
		
		//f1.run();
		f1.start();
		f2.start();
		f4.start();
		
		System.out.println();
		System.out.println(Thread.activeCount());
		
		for (int i = 0; i < 1000; i++) 
		{
			System.out.print("-");
		}
		
		try 
		{
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println(Thread.activeCount()); // 돌고있는 쓰레드 겟수
		System.out.println(Thread.currentThread()); //어느 쓰레드인지 알려줌
	}

}
