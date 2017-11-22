package dynamic;
class StaPar{
	int a = setA();
	
	static int aa =  StaChild.bb;
	
	public StaPar(int a) {
		// TODO Auto-generated constructor stub
		System.out.println("何葛积己磊");
		//this.a = a;
		//aa = bb;
		//aa = StaChild.bb;
	}
	
	int setA()
	{
		System.out.println("StaPar setA()");
		return 10;
	}
	
	static int setAA()
	{
		System.out.println("StaPar setAA()");
		return 11;
	}
}

class StaChild extends StaPar{
	
	int b = setB();
	
	static int bb = setBB();
	
	public StaChild() {
		// TODO Auto-generated constructor stub
		super(bb);
		//a = bb;
		
		System.out.println("磊侥 积己磊");
	}
	
	
	int setB()
	{
		System.out.println("StaChild setB()");
		return 20000;
	}
	
	static int setBB()
	{
		System.out.println("StaChild setBB()");
		return 22222;
	}
}
public class ExtendsStaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaChild cc1 = new StaChild();
		System.out.println("---------------------");
		StaChild cc2 = new StaChild();
		System.out.println("---------------------");
		StaPar pp1 = new StaPar(111);
		System.out.println("---------------------");
		StaPar pp2 = new StaPar(222);
		
		System.out.println("---------------------");
		
		System.out.println("cc1.a:"+cc1.a);
		System.out.println("cc1.aa:"+cc1.aa);
		
		
	}

}
