package dynamic;

class Grand
{
	int b = 2222;
}

class OverPar extends Grand
{
	int a = 10;
	int b = 20;
	int pb = super.b;
	
	void meth_1()
	{
		System.out.println("OverPar meth_1()");
	}
	
	void meth_2()
	{
		System.out.println("OverPar meth_2()");
	}
}

class OverChild extends OverPar
{
	int a = 1000;
	int pa = super.a;
	int pb = super.pb;
	
	void meth_1()
	{
		System.out.println("OverChild meth_1()");
	}
}

public class OverrideMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		OverChild oc = new OverChild();
		System.out.println("oc.a : " + oc.a);
		System.out.println("oc.pa : " + oc.pa);
		System.out.println("oc.b : " + oc.b);
		System.out.println("oc.pb : " + oc.pb);
		oc.meth_1();
		oc.meth_2();
	}

}
