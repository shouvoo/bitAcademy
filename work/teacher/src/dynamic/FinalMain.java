package dynamic;

class FiFar{
	int a = 10;
	final int b = 20;
	
	
	
	public FiFar() {
		//b = 3333;
	}

	void meth_1()
	{
		a = 1234;
		//b = 5678;
		System.out.println("FiFar meth_1()");
	}
	
	final void meth_2()
	{
		System.out.println("FiFar meth_2()");
	}
}

class FiChild extends FiFar{
	int a = 10;
	
	
	void meth_1()
	{
		System.out.println("FiFar meth_1()");
	}
	
	/*final void meth_2()
	{
		System.out.println("FiFar meth_2()");
	}*/
}
public class FinalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FiFar pp = new FiFar();
		pp.a = 1111;
		//pp.b = 2222;
		System.out.println("pp.a:"+pp.a);
		System.out.println("pp.b:"+pp.b);
		pp.meth_1();
		pp.meth_2();
	}

}
