package oops;

class MethAAA
{
	int a = 10, b=20;//멤버변수
	
	void meth_1()
	{
		int c = 300;	//지역변수
		System.out.println("MethAAA meth_1():"+a+","+c);
	}
	
	void meth_2()
	{
		int b = 200;	//지역변수
		System.out.println("MethAAA meth_2():"+a+","+b);
		//System.out.println(c);
		//System.out.println(d);
	}
	
	void meth_3()
	{
		int b = 200;	//지역변수
		this.b = 3456;
		a = 9012;
		System.out.println("MethAAA meth_3():"
		+a+","+this.b+","+b);
		
		/*void meth_4() {
			
		}*/
	}
	
	void meth_4()
	{
		class Abcd{
			
		}
		
		Abcd abc = new Abcd();
	}
	
//	class Abcd{
//		
//	}
}

public class MethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethAAA a1 = new MethAAA();
		int d = 1234;
		System.out.println("a1.a:"+a1.a);
		
		a1.meth_1();
		a1.meth_2();
		a1.meth_3();
		
		System.out.println("a1.a:"+a1.a);
		System.out.println("a1.b:"+a1.b);
		//System.out.println("a1.c:"+a1.c);
		System.out.println(d);
		
		/*void meth_5()
		{
			
		}*/
		
		//a1.Abcd abc = new a1.Abcd();
		
		//MethAAA.Abcd ab = a1.new Abcd();
	}

}
