package inter_p;
interface ExAAA{
	void meth_1();
	void meth_2();
}

interface ExBBB{
	void meth_1();
	void meth_3();
}

interface ExCCC{
	void meth_3();
	void meth_2();
}

interface ExTotal extends ExAAA, ExBBB, ExCCC
{
}

class ExAAAImpl implements ExAAA{
	@Override
	public void meth_1() {
		// TODO Auto-generated method stub
		System.out.println("ExAAAImpl meth_1()");
	}
	@Override
	public void meth_2() {
		// TODO Auto-generated method stub
		System.out.println("ExAAAImpl meth_2()");
	}
}

class ExBBBImpl extends ExAAAImpl implements ExBBB{
	
	@Override
	public void meth_3() {
		// TODO Auto-generated method stub
		System.out.println("ExBBBImpl meth_3()");
	}
}

class ExTotImpl extends ExBBBImpl implements ExTotal{
	
}

public class InterFaceExtensMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExTotImpl tt = new ExTotImpl();
		
		ExAAA aa= tt;
		ExBBB bb= tt;
		ExCCC cc= tt;
		
		aa.meth_1();
		aa.meth_2();
		System.out.println("---------------");
		bb.meth_1();
		bb.meth_3();
		System.out.println("---------------");
		cc.meth_3();
		cc.meth_2();
		System.out.println("---------------");
	}

}
