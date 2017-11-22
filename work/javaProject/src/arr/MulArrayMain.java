package arr;

public class MulArrayMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String[][] arr = {{"000", "001", "002"},
					      {"100", "101", "102"},
						  {"200", "201", "202"},
						  {"300", "301", "302"}};
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[0][0]);
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println();
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(" :  " + arr[i][j]);
			}
		}

	}

}
