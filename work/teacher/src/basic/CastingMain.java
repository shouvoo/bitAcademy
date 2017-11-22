package basic;

public class CastingMain {

	public static void main(String[] args) {
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
		dd = lo;
		
		dd = ff;
		//ff = dd;
		//i = ff;
		//lo = ff;
		System.out.println(sh);
		System.out.println(ff);
		
		boolean bo = true;
		//i = bo;
		//ff = bo;
		
		char ch = '∞§';
		//sh = ch;
		i = ch;
		System.out.println(i);
		ch = '∞•';
		i = ch;
		System.out.println(i);
		//ch = i;
		//ch = sh;
		//ch = b1;
		ch = 'Åh'-'∞§';
		System.out.println(ch);
		
		ff = 123.456f;
		i = (int)ff;
		dd = 123.456;
		i = (int)dd;
		System.out.println(i);
		
		i = 1023;
		b1 = (byte)i;
		
		System.out.println(b1);
		
		
		
		
	}

}
