package oops;
class SelfMethod
{
	String pre="";
	int meth(int a)
	{
		
		a-=a%2;
		
		
		int res=0;
		String my =pre;
		System.out.println(my+"meth ½ÃÀÛ:"+a+","+res);
		
		pre+="\t";
		
		if(a>0)
			res=a+meth(a-1);
		
		System.out.println(my+"meth ³¡:"+a+","+res);
		return res;
	}
}
public class SelfMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SelfMethod sm = new SelfMethod();
		
		System.out.println(sm.meth(10));
	}

}
