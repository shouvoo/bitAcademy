package lang_p;

import java.lang.reflect.Constructor;

class CCC
{
	int a = 10;
	String b = "qwer";
	
	void meth()
	{
		System.out.println("CCC meth()");
	}
	
	public CCC() 
	{
		// TODO Auto-generated constructor stub
		System.out.println("기본생성자");
	}
	
	public CCC(int a, String b) 
	{
		this.a = a;
		this.b = b;
		System.out.println("생성자");
	}
}

public class ClassMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
			//생성자에 넘겨줄 값이 없을시 사용
			Class cc = Class.forName("lang_p.CCC");
			System.out.println(cc);
			CCC c1 = (CCC)cc.newInstance();
			c1.meth();
			System.out.println(c1.a);
			System.out.println(c1.b);
			//-----------------------------------------------------------
			//생성자에 넘겨줄 값이 있을 경우 사용
			Constructor con = cc.getConstructor(new Class[] {int.class, String.class});
			System.out.println("생성자 작동전");
			CCC c2 = (CCC)con.newInstance(new Object[] {100, "abcd"});
			System.out.println(c2.a);
			System.out.println(c2.b);
			
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
