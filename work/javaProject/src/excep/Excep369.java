package excep;

public class Excep369 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) 
		{
			int one = i % 10;
			String str = "";
			try 
			{
				int a = 10 / (one % 3);
				str += i;
			} catch (Exception e) 
			{
				try 
				{
					int a = 10 / one;
					str = "¦";
				} catch (Exception e2) 
				{
					str += i;
				}
				
			}
			
			System.out.println(str);
		}
	}

}
