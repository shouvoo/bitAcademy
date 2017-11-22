package oops;

class SelfMethod
{
	String pre = "";
	/*int meth(int a)
	{
		int res = 0;
		String my = pre;
		System.out.println(my + "meth 시작:" + a + ", " + res);
		pre += "\t";
		if(a > 0)
		{
			System.out.println("res : " + res);
			res = a + meth(a - 1);
			System.out.println("res : " + res);
		}
		System.out.println(my + "meth 끝:" + a + ", " + res);
		return res;
	}*/
	
	int evenPlus = 0;
	int meth(int a)
	{
		a -= a%2;

		int res = 0;		
		String my = pre;
		pre += "\t";
		if(a > 0)
		{
			res = a + meth(a - 1);
			//if((a % 2) == 0) evenPlus += a;
		}
		
		
		return res;
	}
}

public class SelfMethodMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SelfMethod sm = new SelfMethod();
		System.out.println(sm.meth(5));
		//sm.meth(5);
		//System.out.println("짝수의 합" + sm.evenPlus);
	}

}
