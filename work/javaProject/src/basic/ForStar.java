package basic;

public class ForStar 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int line = 5;
		for (int i = 0; i < line; i++) 
		{
			for (int j = 0; j <= i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------");
		
		for (int i = 0; i < line; i++) 
		{
			for (int j = 0; j < line - i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------");
		
		for (int i = 0; i < line; i++) 
		{
			for (int j = 0; j < line; j++) 
			{
				if((4 - i) <= j) System.out.print("*");
				else System.out.print(" ");
			}
			
			System.out.println();
		}
		
		/*急积丛 规过
		for (int i = 0; i < line; i++) 
		{
			for (int j = i; j < line - 1; j++) 
			{
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i; j++) 
			{
				System.out.print("*");
			}
			
			System.out.println();
		}*/
		
		
		System.out.println("-----------------------------------");
		
		
		for (int i = 0; i < line; i++) 
		{
			
			for (int j = 0; j < line; j++) 
			{
				if(i <= j) System.out.print("*");
				else System.out.print(" ");
			}
			
			System.out.println();
		}
		
		/*//急积丛 规过
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < i; j++) 
			{
				System.out.print(" ");
			}
			
			for (int j = 0; j < 5 - i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		System.out.println("-----------------------------------");
		
		for (int i = 0; i < line; i++) 
		{
			
			for (int j = 0; j < line + i; j++) 
			{
				if((line - 1 - i) <= j) System.out.print("*");
				else System.out.print(" ");
			}
			
			System.out.println();
		}
		
		System.out.println("-----------------------------------");
		
		for (int i = 0; i < line; i++) 
		{
			
			for (int j = 0; j < (line * 2 ) - 1 - i; j++) 
			{
				
				//System.out.println(i + "  :  " + j);
				if(i <= j) System.out.print("*");
				else System.out.print(" ");
			}
			
			System.out.println();
		}

		System.out.println("-----------------------------------");
		
		for (int i = 0; i < 9; i++) 
		{
			for (int j = 0; j < 11; j++) 
			{
				System.out.println(j % 2);
			}
				
			System.out.println();
		}
	}

}
