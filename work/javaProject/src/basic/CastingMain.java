package basic;

public class CastingMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i = 255;
		byte bb = (byte)i;
		System.out.println(bb);
		
		byte b1 = 123;
		short sh = b1;
		int ii = b1;
		long lo = b1;
		
		float ff = b1;
		ff = i;
		ff = lo;
		double dd = b1;
		dd = i;
		dd = ff;
		
		//ff = dd;
		System.out.println(ff);
		
		boolean bo = true;
		char ch = 'a';
		i = ch;
		System.out.println(i);
		
		ff = 123.456F;
		i = (int)ff;
		dd = 123.456;
		i = (int)dd;
		System.out.println(i);
		
		i = 257;
		b1 = (byte)i;
		System.out.println(b1);
		
	}

}




















































