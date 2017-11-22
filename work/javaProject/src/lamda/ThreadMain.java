package lamda;

public class ThreadMain
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Runnable r1 = new Runnable() 
		{
			@Override
			public void run() 
			{
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) 
				{
					System.out.println("r1 : " + i);
					try 
					{
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		Runnable r2 = ()->{
			for (int i = 0; i < 10; i++) 
			{
				System.out.println("r2 : " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(
				new Runnable() 
				{
					@Override
					public void run() 
					{
						// TODO Auto-generated method stub
						for (int i = 0; i < 10; i++) 
						{
							System.out.println("r3 : " + i);
							try 
							{
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}
				);
		
		Thread t4 = new Thread(
				()->{
					for (int i = 0; i < 10; i++) 
					{
						System.out.println("r4 : " + i);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}





























