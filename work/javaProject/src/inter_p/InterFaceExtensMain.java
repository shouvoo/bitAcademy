package inter_p;

interface ExAAA
{
	void meth_1();
	void meth_2();
}

interface ExBBB
{
	void meth_1();
	void meth_3();
}

interface ExCCC
{
	void meth_3();
	void meth_2();
}

interface ExTotal extends ExAAA, ExBBB, ExCCC
{
	
}

class ExAAAImpl implements ExAAA
{
	public void meth_1()
	{
		System.out.println("ExAAAImpl meth_1()");
	}
	
	public void meth_2()
	{
		System.out.println("ExAAAImpl meth_2()");
	}
}

class ExBBBImpl extends ExAAAImpl implements ExBBB
{
	
	public void meth_3()
	{
		System.out.println("ExBBBImpl meth_3()");
	}
}

class ExTotImpl extends ExBBBImpl implements ExTotal
{
/*	public void meth_1()
	{
		System.out.println("ExTotImpl meth_1()");
	}
	
	public void meth_2()
	{
		System.out.println("ExTotImpl meth_2()");
	}
	
	public void meth_3()
	{
		System.out.println("ExTotImpl meth_3()");
	}*/
	
}

public class InterFaceExtensMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ExTotImpl tt = new ExTotImpl();
		
		ExAAA aa = tt;
		ExBBB bb = tt;
		ExCCC cc = tt;
		
		aa.meth_1();
		aa.meth_2();
		System.out.println("----------------------------------");
		bb.meth_1();
		bb.meth_3();
		System.out.println("----------------------------------");
		cc.meth_2();
		cc.meth_3();
		System.out.println("----------------------------------");
	}

}































