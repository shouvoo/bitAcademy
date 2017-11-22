package lang_p;

class AAA
{
	int a = 10;
	
	public AAA(int a) 
	{
		this.a = a;
	}
	
	public AAA()
	{
		
	}
	
	void meth()
	{
		System.out.println("AAA meth()");
	}
	
	@Override
	public String toString() {
		return "AAA [a=" + a + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AAA other = (AAA) obj;
		if (a != other.a)
			return false;
		return true;
	}
	
	/*@Override
	public boolean equals(Object obj) 
	{
		// TODO Auto-generated method stub
		if(getClass() != obj.getClass())
		{
			return false;
		}
		
		AAA you = (AAA)obj;
		return a == you.a;
	}*/
	
	
}

public class ObjectMain 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AAA a1 = new AAA(200);
		Object a2 = new AAA(200);
		AAA a3 = a1;
		AAA a4 = new AAA();
		System.out.println(a1.a);
		//System.out.println(a2.a);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		System.out.println(a1.getClass());
		System.out.println(a2.getClass());
		System.out.println(a3.getClass());
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());		
		
		System.out.println(a1 == a2);
		System.out.println(a1 == a3);
		System.out.println(a1 == a4);
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
		System.out.println(a1.equals(a4));
	}

}
