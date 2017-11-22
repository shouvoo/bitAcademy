package inter_p;

interface AAA{
	int a = 10;
	
	void meth_1();
	void meth_2();
}

interface BBB{
	int a = 10000;
	int b = 20;
	
	void meth_2();
}

class AAAImpl implements AAA, BBB{
	
	int a = 1234;
	
	@Override
	public void meth_2() {
		// TODO Auto-generated method stub
		System.out.println("AAAImpl meth_2()");
	}
	
	@Override
	public void meth_1() {
		// TODO Auto-generated method stub
		System.out.println("AAAImpl meth_1()");
	}
}

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AAA a1 = new AAA() {
			@Override
			public void meth_1() {
				// TODO Auto-generated method stub
				System.out.println("생성시 meth_1() 정의");
			}
			
			@Override
			public void meth_2() {
				// TODO Auto-generated method stub
				System.out.println("생성시 meth_2() 정의");
			}
		};
		
		a1.meth_1();
		//a1.a = 1000;
		System.out.println("a1.a:"+a1.a);
		
		AAAImpl a2 = new AAAImpl();
		a2.meth_1();
		//a2.a = 1000;
		System.out.println("a2.a:"+a2.a);
		a2.meth_2();
		System.out.println("a2.b:"+a2.b);
		
		BBB b1 = a2;
		//b1.meth_1();
		b1.meth_2();
		//System.out.println("b1.a:"+b1.a);
		System.out.println("b1.b:"+b1.b);
		
		
		AAA a3 = a2;
		a3.meth_1();
		a3.meth_2();
		System.out.println("a3.a:"+a3.a);
		//System.out.println("a3.b:"+a3.b);
		
		
		
	}

}
