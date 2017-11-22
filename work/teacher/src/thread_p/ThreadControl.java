package thread_p;

class ThCon extends Thread{
	public ThCon(String name) {
		// TODO Auto-generated constructor stub
		
		super(name);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				sleep(1000);
				System.out.println(getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadControl {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ThCon t1 = new ThCon("*");
		ThCon t2 = new ThCon("**");
		ThCon t3 = new ThCon("***");
		
		
		t1.start();
		t2.start();
		t3.start();
		
		
		Thread.sleep(2000);
		//t1.interrupt();
		//t1.wait(1000);
		//t1.notify();
		t1.suspend();
		
		Thread.sleep(3000);
		t1.resume();
		Thread.sleep(3000);
		t1.stop();
		Thread.sleep(3000);
		t1.start();
		
		
	}

}
