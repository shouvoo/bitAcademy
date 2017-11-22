package thread_p;

class PriTH extends Thread
{
	public PriTH(String name) 
	{		
		super(name);
	}
	
	public void run() 
	{
		for (int i = 0; i < 300; i++) 
		{
			System.out.print(getName());
			/*try
			{
				sleep(10);
			} catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
	}
}

public class PriorityMain
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PriTH t1 = new PriTH("+");
		PriTH t2 = new PriTH("-");
		PriTH t3 = new PriTH("?");
		
		t1.setPriority(10);
		t2.setPriority(5);
		t3.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
