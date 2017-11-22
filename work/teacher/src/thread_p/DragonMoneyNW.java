package thread_p;

class MotherNW{
	int total = 50;
	boolean chk = false;
	
	synchronized boolean showMetheMoney(int money)
	{
		try {
			Thread.sleep(1000);
			
			if(!chk)
			{
				chk = true;
				wait();
			}else {
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

class ChildNW extends Thread{
	
	MotherNW mm;
	int myMoney=0;
	
	
	
	public ChildNW(MotherNW mm, String name) {
		super(name);
		this.mm = mm;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(mm.total>0)
		{
			
			int money = (int)(Math.random()*20+1);
			if(mm.showMetheMoney(money))
			{
				
				mm.total-=money;
				myMoney+=money;
				System.out.println(getName()+":"+money);
				System.out.println("\tภÜพื:"+mm.total);
			}
		}
	}
}



public class DragonMoneyNW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotherNW mm = new MotherNW();
		ChildNW son = new ChildNW(mm, "พฦต้");
		ChildNW dau = new ChildNW(mm, "ตþ");
		
		dau.start();
		son.start();
		
	}

}
