package oops;

class StaticCla
{
	int a = setA();
	int b = setB();
	StaticCla()
	{
		System.out.println("»ý¼ºÀÚ");
	}
	static int c = setC();
	
	int setA()
	{
		System.out.println("setA()");
		return 100;
	}
	
	int setB()
	{
		System.out.println("setB()");
		return 200;
	}
	
	static int setC()
	{
		System.out.println("setC()");
		return 300;
	}
	
	void meth_1()
	{
		System.out.println("meth_1() : " + a + ", " + c);
		meth_11();
		meth_22();
		System.out.println("----------------------------");
	}
	
	void meth_11()
	{
		System.out.println("meth_11()");
	}
	
	static void meth_2()
	{
		System.out.println("meth_2() : " + c);
		//meth_11();
		meth_22();
		System.out.println("----------------------------");
	}
	
	static void meth_22()
	{
		System.out.println("meth_22()");
	}

}

public class StaticMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		StaticCla.c = 333;
		StaticCla.setC();
		StaticCla sc1 = new StaticCla();
		StaticCla sc2 = new StaticCla();
		
		sc1.a = 10;
		sc1.b = 20;
		//sc1.c = 30;
		sc1.setC();
		
		System.out.println("sc1.a : " + sc1.a);
		System.out.println("sc1.b : " + sc1.b);
		System.out.println("sc1.c : " + sc1.c);
		System.out.println("sc2.a : " + sc2.a);
		System.out.println("sc2.b : " + sc2.b);
		System.out.println("sc2.c : " + sc2.c);
		
		sc1.meth_1();
		sc2.meth_2();
	}

}
