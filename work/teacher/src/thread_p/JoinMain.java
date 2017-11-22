package thread_p;

class JoinTH extends Thread{
	
	public JoinTH(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <300; i++) {
			try {
				sleep(100);
				System.out.print(getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class JoinMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		JoinTH j1 = new JoinTH("+");
		JoinTH j2 = new JoinTH("-");
		JoinTH j3 = new JoinTH("?");
		
		
		
		j1.start();
		j2.start();
		j1.join(3000);
		j1.interrupt();
		
		
		j3.start();
		
		
	}

}
