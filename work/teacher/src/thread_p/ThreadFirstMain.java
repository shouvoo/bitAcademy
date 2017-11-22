package thread_p;

class FirstTh extends Thread{
	
	//String name;
	
	
	
	public FirstTh(String name) {
		super(name);
		//this.name = name;
	}



	public void run()
	{
		for (int i = 0; i < 1000; i++) {
			System.out.print(getName());
		}
		
		System.out.println("\n"+Thread.currentThread()+"»ç¸Á");
	}
}

class SecTh implements Runnable{
	
	String name;
	
	
	
		public SecTh(String name) {
			
			this.name = name;
		}



		public void run()
		{
			for (int i = 0; i < 1000; i++) {
				System.out.print(name);
			}
			
			System.out.println("\n"+Thread.currentThread()+"»ç¸Á");
		}
}


public class ThreadFirstMain {

	public static void main(String[] args) {
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
		
		for (int i = 0; i < 1000; i++) {
			System.out.print("-");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread());
	}

}
