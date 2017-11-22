package basic;

public class HomeWork_20170726 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("-----------------------------------");
		
		int count = 4;
		for (int i = 0; i < 9; i++) 
		{
			int editNum = 0;
			int editCount = (count < 0) ? -count : count;
			for (int j = 0; j < 11; j++) 
			{
				editNum = (j > (11 / 2)) ? 10 - j : j;
				if(editNum - 1 >= editCount) System.out.print(" ");
				else System.out.print("*");
			}
				
			--count;
			
			System.out.println();
			System.out.println();
		}
		
		System.out.println("-----------------------------------");
		
		count = 0;
		for (int i = 0; i < 9; i++) 
		{
			int editNum = 0;
			int editCount = (count > 4) ? 8 - count : count;
			for (int j = 0; j < 11; j++) 
			{
				editNum = (j > (11 / 2)) ? 10 - j : j;
				if(editCount >= editNum)  System.out.print("*");
				else System.out.print(" ");
				//System.out.print(editCount);
			}
			++count;
			System.out.println();
			System.out.println();
		}
		
		System.out.println("-----------------------------------");
		
		count = 0;
		for (int i = 0; i < 9; i++) 
		{
			int editNum = 0;
			int editCount = (count > 4) ? 8 - count : count;
			
			for (int j = 0; j < 9; j++) 
			{
				editNum = (j > (9 / 2)) ? 8 - j : j;
				
				if(editCount > editNum) System.out.print(" ");
				else System.out.print("*");
			}
			++count;
			System.out.println();
			System.out.println();
		}
		
		
		System.out.println("-----------------------------------");
		
		count = 6;
		for (int i = 0; i < 13; i++) 
		{
			int editNum = 0;
			int editCount = (count < 0) ? -count : count;
			for (int j = 0; j < 19; j++) 
			{
				editNum = (j > (19 / 2)) ? 18 - j : j;
				
				//System.out.print(editCount);
				if(editCount == 6 && editNum < 9) System.out.print(" ");
				else if(editCount == 5 && editNum < 7) System.out.print(" ");
				else if(editCount == 4 && editNum < 6) System.out.print(" ");
				else if(editCount == 2 && editNum == 0) System.out.print(" ");
				else if(editCount == 1 && editNum < 2) System.out.print(" ");
				else if(editCount == 0 && editNum < 3) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
			--count;
		}

		

	}

}
