package lang_p;

public class MathMain 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		System.out.println(Math.ceil(123.456));
		System.out.println(Math.floor(123.456));
		System.out.println(Math.round(123.456));
		System.out.println(Math.round(-123.456));
		System.out.println(Math.abs(-123.456));
		System.out.println(Math.max(10, 20));
		System.out.println(Math.min(10, 20));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.sqrt(4));
		System.out.println(Math.cos(60 * (Math.PI / 180)));
		System.out.println("-----------------------------------------------------------");
		
		System.out.println((int)(Math.random() * 10));
		
		/*String sss = "7854321";
		System.out.println(sss + 100);
		int bbb = 0;
		for (int i = 0; i < sss.length(); i++) 
		{
			
			bbb *= 10;
			System.out.println(bbb);
			bbb += sss.charAt(i) - '0';
			System.out.println("------------------------------------------------");
			
		}

		System.out.println(bbb + 100);*/
		
		/*String sss = "765.4321";
		String s3 = sss.replace(".", "");
		
		double bbb = 0;
		
		for (int i = 0; i < s3.length(); i++) 
		{
			bbb *= 10;
			bbb += (s3.charAt(i) - '0');
		}
		System.out.println(bbb / 10000);*/
		
		/*String sss = "765.4321";		
		double bbb = 0;
		boolean chk = true;
		double dou = 1;
		for (int i = 0; i < sss.length(); i++) 
		{
			char ch = sss.charAt(i);
			if(ch == '.')
			{
				chk = false;
			} else 
			{
				if(chk)
				{
					bbb *= 10;
					bbb += ch - '0';
				} else 
				{
					dou *= 10;
					bbb += (ch - '0') / dou;
				}
			}
		}
		System.out.println(bbb + 100);*/
		
		

	}

}






































