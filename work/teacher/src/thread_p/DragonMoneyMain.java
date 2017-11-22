package thread_p;

class Mother{
	int total = 50;
	
	synchronized boolean showMetheMoney(int money)
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return total >= money;
	}
}

class Child extends Thread{
	
	Mother mm;
	int myMoney=0;
	
	
	
	public Child(Mother mm, String name) {
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



public class DragonMoneyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mother mm = new Mother();
		Child son = new Child(mm, "พฦต้");
		Child dau = new Child(mm, "ตþ");
		
		son.start();
		dau.start();
	}

}
