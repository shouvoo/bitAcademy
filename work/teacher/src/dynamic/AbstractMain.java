package dynamic;
abstract class AbsPar{
	
	int a =10;
	
	abstract void meth_1();
	
	void meth_2()
	{
		System.out.println("AbsPar meth_2()");
	}
}

class AbsChild extends AbsPar{
	void meth_1()
	{
		System.out.println("AbsChild meth_1()");
	}
}

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 AbsPar pp = new AbsPar() {
			 @Override
			void meth_1() {
				// TODO Auto-generated method stub
				 System.out.println("何葛 积己矫 贸府");
			}
		 };
		
		AbsChild cc = new AbsChild(){
			 @Override
			void meth_1() {
				// TODO Auto-generated method stub
				 System.out.println("磊侥 积己矫 贸府");
				 meth_3();
			}
			 
			 void meth_3() {
					// TODO Auto-generated method stub
					 System.out.println("磊侥 积己矫 贸府3");
				}
		 };
		
		pp.meth_1();
		pp.meth_2();
		
		cc.meth_1();
		cc.meth_2();
		//cc.meth_3();
	}

}
