package dynamic;

import dynamic.Outer.Inner;

class Outer
{
	int a = 10;
	static int d = 40;
	
	//1. 일반 이너 클래스
	class Inner
	{
		int b = 200;
		int aa = a;
		public Inner() 
		{
			// TODO Auto-generated constructor stub
			System.out.println("Inner 생성자");
		}
	}
	
	//2. static 이너 클래스
	static class InnerSt
	{
		int c = 30000;
		//int aa = a;
		int dd = d;
		
		public InnerSt() 
		{
			// TODO Auto-generated constructor stub
			System.out.println("StInner 생성자");
		}
	}
	
	
	public Outer() 
	{
		// TODO Auto-generated constructor stub
		System.out.println("Outer 생성자");
	}
	
	void meth()
	{
		int mx = 1234;
		
		//3. Local 이너 클래스
		class InnerLocal
		{
			int e = 5050;
			int aaa = a;
			int mmxx = mx;
			
			public InnerLocal() 
			{
				// TODO Auto-generated constructor stub
				System.out.println("InnerLocal");
			}
			
		}
		InnerLocal il = new InnerLocal();
		System.out.println("il.e : " + il.e);
		System.out.println("il.mmxx : " + il.mmxx);
		System.out.println("il.aaa : " + il.aaa);
	}
}

class IIChild extends Outer.Inner
{
	public IIChild() 
	{
		// TODO Auto-generated constructor stub
		//oo.super();
		new Outer().super();
		System.out.println("IIChild 생성자");
	}
}

public class InnerMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Outer oo = new Outer();
		System.out.println("------------------------------------------");
		Outer.Inner ii = oo.new Inner();
		System.out.println("------------------------------------------");
		//Outer.InnerSt is = new InnerSt();
		Outer.InnerSt is = new Outer.InnerSt();
		
		
		
		
		//is = oo.InnerSt();
		System.out.println("------------------------------------------");
		IIChild cc = new IIChild();
		System.out.println("------------------------------------------");
		
		//4. 익명 이너 클래스
		Outer ooAno = new Outer()
		{
			void meth()
			{
				System.out.println("생성시 재정의 meth()");
			}
		};
		
		
		/*System.out.println("oo.a : " + oo.a);
		System.out.println("oo.a : " + oo.a);*/
		System.out.println("oo.a : " + oo.a);
		System.out.println("ii.a : " + ii.b);
		System.out.println("ii.aa : " + ii.aa);
		System.out.println("is.c : " + is.c);
		System.out.println("is.dd : " + is.dd);
		System.out.println("------------------------------------------");
		oo.meth();
		System.out.println("------------------------------------------");
		ooAno.meth();
	}

}



























