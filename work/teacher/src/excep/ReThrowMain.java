package excep;

class ReThrow
{
	void meth_1() throws Exception
	{
		System.out.println("meth_1 Ω√¿€");
		try {
			meth_2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("meth_1():"+e.getMessage());
			throw e;
		}
		System.out.println("meth_1 ≥°");
	}
	
	void meth_2 () throws Exception
	{
		
		
		try {
			System.out.println("meth_2 Ω√¿€");
			throw new Exception("≥™ ∂ÀΩ’æÓ");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("meth_2():"+e.getMessage());
			
			throw e;
		}
		
	}
}


public class ReThrowMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ReThrow rt = new ReThrow();
		
		
		rt.meth_1();
		
	}

}
