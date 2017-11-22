package basic;

import java.io.IOException;

public class InRead 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		//char ab = '';
		/*while(true)
		{
			int i = System.in.read();
			System.out.print((char)i);
			if(i == 13)
			{
				break;
			} 
			
		}*/
		
		System.out.println("°ª 1  :  ");
		int su1 = 0;
		while(true)
		{
			int i = System.in.read();
			if(i == 13) 
			{
				System.in.read();
				break;
			}
			su1 *= 10;
			su1 += i - '0';
			/*i -= '0';
			su1 += i;*/
			//System.out.println(i);
		}
		
		
		System.out.println("su1 : " + su1);
		System.out.println("°ª 2  :  ");
		
		int su2 = 0;
		while(true)
		{
			int i = System.in.read();
			if(i == 13) break;
			su2 *= 10;
			su2 += i - '0';
			/*i -= '0';
			su1 += i;*/
			//System.out.println(i);
		}
		System.out.println("su2 : " + su2);
		System.out.println("hap = " + (su1 + su2));
		
	}

}
