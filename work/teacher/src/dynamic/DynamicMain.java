package dynamic;
class Uncle{
	int a = 10;
	
	String meth_1()
	{
		return "DyPar meth_1()";
	}
}

class DyPar{
	
	int a = 10;
	
	String meth_1()
	{
		return "DyPar meth_1()";
	}
	
}

class DyChild extends DyPar{
	
	int a = 1000;
	int b = 2000;
	int c = 3000;
	
	String meth_1()
	{
		return "DyChild meth_1():"+c+","+a;
	}
	
	String meth_2()
	{
		return "DyChild meth_2()";
	}
	
}
public class DynamicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DyPar pp = new DyPar();
		DyPar pc = new DyChild();
		
		//DyChild cp = new DyPar();
		DyChild cc = new DyChild();
		
		
		
		System.out.println("pp.a:"+pp.a);
		//System.out.println("pp.b:"+pp.b);
		
		System.out.println("pc.a:"+pc.a);
		//System.out.println("pc.b:"+pc.b);
		
		System.out.println("cc.a:"+cc.a);
		System.out.println("cc.b:"+cc.b);
		
		
		System.out.println("pp.m1:"+pp.meth_1());

		
		System.out.println("pc.m1:"+pc.meth_1());
		//System.out.println("pc.m2:"+pc.meth_2());
		
		System.out.println("cc.m1:"+cc.meth_1());
		System.out.println("cc.m2:"+cc.meth_2());
		
		
		cc.a = 1111;
		System.out.println("cc.a:"+cc.a);
		
		DyPar pcc = cc;
		
		System.out.println("pcc.a:"+pcc.a);
		System.out.println("pcc.m1:"+pcc.meth_1());
		
		DyChild cpcc = (DyChild)pcc;
		System.out.println("cpcc.a:"+cpcc.a);
		System.out.println("cpcc.m1:"+cpcc.meth_1());
		
		
		System.out.println(pp instanceof DyChild);
		System.out.println(pcc instanceof DyChild);
		
		//DyChild cpp = (DyChild)pp;
		
		//Uncle uu = (Uncle)pp;
		//Uncle uu = (Uncle)cc;
	}

}
