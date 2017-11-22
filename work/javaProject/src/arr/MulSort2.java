package arr;

import basic.forMain;

public class MulSort2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int [][] arr = {{85, 76, 78},
						{75, 76, 78},
						{95, 96, 98},
						{65, 46, 48},
						{45, 86, 88},
						{75, 66, 68}};

		
		String [] name = {"泅后1", "榜后2", "捞后3", "坷后4", "酒后5", "备后6"};
		int [][] res = new int[arr.length][2];
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j : arr[i]) 
			{
				res[i][0] += j;
			}
			res[i][1] = res[i][0] / arr[i].length;
		}
		
		int [] buf, resBuf;
		String nameBuf;
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i; j < arr.length; j++) 
			{
				
				if(res[i][1] < res[j][1])
				{
					buf = arr[i];
					arr[i] = arr[j];
					arr[j] = buf;
					
					nameBuf = name[i];
					name[i] = name[j];
					name[j] = nameBuf;
					
					buf = res[i];
					res[i] = res[j];
					res[j] = buf;
				}
				
			}
			
		}
		
		for (int i = 0; i < name.length; i++) 
		{
			System.out.print(name[i] + '\t');
			for (int j : arr[i]) 
			{
				System.out.print(j + ",");
			}
			
			for (int j : res[i]) 
			{
				System.out.print(j + ",");
			}
			System.out.println();
		}

	}

}
