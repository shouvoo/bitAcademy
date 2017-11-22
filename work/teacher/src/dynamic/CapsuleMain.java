package dynamic;

class Capsule
{
	private int a = 10;
	private int b = 20;
	private int c = 30;
	
	
	
	
	public Capsule(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getC() {
		return c;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getA()
	{
		return a;
	}
	
	public void setA(int a)
	{
		this.a = a;
	}
}
public class CapsuleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Capsule cs = new Capsule(777,888,999);
		
		cs.setA(1234);
		cs.setB(5678);
		//cs.setC(9012);
		
		System.out.println("cs.a:"+cs.getA());
		System.out.println("cs.b:"+cs.getB());
		System.out.println("cs.c:"+cs.getC());
	}

}
