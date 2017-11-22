package dynamic;

class Par{
	
	Par(int a){
		System.out.println("何葛积己磊");
		this.a = a;
	}
	
	int a =setA();
	
	int setA()
	{
		System.out.println("Par setA()");
		
		return 10;
	}
	
	
	void meth_1()
	{
		System.out.println("Par meth_1()");
	}
}

class Child extends Par{
	int b =a;
	
	Child(){
		super(8888);
		System.out.println("磊侥积己磊");
	}
	
	int setB()
	{
		System.out.println("Child setB()");
		
		return 2000;
	}
	
	void meth_2()
	{
		System.out.println("Child meth_2()");
	}
}

class Child2 extends Par{
	int c =setC();
	
	public Child2() {
		// TODO Auto-generated constructor stub
		super(7788);
	}
	
	int setC()
	{
		System.out.println("Child setC()");
		
		return 3333;
	}
	
	void meth_3()
	{
		System.out.println("Child2 meth_3()");
	}
}

public class ExtendsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Par pp = new Par(777);
		System.out.println("------------------");
		Child cc = new Child();
		System.out.println("------------------");
		Child2 cc2 = new Child2();
		System.out.println("------------------");
		//pp.a = 1234;
		//cc.a = 5678;
		System.out.println("pp.a:"+pp.a);
		//System.out.println("pp.b:"+pp.b);
		System.out.println("cc.a:"+cc.a);
		System.out.println("cc.b:"+cc.b);
		System.out.println("cc2.a:"+cc2.a);
		//System.out.println("cc2.b:"+cc2.b);
		System.out.println("cc2.c:"+cc2.c);
		
		
		pp.meth_1();
		//pp.meth_2();
		cc.meth_1();
		cc.meth_2();
		
		cc2.meth_1();
		//cc2.meth_2();
		cc2.meth_3();
		
		
	}

}
