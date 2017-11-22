package thread_p;

class MotherNW
{
	int total = 50;
	boolean chk = false;
	
	synchronized boolean showMetheMoney(int money)
	{
		try {
			Thread.sleep(500);
			
			if(!chk)
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
		
		
		return total >= money;
	}	
}

class ChildNW extends Thread
{
	MotherNW mm;
	int myMoney = 0;

	public ChildNW(MotherNW mm, String name) 
	{
		super(name);
		this.mm = mm;
	}

	@Override
	public void run() 
	{
		while(mm.total > 0)
		{
			int money = (int)(Math.random() * 19 + 1);
			if(mm.showMetheMoney(money))
			{
				
				mm.total -= money;
				myMoney += money;
				System.out.println(getName() + " : " + money);
				System.out.println("\t ภÜพื : "+ mm.total);
			}
		}
	}
}

public class DragonMoneyMainNW 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MotherNW mm = new MotherNW();
		
		ChildNW dau = new ChildNW(mm, "ตþ");
		ChildNW son = new ChildNW(mm, "พฦต้");
		
		
		dau.start();
		son.start();
	}

}
