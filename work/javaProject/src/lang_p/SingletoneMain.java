package lang_p;

class SSS
{
	static SSS me = null;
	int a = 10;
	
	private SSS() 
	{
		// TODO Auto-generated constructor stub
		System.out.println("»ý¼ºÀÚ");
	}
	
	public static SSS get()
	{
		if(me == null)
		{
			me = new SSS();
		}
		return me;
	}
	
	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return "SSS [a = " + a + "]";
	}
}


public class SingletoneMain 
{
	
	public static void main(String[] args) 
	{
		SSS s1 = SSS.get();
		s1.a = 20;
		System.out.println(s1);
		
		SSS s2 = SSS.get();
		System.out.println(s2);
	}

}
