package dynamic;

abstract class AbsPar
{
	int a = 10;
	
	abstract void meth_1();
	
	void meth_2()
	{
		System.out.println("AbsPar meth_2()");
	}
}

class AbsChild extends AbsPar
{
	void meth_1()
	{
		System.out.println("AbsChild meth_1()");
	}
}

public class AbstractMain 
{

	public static void main(String[] args) 
	{
		AbsPar pp = new AbsPar() 
		{
			void meth_1() 
			{
				System.out.println("积己矫 贸府");
			}
		};
		
		pp.meth_1();
		pp.meth_2();
		
		AbsChild cc = new AbsChild()
		{
			void meth_1() 
			{
				System.out.println("磊侥 积己矫 贸府");
			}
		};
		
		cc.meth_1();
		cc.meth_2();
	}

}

















