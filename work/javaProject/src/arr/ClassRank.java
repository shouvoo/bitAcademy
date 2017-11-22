package arr;

import basic.forMain;

public class ClassRank 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*���� �ְ� �ݺ�, ��ȣ��, ������ ����ϼ���
		�� ī�װ��� ��� ������� ����ϼ���!
		��¹��
		1.��ü��� 2.�ݺ����, 3.�������, 4.��,����, ���*/
		//1. �Էº�
		int [][][] arr = {{{55, 76, 78},
							{75, 76, 78},
							{95, 96, 98},
							{35, 46, 88},
							{75, 96, 68}},
		
							{{95, 66, 78},
							{75, 66, 58},
							{65, 56, 98},
							{85, 76, 88},
							{65, 96, 68}}};

		String [][] genderArr = {{"��", "��", "��", "��", "��"},
								{"��", "��", "��", "��", "��"}};
		
		String [][] name = {{"����1", "���2", "�̺�3", "����4", "����5"},
							{"����1-1", "���2-1", "�̺�3-1", "����4-1", "����5-1"}};
		int [][][] res = new int[arr.length][5][2];
		int [][][] rank = new int[arr.length][5][1];
		
		//2�����
		//2.1 ����, ���
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				
				for(int k : arr[i][j]) 
				{
					res[i][j][0] += k;
				}
				res[i][j][1] = res[i][j][0] / arr[i][j].length;
			}
			
		}
		
		//2.2 ���(��¼���)
		String [] index = {"��", "�̸�", "����", "����", "����", "����", "����", "���", "���"};
		
		String line = "";
		for (int i = 0; i < index.length; i++) 
		{
			System.out.print(index[i] + "\t");
			line += "========";
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < res[i].length; j++) 
			{
				rank[i][j][0] = 1;
				for (int[] you : res[i]) 
				{
					
					if(res[i][j][1] < you[1])
					{
						rank[i][j][0]++;
						//System.out.println(rank[i][j][0]);
					}
				}
			
			}
		
		}
		
		
		// ��º�
		
		for (int c = 0; c < arr.length; c++) 
		{
			for (int r = 1; r <= name[c].length; r++) 
			{
				
				for (int i = 0; i < name[c].length; i++) 
				{
					if(rank[c][i][0] == r)
					{
						System.out.print((c + 1) + "��" + '\t');
						System.out.print(name[c][i] + '\t');
						System.out.print(genderArr[c][i] + '\t');

						for (int j : arr[c][i]) 
						{
							System.out.print(j + "\t");
						}
						
						for (int j : res[c][i]) 
						{			
							System.out.print(j + "\t");
						}
						
						for (int j : rank[c][i]) 
						{			
							System.out.print(j + "\t");
						}
						
						/*for (int j : rank[i]) 
						{
							System.out.print(j + "\t");
						}*/
						
						System.out.println();
					}
				}
				
			}
			
			System.out.println();
		
		}
	}

}
