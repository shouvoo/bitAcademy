package basic;

public class Forfor 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for (int h = 0; h <= 12; h++) 
		{
			//System.out.println(h + "     ��>>>>>>>");
			for (int m = 0; m < 60; m++) {
				//System.out.println(h + "  :  " + m);
			}
		}
		
		for (int i = 1; i < 10; i++) 
		{
			for (int j = 1; j < 10; j++) 
			{
				//System.out.println(i + "  *  " + j + "  =  " + (i * j));
			}
		}
		
		for (int i = 1; i < 10; i++) 
		{
			
			//System.out.println("");
			
			for (int j = 1; j < 10; j++) 
			{
				//System.out.print((j + " * " + i) + " = " + (j * i) + "\t");
			}
		}
		
		
		int count = 0;
		for (int c = 1; c <= 3; c++) 
		{
			
			//System.out.println("");
			
			for (int i = 1; i < 10; i++) 
			{
				
				//System.out.println("");
				
				for (int j = 1; j <= 3; j++) 
				{
				//	System.out.print(((j + count) + " * " + i) + " = " + ((j + count) * i) + "\t");
				}
			}
			
			count += 3;
		}
		
		
	}

}
