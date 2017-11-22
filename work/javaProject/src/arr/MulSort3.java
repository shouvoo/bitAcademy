package arr;

import basic.forMain;

public class MulSort3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//1. �Էº�
		int [][] arr = {{85, 76, 78},
						{75, 76, 78},
						{95, 96, 98},
						{65, 46, 48},
						{45, 86, 88},
						{75, 66, 68}};

		
		String [] name = {"����1", "���2", "�̺�3", "����4", "�ƺ�5", "����6"};
		int [][] res = new int[arr.length][2];
		int [][] rank = new int[arr.length][2];
		
		//2�����
		//2.1 ����, ���
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j : arr[i]) 
			{
				res[i][0] += j;
			}
			res[i][1] = res[i][0] / arr[i].length;
		}
		
		//2.2 ���(��¼���)
		for (int i = 0; i < res.length; i++) 
		{
			rank[i][0] = 1;
			for (int[] you : res) 
			{
				if(res[i][1] < you[1])
				{
					rank[i][0]++;
				}
			}
		
		}
		
		
		// ��º�
		for (int r = 1; r <= name.length; r++) 
		{
			for (int i = 0; i < name.length; i++) 
			{
				if(rank[i][0] == r)
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
					
					for (int j : rank[i]) 
					{
						System.out.print(j + ",");
					}
					
					System.out.println();
				}
			}
		}
	}

}
